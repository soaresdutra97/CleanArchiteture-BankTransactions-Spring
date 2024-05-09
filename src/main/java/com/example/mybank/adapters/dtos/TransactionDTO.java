package com.example.mybank.adapters.dtos;

import java.math.BigDecimal;

public record TransactionDTO(BigDecimal value,
                             Long senderId,
                             Long receiverId) {
}
