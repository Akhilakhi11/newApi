package com.example.newapi;

import com.google.gson.annotations.SerializedName;

public class ApiResponse1 {

	@SerializedName("data")
	private Data data;

	@SerializedName("support")
	private Support support;

	public void setData(Data data){
		this.data = data;
	}

	public Data getData(){
		return data;
	}

	public void setSupport(Support support){
		this.support = support;
	}

	public Support getSupport(){
		return support;
	}



}