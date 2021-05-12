package az.company.resume.dto.request;

import az.company.resume.entity.EducationEntity;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class EducationDto implements Serializable {
    private Long id;

    private String name;

    private LocalDate startDate;

    private LocalDate endDate;

    private String description;

    private String educationDegree;

    public EducationDto() {
    }

    public Long getId() {
        return id;
    }

    public EducationDto setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public EducationDto setName(String name) {
        this.name = name;
        return this;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public EducationDto setStartDate(LocalDate startDate) {
        this.startDate = startDate;
        return this;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public EducationDto setEndDate(LocalDate endDate) {
        this.endDate = endDate;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public EducationDto setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getEducationDegree() {
        return educationDegree;
    }

    public EducationDto setEducationDegree(String educationDegree) {
        this.educationDegree = educationDegree;
        return this;
    }

    public static EducationDto toDto(EducationEntity educationEntity) {
        return new EducationDto()
                .setId(educationEntity.getId())
                .setName(educationEntity.getName())
                .setStartDate(educationEntity.getDateStart())
                .setEndDate(educationEntity.getDateEnd())
                .setDescription(educationEntity.getDescription())
                .setEducationDegree(educationEntity.getEducationDegree());

    }

    public String getDate(){
        return getStartDate().format(DateTimeFormatter.ofPattern("MMM yyyy")) + " - " + getEndDate().format(DateTimeFormatter.ofPattern("MMM yyyy"));
    }
}
