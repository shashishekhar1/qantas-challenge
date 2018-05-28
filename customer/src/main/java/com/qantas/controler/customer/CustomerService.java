package com.qantas.controler.customer;

import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class CustomerService {

	private RestTemplate restTemplate = new RestTemplate();
	private String baseCrmUri = "https://testsalesforcecrm.com:443";
	private String apiPath = "/v1/api/customer";
	HttpHeaders httpHeaders = null;
	
	
	public Customer createCustomerObject(Customer c){
		httpHeaders = new HttpHeaders();
		httpHeaders.set("Content-Type", "application/json");
		
		UriComponentsBuilder builder = UriComponentsBuilder
				                        .fromUriString(baseCrmUri)
										.path(apiPath);
		
		return restTemplate.postForObject(builder.toUriString(), c, Customer.class);
		
	}
	
	public Customer updateCustomerObject(Customer c){
		httpHeaders = new HttpHeaders();
		httpHeaders.set("Content-Type", "application/json");
		
		UriComponentsBuilder builder = UriComponentsBuilder
				                        .fromUriString(baseCrmUri)
										.path(apiPath)
										.queryParam("customerId", c.getId());
		
		restTemplate.put(builder.toUriString(), c);
		return restTemplate.getForObject(builder.toUriString(), Customer.class);
		
	}
	
	public void deleteCustomerObject(String id){
		httpHeaders = new HttpHeaders();
		httpHeaders.set("Content-Type", "application/json");
		
		UriComponentsBuilder builder = UriComponentsBuilder
				                        .fromUriString(baseCrmUri)
										.path(apiPath)
										.queryParam("customerId", id);
		
		restTemplate.delete(builder.toUriString());
		
	}
	
	public Customer getCustomerObject(String id){
		httpHeaders = new HttpHeaders();
		httpHeaders.set("Content-Type", "application/json");
		
		UriComponentsBuilder builder = UriComponentsBuilder
				                        .fromUriString(baseCrmUri)
										.path(apiPath)
										.queryParam("customerId", id);
		
		return restTemplate.getForObject(builder.toUriString(), Customer.class);
		
	}
}
