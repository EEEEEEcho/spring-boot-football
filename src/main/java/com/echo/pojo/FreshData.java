package com.echo.pojo;

import java.text.SimpleDateFormat;

public class FreshData {
    private String away;
    private Integer awayId;
    private Integer awayGames;
    private Integer awayGoal;
    private Integer awayLoss;
    private Integer awayPoints;
    private Integer awayWin;
    private Float awayWinRate;
    private Integer awayScore;
    private String dataUrl;
    private Long date;
    private String home;
    private Integer homeId;
    private Integer homeGames;
    private Integer homeGoal;
    private Integer homeLoss;
    private Integer homePoints;
    private Integer homeWin;
    private Float homeWinRate;
    private Integer homeScore;
    private String liveRoomLink;
    private Integer mid;
    private Integer roomId;
    private Integer roundNum;
    private Integer status;
    private String statusStr;
    private Integer type;
    private String rounds;
    private Integer recommendPoints;
    private String groupName;
    private String dateStr;

    public String getDateStr() {
        Long timestamp = this.date;
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return format.format(timestamp);
    }

    public void setDateStr(String dateStr) {
        this.dateStr = dateStr;
    }

    public String getAway() {
        return away;
    }

    public void setAway(String away) {
        this.away = away;
    }

    public Integer getAwayId() {
        return awayId;
    }

    public void setAwayId(Integer awayId) {
        this.awayId = awayId;
    }

    public Integer getAwayGames() {
        return awayGames;
    }

    public void setAwayGames(Integer awayGames) {
        this.awayGames = awayGames;
    }

    public Integer getAwayGoal() {
        return awayGoal;
    }

    public void setAwayGoal(Integer awayGoal) {
        this.awayGoal = awayGoal;
    }

    public Integer getAwayLoss() {
        return awayLoss;
    }

    public void setAwayLoss(Integer awayLoss) {
        this.awayLoss = awayLoss;
    }

    public Integer getAwayPoints() {
        return awayPoints;
    }

    public void setAwayPoints(Integer awayPoints) {
        this.awayPoints = awayPoints;
    }

    public Integer getAwayWin() {
        return awayWin;
    }

    public void setAwayWin(Integer awayWin) {
        this.awayWin = awayWin;
    }

    public Float getAwayWinRate() {
        return awayWinRate;
    }

    public void setAwayWinRate(Float awayWinRate) {
        this.awayWinRate = awayWinRate;
    }

    public Integer getAwayScore() {
        return awayScore;
    }

    public void setAwayScore(Integer awayScore) {
        this.awayScore = awayScore;
    }

    public String getDataUrl() {
        return dataUrl;
    }

    public void setDataUrl(String dataUrl) {
        this.dataUrl = dataUrl;
    }

    public Long getDate() {
        return date;
    }

    public void setDate(Long date) {
        this.date = date;
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public Integer getHomeId() {
        return homeId;
    }

    public void setHomeId(Integer homeId) {
        this.homeId = homeId;
    }

    public Integer getHomeGames() {
        return homeGames;
    }

    public void setHomeGames(Integer homeGames) {
        this.homeGames = homeGames;
    }

    public Integer getHomeGoal() {
        return homeGoal;
    }

    public void setHomeGoal(Integer homeGoal) {
        this.homeGoal = homeGoal;
    }

    public Integer getHomeLoss() {
        return homeLoss;
    }

    public void setHomeLoss(Integer homeLoss) {
        this.homeLoss = homeLoss;
    }

    public Integer getHomePoints() {
        return homePoints;
    }

    public void setHomePoints(Integer homePoints) {
        this.homePoints = homePoints;
    }

    public Integer getHomeWin() {
        return homeWin;
    }

    public void setHomeWin(Integer homeWin) {
        this.homeWin = homeWin;
    }

    public Float getHomeWinRate() {
        return homeWinRate;
    }

    public void setHomeWinRate(Float homeWinRate) {
        this.homeWinRate = homeWinRate;
    }

    public Integer getHomeScore() {
        return homeScore;
    }

    public void setHomeScore(Integer homeScore) {
        this.homeScore = homeScore;
    }

    public String getLiveRoomLink() {
        return liveRoomLink;
    }

    public void setLiveRoomLink(String liveRoomLink) {
        this.liveRoomLink = liveRoomLink;
    }

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public Integer getRoomId() {
        return roomId;
    }

    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    public Integer getRoundNum() {
        return roundNum;
    }

    public void setRoundNum(Integer roundNum) {
        this.roundNum = roundNum;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getStatusStr() {
        return statusStr;
    }

    public void setStatusStr(String statusStr) {
        this.statusStr = statusStr;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getRounds() {
        return rounds;
    }

    public void setRounds(String rounds) {
        this.rounds = rounds;
    }

    public Integer getRecommendPoints() {
        return recommendPoints;
    }

    public void setRecommendPoints(Integer recommendPoints) {
        this.recommendPoints = recommendPoints;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    @Override
    public String toString() {
        return "FreshData{" +
                "recommendPoints=" + recommendPoints +
                '}';
    }
}
