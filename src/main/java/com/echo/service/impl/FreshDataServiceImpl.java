package com.echo.service.impl;

import com.echo.mapper.FreshDataMapper;
import com.echo.pojo.FreshData;
import com.echo.service.FreshDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FreshDataServiceImpl implements FreshDataService {
    @Autowired
    private FreshDataMapper freshDataMapper;

    @Override
    public List<FreshData> findAllFreshData() {
        return freshDataMapper.findAllFreshData();
    }
}
