package com.example.bank_service;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class BalanceRepository {
      private final Map<Long, BigDecimal> storege = new HashMap<>(Map.of(1L,BigDecimal.ZERO));

    public BigDecimal getBalanceForId(Long accountId) {
        return storege.get(accountId);
    }
}
