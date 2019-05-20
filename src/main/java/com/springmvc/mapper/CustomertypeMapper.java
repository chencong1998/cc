package com.springmvc.mapper;

import com.springmvc.bean.Customertype;
import com.springmvc.bean.CustomertypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CustomertypeMapper {
    long countByExample(CustomertypeExample example);

    int deleteByExample(CustomertypeExample example);

    int deleteByPrimaryKey(Integer customertypeid);

    int insert(Customertype record);

    int insertSelective(Customertype record);

    List<Customertype> selectByExample(CustomertypeExample example);

    Customertype selectByPrimaryKey(Integer customertypeid);

    int updateByExampleSelective(@Param("record") Customertype record, @Param("example") CustomertypeExample example);

    int updateByExample(@Param("record") Customertype record, @Param("example") CustomertypeExample example);

    int updateByPrimaryKeySelective(Customertype record);

    int updateByPrimaryKey(Customertype record);
}