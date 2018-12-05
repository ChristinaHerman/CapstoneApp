package capstoneorderhistory.orderhistory.OrderHistoryCapstone.controller;



import java.io.ByteArrayInputStream;
import java.util.List;

import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import capstoneorderhistory.orderhistory.OrderHistoryCapstone.model.Product;
import capstoneorderhistory.orderhistory.OrderHistoryCapstone.service.ExcelWriterService;
import capstoneorderhistory.orderhistory.OrderHistoryCapstone.service.OrderHistoryService;

@RestController
@RequestMapping("/")
public class OrderHistoryController {
	
	

private ExcelWriterService services;
OrderHistoryService service = new OrderHistoryService();

	public OrderHistoryController(ExcelWriterService services) {
		this.services = services;
	}
	
	@GetMapping("/orders/customer")
	public ResponseEntity<InputStreamResource> excelCustomersReport() {
		 List<Product> list = service.getOrderDistrictName();

		ByteArrayInputStream in = services.createExcelFile(list);
		
		HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Disposition", "attachment; filename=customers.xlsx");
		
        return ResponseEntity
	                .ok()
	                .headers(headers)
	                .body(new InputStreamResource(in));
        
    }
@GetMapping("/products")
public ResponseEntity<InputStreamResource> excelDistrictReport() {
	 List<Product> list = service.getOrderDistrictName();

	ByteArrayInputStream in = services.createExcelFile(list);
	
	HttpHeaders headers = new HttpHeaders();
    headers.add("Content-Disposition", "attachment; filename=district.xlsx");
	
    return ResponseEntity
                .ok()
                .headers(headers)
                .body(new InputStreamResource(in));
    
	
}
@GetMapping("orders/donor")
public ResponseEntity<InputStreamResource> excelDonorReport() {
	 List<Product> list = service.getOrderDistrictName();

	ByteArrayInputStream in = services.createExcelFile(list);
	
	HttpHeaders headers = new HttpHeaders();
    headers.add("Content-Disposition", "attachment; filename=donor.xlsx");
	
    return ResponseEntity
                .ok()
                .headers(headers)
                .body(new InputStreamResource(in));
}
    

 @GetMapping("orders/district")
 public ResponseEntity<InputStreamResource> excelProductReport() {
	 List<Product> list = service.getOrderDistrictName();

		ByteArrayInputStream in = services.createExcelFile(list);
		
		HttpHeaders headers = new HttpHeaders();
     headers.add("Content-Disposition", "attachment; filename=product.xlsx");
		
     return ResponseEntity
	                .ok()
	                .headers(headers)
	                .body(new InputStreamResource(in));
 }
     

 }

