package net.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.model.KhachHang;
import net.repo.KhachHangRepo;

@Service

public class KhachHangService {

	
	@Autowired
	private KhachHangRepo repository;
	
	 public void save(KhachHang khachHang) {
		 repository.save(khachHang);
	    }
	     
	    public List<KhachHang> listAll() {
	        return (List<KhachHang>) repository.findAll();
	    }
	     
	    public KhachHang get(String id) {
	        return repository.findById(id).get();
	    }
	     
	    public void delete(String matt) {
	    	repository.deleteById(matt);
	    }
	   
}
