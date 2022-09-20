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
import java.lang.invoke.MethodHandle;
import java.lang.reflect.Method;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import okhttp3.Request;
import okio.Timeout;
import retrofit2.Call;
import retrofit2.CallAdapter;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.http.PUT;

public
class MainActivity extends AppCompatActivity {



    EditText edtFirstName = null;
    EditText edtLastName = null;
    EditText edtEmail = null;
    EditText edtZipCode = null;
    Button btnConfirm = null;

    private boolean validateZipCode(){

        if(edtZipCode.getText().toString().isEmpty()){
            edtZipCode.setError("Field can't be empty");
        }

        return true;
    };

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




        final String zipCodeValidationRegex = "^\\d{5}$";
        Pattern pattern = Pattern.compile(zipCodeValidationRegex);
        Matcher matcher = pattern.matcher(edtZipCode.getText().toString());
        validateZipCode();

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
                //INPUT VALIDATION NEEDED

                Call<UserModel> call = dataBaseService.createUser(
                        edtFirstName.getText().toString(),
                        edtLastName.getText().toString(),
                        edtEmail.getText().toString(),
                        Integer.valueOf(edtZipCode.getText().toString()));

                call.enqueue(new Callback<UserModel>() {
                    @Override
                    public
                    void onResponse(Call<UserModel> call, Response<UserModel> response)
                        {

                            Toast.makeText(MainActivity.this, "onResponse code: " + response.code(), Toast.LENGTH_SHORT).show();

                        }

                    @Override
                    public
                    void onFailure(Call<UserModel> call, Throwable t)
                        {
                        Toast.makeText(MainActivity.this, "onFailure message: " + t.getMessage(), Toast.LENGTH_SHORT).show();
                        }
                });
                }
        });
        }
}