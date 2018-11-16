  package com.example.arya.jakarta.model;


import com.google.gson.annotations.SerializedName;

public class WisataItem{

	@SerializedName("kode_wilayah")
	private String kodeWilayah;

	@SerializedName("nama")
	private String nama;

	@SerializedName("jam")
	private String jam;

	@SerializedName("latitude")
	private String latitude;

	@SerializedName("id")
	private String id;

	@SerializedName("deskripsi")
	private String deskripsi;

	@SerializedName("gambar")
	private String gambar;

	@SerializedName("longitude")
	private String longitude;

	public void setKodeWilayah(String kodeWilayah){
		this.kodeWilayah = kodeWilayah;
	}

	public String getKodeWilayah(){
		return kodeWilayah;
	}

	public void setNama(String nama){
		this.nama = nama;
	}

	public String getNama(){
		return nama;
	}

	public void setJam(String jam){
		this.jam = jam;
	}

	public String getJam(){
		return jam;
	}

	public void setLatitude(String latitude){
		this.latitude = latitude;
	}

	public String getLatitude(){
		return latitude;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setDeskripsi(String deskripsi){
		this.deskripsi = deskripsi;
	}

	public String getDeskripsi(){
		return deskripsi;
	}

	public void setGambar(String gambar){
		this.gambar = gambar;
	}

	public String getGambar(){
		return gambar;
	}

	public void setLongitude(String longitude){
		this.longitude = longitude;
	}

	public String getLongitude(){
		return longitude;
	}

	@Override
 	public String toString(){
		return 
			"WisataItem{" + 
			"kode_wilayah = '" + kodeWilayah + '\'' + 
			",nama = '" + nama + '\'' + 
			",jam = '" + jam + '\'' + 
			",latitude = '" + latitude + '\'' + 
			",id = '" + id + '\'' + 
			",deskripsi = '" + deskripsi + '\'' + 
			",gambar = '" + gambar + '\'' + 
			",longitude = '" + longitude + '\'' + 
			"}";
		}
}