package com.example.tugassensor.ui.restoran;
//NIM : 10119078
//Nama: Adam Firdaus Darmawan
//Kelas : IF2

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tugassensor.R;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class RestoranFragment extends Fragment implements OnMapReadyCallback {

    private GoogleMap map;

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_restoran, container, false);
        SupportMapFragment mapFragment = (SupportMapFragment) getChildFragmentManager().findFragmentById(R.id.area);
        mapFragment.getMapAsync(this);
        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }

        @Override
        public void onMapReady(@NonNull GoogleMap googleMap) {
            LatLng fuku = new LatLng(-6.830239604704853, 107.63362845108581);
            LatLng gerbong = new LatLng(-6.81251599880454, 107.6195260934153);
            LatLng nobu = new LatLng(-6.870327798624317, 107.59300048103462);
            LatLng angkringan = new LatLng(-6.814498758168102, 107.62322003609694);
            LatLng gacoan = new LatLng(-6.865997096988526, 107.59387737492509);

            googleMap.addMarker(new MarkerOptions().position(fuku).title("Makanan Jepang di atas gunung"));
            googleMap.addMarker(new MarkerOptions().position(gerbong).title("Ramen autentik di pinggir jalan"));
            googleMap.addMarker(new MarkerOptions().position(nobu).title("Ramen inovasi beda dari yang lain"));
            googleMap.addMarker(new MarkerOptions().position(angkringan).title("Cilok, Nasi goreng, dll buat malem malem"));
            googleMap.addMarker(new MarkerOptions().position(gacoan).title("Mie pedas murah"));

            googleMap.moveCamera(CameraUpdateFactory.newLatLng(fuku));
        }

}