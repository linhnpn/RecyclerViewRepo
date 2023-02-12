package com.example.productrecyclerview;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class ListProduct extends AppCompatActivity {
    private static final int ADD_PRODUCT = 2;
    RecyclerView recyclerView;

    List<Product> listProduct = new ArrayList<>();

    CustomRecyclerVew customRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_product);

        displayProduct();
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
    }

    private void displayProduct(){
        recyclerView = findViewById(R.id.list_product);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 3));
        listProduct = new ArrayList<>();
        listProduct = addProductToList(9);

        customRecyclerView = new CustomRecyclerVew(this, listProduct);
        recyclerView.setAdapter(customRecyclerView);
    }

    private ArrayList<Product> addProductToList(int size){
        ArrayList<Product> list = new ArrayList<>();
        String[] listName = {"Hoa", "Hoa hong", "Hoa mai", "Hoa mau don", "Hoa nhai", "Hoa rupy", "Hoa Tigon", "Hoa tulip"};
        int[] listImage = {R.drawable.hoa,R.drawable.hoahong,R.drawable.mai,R.drawable.maudon,R.drawable.nhai,
                R.drawable.rupy, R.drawable.tigon, R.drawable.tulip};
        for(int i = 0; i < size - 1; i++) {
            Product product = new Product(listImage[i], listName[i]);
            list.add(product);
        }
        return  list;
    }
}