package com.bondtracker.Controller;

import com.bondtracker.model.Bond;
import com.bondtracker.Service.BondService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.bondtracker.Repository.BondRepository;
import java.util.List;

@RestController
@RequestMapping("/bonds")
public class BondController {

    @Autowired
    private BondService bondService;
	private BondRepository bondRepository;
    @GetMapping("/customer/{customerId}")
    public List<Bond> getActiveBondsForCustomer(@PathVariable String customerId) {
        return bondService.getActiveBondsForCustomer(customerId);
    }
@PostMapping
    public Bond addBond(@RequestBody Bond bond) {
        return bondRepository.save(bond);
    }
}
