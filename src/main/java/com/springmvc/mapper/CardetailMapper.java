package com.springmvc.mapper;

import com.springmvc.bean.Cardetail;
import com.springmvc.bean.CardetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CardetailMapper {
    long countByExample(CardetailExample example);

    int deleteByExample(CardetailExample example);

    int deleteByPrimaryKey(String detailid);

    int insert(Cardetail record);

    int insertSelective(Cardetail record);

    List<Cardetail> selectByExample(CardetailExample example);

    Cardetail selectByPrimaryKey(String detailid);

    List<Cardetail> selectByExampleWithother(int cid);

    List<Cardetail> selectByExampleWithother1(@Param("sta") String sta,@Param("i0") String i0,@Param("i2") String i2,@Param("i3") String i3,@Param("i4") String i4,@Param("i5") String i5,@Param("i6") String i6);

    int updateByExampleSelective(@Param("record") Cardetail record, @Param("example") CardetailExample example);

    int updateByExample(@Param("record") Cardetail record, @Param("example") CardetailExample example);

    int updateByPrimaryKeySelective(Cardetail record);

    int updateByPrimaryKey(Cardetail record);
}