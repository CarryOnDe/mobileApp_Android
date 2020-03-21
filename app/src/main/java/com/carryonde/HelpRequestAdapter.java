package com.carryonde;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.carryonde.model.HelpRequest;

import java.util.ArrayList;

public class HelpRequestAdapter extends RecyclerView.Adapter<HelpRequestAdapter.HelpRequestViewHolder> {


    ArrayList<HelpRequest> helpRequests;
    Context context;

    public HelpRequestAdapter(ArrayList<HelpRequest> helpRequests, Context context) {
        this.helpRequests = helpRequests;
        this.context = context;

    }

    @NonNull
    @Override
    public HelpRequestViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater =  LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.help_request, parent, false);
        return new HelpRequestViewHolder(view);
        /*
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HelpRequestViewHolder {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.help_request, null)
        return HelpRequestViewHolder(view)
    }
         */
    }

    @Override
    public void onBindViewHolder(@NonNull HelpRequestViewHolder holder, int position) {
        HelpRequest helpRequest = helpRequests.get(position);
        holder.title.setText(helpRequest.title);
        holder.description.setText(helpRequest.description);
        holder.distance.setText("2");
    }

    @Override
    public int getItemCount() {
       return helpRequests.size();
    }

    class HelpRequestViewHolder extends RecyclerView.ViewHolder {
        TextView image, title, distance, description;
        public HelpRequestViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.image);
            title  = itemView.findViewById(R.id.title);
            distance = itemView.findViewById(R.id.distance);
            description = itemView.findViewById(R.id.description);
        }
    }

}