package az.company.resume.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "skill")
public class SkillEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private UserEntity user;

    @OneToMany(mappedBy = "skill", fetch = FetchType.LAZY)
    private List<SubSkillEntity> subSkillEntityList;

    public SkillEntity() {
    }

    public Long getId() {
        return id;
    }

    public SkillEntity setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public SkillEntity setName(String name) {
        this.name = name;
        return this;
    }

    public UserEntity getUser() {
        return user;
    }

    public SkillEntity setUser(UserEntity user) {
        this.user = user;
        return this;
    }

    public List<SubSkillEntity> getSubSkillList() {
        return subSkillEntityList;
    }

    public SkillEntity setSubSkillList(List<SubSkillEntity> subSkillEntityList) {
        this.subSkillEntityList = subSkillEntityList;
        return this;
    }

}
