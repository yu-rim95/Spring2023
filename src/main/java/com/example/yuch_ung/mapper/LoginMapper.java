package com.example.yuch_ung.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LoginMapper {
    public int loginSave(String id, String pw);
}
