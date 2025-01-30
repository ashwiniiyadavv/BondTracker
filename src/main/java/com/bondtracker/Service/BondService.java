package com.bondtracker.Service;

import com.bondtracker.model.Bond;
import com.bondtracker.Repository.BondRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BondService {

    @Autowired
    private BondRepository bondRepository;

    public List<Bond> getActiveBondsForCustomer(String customerId) {
        return bondRepository.findByCustomerIdAndIsActive(customerId, true);
    }
}
