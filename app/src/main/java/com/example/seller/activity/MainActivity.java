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
import com.google.android.gms.wallet.PaymentsClient;
import com.google.android.gms.wallet.Wallet;
import com.google.android.gms.wallet.WalletConstants;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

import java.nio.file.Watchable;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public
class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private PaymentsClient paymentsClient;

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

                Toast.makeText(MainActivity.this, "" + Objects.requireNonNull(binding.textInputLayoutEmail.getEditText()).getText().toString(), Toast.LENGTH_SHORT).show();
                Call<UserModel> call = dataBaseService.createUser(
                        Objects.requireNonNull(binding.textInputLayoutFirstName.getEditText()).getText().toString(),
                        Objects.requireNonNull(binding.textInputLayoutLastName.getEditText()).getText().toString(),
                        Objects.requireNonNull(binding.textInputLayoutEmail.getEditText()).getText().toString(),
                        Objects.requireNonNull(binding.textInputLayoutZipCode.getEditText()).getText().toString());

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
                        Toast.makeText(MainActivity.this, "onFailure message: " + t.getMessage(), Toast.LENGTH_LONG).show();
                        }
                });
                }
        });

        Wallet.WalletOptions walletOptions =
                new Wallet.WalletOptions.Builder()
                        .setEnvironment(WalletConstants.ENVIRONMENT_TEST)
                        .build();
        paymentsClient = Wallet.getPaymentsClient(this, walletOptions);
        }
}