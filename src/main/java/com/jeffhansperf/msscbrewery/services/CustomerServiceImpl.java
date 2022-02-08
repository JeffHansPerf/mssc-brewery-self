package com.jeffhansperf.msscbrewery.services;

import com.jeffhansperf.msscbrewery.web.model.CustomerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Slf4j
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomerById(UUID customerId) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .name("Gayle Ale")
                .build();
    }
    @Override
    public CustomerDto saveNewCustomer(CustomerDto customerDto) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateCustomer(UUID customerId, CustomerDto customerDto) {
        //// TODO: 2/7/2022 -add real impl of this
        log.debug("Updating...");

    }

    @Override
    public void deleteById(UUID customerId) {
        log.debug("Deleting a whole PERSON...");
    }
}
