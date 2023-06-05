package net.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ChiTietDonHang")
public class ChiTietHonHang {
@Id
@Column(name = "maCTDH")
private String maCTDH;

@Column(name = "tenSP")
private String tenSP;

@Column(name = "soTien")
private Float soTien;

@Column(name = "ghiChu")
private String ghiChu;


@JoinColumn(name = "maDH")
@OneToOne(fetch = FetchType.LAZY)
private DonHang donHang;


public ChiTietHonHang(String maCTDH, String tenSP, Float soTien, String ghiChu, DonHang donHang) {
	super();
	this.maCTDH = maCTDH;
	this.tenSP = tenSP;
	this.soTien = soTien;
	this.ghiChu = ghiChu;
	this.donHang = donHang;
}


public ChiTietHonHang() {
	super();
}


public String getMaCTDH() {
	return maCTDH;
}


public void setMaCTDH(String maCTDH) {
	this.maCTDH = maCTDH;
}


public String getTenSP() {
	return tenSP;
}


public void setTenSP(String tenSP) {
	this.tenSP = tenSP;
}


public Float getSoTien() {
	return soTien;
}


public void setSoTien(Float soTien) {
	this.soTien = soTien;
}


public String getGhiChu() {
	return ghiChu;
}


public void setGhiChu(String ghiChu) {
	this.ghiChu = ghiChu;
}


public DonHang getDonHang() {
	return donHang;
}


public void setDonHang(DonHang donHang) {
	this.donHang = donHang;
}
}
