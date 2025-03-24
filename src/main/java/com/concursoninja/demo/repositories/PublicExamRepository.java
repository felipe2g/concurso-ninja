package com.concursoninja.demo.repositories;

import com.concursoninja.demo.entities.PublicExam;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublicExamRepository extends JpaRepository<PublicExam, Long> {}
