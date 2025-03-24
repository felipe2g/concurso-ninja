package com.concursoninja.demo.services;

import com.concursoninja.demo.dtos.PublicExamCreateDTO;
import com.concursoninja.demo.dtos.PublicExamDTO;
import com.concursoninja.demo.entities.PublicExam;
import com.concursoninja.demo.mappers.PublicExamMapper;
import com.concursoninja.demo.repositories.PublicExamRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PublicExamService {
    private final PublicExamRepository repository;
    private final PublicExamMapper publicExamMapper;

    public PublicExamService(PublicExamRepository publicExamRepository, PublicExamMapper publicExamMapper) {
        this.repository = publicExamRepository;
        this.publicExamMapper = publicExamMapper;
    }

    public PublicExamDTO create(PublicExamCreateDTO dto) {
        PublicExam publicExam = repository.save(publicExamMapper.toConcurso(dto));
        return publicExamMapper.toPublicExamDTO(publicExam);
    }

    public List<PublicExamDTO> findAllPublicExams() {
        List<PublicExam> publicExams = repository.findAll();
        return publicExams.stream()
                .map(publicExamMapper::toPublicExamDTO)
                .toList();
    }
}
