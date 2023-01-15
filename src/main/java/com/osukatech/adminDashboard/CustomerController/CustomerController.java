package com.osukatech.adminDashboard.CustomerController;

import com.osukatech.adminDashboard.DTO.CustomerSaveDTO;
import com.osukatech.adminDashboard.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("api/v1/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @PostMapping(path = "/save")
    public String saveCustomer(@RequestBody CustomerSaveDTO customerSaveDTO) {
        String id = customerService.addCustomer(customerSaveDTO);
                return id;
    }
}
