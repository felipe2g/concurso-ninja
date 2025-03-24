package com.concursoninja.demo.entities;

import com.concursoninja.demo.enums.StatusPublicExam;
import com.concursoninja.demo.enums.TypePublicExam;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "public-exam")
public class PublicExam {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    @JsonProperty("governmentAgency")
    private String governmentAgency;

    @Column(nullable = false)
    @JsonFormat(pattern = "dd/MM/yyyy")
    @JsonProperty("applicationStartDate")
    private LocalDate applicationStartDate;

    @Column(nullable = false)
    @JsonFormat(pattern = "dd/MM/yyyy")
    @JsonProperty("applicationEndDate")
    private LocalDate applicationEndDate;

    @Column(nullable = false)
    private StatusPublicExam status;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private TypePublicExam type;

    public PublicExam() {
    }

    public PublicExam(Long id, String title, String governmentAgency, LocalDate applicationStartDate, LocalDate applicationEndDate, StatusPublicExam status, TypePublicExam type) {
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
        PublicExam that = (PublicExam) o;
        return Objects.equals(id, that.id) && Objects.equals(title, that.title) && Objects.equals(governmentAgency, that.governmentAgency) && Objects.equals(applicationStartDate, that.applicationStartDate) && Objects.equals(applicationEndDate, that.applicationEndDate) && Objects.equals(status, that.status) && type == that.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, governmentAgency, applicationStartDate, applicationEndDate, status, type);
    }
}
