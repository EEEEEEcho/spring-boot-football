package com.echo;

import com.echo.mapper.MatchMapper;
import com.echo.pojo.Match;
import com.echo.service.MatchService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.SimpleDateFormat;
import java.util.*;

@SpringBootTest
class SpringBootFootballApplicationTests {

    @Autowired
    MatchMapper matchMapper;
    @Test
    void contextLoads() {
        List<Match> allMatchesByType = matchMapper.findAllMatchesByType(82);
        Collections.sort(allMatchesByType, Comparator.comparing(Match::getDate));
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM月");
        if(allMatchesByType.size() == 0){
            //return results;
        }
        Map<String,Integer> map1 = new HashMap<>();
        Match match1 = allMatchesByType.get(0);
        String format1 = simpleDateFormat.format(match1.getDate());
        map1.put(format1.split("-")[1],1);
        for(int i = 1;i < allMatchesByType.size();i ++){
            Match match = allMatchesByType.get(i);
            String format = simpleDateFormat.format(match.getDate());
            String key = format.split("-")[1];
            if(map1.containsKey(key)){
                map1.put(key,map1.get(key) + 1);
            }
            else{
                map1.put(key,1);
            }
        }
        System.out.println(map1);
    }

    @Autowired
    MatchService matchService;
    @Test
    void testKeySet(){
        Map<String, Integer> matchDate = matchService.getMatchDate(82);
        Collection<String> keySet = matchDate.keySet();
        ArrayList<String> allKeys = new ArrayList<>(keySet);
        Collections.sort(allKeys);
        for (String s : allKeys){
            System.out.println(s + ":" +  matchDate.get(s));
        }
    }
}
