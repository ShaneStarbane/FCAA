package com.example.hendryshanedeguia.freshcartadminapp.Adapters;

import android.app.Activity;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.hendryshanedeguia.freshcartadminapp.Models.OrderInnerDetailsModel;
import com.example.hendryshanedeguia.freshcartadminapp.R;

import java.util.List;

/**
 * Created by HendryShanedeGuia on 03/10/2017.
 */

public class OrderItemsAdapter extends ArrayAdapter<OrderInnerDetailsModel> {
    private Activity context;
    private int resource;
    private List<OrderInnerDetailsModel> listOrders;

    public OrderItemsAdapter(@NonNull Activity context, @LayoutRes int resource, @NonNull List<OrderInnerDetailsModel> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        listOrders = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();


        View v = inflater.inflate(resource,parent, false);
        TextView tvName = (TextView) v.findViewById(R.id.tvOSName);
        TextView tvPrice = (TextView) v.findViewById(R.id.tvOSPrice);
        TextView tvQuant = (TextView) v.findViewById(R.id.tvOSQTY);
        TextView tvSubtotal = (TextView) v.findViewById(R.id.tvOSTotal);


        tvName.setText(listOrders.get(position).getProdName());
        tvPrice.setText(listOrders.get(position).getProdPrice());
        tvQuant.setText(listOrders.get(position).getOrderQuantity());
        tvSubtotal.setText(listOrders.get(position).getSubTotal());


        return v;

    }
}
