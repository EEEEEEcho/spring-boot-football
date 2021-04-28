package com.echo.service.impl;

import com.echo.mapper.TeamMapper;
import com.echo.pojo.Team;
import com.echo.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TeamServiceImpl implements TeamService {
    @Autowired
    private TeamMapper teamMapper;

    @Override
    public List<Team> findTeamByType(Integer type) {
        List<Team> teamByType = teamMapper.findTeamByType(type);
        if (type == 26 || type == 46){
            teamByType.sort((t1, t2) -> {
                int t1GroupName = t1.getGroupName().indexOf(0);
                int t2GroupName = t2.getGroupName().indexOf(0);
//                if (t2GroupName == t1GroupName) {
//                    return Integer.compare(t1.getPoints(), t2.getPoints());
//                }
                return Integer.compare(t2GroupName, t1GroupName);
            });
        }
        else{
            teamByType.sort((o1, o2) -> o2.getPoints().compareTo(o1.getPoints()));
        }
        return teamByType;
    }
}
