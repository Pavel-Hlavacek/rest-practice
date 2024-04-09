package com.kebronis.spring6restmvc.mappers;

import com.kebronis.spring6restmvc.entities.Customer;
import com.kebronis.spring6restmvc.model.CustomerDTO;
import org.mapstruct.Mapper;

@Mapper
public interface CustomerMapper {

    Customer customerDtoToCustomer(CustomerDTO dto);
    CustomerDTO customerToCustomerDto(Customer customer);
}
