package com.osukatech.adminDashboard.Service;

import com.osukatech.adminDashboard.CustomerRepo.CustomerRepo;
import com.osukatech.adminDashboard.DTO.CustomerDTO;
import com.osukatech.adminDashboard.DTO.CustomerSaveDTO;
import com.osukatech.adminDashboard.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerServiceIMPL implements CustomerService {
    @Autowired
    private CustomerRepo customerRepo;

    // This method adds new customers
    @Override
    public String addCustomer(CustomerSaveDTO customerSaveDTO) {
        Customer customer = new Customer(
                customerSaveDTO.getCustomername(),
                customerSaveDTO.getMobile()
        );
        customerRepo.save(customer);
        return customer.getCustomername();
    }

    // This method fetches all customer records from the database
    @Override
    public List<CustomerDTO> getAllCustomers() {
        List<Customer> getCustomers = customerRepo.findAll();
        List<CustomerDTO> customerDTOList = new ArrayList<>();
        for(Customer a:getCustomers)
        {
            CustomerDTO customerDTO = new CustomerDTO(

                    a.getCustomerid(),
                    a.getCustomername(),
                    a.getMobile()
            );
            customerDTOList.add(customerDTO);
        }

        return  customerDTOList;
    }
}
