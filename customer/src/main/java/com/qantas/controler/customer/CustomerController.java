package com.qantas.controler.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

	@Autowired
	private CustomerService service;
	
	@RequestMapping(method=RequestMethod.POST, value="/customers")
	@ResponseBody
	public Customer createCustomer(@RequestBody Customer customer){
		
		return service.createCustomerObject(customer);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/customers/{id}")
	@ResponseBody
	public Customer updateCustomer(@RequestBody Customer customer, @PathVariable String id){
		return service.updateCustomerObject(customer);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/customers/{id}")
	public void deleteCustomer(@RequestBody Customer customer, @PathVariable String id){
		service.deleteCustomerObject(id);
	}
}
