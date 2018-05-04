package com.oracle.labor.dao;

import com.oracle.labor.po.ZjTjxxb;
import com.oracle.labor.po.ZjTjxxbExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ZjTjxxbMapper {
    long countByExample(ZjTjxxbExample example);

    int deleteByExample(ZjTjxxbExample example);

    int deleteByPrimaryKey(String tjxid);

    int insert(ZjTjxxb record);

    int insertSelective(ZjTjxxb record);

    List<ZjTjxxb> selectByExample(ZjTjxxbExample example);

    ZjTjxxb selectByPrimaryKey(String tjxid);

    int updateByExampleSelective(@Param("record") ZjTjxxb record, @Param("example") ZjTjxxbExample example);

    int updateByExample(@Param("record") ZjTjxxb record, @Param("example") ZjTjxxbExample example);

    int updateByPrimaryKeySelective(ZjTjxxb record);

    int updateByPrimaryKey(ZjTjxxb record);
}