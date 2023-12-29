package com.mmdxiaoxin.minicservice.service;

import com.mmdxiaoxin.minicservice.parser.*;
import com.mmdxiaoxin.minicservice.util.QTInfo;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;
import java.util.stream.Collectors;

@Service
@Scope("prototype")
public class MiniCService {

    public Map<String, String> processing(String code) {
        Map<String, String> result = new HashMap<>();
        // 将代码转换为输入流
        InputStream lexicalStream = new ByteArrayInputStream(code.getBytes());
        InputStream syntaxStream = new ByteArrayInputStream(code.getBytes());
        try {
            SimpleCharStream stream = new SimpleCharStream(lexicalStream);
            MiniCParserTokenManager tokenManager = new MiniCParserTokenManager(stream);
            StringBuilder lexicalResult = new StringBuilder();

            Token token = tokenManager.getNextToken();
            int index = 0;
            while (token.kind != 0) {
                lexicalResult.append(++index).append(": ").append("(").append(token.kind).append(", ").append(token.image).append(")\n");
                token = tokenManager.getNextToken();
            }

            // 词法分析
            result.put("lexicalAnalysis", lexicalResult.toString());

            // 语法分析
            StringBuilder syntaxResult = new StringBuilder();
            MiniCParser miniCParser = new MiniCParser(syntaxStream);
            SimpleNode n = miniCParser.Start();

            // 处理错误信息
            miniCParser.errorList.removeIf(Objects::isNull);  // 过滤掉可能的 null
            Set<String> uniqueErrors = new LinkedHashSet<>(miniCParser.errorList);
            miniCParser.errorList.clear();
            miniCParser.errorList.addAll(uniqueErrors);

            // 构建语法分析结果字符串
            syntaxResult.append(!miniCParser.errorList.isEmpty() ? String.join("\n\n", miniCParser.errorList) + "\n\n" : "语法分析成功！\n\n");
            syntaxResult.append("语法树:\n");
            syntaxResult.append(n.dump("->"));
            syntaxResult.append("谢谢。\n\n");

            result.put("syntaxAnalysis", syntaxResult.toString());

            // 语义分析
            StringBuilder semanticResult = new StringBuilder();
            semanticResult.append(miniCParser.printQTTable());
            result.put("semanticAnalysis", semanticResult.toString());
        } catch (ParseException e) {
            result.put("syntaxAnalysis", "语法分析错误：" + e.getMessage());
        } finally {
            closeStream(lexicalStream);
            closeStream(syntaxStream);
            QTInfo.innerIdSeqen = 0;
            QTInfo.size = 0;
            QTInfo.START = 0;
        }
        return result;
    }

    private void closeStream(InputStream stream) {
        try {
            stream.close();
        } catch (IOException e) {
            e.printStackTrace(); // 处理关闭流时的异常
        }
    }
}
