package az.company.resume.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "education")
public class EducationEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "date_start")
    private LocalDate dateStart;

    @Column(name = "date_end")
    private LocalDate dateEnd;

    @Column(name = "description")
    private String description;

    @Column(name = "education_degree")
    private String educationDegree;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private UserEntity user;

    public EducationEntity() {
    }

    public UserEntity getUser() {
        return user;
    }

    public EducationEntity setUser(UserEntity user) {
        this.user = user;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EducationEntity that = (EducationEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(name, that.name) &&
                Objects.equals(dateStart, that.dateStart) &&
                Objects.equals(dateEnd, that.dateEnd) &&
                Objects.equals(description, that.description) &&
                Objects.equals(educationDegree, that.educationDegree);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, dateStart, dateEnd, description, educationDegree);
    }

    public Long getId() {
        return id;
    }

    public EducationEntity setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public EducationEntity setName(String name) {
        this.name = name;
        return this;
    }

    public LocalDate getDateStart() {
        return dateStart;
    }

    public EducationEntity setDateStart(LocalDate dateStart) {
        this.dateStart = dateStart;
        return this;
    }

    public LocalDate getDateEnd() {
        return dateEnd;
    }

    public EducationEntity setDateEnd(LocalDate dateEnd) {
        this.dateEnd = dateEnd;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public EducationEntity setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getEducationDegree() {
        return educationDegree;
    }

    public EducationEntity setEducationDegree(String educationDegree) {
        this.educationDegree = educationDegree;
        return this;
    }

}
