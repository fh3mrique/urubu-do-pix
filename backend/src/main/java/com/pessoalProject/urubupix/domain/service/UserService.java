package com.pessoalProject.urubupix.domain.service;

import com.pessoalProject.urubupix.domain.dto.TransactionSimulationDTO;
import com.pessoalProject.urubupix.domain.entities.TransactionSimulation;
import com.pessoalProject.urubupix.domain.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public TransactionSimulationDTO operation(Long userId, BigDecimal chosenAmout) {
        userRepository.findById(userId);

        BigDecimal returnValue = chosenAmout.multiply(BigDecimal.TEN);

        return new TransactionSimulationDTO(chosenAmout, returnValue); // Corrigido para passar chosenAmout e returnValue
    }
}
