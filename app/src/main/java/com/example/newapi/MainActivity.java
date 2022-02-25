package com.example.newapi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.nametxt)
    TextView nametxt;
    @BindView(R.id.idtxt)
    TextView idtxt;
    @BindView(R.id.yeartxt1)
    TextView yeartxt;
    @BindView(R.id.namevalue)
    TextView name;
    @BindView(R.id.id)
    TextView idaddress;
    @BindView(R.id.year)
    TextView year1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);


        ApiInterface methods = RetrofitClient.getRetrofitInstance().create(ApiInterface.class);
        Call<ApiResponse1> call = methods.getAllData();
        call.enqueue(new Callback<ApiResponse1>() {
            @Override
            public void onResponse(Call<ApiResponse1> call, Response<ApiResponse1> response) {
                if (response.isSuccessful()) {
                    Log.i("response", String.valueOf(response.body().getData().getName()));
                    name.setText(response.body().getData().getName());



                    idaddress.setText(String.valueOf(response.body().getData().getId()));


                    year1.setText(String.valueOf(response.body().getData().getYear()));
            }
                     }

            @Override
            public void onFailure(Call<ApiResponse1> call, Throwable t) {

            }
        });
            }
}


//            @Override
//            public void onFailure(Call<ApiResponse1> call, Throwable t) {
//                Toast.makeText(MainActivity.this, t.getMessage(), Toast.LENGTH_SHORT).show();

//            } });}}








                
            

                       
                    
                  //  public void checkYear () {
                       

//            @Override
//            public void onFailure(Call<ApiResponse1> call, Throwable t) {
//                        Toast.makeText(MainActivity.this, t.getMessage, Toast.LENGTH_SHORT).show();
//
//            }


        

