package com.example.arya.jakarta.model;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class Wisataresponse{

	@SerializedName("wisata")
	private List<WisataItem> wisata;

	@SerializedName("status")
	private boolean status;

	public void setWisata(List<WisataItem> wisata){
		this.wisata = wisata;
	}

	public List<WisataItem> getWisata(){
		return wisata;
	}

	public void setStatus(boolean status){
		this.status = status;
	}

	public boolean isStatus(){
		return status;
	}

	@Override
 	public String toString(){
		return 
			"Wisataresponse{" + 
			"wisata = '" + wisata + '\'' + 
			",status = '" + status + '\'' + 
			"}";
		}
}