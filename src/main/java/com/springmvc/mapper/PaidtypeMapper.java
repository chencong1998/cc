package com.springmvc.mapper;

import com.springmvc.bean.Paidtype;
import com.springmvc.bean.PaidtypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PaidtypeMapper {
    long countByExample(PaidtypeExample example);

    int deleteByExample(PaidtypeExample example);

    int deleteByPrimaryKey(Integer paidid);

    int insert(Paidtype record);

    int insertSelective(Paidtype record);

    List<Paidtype> selectByExample(PaidtypeExample example);

    Paidtype selectByPrimaryKey(Integer paidid);

    int updateByExampleSelective(@Param("record") Paidtype record, @Param("example") PaidtypeExample example);

    int updateByExample(@Param("record") Paidtype record, @Param("example") PaidtypeExample example);

    int updateByPrimaryKeySelective(Paidtype record);

    int updateByPrimaryKey(Paidtype record);
}