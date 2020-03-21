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
        TextView description = (TextView) convertView.findViewById(R.id.description);
        //TextView tvHome = (TextView) convertView.findViewById(R.id.tvHome);
        // Populate the data into the template view using the data object
        description.setText(helpRequest.description);
        //tvHome.setText(user.hometown);
        // Return the completed view to render on screen
        return convertView;

        /*
            var listItem: View? = convertView
        if (listItem == null)
            listItem = LayoutInflater.from(context).inflate(R.layout.group_list_element_view , parent, false)
        val group = groups?.get(position!!)
        val name = listItem!!.findViewById(R.id.textView_name) as TextView
        name.setText(group?.name)
        return listItem
         */
    }
}
