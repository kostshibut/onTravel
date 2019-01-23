package com.OnTravel.springboot.repository;

import com.OnTravel.springboot.model.Election;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface VoteJpaRepository extends JpaRepository<Election, Long> {

}
