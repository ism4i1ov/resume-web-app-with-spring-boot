package az.company.resume.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "users")
public class UserEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;


    @Column(name = "birth_day")
    private LocalDate birthDay;

    @Column(name = "email")
    private String email;

    @Column(name = "address")
    private String address;

    @OneToOne
    @JoinColumn(name = "residence_id", referencedColumnName = "id")
    private ResidenceEntity residenceEntity;

    @Column(name = "phone")
    private String phone;

    @Column(name = "freelance")
    private String freelance;

    @Column(name = "profession")
    private String profession;

    @Column(name = "summary")
    private String summary;

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    private List<EducationEntity> educations;

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    private List<WorkExperienceEntity> workExperienceList;

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    private List<SkillEntity> skillEntityList;

    public UserEntity() {
    }

    public List<EducationEntity> getEducations() {
        return educations;
    }

    public UserEntity setEducations(List<EducationEntity> educations) {
        this.educations = educations;
        return this;
    }

    public Long getId() {
        return id;
    }

    public UserEntity setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public UserEntity setName(String name) {
        this.name = name;
        return this;
    }

    public String getSurname() {
        return surname;
    }

    public UserEntity setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public UserEntity setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public UserEntity setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public UserEntity setAddress(String adress) {
        this.address = adress;
        return this;
    }

    public List<WorkExperienceEntity> getWorkExperienceList() {
        return workExperienceList;
    }

    public UserEntity setWorkExperienceList(List<WorkExperienceEntity> workExperienceList) {
        this.workExperienceList = workExperienceList;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public UserEntity setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public String getFreelance() {
        return freelance;
    }

    public UserEntity setFreelance(String freelance) {
        this.freelance = freelance;
        return this;
    }

    public String getProfession() {
        return profession;
    }

    public UserEntity setProfession(String profession) {
        this.profession = profession;
        return this;
    }

    public String getSummary() {
        return summary;
    }

    public UserEntity setSummary(String summary) {
        this.summary = summary;
        return this;
    }

    public ResidenceEntity getResidence() {
        return residenceEntity;
    }

    public UserEntity setResidence(ResidenceEntity residenceEntity) {
        this.residenceEntity = residenceEntity;
        return this;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserEntity userEntity = (UserEntity) o;
        return Objects.equals(id, userEntity.id) &&
                Objects.equals(name, userEntity.name) &&
                Objects.equals(surname, userEntity.surname) &&
                Objects.equals(birthDay, userEntity.birthDay) &&
                Objects.equals(email, userEntity.email) &&
                Objects.equals(address, userEntity.address) &&
                Objects.equals(phone, userEntity.phone) &&
                Objects.equals(freelance, userEntity.freelance) &&
                Objects.equals(profession, userEntity.profession) &&
                Objects.equals(summary, userEntity.summary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname, birthDay, email, address, phone, freelance, profession, summary);
    }

    @Override
    public String toString() {
        return String.format("User{id=%d, name='%s', surname='%s', birthDay=%s, email='%s', adress='%s', phone='%s', freelance='%s', profession='%s', summary='%s'}", id, name, surname, birthDay, email, address, phone, freelance, profession, summary);
    }

    public ResidenceEntity getResidenceEntity() {
        return residenceEntity;
    }

    public UserEntity setResidenceEntity(ResidenceEntity residenceEntity) {
        this.residenceEntity = residenceEntity;
        return this;
    }

    public List<SkillEntity> getSkillList() {
        return skillEntityList;
    }

    public UserEntity setSkillList(List<SkillEntity> skillEntityList) {
        this.skillEntityList = skillEntityList;
        return this;
    }
}
