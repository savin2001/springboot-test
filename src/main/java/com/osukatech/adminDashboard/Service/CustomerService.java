package com.osukatech.adminDashboard.Service;

import com.osukatech.adminDashboard.DTO.CustomerDTO;
import com.osukatech.adminDashboard.DTO.CustomerSaveDTO;

import java.util.List;

public interface CustomerService {
    String addCustomer(CustomerSaveDTO customerSaveDTO);

    List<CustomerDTO> getAllCustomers();
}
