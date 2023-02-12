package com.example.productrecyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CustomRecyclerVew extends RecyclerView.Adapter<ProductHolder> {
    Context context;

    List<Product> list;

    public CustomRecyclerVew(Context context, List<Product> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ProductHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ProductHolder(LayoutInflater.from(context).inflate(R.layout.product_detail, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ProductHolder holder, int position) {
        holder.productImage.setImageResource(list.get(position).getProductImage());
        holder.productName.setText(list.get(position).getProductName());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
