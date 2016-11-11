package com.zl.mvpsamiple.bean;

/**
 * Created by zhanglin on 2016/11/1
 */

public class User {
    private String p_age;
    private String p_name;

    public String getP_age() {
        return p_age;
    }

    public void setP_age(String p_age) {
        this.p_age = p_age;
    }

    public String getP_name() {
        return p_name;
    }

    public void setP_name(String p_name) {
        this.p_name = p_name;
    }

    public User(String p_age, String p_name) {
        this.p_age = p_age;
        this.p_name = p_name;
    }
}
