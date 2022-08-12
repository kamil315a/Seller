package com.example.seller.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.seller.R;
import com.example.seller.network.RetrofitInstance;

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

        edtNickname = findViewById(R.id.edtFirstName);
        edtEmail    = findViewById(R.id.edtEmail);
        btnConfirm  = findViewById(R.id.btnConfirm);


        btnConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public
            void onClick(View view)
                {
                    edtNickname.getText().toString();

                }



        });


        }
}