package com.concursoninja.demo.dtos;

import com.concursoninja.demo.enums.StatusPublicExam;
import com.concursoninja.demo.enums.TypePublicExam;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.Objects;

public class PublicExamCreateDTO {

    @NotBlank
    private String title;

    @NotBlank
    private String governmentAgency;

    @NotNull
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate applicationStartDate;

    @NotNull
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate applicationEndDate;

    @NotNull
    private StatusPublicExam status;

    @NotNull
    private TypePublicExam type;

    public PublicExamCreateDTO() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGovernmentAgency() {
        return governmentAgency;
    }

    public void setGovernmentAgency(String governmentAgency) {
        this.governmentAgency = governmentAgency;
    }

    public LocalDate getApplicationStartDate() {
        return applicationStartDate;
    }

    public void setApplicationStartDate(LocalDate applicationStartDate) {
        this.applicationStartDate = applicationStartDate;
    }

    public LocalDate getApplicationEndDate() {
        return applicationEndDate;
    }

    public void setApplicationEndDate(LocalDate applicationEndDate) {
        this.applicationEndDate = applicationEndDate;
    }

    public StatusPublicExam getStatus() {
        return status;
    }

    public void setStatus(StatusPublicExam status) {
        this.status = status;
    }

    public TypePublicExam getType() {
        return type;
    }

    public void setType(TypePublicExam type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        PublicExamCreateDTO that = (PublicExamCreateDTO) o;
        return Objects.equals(title, that.title) && Objects.equals(governmentAgency, that.governmentAgency) && Objects.equals(applicationStartDate, that.applicationStartDate) && Objects.equals(applicationEndDate, that.applicationEndDate) && Objects.equals(status, that.status) && type == that.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, governmentAgency, applicationStartDate, applicationEndDate, status, type);
    }
}
