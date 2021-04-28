package com.echo.mapper;

import com.echo.pojo.FreshData;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FreshDataMapper {
    public List<FreshData> findAllFreshData();
}
