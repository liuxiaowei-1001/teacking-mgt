package com.kgc.teackingmgt.dto.vo;

public class MenuSecondVo {

    private int rightid;
    private String rightName,iconPath,path;

    public String getRightName() {
        return rightName;
    }

    public void setRightName(String rightName) {
        this.rightName = rightName;
    }

    public String getIconPath() {
        return iconPath;
    }

    public void setIconPath(String iconPath) {
        this.iconPath = iconPath;
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

    @Override
    public String toString() {
        return "MenuSecondVo{" +
                "rightid=" + rightid +
                ", rightName='" + rightName + '\'' +
                ", iconPath='" + iconPath + '\'' +
                '}';
    }
}
