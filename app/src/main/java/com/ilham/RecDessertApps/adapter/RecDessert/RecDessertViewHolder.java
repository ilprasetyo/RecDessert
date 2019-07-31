package com.ilham.RecDessertApps.adapter.RecDessert;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.ilham.RecDessertApps.R;
import com.ilham.RecDessertApps.model.Result;
import com.ilham.RecDessertApps.view.SemuaMenu.AllActivity;


import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class RecDessertViewHolder extends RecyclerView.ViewHolder {

    @BindView(R.id.gambar_tampilan_semua) ImageView gambarSemua;
    @BindView(R.id.txtSemua_Nama_makanan) TextView namaSemua;


    private List<Result> resultRecipeList = new ArrayList<>();

    public RecDessertViewHolder(@NonNull View view) {


        super(view);
        ButterKnife.bind(this,view);
    }
    public  void setItem(List<Result> item){
        resultRecipeList = item;
    }
    @OnClick()
    void click(@NonNull View itemView){
        int position = getAdapterPosition();
        //String nama = resultRecipeList.get(position).getNama_masakan();
        //Toast.makeText(view.getContext(),nama,Toast.LENGTH_LONG).show();
        ///////////////////////////////////////////////////////////////////
        String gambar = resultRecipeList.get(position).getGambar_dessert();
        String nama_dessert = resultRecipeList.get(position).getNama_dessert();
        String bahan = resultRecipeList.get(position).getBahan();
        String cara = resultRecipeList.get(position).getCara();

        Intent intent = new Intent(itemView.getContext(), AllActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.putExtra("gambar", gambar);
        intent.putExtra("Nama Dessert", nama_dessert);
        intent.putExtra("Bahan", bahan);
        intent.putExtra("Cara", cara);
        itemView.getContext().startActivity(intent);
        ///////////////////////////////////////////////////////////////////



    }

}
