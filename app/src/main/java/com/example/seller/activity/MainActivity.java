package com.example.seller.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.seller.R;
import com.example.seller.model.UserModel;
import com.example.seller.my_interface.DataBaseService;
import com.example.seller.network.RetrofitInstance;

import java.io.IOException;

import retrofit2.Call;
import retrofit2.CallAdapter;
import retrofit2.Response;

public
class MainActivity extends AppCompatActivity {


    EditText edtFirstName;
    EditText edtLastName;
    EditText edtEmail;
    EditText edtZipCode;
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
                DataBaseService dataBaseService = RetrofitInstance.getRetrofit().create(DataBaseService.class);


/*                try {
                    Toast.makeText(MainActivity.this, ""+edtZipCode, Toast.LENGTH_SHORT).show();
                    Log.d("edtZipCode", "wywalilo");
                    Response<UserModel> userModelResponse = dataBaseService.createUser(edtFirstName.getText().toString(),
                            edtLastName.getText().toString(),
                            edtEmail.getText().toString(),
                            Integer.parseInt(edtZipCode.getText().toString())).execute();
                } catch (IOException e) {
                    e.printStackTrace();
                }*/



                }




        });


        }
}