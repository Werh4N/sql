package com.example.ol.controller;

import com.example.ol.Mapper.BwlistMapper;
import com.example.ol.pojo.Bwlist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/bwlist")
public class BwlistController {
    @Autowired
    private BwlistMapper bwlistMapper;

    @GetMapping("/all")
    public List<Bwlist> searchAll() {return bwlistMapper.searchAll();}
}
