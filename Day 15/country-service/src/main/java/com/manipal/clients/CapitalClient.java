package com.manipal.clients;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import com.manipal.demo.model.Capital;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(url="http://localhost:8000/country", name="CAPITAL-CLIENT")
public interface CapitalClient {
	
	@GetMapping("/getcountrycapitaldetail")
	public List<Capital> getCountryCapitalDetail(String name);

}