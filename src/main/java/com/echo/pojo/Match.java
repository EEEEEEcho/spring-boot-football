package com.echo.pojo;

import java.text.SimpleDateFormat;

public class Match {
    private Long date;
    private String rounds;
    private String statusStr;
    private String home;
    private String away;
    private String liveRoomLink;
    private String dateStr;
    private Integer type;

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getDateStr() {
        Long timestamp = this.date;
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return format.format(timestamp);
    }

    public void setDateStr(String dateStr) {
        this.dateStr = dateStr;
    }

    public Long getDate() {
        return date;
    }

    public void setDate(Long date) {
        this.date = date;
    }

    public String getRounds() {
        return rounds;
    }

    public void setRounds(String rounds) {
        this.rounds = rounds;
    }

    public String getStatusStr() {
        return statusStr;
    }

    public void setStatusStr(String statusStr) {
        this.statusStr = statusStr;
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public String getAway() {
        return away;
    }

    public void setAway(String away) {
        this.away = away;
    }

    public String getLiveRoomLink() {
        return liveRoomLink;
    }

    public void setLiveRoomLink(String liveRoomLink) {
        this.liveRoomLink = liveRoomLink;
    }

    @Override
    public String toString() {
        return "Match{" +
                "date=" + date +
                ", rounds='" + rounds + '\'' +
                ", statusStr='" + statusStr + '\'' +
                ", home='" + home + '\'' +
                ", away='" + away + '\'' +
                ", liveRoomLink='" + liveRoomLink + '\'' +
                ", dateStr='" + dateStr + '\'' +
                ", type=" + type +
                '}';
    }
}
