package com.kgc.teackingmgt.entity;

import java.io.Serializable;

/**
 * (Users)实体类
 *
 * @author makejava
 * @since 2020-09-17 11:50:39
 */
public class Users implements Serializable {
    private static final long serialVersionUID = -53096267401191826L;

    private Integer userid;

    private String username;

    private Integer userage;

    private Integer roleid;

    private String userphone;

    private String password;

    private Integer level;
    /**
     * 贡献分
     */
    private Integer contributionscore;
    /**
     * 综合评分
     */
    private Integer combinedscore;

    private Integer javascore;

    private Integer webscore;

    private Integer dbscore;

    private Integer serverscore;

    private Integer pgmscore;

    private Integer bdscore;

    private Integer status;


    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getUserage() {
        return userage;
    }

    public void setUserage(Integer userage) {
        this.userage = userage;
    }

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    public String getUserphone() {
        return userphone;
    }

    public void setUserphone(String userphone) {
        this.userphone = userphone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getContributionscore() {
        return contributionscore;
    }

    public void setContributionscore(Integer contributionscore) {
        this.contributionscore = contributionscore;
    }

    public Integer getCombinedscore() {
        return combinedscore;
    }

    public void setCombinedscore(Integer combinedscore) {
        this.combinedscore = combinedscore;
    }

    public Integer getJavascore() {
        return javascore;
    }

    public void setJavascore(Integer javascore) {
        this.javascore = javascore;
    }

    public Integer getWebscore() {
        return webscore;
    }

    public void setWebscore(Integer webscore) {
        this.webscore = webscore;
    }

    public Integer getDbscore() {
        return dbscore;
    }

    public void setDbscore(Integer dbscore) {
        this.dbscore = dbscore;
    }

    public Integer getServerscore() {
        return serverscore;
    }

    public void setServerscore(Integer serverscore) {
        this.serverscore = serverscore;
    }

    public Integer getPgmscore() {
        return pgmscore;
    }

    public void setPgmscore(Integer pgmscore) {
        this.pgmscore = pgmscore;
    }

    public Integer getBdscore() {
        return bdscore;
    }

    public void setBdscore(Integer bdscore) {
        this.bdscore = bdscore;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Users{" +
                "userid=" + userid +
                ", username='" + username + '\'' +
                ", userage=" + userage +
                ", roleid=" + roleid +
                ", userphone='" + userphone + '\'' +
                ", password='" + password + '\'' +
                ", level=" + level +
                ", contributionscore=" + contributionscore +
                ", combinedscore=" + combinedscore +
                ", javascore=" + javascore +
                ", webscore=" + webscore +
                ", dbscore=" + dbscore +
                ", serverscore=" + serverscore +
                ", pgmscore=" + pgmscore +
                ", bdscore=" + bdscore +
                ", status=" + status +
                '}';
    }
}