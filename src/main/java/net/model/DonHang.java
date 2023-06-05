package net.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "DonHang")
public class DonHang {
	
	@Id
	@Column(name="maDH")
	private String maDH;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name="ngayDatMay")
	private LocalDate ngayDatMay;
	
	@Column(name="trangThaiThanhToan")
	private String trangThaiThanhToan;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name="ngayHenTra")
	private LocalDate ngayHenTra;
	
	@Column(name="trangThaiDonHang")
	private String trangThaiDonHang;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name="ngayTra")
	private LocalDate ngayTra;
	
	
	@JoinColumn(name = "maKH",referencedColumnName = "maKH")
	
	@ManyToOne(fetch = FetchType.LAZY)
	private KhachHang khachHang;


	public DonHang(String maDH, LocalDate ngayDatMay, String trangThaiThanhToan, LocalDate ngayHenTra,
			String trangThaiDonHang, LocalDate ngayTra, KhachHang khachHang) {
		super();
		this.maDH = maDH;
		this.ngayDatMay = ngayDatMay;
		this.trangThaiThanhToan = trangThaiThanhToan;
		this.ngayHenTra = ngayHenTra;
		this.trangThaiDonHang = trangThaiDonHang;
		this.ngayTra = ngayTra;
		this.khachHang = khachHang;
	}


	public DonHang() {
		super();
	}


	public String getMaDH() {
		return maDH;
	}


	public void setMaDH(String maDH) {
		this.maDH = maDH;
	}


	public LocalDate getNgayDatMay() {
		return ngayDatMay;
	}


	public void setNgayDatMay(LocalDate ngayDatMay) {
		this.ngayDatMay = ngayDatMay;
	}


	public String getTrangThaiThanhToan() {
		return trangThaiThanhToan;
	}


	public void setTrangThaiThanhToan(String trangThaiThanhToan) {
		this.trangThaiThanhToan = trangThaiThanhToan;
	}


	public LocalDate getNgayHenTra() {
		return ngayHenTra;
	}


	public void setNgayHenTra(LocalDate ngayHenTra) {
		this.ngayHenTra = ngayHenTra;
	}


	public String getTrangThaiDonHang() {
		return trangThaiDonHang;
	}


	public void setTrangThaiDonHang(String trangThaiDonHang) {
		this.trangThaiDonHang = trangThaiDonHang;
	}


	public LocalDate getNgayTra() {
		return ngayTra;
	}


	public void setNgayTra(LocalDate ngayTra) {
		this.ngayTra = ngayTra;
	}


	public KhachHang getKhachHang() {
		return khachHang;
	}


	public void setKhachHang(KhachHang khachHang) {
		this.khachHang = khachHang;
	}


}
