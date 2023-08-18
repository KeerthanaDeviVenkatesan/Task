package com.example.Task.Repository;

import com.example.Task.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepo extends JpaRepository<Address,Long>{
}
