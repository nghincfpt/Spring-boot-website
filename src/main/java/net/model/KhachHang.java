package net.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "KhachHang")
public class KhachHang {
 
	@Id
	@Column(name = "maKH")
    private String maKH;
	
	@Column(name = "tenKH")
	private String tenKH;
	
	
	@Column(name = "gioTinh")
	private String gioTinh;
	
	
	@Column(name = "sdt")
	private String sdt;
	
	
	
	public KhachHang(String maKH, String tenKH, String gioTinh, String sdt) {
		super();
		this.maKH = maKH;
		this.tenKH = tenKH;
		this.gioTinh = gioTinh;
		this.sdt = sdt;
	}
	public KhachHang() {
		super();
	}
	public String getMaKH() {
		return maKH;
	}
	public void setMaKH(String maKH) {
		this.maKH = maKH;
	}
	public String getTenKH() {
		return tenKH;
	}
	
	public void setTenKH(String tenKH) {
		this.tenKH = tenKH;
	}
	public String getGioTinh() {
		return gioTinh;
	}
	public void setGioTinh(String gioTinh) {
		this.gioTinh = gioTinh;
	}
	public String getSdt() {
		return sdt;
	}
	public void setSdt(String sdt) {
		this.sdt = sdt;
	}
	
}
