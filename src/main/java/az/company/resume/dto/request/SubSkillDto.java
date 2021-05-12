package az.company.resume.dto.request;

import az.company.resume.entity.SubSkillEntity;

import java.io.Serializable;

public class SubSkillDto implements Serializable {

    private Long id;
    private String name;
    private Long power;

    public SubSkillDto() {
    }

    public Long getId() {
        return id;
    }

    public SubSkillDto setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public SubSkillDto setName(String name) {
        this.name = name;
        return this;
    }

    public Long getPower() {
        return power;
    }

    public SubSkillDto setPower(Long power) {
        this.power = power;
        return this;
    }

    public static SubSkillDto toDto(SubSkillEntity subSkillEntity) {
        return new SubSkillDto().setId(subSkillEntity.getId()).setName(subSkillEntity.getName()).setPower(subSkillEntity.getPower());
    }

    public String getSkillClass() {
        return "skill-percentage skill-" + power;
    }
}
