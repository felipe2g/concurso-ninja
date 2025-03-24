package com.concursoninja.demo.dtos;

import com.concursoninja.demo.enums.StatusPublicExam;
import com.concursoninja.demo.enums.TypePublicExam;

import java.time.LocalDate;
import java.util.Objects;

public class PublicExamDTO {
    private Long id;
    private String title;
    private String governmentAgency;
    private LocalDate applicationStartDate;
    private LocalDate applicationEndDate;
    private StatusPublicExam status;
    private TypePublicExam type;

    public PublicExamDTO() {
    }

    public PublicExamDTO(Long id, String title, String governmentAgency, LocalDate applicationStartDate, LocalDate applicationEndDate, StatusPublicExam status, TypePublicExam type) {
        this.id = id;
        this.title = title;
        this.governmentAgency = governmentAgency;
        this.applicationStartDate = applicationStartDate;
        this.applicationEndDate = applicationEndDate;
        this.status = status;
        this.type = type;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
        PublicExamDTO that = (PublicExamDTO) o;
        return Objects.equals(id, that.id) && Objects.equals(title, that.title) && Objects.equals(governmentAgency, that.governmentAgency) && Objects.equals(applicationStartDate, that.applicationStartDate) && Objects.equals(status, that.status) && type == that.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, governmentAgency, applicationStartDate, status, type);
    }
}
