package com.ilham.RecDessertApps.view.SemuaMenu;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.RelativeLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import com.ilham.RecDessertApps.R;
import com.ilham.RecDessertApps.adapter.RecDessert.RecDessertAdapter;
import com.ilham.RecDessertApps.api.APIEndPoint;
import com.ilham.RecDessertApps.api.APIService;
import com.ilham.RecDessertApps.model.RecipeModels;
import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class AllFragment extends Fragment {
    @BindView(R.id.recyclerSemuaMenu) RecyclerView recyclerView;


    Call<RecipeModels> call;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = (RelativeLayout) inflater.inflate(R.layout.fragment_semua_menu, container, false);
        getActivity().setTitle("RecDessert");
        super.onCreate(savedInstanceState);
        ButterKnife.bind(this,view);
        tampildata(null);
        return view;
    }



    void tampildata(String cari){
        APIService service=APIEndPoint.getClient().create(APIService.class);

        if(cari == null){
            call=service.getsemuadata();

            Toast.makeText(getActivity().getApplicationContext(),"Masukan Data",Toast.LENGTH_LONG).show();
        } else{
            call=service.getdataByNama(cari);
        }

        Call<RecipeModels> call=service.getsemuadata();
        call.enqueue(new Callback<RecipeModels>() {
            @Override
            public void onResponse(Call<RecipeModels> call, Response<RecipeModels> response) {
                Toast.makeText(getActivity().getApplicationContext(),"total ="+response.body().getTotal_result(),Toast.LENGTH_LONG).show();
                LinearLayoutManager linearLayoutManager=new LinearLayoutManager(getActivity().getApplicationContext());
                recyclerView.setLayoutManager(linearLayoutManager);
                recyclerView.setHasFixedSize(true);
                RecDessertAdapter recDessertAdapter =new RecDessertAdapter(getActivity().getApplicationContext(),response.body().getResults());
                recyclerView.setAdapter(recDessertAdapter);
            }


            @Override
            public void onFailure(Call<RecipeModels> call, Throwable t) {

            }
        });
    }

}

