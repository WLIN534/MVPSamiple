package com.zl.mvpsamiple.model;

import android.util.SparseArray;

import com.zl.mvpsamiple.bean.User;

public class UserModel implements IUserModel {

    private String name;
    private String age;
    private int mID;
    private SparseArray<User> mUsererArray = new SparseArray<User>();
    @Override
    public void setID(int id) {
        mID = id;
    }


    @Override
    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public void setName(String Name) {
        this.name = Name;
        User UserBean = new User(age, name);
        mUsererArray.append(mID, UserBean);
    }

    @Override
    public User load(int id) {
        mID = id;
        User userBean = mUsererArray.get(mID, new User("not found",
                "not found"));
        return userBean;
    }
}
