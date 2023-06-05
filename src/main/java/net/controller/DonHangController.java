package net.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import net.DTO.DTOBoot;
import net.model.ChiTietHonHang;
import net.model.DonHang;
import net.model.KhachHang;
import net.service.ChiTietDonHangService;
import net.service.DonHangService;
import net.service.KhachHangService;

@Controller
public class DonHangController {

	
	
	@Autowired
	private DonHangService donHangService;
	
	
	@Autowired
	private ChiTietDonHangService chiTietDonHangService;
	
	@Autowired
	private KhachHangService khachHangService;
	
	@ModelAttribute("listMakh")
	public List<KhachHang> allList(){
		return khachHangService.listAll();
	}
	
	
	

	@RequestMapping("/")
	public ModelAndView homeView() {
		ModelAndView maHome = new ModelAndView("indeHome");
		List<DonHang> list = donHangService.listAll();
		maHome.addObject("lists", list);
		return maHome;
	}
	
	@RequestMapping("/xemchitiet")
	public ModelAndView homeViewxemchitiet() {
		ModelAndView maHome1 = new ModelAndView("indexXemChiTiet");
		List<ChiTietHonHang> list1 = chiTietDonHangService.listAll();
		maHome1.addObject("listxemchitiet", list1);
		return maHome1;
	}
	
	
	@RequestMapping("/add")
	public String newCustomerForm(Map<String, Object> model) {
 	  model.put("boot", new DTOBoot());
	    return "add";
	}

	@PostMapping("/saveDonHang")
	public String saveBoots( @Validated @ModelAttribute("boot") DTOBoot dtoBoot,
			BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			return "add";
		}
		  DonHang donHang = new DonHang();
		  ChiTietHonHang chiTietHonHang =  new ChiTietHonHang();
		  	  
		BeanUtils.copyProperties(dtoBoot,donHang);
		BeanUtils.copyProperties(dtoBoot,chiTietHonHang);		
		
		chiTietHonHang.setDonHang(donHang);
		
		donHangService.save(donHang);
		chiTietDonHangService.save(chiTietHonHang);
		
		return "redirect:/";
	}
}
