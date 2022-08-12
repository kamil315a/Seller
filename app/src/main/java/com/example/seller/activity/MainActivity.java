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

    EditText edtFirstName, edtLastName, edtEmail , edtZipCode;
    Button btnConfirm;



    @Override
    protected
    void onCreate(Bundle savedInstanceState)
        {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtFirstName = findViewById(R.id.edtFirstName);
        edtLastName = findViewById(R.id.edtLastName);
        edtEmail    = findViewById(R.id.edtEmail);
        edtZipCode  = findViewById(R.id.edtZipCode);
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