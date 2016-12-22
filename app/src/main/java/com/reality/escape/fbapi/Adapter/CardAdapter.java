package com.reality.escape.fbapi.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.facebook.login.widget.LoginButton;
import com.facebook.login.widget.ProfilePictureView;
import com.reality.escape.fbapi.Model.ProfileDetails;
import com.reality.escape.fbapi.R;

import java.util.ArrayList;

/**
 * Created by JR HARI NANDHA on 18-12-2016.
 */
public class CardAdapter extends RecyclerView.Adapter<CardAdapter.ViewHolder>{
    private ArrayList<ProfileDetails> details;

    public CardAdapter(ArrayList<ProfileDetails> details){
        this.details = details;
    }

    @Override
    public CardAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(CardAdapter.ViewHolder holder, int position) {

        ProfileDetails profileDetails = details.get(position);
        holder.name.setText(profileDetails.getName());
        holder.gender.setText(profileDetails.getGender());
        holder.email.setText(profileDetails.getEmail());
        holder.dob.setText(profileDetails.getDob());
        holder.dp.setProfileId(profileDetails.getId());
    }

    @Override
    public int getItemCount() {
        return details.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder{

        private TextView name,email,gender,dob,title,idname,idgender,idemail,iddob;
        private ProfilePictureView dp;
        private LoginButton loginButton;

        public ViewHolder(View view){
            super(view);

            title = (TextView)view.findViewById(R.id.title);
            idname = (TextView)view.findViewById(R.id.idname);
            idgender = (TextView)view.findViewById(R.id.idgender);
            idemail = (TextView)view.findViewById(R.id.idemail);
            iddob = (TextView)view.findViewById(R.id.iddob);
            name = (TextView)view.findViewById(R.id.name);
            email = (TextView)view.findViewById(R.id.email);
            dob = (TextView)view.findViewById(R.id.birthday);
            gender = (TextView)view.findViewById(R.id.gender);
            dp = (ProfilePictureView) view.findViewById(R.id.profilePic);



        }
    }
}



