package com.mmdxiaoxin.minicservice.service;

import com.mmdxiaoxin.minicservice.parser.*;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

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
