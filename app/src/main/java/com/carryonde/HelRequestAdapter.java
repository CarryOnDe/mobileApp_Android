package com.carryonde;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.constraintlayout.widget.ConstraintLayout;

import com.carryonde.model.HelpRequest;

import java.util.ArrayList;

public class HelRequestAdapter extends ArrayAdapter<HelpRequest> {

    Context context;
    ArrayList<HelpRequest> helpRequests;
    public HelRequestAdapter(Context context, ArrayList<HelpRequest> helpRequest) {
        super(context, 0, helpRequest);
        this.context = context;
        this.helpRequests = helpRequest;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        HelpRequest helpRequest = getItem(position);

        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.help_request, parent, false);
        }
        // Lookup view for data population
        TextView title = (TextView) convertView.findViewById(R.id.requestTitle);
        TextView description = (TextView) convertView.findViewById(R.id.description);
        TextView location = (TextView) convertView.findViewById(R.id.location);
        TextView distance = (TextView) convertView.findViewById(R.id.distance);
        TextView when = (TextView) convertView.findViewById(R.id.when);
        TextView duration = (TextView) convertView.findViewById(R.id.duration);
        //TextView tvHome = (TextView) convertView.findViewById(R.id.tvHome);
        // Populate the data into the template view using the data object
        title.setText(helpRequest.title);
        description.setText(helpRequest.description);
        location.setText(helpRequest.location.shortName);
        distance.setText(helpRequest.distance);
        when.setText(helpRequest.when);
        duration.setText(helpRequest.duration);
        return convertView;

    }
}
