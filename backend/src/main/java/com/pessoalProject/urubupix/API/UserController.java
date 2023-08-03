package com.pessoalProject.urubupix.API;

import com.pessoalProject.urubupix.domain.dto.TransactionSimulationDTO;
import com.pessoalProject.urubupix.domain.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/{userId}/simulate-transaction")
    public ResponseEntity<TransactionSimulationDTO> simulateTransaction(
            @PathVariable Long userId,
            @RequestParam BigDecimal chosenAmount) {
        TransactionSimulationDTO result = userService.operation(userId, chosenAmount);
        return ResponseEntity.ok(result);
    }
}
