package com.example.arya.jakarta;

import android.app.ProgressDialog;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.arya.jakarta.api.ApiClient;
import com.example.arya.jakarta.api.ApiService;
import com.example.arya.jakarta.model.WisataItem;
import com.example.arya.jakarta.model.Wisataresponse;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private List<WisataItem> wisataItemList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
         getAllDataLocationLangLng();
    }

    private void getAllDataLocationLangLng() {
        final ProgressDialog dialog =new ProgressDialog(this);
        dialog.setMessage("Menampilkan lokasi wisata....");
        dialog.show();

        ApiService api = ApiClient.getService();
        Call<Wisataresponse> wisataresponseCall = api.tampil_semua();
        wisataresponseCall.enqueue(new Callback<Wisataresponse>() {
            @Override
            public void onResponse(Call<Wisataresponse> call, Response<Wisataresponse> response) {
                dialog.dismiss();
                wisataItemList = response.body().getWisata();
                initMarker(wisataItemList);
            }

            @Override
            public void onFailure(Call<Wisataresponse> call, Throwable t) {
                dialog.dismiss();
                Toast.makeText(MapsActivity.this, t.getMessage(), Toast.LENGTH_SHORT).show();

            }

        });
    }

    private void initMarker (List<WisataItem> wisataItemList){
        for (int i=0; i<wisataItemList.size(); i++) {
            LatLng location = new LatLng(Double.parseDouble(wisataItemList.get(i).getLatitude()), Double.parseDouble(wisataItemList.get(i).getLongitude()));
            mMap.addMarker(new MarkerOptions().position(location).title(wisataItemList.get(i).getNama()));
            LatLng latLng =new LatLng(Double.parseDouble(wisataItemList.get(0).getLatitude()), Double.parseDouble(wisataItemList.get(0).getLongitude()));
            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(latLng.latitude, latLng.longitude), 10.0f));
        }
    }
}
