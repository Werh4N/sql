package com.example.ol.controller;

import com.example.ol.Mapper.OlMapper;
import com.example.ol.pojo.Ol;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ol")
public class OlController {
    @Autowired
    private OlMapper olMapper;

    @GetMapping("/all")
    private List<Ol> searchAll() {
        return olMapper.searchAll();
    }
}
