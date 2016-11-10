package com.example.java2.rests;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.java2.rests.Model.Comment;
import com.example.java2.rests.Model.CommentsResponse;
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
        RestClient.getApi().getComments("desc","votes",10,3).enqueue(new Callback<CommentsResponse>() {
            @Override
            public void onResponse(Call<CommentsResponse> call, Response<CommentsResponse> response) {
                if(response.isSuccessful()){
                    System.out.println("gogogog");
                    ArrayList<Comment>go=(response.body().getItems());
                    Adapter adapter=new Adapter(MainActivity.this,go);
                    gg.setAdapter(adapter);
                }
            }

            @Override
            public void onFailure(Call<CommentsResponse> call, Throwable t) {

            }
        });

    }
}
