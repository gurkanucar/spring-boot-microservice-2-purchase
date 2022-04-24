package com.gucardev.springbootmicroservice2purchase.service;

import com.gucardev.springbootmicroservice2purchase.model.Purchase;
import com.gucardev.springbootmicroservice2purchase.repository.PurchaseRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class PurchaseService {

    private final PurchaseRepository purchaseRepository;


    public PurchaseService(PurchaseRepository purchaseRepository) {
        this.purchaseRepository = purchaseRepository;
    }

    public Purchase savePurchase(Purchase purchase) {
        purchase.setPurchaseTime(LocalDateTime.now());
        return purchaseRepository.save(purchase);
    }

    public List<Purchase> findAllPurchasesOfUser(Long userId) {
        return purchaseRepository.findAllByUserId(userId);
    }


}
