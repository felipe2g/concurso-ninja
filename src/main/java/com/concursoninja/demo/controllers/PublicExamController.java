package com.concursoninja.demo.controllers;

import com.concursoninja.demo.dtos.PublicExamCreateDTO;
import com.concursoninja.demo.dtos.PublicExamDTO;
import com.concursoninja.demo.entities.PublicExam;
import com.concursoninja.demo.services.PublicExamService;
import jakarta.validation.Valid;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/public-exams")
public class PublicExamController {
    private final PublicExamService publicExamService;

    public PublicExamController(PublicExamService publicExamService) {
        this.publicExamService = publicExamService;
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<PublicExamDTO>> findAll() {
        List<PublicExamDTO> publicExam = publicExamService.findAllPublicExams();
        return ResponseEntity.ok(publicExam);
    }

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<PublicExamDTO> create(@RequestBody @Valid PublicExamCreateDTO dto) {
        PublicExamDTO publicExam = publicExamService.create(dto);
        return ResponseEntity.ok(publicExam);
    }
}
