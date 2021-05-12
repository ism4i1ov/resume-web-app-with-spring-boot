package az.company.resume.dto.request;

import az.company.resume.entity.ResidenceEntity;

import java.io.Serializable;

public class ResidenceDto implements Serializable {
    private Long id;
    private String name;

    public ResidenceDto() {
    }

    public Long getId() {
        return id;
    }

    public ResidenceDto setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public ResidenceDto setName(String name) {
        this.name = name;
        return this;
    }

    public static ResidenceDto toDto(ResidenceEntity residenceEntity) {
        return new ResidenceDto().setId(residenceEntity.getId()).setName(residenceEntity.getName());
    }
}
