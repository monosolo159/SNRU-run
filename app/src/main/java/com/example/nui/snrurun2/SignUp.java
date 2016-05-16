package com.example.nui.snrurun2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class SignUp extends AppCompatActivity {

    private EditText nameEdt, userEdt, passEdt;
    private RadioGroup radioGroup;
    private RadioButton choice1Rdo, choice2Rdo, choice3Rdo, choice4Rdo,choice5Rdo;
    private String strName, strUser, strPass, strAvata;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        bindWidget();

    }// end method main onCreate

    private void bindWidget() {
        nameEdt = (EditText) findViewById(R.id.edtName);
        userEdt = (EditText) findViewById(R.id.edtUser);
        passEdt = (EditText) findViewById(R.id.edtPass);
        radioGroup = (RadioGroup) findViewById(R.id.radAvata);
        choice1Rdo = (RadioButton) findViewById(R.id.radioButton1);
        choice2Rdo = (RadioButton) findViewById(R.id.radioButton2);
        choice3Rdo = (RadioButton) findViewById(R.id.radioButton3);
        choice4Rdo = (RadioButton) findViewById(R.id.radioButton4);
        choice5Rdo = (RadioButton) findViewById(R.id.radioButton5);
    }

    public void clickSingUpSign(View view){
        strName = nameEdt.getText().toString().trim();
        strUser = userEdt.getText().toString().trim();
        strPass = passEdt.getText().toString().trim();

        //check Space
        if(strName.equals("") || strUser.equals("") || strPass.equals("")){
            MyAlert myAlert = new MyAlert();
            myAlert.myDialog(this,"มีช่องว่าง","กรุณากรอกทุกช่อง");
        }else{

        }

    }// end method clickSignUpSign
}// end Main Class
