package com.example.ol.Mapper;

import com.example.ol.pojo.Bwlist;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface BwlistMapper {
    //void insert(Bwlist bwlist);

    @Select("select * from bwtest")
    public List<Bwlist> searchAll();
}
