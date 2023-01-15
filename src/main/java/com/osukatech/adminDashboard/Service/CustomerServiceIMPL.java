package com.osukatech.adminDashboard.Service;

import com.osukatech.adminDashboard.CustomerRepo.CustomerRepo;
import com.osukatech.adminDashboard.DTO.CustomerSaveDTO;
import com.osukatech.adminDashboard.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceIMPL implements CustomerService {
    @Autowired
    private CustomerRepo customerRepo;

    @Override
    public String addCustomer(CustomerSaveDTO customerSaveDTO) {
        Customer customer = new Customer(
                customerSaveDTO.getCustomername(),
                customerSaveDTO.getMobile()
        );
        customerRepo.save(customer);
        return customer.getCustomername();
    }
}
