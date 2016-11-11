package com.zl.mvpsamiple.model;

import com.zl.mvpsamiple.bean.User;

public interface IUserModel {
	void setID(int id);
	void setAge(String age);

	void setName(String Name);
	User load(int id);


}
