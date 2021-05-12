package az.company.resume.dto.request;

import az.company.resume.entity.SkillEntity;

import java.io.Serializable;
import java.util.List;
import java.util.stream.Collectors;

public class SkillDto implements Serializable {

    private Long id;

    private String name;

    private List<SubSkillDto> subSkillList;

    public SkillDto() {
    }

    public Long getId() {
        return id;
    }

    public SkillDto setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public SkillDto setName(String name) {
        this.name = name;
        return this;
    }

    public List<SubSkillDto> getSubSkillList() {
        return subSkillList;
    }

    public SkillDto setSubSkillList(List<SubSkillDto> subSkillList) {
        this.subSkillList = subSkillList;
        return this;
    }

    public static SkillDto toDto(SkillEntity skillEntity) {
        return new SkillDto()
                .setId(skillEntity.getId())
                .setName(skillEntity.getName())
                .setSubSkillList(skillEntity.getSubSkillList()
                        .stream()
                        .map(SubSkillDto::toDto)
                        .collect(Collectors.toList()));
    }
}
