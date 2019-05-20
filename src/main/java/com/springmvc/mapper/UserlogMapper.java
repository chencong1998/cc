package com.springmvc.mapper;

import com.springmvc.bean.Userlog;
import com.springmvc.bean.UserlogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserlogMapper {
    long countByExample(UserlogExample example);

    int deleteByExample(UserlogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Userlog record);

    int insertSelective(Userlog record);

    List<Userlog> selectByExample(UserlogExample example);

    Userlog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Userlog record, @Param("example") UserlogExample example);

    int updateByExample(@Param("record") Userlog record, @Param("example") UserlogExample example);

    int updateByPrimaryKeySelective(Userlog record);

    int updateByPrimaryKey(Userlog record);
}