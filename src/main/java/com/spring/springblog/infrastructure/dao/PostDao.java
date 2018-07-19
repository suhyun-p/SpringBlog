package com.spring.springblog.infrastructure.dao;

import com.spring.springblog.domain.model.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;

public interface PostDao extends JpaRepository<Post, Integer> {
    public Post setRegDate(Date date);
}
