package com.example.springvue.repositories;

import com.example.springvue.models.Address;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

public interface AddressRepository extends PagingAndSortingRepository<Address, String> {

}