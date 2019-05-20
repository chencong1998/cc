package com.springmvc.mapper;

import com.springmvc.bean.Accmodule;
import com.springmvc.bean.AccmoduleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AccmoduleMapper {
    long countByExample(AccmoduleExample example);

    int deleteByExample(AccmoduleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Accmodule record);

    int insertSelective(Accmodule record);

    List<Accmodule> selectByExample(AccmoduleExample example);

    Accmodule selectByPrimaryKey(Integer id);

    int insertBatch(@Param("modules") String[] modules,@Param("userID") Integer userID);


    int updateByExampleSelective(@Param("record") Accmodule record, @Param("example") AccmoduleExample example);

    int updateByExample(@Param("record") Accmodule record, @Param("example") AccmoduleExample example);

    int updateByPrimaryKeySelective(Accmodule record);

    int updateByPrimaryKey(Accmodule record);
}