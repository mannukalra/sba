package com.mk.sba.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class TestAPI {

    @GetMapping(value = "/hello")
    public String getTest() {
        return "Hello from SBA!";
    }

    @GetMapping(value = "/list")
    public List<String> getList() {
        return List.of("AA", "BB", "CC");
    }

    @GetMapping(value = "/map")
    public Map<String, Integer> getMap() {
        return Map.of("AA", 1, "BB", 2, "CC", 3);
    }
}
