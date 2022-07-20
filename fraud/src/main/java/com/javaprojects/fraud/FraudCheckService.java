package com.javaprojects.fraud;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@AllArgsConstructor
public class FraudCheckService {
    private final FraudCheckHistoryRepository fraudCheckHistoryRepository;

    public boolean isFradulentCustomer(Integer customerID) {
        fraudCheckHistoryRepository.save(
                FraudCheckHistory
                        .builder()
                        .isFraudster(false)
                        .customerId(customerID)
                        .createdAt(LocalDateTime.now())
                        .build()
        );
        return false;
    }
}
