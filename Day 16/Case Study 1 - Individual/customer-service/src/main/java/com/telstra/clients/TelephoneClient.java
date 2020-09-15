package com.telstra.clients;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;

import com.telstra.model.Telephone;

@org.springframework.cloud.openfeign.FeignClient(url="http://localhost:8082/telephone", name="TELEPHONE-CLIENT")
public interface TelephoneClient {
	
	@GetMapping("/getcustomertelephonedetail")
	public List<Telephone> getCustomerTelephoneDetail(Long customerId);

}
