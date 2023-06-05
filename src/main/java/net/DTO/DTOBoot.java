package net.DTO;

import java.time.LocalDate;

import javax.validation.constraints.NotEmpty;

import org.springframework.format.annotation.DateTimeFormat;

import net.model.KhachHang;

public class DTOBoot {
	@NotEmpty
	private String maCTDH;
	private String tenSP;
	private Float soTien;
	private String ghiChu;
	private String maKH;
	private String maDH;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate ngayDatMay;
	private String trangThaiThanhToan;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate ngayHenTra;
	private String trangThaiDonHang;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate ngayTra;
	private KhachHang khachHang;
	public DTOBoot(String maCTDH, String tenSP, Float soTien, String ghiChu, String maKH, String maDH,
			LocalDate ngayDatMay, String trangThaiThanhToan, LocalDate ngayHenTra, String trangThaiDonHang,
			LocalDate ngayTra, KhachHang khachHang) {
		super();
		this.maCTDH = maCTDH;
		this.tenSP = tenSP;
		this.soTien = soTien;
		this.ghiChu = ghiChu;
		this.maKH = maKH;
		this.maDH = maDH;
		this.ngayDatMay = ngayDatMay;
		this.trangThaiThanhToan = trangThaiThanhToan;
		this.ngayHenTra = ngayHenTra;
		this.trangThaiDonHang = trangThaiDonHang;
		this.ngayTra = ngayTra;
		this.khachHang = khachHang;
	}
	public DTOBoot() {
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
	public String getMaKH() {
		return maKH;
	}
	public void setMaKH(String maKH) {
		this.maKH = maKH;
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
