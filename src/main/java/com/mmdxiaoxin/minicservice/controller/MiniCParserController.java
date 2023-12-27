package com.mmdxiaoxin.minicservice.controller;

import com.mmdxiaoxin.minicservice.service.MiniCService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class MiniCParserController {

    @GetMapping("/hello")
    public String hello() {
        return "index";
    }

    @GetMapping("/parser")
    public String parser() {
        return "parser";
    }

    @PostMapping("/processing")
    @ResponseBody
    public Map<String, String> processing(@RequestBody HashMap<String, String> code) {
        MiniCService miniCService = new MiniCService();
        String codeStr = " " + code.get("code");
        Map<String, String> result = miniCService.processing(codeStr);
        System.out.println(codeStr);
        return result;
    }
}

