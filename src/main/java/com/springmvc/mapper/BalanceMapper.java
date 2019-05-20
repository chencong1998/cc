package com.springmvc.mapper;

import com.springmvc.bean.Balance;
import com.springmvc.bean.BalanceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BalanceMapper {
    int countByExample(BalanceExample example);

    int deleteByExample(BalanceExample example);

    int deleteByPrimaryKey(Integer balanceid);

    int insert(Balance record);

    int insertSelective(Balance record);

    List<Balance> selectByExample(BalanceExample example);

    Balance selectByPrimaryKey(Integer balanceid);

    List<Balance> selectByExampleWithOther1(int cid);

    Balance selectByPrimaryKeyWithOther1(Integer balanceid);

    int updateByExampleSelective(@Param("record") Balance record, @Param("example") BalanceExample example);

    int updateByExample(@Param("record") Balance record, @Param("example") BalanceExample example);

    int updateByPrimaryKeySelective(Balance record);

    int updateByPrimaryKey(Balance record);
}