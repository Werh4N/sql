package com.example.ol.Mapper;

import com.example.ol.pojo.Ol;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface OlMapper {
    @Select("select * from oltest")
    public List<Ol> searchAll();
}
