package com.osukatech.adminDashboard.CustomerController;

import com.osukatech.adminDashboard.DTO.CustomerDTO;
import com.osukatech.adminDashboard.DTO.CustomerSaveDTO;
import com.osukatech.adminDashboard.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/v1/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    //  New customers are registered using this url
    @PostMapping(path = "/save")
    public String saveCustomer(@RequestBody CustomerSaveDTO customerSaveDTO) {
        String id = customerService.addCustomer(customerSaveDTO);
                return id;
    }

    //  List of the customers
    @GetMapping(path = "/get-all-customers")
    public List<CustomerDTO> getAllCustomers() {
        List<CustomerDTO> allCustomers = customerService.getAllCustomers();
        return allCustomers;
    }
}
