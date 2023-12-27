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
        InputStream lexicalStream = new ByteArrayInputStream(code.getBytes());
        InputStream syntaxStream = new ByteArrayInputStream(code.getBytes());
        InputStream semanticStream = new ByteArrayInputStream(code.getBytes());

        // 词法分析
        result.put("lexicalAnalysis", performLexicalAnalysis(lexicalStream));
        // 关闭词法分析流
        closeStream(lexicalStream);

        // 语法分析
        result.put("syntaxAnalysis", performSyntaxAnalysis(syntaxStream));
        // 关闭语法分析流
        closeStream(syntaxStream);

        // 语义分析
        result.put("semanticAnalysis", performSemanticAnalysis(semanticStream));
        // 关闭语义分析流
        closeStream(semanticStream);

        return result;
    }

    private String performLexicalAnalysis(InputStream inputStream) {
        try {
            SimpleCharStream stream = new SimpleCharStream(inputStream);
            MiniCParserTokenManager tokenManager = new MiniCParserTokenManager(stream);
            StringBuilder lexicalResult = new StringBuilder();

            Token token = tokenManager.getNextToken();
            while (token.kind != 0) {
                lexicalResult.append("(").append(token.kind).append(", ").append(token.image).append(")\n");
                token = tokenManager.getNextToken();
            }

            return lexicalResult.toString();
        } finally {
            closeStream(inputStream);
        }
    }

    private String performSyntaxAnalysis(InputStream inputStream) {
        try {
            StringBuilder syntaxResult = new StringBuilder();
            MiniCParser miniCParser = new MiniCParser(inputStream);
            SimpleNode n = miniCParser.Start();
            syntaxResult.append(n.dump("->"));
            syntaxResult.append("谢谢。\n\n");
            return syntaxResult.toString();
        } catch (ParseException e) {
            return "语法分析错误：" + e.getMessage();
        } finally {
            closeStream(inputStream);
        }
    }

    private String performSemanticAnalysis(InputStream inputStream) {
        try {
            StringBuilder semanticResult = new StringBuilder("test");
            // 执行语义分析逻辑
            return semanticResult.toString();
        } finally {
            closeStream(inputStream);
        }
    }

    private void closeStream(InputStream stream) {
        try {
            stream.close();
        } catch (IOException e) {
            e.printStackTrace(); // 处理关闭流时的异常
        }
    }

}
