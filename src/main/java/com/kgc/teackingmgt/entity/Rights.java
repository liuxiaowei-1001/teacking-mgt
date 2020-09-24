package com.kgc.teackingmgt.entity;

import java.io.Serializable;

/**
 * (Rights)实体类
 *
 * @author makejava
 * @since 2020-09-17 11:48:06
 */
public class Rights implements Serializable {
    private static final long serialVersionUID = -28407069395164539L;

    private Integer rightid;

    private Integer level;

    private String rightname;

    private String path;

    private Integer parentid;


    public Integer getRightid() {
        return rightid;
    }

    public void setRightid(Integer rightid) {
        this.rightid = rightid;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getRightname() {
        return rightname;
    }

    public void setRightname(String rightname) {
        this.rightname = rightname;
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}