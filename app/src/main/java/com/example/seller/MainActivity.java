package com.example.seller;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.seller.databinding.FragmentLoginBinding;
import com.example.seller.ui.login.LoginFragment;

public
class MainActivity extends AppCompatActivity {

    EditText edtNickname, edtEmail;
    Button btnConfirm;



    @Override
    protected
    void onCreate(Bundle savedInstanceState)
        {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNickname = findViewById(R.id.edtNickname);
        edtEmail    = findViewById(R.id.edtEmail);
        btnConfirm  = findViewById(R.id.btnConfirm);


        btnConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public
            void onClick(View view)
                {

                }



        });


        }
}