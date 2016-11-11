package com.zl.mvpsamiple;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.zl.mvpsamiple.presenter.UserPresenter;
import com.zl.mvpsamiple.view.IUserView;

public class MainActivity extends AppCompatActivity implements IUserView, View.OnClickListener {

    private EditText ageEdit, nameEdit, mIdEditText;
    private Button mSaveButton, mLoadButton;
    private UserPresenter mUserPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findWidgets();
        mUserPresenter = new UserPresenter(this);
        mSaveButton.setOnClickListener(this);
        mLoadButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        // TODO Auto-generated method stub
        switch (v.getId()) {
            case R.id.saveButton:
                mUserPresenter.saveUser(getID(), getAge(), getName());
                break;
            case R.id.loadButton:
                mUserPresenter.loadUser(getID());
                break;
            default:
                break;
        }
    }


    @Override
    public int getID() {
        // TODO Auto-generated method stub
        return Integer.parseInt(mIdEditText.getText().toString());
    }

    @Override
    public String getName() {
        return nameEdit.getText().toString();
    }

    @Override
    public String getAge() {
        return ageEdit.getText().toString();
    }

    @Override
    public void setName(String name) {
        nameEdit.setText(name);
    }

    @Override
    public void setAge(String age) {
        ageEdit.setText(age);
    }


    void findWidgets() {
        ageEdit = (EditText) findViewById(R.id.age);
        nameEdit = (EditText) findViewById(R.id.name);
        mIdEditText = (EditText) findViewById(R.id.id_edt);

        mSaveButton = (Button) findViewById(R.id.saveButton);
        mLoadButton = (Button) findViewById(R.id.loadButton);
    }
}
