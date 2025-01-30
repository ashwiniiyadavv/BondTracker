package com.bondtracker.Repository;

import com.bondtracker.model.Bond;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BondRepository extends JpaRepository<Bond, Long> {

    List<Bond> findByCustomerIdAndIsActive(String customerId, boolean isActive);

}
