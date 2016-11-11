package com.zl.mvpsamiple.presenter;


import android.util.Log;

import com.zl.mvpsamiple.bean.User;
import com.zl.mvpsamiple.model.IUserModel;
import com.zl.mvpsamiple.model.UserModel;
import com.zl.mvpsamiple.view.IUserView;

public class UserPresenter {
	private IUserView mUserView;
	private IUserModel mUserModel;

	public UserPresenter(IUserView view) {
		mUserView = view;
		mUserModel = new UserModel();
	}

	public void saveUser(int id,String age, String name) {
		mUserModel.setID(id);
		mUserModel.setAge(age);
		mUserModel.setName(name);
	}

	public void loadUser(int id) {
		User user = mUserModel.load(id);
		mUserView.setAge(user.getP_age());
		mUserView.setName(user.getP_name());
		Log.e("用户信息：","name:"+user.getP_name() +"          age:"+user.getP_age());
	}
}
