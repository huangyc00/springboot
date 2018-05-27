package com.hyc.basic;

import tk.mybatis.mapper.genid.GenId;

import java.util.UUID;

public class UUIDGenId implements GenId {

    @Override
    public Object genId(String table, String column) {
        return UUID.randomUUID().toString().replace("-", "");
    }
}
