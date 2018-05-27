package com.hyc.entity;

import com.hyc.basic.UUIDGenId;
import com.hyc.common.BasicEntity;
import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;
import tk.mybatis.mapper.annotation.NameStyle;
import tk.mybatis.mapper.code.Style;

import javax.persistence.Id;

@Data
@NameStyle(Style.camelhumpAndLowercase)
public class Account extends BasicEntity{

    @Id
    @KeySql(genId = UUIDGenId.class)
    private String id;

    private String username;

    private String password;


}
