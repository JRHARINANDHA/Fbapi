package com.reality.escape.fbapi;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.reality.escape.fbapi.Adapter.CardAdapter;
import com.reality.escape.fbapi.Model.ProfileDetails;

import java.util.ArrayList;

/**
 * Created by JR HARI NANDHA on 17-12-2016.
 */
public class Content extends AppCompatActivity {


    public ArrayList<ProfileDetails> details;
    private RecyclerView recyclerView;
    private String name,email,birthday,gender,id;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content);

        name = getIntent().getExtras().getString("name","name");
        email = getIntent().getExtras().getString("email","email");
        birthday = getIntent().getExtras().getString("birthday","birthday");
        gender = getIntent().getExtras().getString("gender","gender");
        id = getIntent().getExtras().getString("id","id");

        System.out.println("Details"+ name+email+birthday+gender);

        init();

    }


    private void init(){
        System.out.println("iDetails"+ name+email+birthday+gender);
        recyclerView = (RecyclerView) findViewById(R.id.cardList);
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        details = new ArrayList<>();
        ProfileDetails profileDetails = new ProfileDetails(name,gender,email,birthday,id);
        details.add(profileDetails);

        RecyclerView.Adapter adapter = new CardAdapter(details);
        recyclerView.setAdapter(adapter);
        System.out.println("count"+adapter.getItemCount());


    }


}
