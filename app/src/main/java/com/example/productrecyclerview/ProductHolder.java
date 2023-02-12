package com.example.productrecyclerview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ProductHolder extends RecyclerView.ViewHolder {
    TextView productName;
    ImageView productImage;

    public ProductHolder(@NonNull View view) {
        super(view);
        productImage = view.findViewById(R.id.product_image);
        productName = view.findViewById(R.id.product_name);
    }
}
