package com.example.yuch_nug.mapper;

import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface LoginMapper {
    public int loginSave (String id, String pw);
}
