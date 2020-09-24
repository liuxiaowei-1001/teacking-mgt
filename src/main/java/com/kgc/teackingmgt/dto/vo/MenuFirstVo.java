package com.kgc.teackingmgt.dto.vo;

import java.util.ArrayList;
import java.util.List;

public class MenuFirstVo {

    private int rightid;
    private String rightName,iconpath,path;
    private List<MenuSecondVo> children=new ArrayList<>();

    public String getRightName() {
        return rightName;
    }

    public void setRightName(String rightName) {
        this.rightName = rightName;
    }

    public int getRightid() {
        return rightid;
    }

    public void setRightid(int rightid) {
        this.rightid = rightid;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getIconpath() {
        return iconpath;
    }

    public void setIconpath(String iconpath) {
        this.iconpath = iconpath;
    }

    public List<MenuSecondVo> getChildren() {
        return children;
    }

    public void setChildren(List<MenuSecondVo> children) {
        this.children = children;
    }

    @Override
    public String toString() {
        return "MenuFirstVo{" +
                "rightid=" + rightid +
                ", rightName='" + rightName + '\'' +
                ", iconpath='" + iconpath + '\'' +
                ", children=" + children +
                '}';
    }
}
