package com.example.spring.repository;

import com.example.spring.model.Doc;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DocRepository extends JpaRepository <Doc, Integer>{
}
