package com.rmhan.itf.model.register;

import com.google.gson.annotations.SerializedName;

public class RegisterData {

	@SerializedName("name")
	private String name;

	@SerializedName("username")
	private String username;

	@SerializedName("email")
	private String email;

	@SerializedName("phone")
	private String phone;

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setUsername(String username){
		this.username = username;
	}

	public String getUsername(){
		return username;
	}

	public void setEmail(String email){
		this.email = email;
	}
	public String getEmail(){
		return email;
	}
	public void setPhone(String phone){
		this.phone = phone;
	}
	public String getPhone(){
		return phone;
	}
}