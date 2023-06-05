package net.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.model.DonHang;
import net.repo.DonHangRep;

@Service

public class DonHangService {

	@Autowired
	private DonHangRep repository;
	
	 public void save(DonHang chungKhu) {
		 repository.save(chungKhu);
	    }
	     
	    public List<DonHang> listAll() {
	        return (List<DonHang>) repository.findAll();
	    }
	     
	    public DonHang get(String id) {
	        return repository.findById(id).get();
	    }
	     
	    public void delete(String matt) {
	    	repository.deleteById(matt);
	    }
}
