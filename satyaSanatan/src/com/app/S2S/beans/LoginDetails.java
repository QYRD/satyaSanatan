package com.app.S2S.beans;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="LoginDetails")
@Table(name="LoginDetails")
public class LoginDetails {
	@Id
	@GeneratedValue
	private int id;
	@Column
	private String username;
	@Column
	private String password;
	@Column
	private String type;
	public LoginDetails(){}
	public LoginDetails(int id,String username,String password,String type){
		this.id=id;
		this.username=username;
		this .password=password;
		this.type=type;
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
}
