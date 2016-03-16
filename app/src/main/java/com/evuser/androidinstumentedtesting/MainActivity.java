package com.evuser.androidinstumentedtesting;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private TextInputLayout nameInputLayout, emailInputLayout, passwordInputLayout;
    private EditText edtName, edtEmail, edtPassword;
    private Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
        setupEvents();
    }

    private void init() {
        nameInputLayout = (TextInputLayout) findViewById(R.id.layout_edt_name);
        emailInputLayout = (TextInputLayout) findViewById(R.id.layout_edt_email);
        passwordInputLayout = (TextInputLayout) findViewById(R.id.layout_edt_password);

        edtName = (EditText) findViewById(R.id.edt_name);
        edtEmail = (EditText) findViewById(R.id.edt_email);
        edtPassword = (EditText) findViewById(R.id.edt_password);
        btnSubmit = (Button) findViewById(R.id.btn_submit);
    }

    private void setupEvents() {
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callLogin();
            }
        });
    }

    private void callLogin() {
        String name = edtName.getText().toString().trim();
        String email = edtEmail.getText().toString().trim();
        String password = edtPassword.getText().toString().trim();

        if (TextUtils.isNullOrEmpty(name)) {
            nameInputLayout.setError("Field should not empty");
            requestFocus(edtName);
            return;
        } else {
            nameInputLayout.setErrorEnabled(false);
        }

        if (TextUtils.isNullOrEmpty(email)) {
            emailInputLayout.setError("Field should not empty");
            requestFocus(edtEmail);
            return;
        } else {
            emailInputLayout.setErrorEnabled(false);
        }

        if (!TextUtils.isValidEmail(email)) {
            emailInputLayout.setError("Field should not empty");
            requestFocus(edtEmail);
            return;
        } else {
            emailInputLayout.setErrorEnabled(false);
        }

        if (TextUtils.isNullOrEmpty(password)) {
            passwordInputLayout.setError("Field should not empty");
            requestFocus(edtPassword);
            return;
        } else {
            passwordInputLayout.setErrorEnabled(false);
        }

        /*AlertDialog dialog = new AlertDialog.Builder(MainActivity.this)
                .setTitle("Validator")
                .setMessage("Given details are valid")
                .setCancelable(false)
                .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                }).create();

        dialog.show();*/
        startActivity(new Intent(MainActivity.this, NextActivity.class));
    }

    private void requestFocus(EditText edtView) {
        if (edtView.requestFocus()) {
            getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_VISIBLE);
        }
    }
}