package com.spring.springblog.infrastructure.dao;

import com.spring.springblog.domain.model.entity.Hello;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HelloDao extends JpaRepository<Hello, Integer> {
}
