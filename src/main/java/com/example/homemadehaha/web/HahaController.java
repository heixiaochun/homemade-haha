package com.example.homemadehaha.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HahaController {

    @GetMapping("/haha")
    public Map<String, String> haha() {
        Map<String, String> resultMap = new HashMap<>(8);
        resultMap.put("haha", "haha");
        return resultMap;
    }

    @GetMapping("/readiness")
    public Map<String, String> readiness() {
        Map<String, String> resultMap = new HashMap<>(8);
        resultMap.put("readiness", "haha");
        return resultMap;
    }

    @GetMapping("/liveness")
    public Map<String, String> liveness() {
        Map<String, String> resultMap = new HashMap<>(8);
        resultMap.put("liveness", "haha");
        return resultMap;
    }

}
