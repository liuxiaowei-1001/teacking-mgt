package com.kgc.teackingmgt.entity;

import java.io.Serializable;

/**
 * (Masters)实体类
 *
 * @author makejava
 * @since 2020-09-17 11:47:57
 */
public class Masters implements Serializable {
    private static final long serialVersionUID = 201728584823694284L;

    private Integer masterid;

    private String mastername;

    private String masterphone;
    /**
     * 班主任荣誉等级
     */
    private Integer masterlevel;
    /**
     * 班主任荣誉分数
     */
    private Integer mastersocre;
    /**
     * 班主任喜爱度
     */
    private Integer masterpreperence;

    private Integer score1;

    private Integer score2;

    private Integer score3;

    private Integer score4;

    private Integer score5;

    private Integer status;


    public Integer getMasterid() {
        return masterid;
    }

    public void setMasterid(Integer masterid) {
        this.masterid = masterid;
    }

    public String getMastername() {
        return mastername;
    }

    public void setMastername(String mastername) {
        this.mastername = mastername;
    }

    public String getMasterphone() {
        return masterphone;
    }

    public void setMasterphone(String masterphone) {
        this.masterphone = masterphone;
    }

    public Integer getMasterlevel() {
        return masterlevel;
    }

    public void setMasterlevel(Integer masterlevel) {
        this.masterlevel = masterlevel;
    }

    public Integer getMastersocre() {
        return mastersocre;
    }

    public void setMastersocre(Integer mastersocre) {
        this.mastersocre = mastersocre;
    }

    public Integer getMasterpreperence() {
        return masterpreperence;
    }

    public void setMasterpreperence(Integer masterpreperence) {
        this.masterpreperence = masterpreperence;
    }

    public Integer getScore1() {
        return score1;
    }

    public void setScore1(Integer score1) {
        this.score1 = score1;
    }

    public Integer getScore2() {
        return score2;
    }

    public void setScore2(Integer score2) {
        this.score2 = score2;
    }

    public Integer getScore3() {
        return score3;
    }

    public void setScore3(Integer score3) {
        this.score3 = score3;
    }

    public Integer getScore4() {
        return score4;
    }

    public void setScore4(Integer score4) {
        this.score4 = score4;
    }

    public Integer getScore5() {
        return score5;
    }

    public void setScore5(Integer score5) {
        this.score5 = score5;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

}