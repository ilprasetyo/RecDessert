package com.ilham.RecDessertApps.view.SemuaMenu;

import android.app.Fragment;
import android.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import com.ilham.RecDessertApps.R;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class AllActivity extends AppCompatActivity {
    FragmentManager fragmentManager;
    Fragment fragment = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_all);
        //////////////////////////////////////////////////////////////

        ButterKnife.bind(this);

        String gambar = getIntent().getExtras().getString("gambar");
        String nama_dessert = getIntent().getExtras().getString("Nama Dessert");
        String bahan = getIntent().getExtras().getString("Bahan");
        String cara = getIntent().getExtras().getString("Cara");

        ImageView gambarx = (ImageView)findViewById(R.id.img_isi_semua);
        TextView nama_masakanx = (TextView)findViewById(R.id.txtNama_isi_semua);
        TextView resep_masakanx = (TextView)findViewById(R.id.txtBahan_isi_semua);
        TextView cara_masakx = (TextView)findViewById(R.id.txtCaraMasak_isi_semua);

        nama_masakanx.setText(nama_dessert);
        resep_masakanx.setText(bahan);
        cara_masakx.setText(cara);
        Glide.with(this)
                .load("https://kostlab.id/project/ilham/xfile/dessert/"+gambar)
                .apply(new RequestOptions().override(100,100).centerCrop())
                .into(gambarx);
        ////////////////////////////////////////////////////////////////////



    }
//        @OnClick(R.id.img_back_semua)
//        public void back() {
//            Intent in = new Intent(AllActivity.this, Main2Activity.class);
//            startActivity(in);
//        }









//    @OnClick(R.id.img_back_semua)
//
//
//    private void callFragment(Fragment fragment) {
//        fragmentManager = getFragmentManager();
//        fragmentManager.beginTransaction()
//                .replace(R.id.frame_container, fragment)
//                .commit();
//    }




}
