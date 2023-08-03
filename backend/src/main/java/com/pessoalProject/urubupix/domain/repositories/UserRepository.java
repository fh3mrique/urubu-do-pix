package com.pessoalProject.urubupix.domain.repositories;

import com.pessoalProject.urubupix.domain.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    
}
