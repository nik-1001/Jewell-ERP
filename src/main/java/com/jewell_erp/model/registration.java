package com.jewell_erp.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class registration {

	@Id
	private int mobileNo;
	private String shopOwnerFullNmae;
	private String email;
	private String shopName;
	private String shopAddress;
	private String logo;
	private String gstinNo;

	public int getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(int mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getShopOwnerFullNmae() {
		return shopOwnerFullNmae;
	}

	public void setShopOwnerFullNmae(String shopOwnerFullNmae) {
		this.shopOwnerFullNmae = shopOwnerFullNmae;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getShopAddress() {
		return shopAddress;
	}

	public void setShopAddress(String shopAddress) {
		this.shopAddress = shopAddress;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getGstinNo() {
		return gstinNo;
	}

	public void setGstinNo(String gstinNo) {
		this.gstinNo = gstinNo;
	}

	@Override
	public String toString() {
		return "registration [mobileNo=" + mobileNo + ", shopOwnerFullNmae=" + shopOwnerFullNmae + ", email=" + email
				+ ", shopName=" + shopName + ", shopAddress=" + shopAddress + ", logo=" + logo + ", gstinNo=" + gstinNo
				+ "]";
	}

}
