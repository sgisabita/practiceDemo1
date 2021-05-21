package com.bank.employee.api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/v2")
public class EmployeeController {
	@GetMapping("/employees/{eid}")
	public EmployeeVO findEmployee(@PathVariable int eid) {
	EmployeeVO employeeVO = new EmployeeVO();
	employeeVO.setName("Nagendra kumar");
	employeeVO.setEmail("technohunk100@gmail.com");
	
	
		
		return null;
		
	}
	

}
