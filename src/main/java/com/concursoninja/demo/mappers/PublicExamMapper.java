package com.concursoninja.demo.mappers;

import com.concursoninja.demo.dtos.PublicExamCreateDTO;
import com.concursoninja.demo.dtos.PublicExamDTO;
import com.concursoninja.demo.entities.PublicExam;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
@Component
public interface PublicExamMapper {

    PublicExamMapper INSTANCE = Mappers.getMapper(PublicExamMapper.class);

    PublicExamDTO toPublicExamDTO(PublicExam publicExam);

    @Mapping(target = "id", ignore = true)
    PublicExam toConcurso(PublicExamCreateDTO publicExamCreateDTO);
}
