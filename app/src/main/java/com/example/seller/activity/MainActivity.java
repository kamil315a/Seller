package com.example.seller.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.seller.R;
import com.example.seller.databinding.ActivityMainBinding;
import com.example.seller.model.UserModel;
import com.example.seller.my_interface.DataBaseService;
import com.example.seller.network.RetrofitInstance;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public
class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected
    void onCreate(Bundle savedInstanceState)
        {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

/*        final String zipCodeValidationRegex = "^\\d{5}$";
        Pattern pattern = Pattern.compile(zipCodeValidationRegex);
        Matcher matcher = pattern.matcher(edtZipCode.getText().toString());*/

        binding.btnConfirm.setOnClickListener(new View.OnClickListener() {
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
                        Objects.requireNonNull(binding.edtFirstName.getText()).toString(),
                        Objects.requireNonNull(binding.edtLastName.getText()).toString(),
                        Objects.requireNonNull(binding.edtEmail.getText()).toString(),
                        Objects.requireNonNull(binding.edtZipCode.getText()).toString());

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