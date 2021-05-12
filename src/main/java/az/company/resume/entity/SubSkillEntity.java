package az.company.resume.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "sub_skills")
public class SubSkillEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "power")
    private Long power;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "skill_id", referencedColumnName = "id")
    private SkillEntity skill;

    public SubSkillEntity() {
    }

    public Long getId() {
        return id;
    }

    public SubSkillEntity setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public SubSkillEntity setName(String name) {
        this.name = name;
        return this;
    }

    public Long getPower() {
        return power;
    }

    public SubSkillEntity setPower(Long power) {
        this.power = power;
        return this;
    }

    public SkillEntity getSkill() {
        return skill;
    }

    public SubSkillEntity setSkill(SkillEntity skill) {
        this.skill = skill;
        return this;
    }
}
