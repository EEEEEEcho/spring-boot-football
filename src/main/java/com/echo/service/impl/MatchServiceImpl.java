package com.echo.service.impl;

import com.echo.mapper.MatchMapper;
import com.echo.pojo.Match;
import com.echo.service.MatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class MatchServiceImpl implements MatchService {
    @Autowired
    private MatchMapper matchMapper;
    @Override
    public List<Match> findAllMatchesByType(Integer type) {
        return matchMapper.findAllMatchesByType(type);
    }

    @Override
    public Map<String, Integer> getMatchDate(Integer type) {
        try {
            List<Match> matches = matchMapper.findAllMatchesByType(type);
            Match match = matches.get(0);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM-dd");
            Map<String,Integer> map = new HashMap<>();
            String s = simpleDateFormat.format(match.getDate());
            map.put(s.split("/")[1],1);
            for(int i = 1;i < matches.size();i ++){
                Match temp = matches.get(i);
                String format = simpleDateFormat.format(temp.getDate());
                String key = format.split("/")[1];
                if(map.containsKey(key)){
                    map.put(key,map.get(key) + 1);
                }
                else{
                    map.put(key,1);
                }
            }
            return map;
        }
        catch (Exception e){
            //e.printStackTrace();
            System.err.println("亚冠数据就是有问题");
            Map<String,Integer> map = new HashMap<>();
            map.put("12-12",0);
            return map;
        }

    }
}
