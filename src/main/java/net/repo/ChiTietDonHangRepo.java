package net.repo;

import org.springframework.data.repository.CrudRepository;

import net.model.ChiTietHonHang;


public interface ChiTietDonHangRepo  extends CrudRepository<ChiTietHonHang, String> {

}
