package com.example.mybank.adapters.dtos;

import com.example.mybank.domain.user.UserType;

import java.math.BigDecimal;

public record UserDTO(String firstName,
                      String lastName,
                      String email,
                      BigDecimal balance,
                      UserType userType,
                      String password,
                      String document) {
}
