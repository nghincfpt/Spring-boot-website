package net.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.model.ChiTietHonHang;
import net.repo.ChiTietDonHangRepo;

@Service

public class ChiTietDonHangService {

	
	@Autowired
	private ChiTietDonHangRepo repository;
	
	 public void save(ChiTietHonHang chiTietHonHang) {
		 repository.save(chiTietHonHang);
	    }
	     
	    public List<ChiTietHonHang> listAll() {
	        return (List<ChiTietHonHang>) repository.findAll();
	    }
	     
	    public ChiTietHonHang get(String id) {
	        return repository.findById(id).get();
	    }
	     
	    public void delete(String matt) {
	    	repository.deleteById(matt);
	    }
}
