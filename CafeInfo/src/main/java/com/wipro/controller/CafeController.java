package com.wipro.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wipro.model.CafeInfo;
import com.wipro.service.CafeInfoService;

@Controller
public class CafeController {
	
	@Autowired
	CafeInfoService cafeInfoService;
	
	@GetMapping("/")
	public String index()
	{
		return "index";
	}
	
	@PostMapping("/addCafe")
	public String addCafe(@ModelAttribute("cafeName")String cafeName,@ModelAttribute("cafeDesc")String cafeDesc)
	{
		System.out.println("Inside CafeController...addCafe method");
		CafeInfo cafeInfo=new CafeInfo(cafeName,cafeDesc);
		System.out.println("details of cafeInfo:"+cafeInfo.getCafeName()+""+cafeInfo.getCafeDesc());
	    CafeInfo cafeInfoSaved= cafeInfoService.addCafe(cafeInfo);
	    if(cafeInfoSaved!=null)
	    {
	    	return "success";  // templates/success.html
	    }
	    else
	    {
	    	return "fail";   // templates/fail.html
	    }
	}
	
	@GetMapping("/getCafes")
	@ResponseBody
	public List<CafeInfo> getCafes()
	{
		return cafeInfoService.getCafes();
	}

	@GetMapping("/count")
	@ResponseBody
	public String getCafeCount()
	{
		return String.valueOf(cafeInfoService.getCafes().size());
	}
	
	
	  @GetMapping("/getCafeById/{cafeId}")  
	  @ResponseBody public Optional<CafeInfo> getCafeById(@PathVariable("cafeId") Integer cafeId)
	  { 
		  return cafeInfoService.getCafeById(cafeId); 
		  
	  }
	 
}
