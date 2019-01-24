package com.fileapp.model;

import java.io.Serializable;

public class AccountInfo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer account_No;
	private String account_Name;
	private String mobile;
	private String bank;
	public Integer getAccount_No() {
		return account_No;
	}
	public void setAccount_No(Integer account_No) {
		this.account_No = account_No;
	}
	public String getAccount_Name() {
		return account_Name;
	}
	public void setAccount_Name(String account_Name) {
		this.account_Name = account_Name;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getBank() {
		return bank;
	}
	public void setBank(String bank) {
		this.bank = bank;
	}
	

}
