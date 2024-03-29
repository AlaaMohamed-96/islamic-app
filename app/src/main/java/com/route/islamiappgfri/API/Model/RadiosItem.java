package com.route.islamiappgfri.API.Model;

import com.google.gson.annotations.SerializedName;

public class RadiosItem{
	private String name;
	@SerializedName("radio_url")
	private String radioUrl;

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setRadioUrl(String radioUrl){
		this.radioUrl = radioUrl;
	}

	public String getRadioUrl(){
		return radioUrl;
	}

	@Override
 	public String toString(){
		return 
			"RadiosItem{" + 
			"name = '" + name + '\'' + 
			",radio_url = '" + radioUrl + '\'' + 
			"}";
		}
}
