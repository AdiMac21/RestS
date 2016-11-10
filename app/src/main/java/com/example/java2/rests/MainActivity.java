package com.example.java2.rests;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.java2.rests.Model.User;
import com.example.java2.rests.Model.UserResponse;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
ListView gg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
        gg= (ListView) findViewById(R.id.list_view);

    }

    private void init() {
        RestClient.getApi().getUser(100,"reputation").enqueue(new Callback<UserResponse>() {
            @Override
            public void onResponse(Call<UserResponse> call, Response<UserResponse> response) {
                if(response.isSuccessful()){
                    System.out.println("gogogog");
                    ArrayList<User>go=(response.body().getItems());
                    Adapter adapter=new Adapter(MainActivity.this,go);
                    gg.setAdapter(adapter);
                }
            }

            @Override
            public void onFailure(Call<UserResponse> call, Throwable t) {

            }
        });

    }
}
