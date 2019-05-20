package com.springmvc.mapper;

import com.springmvc.bean.Module;
import com.springmvc.bean.ModuleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ModuleMapper {
    long countByExample(ModuleExample example);

    int deleteByExample(ModuleExample example);

    int deleteByPrimaryKey(Integer moduleid);

    int insert(Module record);

    int insertSelective(Module record);

    List<Module> selectByExample(ModuleExample example);

    Module selectByPrimaryKey(Integer moduleid);

    int updateByExampleSelective(@Param("record") Module record, @Param("example") ModuleExample example);

    int updateByExample(@Param("record") Module record, @Param("example") ModuleExample example);

    int updateByPrimaryKeySelective(Module record);

    int updateByPrimaryKey(Module record);
}