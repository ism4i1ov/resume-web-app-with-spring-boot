package az.company.resume.dto.request;

import az.company.resume.entity.WorkExperienceEntity;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class WorkExperienceDto implements Serializable {

    private Long id;

    private String companyName;

    private String professionName;

    private LocalDate dateStart;

    private LocalDate dateEnd;

    private String description;

    public WorkExperienceDto() {
    }

    public Long getId() {
        return id;
    }

    public WorkExperienceDto setId(Long id) {
        this.id = id;
        return this;
    }

    public String getProfessionName() {
        return professionName;
    }

    public WorkExperienceDto setProfessionName(String professionName) {
        this.professionName = professionName;
        return this;
    }

    public LocalDate getDateStart() {
        return dateStart;
    }

    public WorkExperienceDto setDateStart(LocalDate dateStart) {
        this.dateStart = dateStart;
        return this;
    }

    public LocalDate getDateEnd() {
        return dateEnd;
    }

    public WorkExperienceDto setDateEnd(LocalDate dateEnd) {
        this.dateEnd = dateEnd;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public WorkExperienceDto setDescription(String description) {
        this.description = description;
        return this;
    }

    public static WorkExperienceDto toDto(WorkExperienceEntity experienceEntity) {
        return new WorkExperienceDto()
                .setId(experienceEntity.getId())
                .setDateStart(experienceEntity.getDateStart())
                .setDateEnd(experienceEntity.getDateEnd())
                .setProfessionName(experienceEntity.getProfessionName())
                .setCompanyName(experienceEntity.getCompanyName())
                .setDescription(experienceEntity.getDescription());
    }

    public String getCompanyName() {
        return companyName;
    }

    public WorkExperienceDto setCompanyName(String companyName) {
        this.companyName = companyName;
        return this;
    }

    public String getDate() {
        String endDate = "Present";
        if (getDateEnd() != null) {
            endDate = getDateEnd().format(DateTimeFormatter.ofPattern("MMM yyyy"));
        }
        return getDateStart().format(DateTimeFormatter.ofPattern("MMM yyyy")) + " - " + endDate;
    }
}
