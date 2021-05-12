package az.company.resume.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "work_experience")
public class WorkExperienceEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "company_name")
    private String companyName;

    @Column(name = "profession_name")
    private String professionName;

    @Column(name = "date_start")
    private LocalDate dateStart;

    @Column(name = "date_end")
    private LocalDate dateEnd;

    @Column(name = "description")
    private String description;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private UserEntity user;

    public WorkExperienceEntity() {
    }

    public Long getId() {
        return id;
    }

    public WorkExperienceEntity setId(Long id) {
        this.id = id;
        return this;
    }

    public String getProfessionName() {
        return professionName;
    }

    public WorkExperienceEntity setProfessionName(String professionName) {
        this.professionName = professionName;
        return this;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setDateStart(LocalDate dateStart) {
        this.dateStart = dateStart;
    }

    public void setDateEnd(LocalDate dateEnd) {
        this.dateEnd = dateEnd;
    }

    public LocalDate getDateStart() {
        return dateStart;
    }

    public LocalDate getDateEnd() {
        return dateEnd;
    }

    public String getDescription() {
        return description;
    }

    public WorkExperienceEntity setDescription(String description) {
        this.description = description;
        return this;
    }

    public UserEntity getUser() {
        return user;
    }

    public WorkExperienceEntity setUser(UserEntity user) {
        this.user = user;
        return this;
    }
}
