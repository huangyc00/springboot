package com.hyc.dao;

import org.apache.ibatis.annotations.Param;

import java.util.List;
import com.hyc.entity.Account;
import tk.mybatis.mapper.common.Mapper;


public interface AccountDao extends Mapper<Account>{
}
