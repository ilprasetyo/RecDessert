package com.ilham.RecDessertApps.adapter.RecDessert;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ilham.RecDessertApps.R;
import com.ilham.RecDessertApps.model.Result;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.List;

public class RecDessertAdapter extends RecyclerView.Adapter<RecDessertViewHolder> {

    private Context context;
    private List<Result> resultRecipeList;

    ///constructor
    public RecDessertAdapter(Context context, List<Result> resultRecipeList){
        this.context = context;
        this.resultRecipeList = resultRecipeList;
    }

    @NonNull
    @Override
    public RecDessertViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_list_semua,viewGroup,false);

        return new RecDessertViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull RecDessertViewHolder recDessertViewHolder, int i) {
        Result resultRecipe = resultRecipeList.get(i);
        recDessertViewHolder.namaSemua.setText(resultRecipe.getNama_dessert());
//        recDessertViewHolder.jenisSemua.setText(resultRecipe.getGambar_dessert());
        Glide.with(context)
                .load("https://kostlab.id/project/ilham/xfile/dessert/"+ resultRecipe.getGambar_dessert())
                .apply(new RequestOptions().override(100,100).centerCrop())
                .into(recDessertViewHolder.gambarSemua);
        recDessertViewHolder.setItem(resultRecipeList);
    }

    @Override
    public int getItemCount() {

        return resultRecipeList.size();
    }
}
