package az.company.resume.dto.request;

import az.company.resume.entity.UserEntity;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@JsonIgnoreProperties(ignoreUnknown = true)
public class UserDto implements Serializable {

    private Long id;

    private String name;

    private String surname;

    private LocalDate birthDay;

    private String email;

    private ResidenceDto residence;

    private String adress;

    private String phone;

    private String freelance;

    private String profession;

    private String summary;

    private List<EducationDto> educationList;

    private List<WorkExperienceDto> workExperienceList;

    private List<SkillDto> skillList;

    public static UserDto toDto(UserEntity userEntity) {
        return new UserDto().setId(userEntity.getId())
                .setName(userEntity.getName())
                .setSurname(userEntity.getSurname())
                .setEmail(userEntity.getEmail())
                .setBirthDay(userEntity.getBirthDay())
                .setResidence(ResidenceDto.toDto(userEntity.getResidence()))
                .setPhone(userEntity.getPhone())
                .setFreelance(userEntity.getFreelance())
                .setProfession(userEntity.getProfession())
                .setSummary(userEntity.getSummary())
                .setAdress(userEntity.getAddress())
                .setEducationList(userEntity.getEducations()
                        .stream()
                        .map(EducationDto::toDto)
                        .collect(Collectors.toList()))
                .setWorkExperienceList(userEntity.getWorkExperienceList()
                        .stream()
                        .map(WorkExperienceDto::toDto)
                        .collect(Collectors.toList()))
                .setSkillList(userEntity.getSkillList()
                        .stream()
                        .map(SkillDto::toDto)
                        .collect(Collectors.toList()));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserDto userDto = (UserDto) o;
        return Objects.equals(id, userDto.id) &&
                Objects.equals(name, userDto.name) &&
                Objects.equals(surname, userDto.surname) &&
                Objects.equals(birthDay, userDto.birthDay) &&
                Objects.equals(email, userDto.email) &&
                Objects.equals(residence, userDto.residence) &&
                Objects.equals(phone, userDto.phone) &&
                Objects.equals(freelance, userDto.freelance) &&
                Objects.equals(profession, userDto.profession) &&
                Objects.equals(summary, userDto.summary);
    }

    public String getAdress() {
        return adress;
    }

    public UserDto setAdress(String adress) {
        this.adress = adress;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname, birthDay, email, residence, phone, freelance, profession, summary);
    }

    public List<SkillDto> getSkillList() {
        return skillList;
    }

    public UserDto setSkillList(List<SkillDto> skillList) {
        this.skillList = skillList;
        return this;
    }

    public Long getId() {
        return id;
    }

    public UserDto setId(Long id) {
        this.id = id;
        return this;
    }

    public List<EducationDto> getEducationList() {
        return educationList;
    }

    public UserDto setEducationList(List<EducationDto> educationList) {
        this.educationList = educationList;
        return this;
    }

    public String getName() {
        return name;
    }

    public UserDto setName(String name) {
        this.name = name;
        return this;
    }

    public String getSurname() {
        return surname;
    }

    public UserDto setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public String getAge() {
        int years = Period.between(birthDay, LocalDate.now()).getYears();
        return String.valueOf(years);
    }

    public UserDto setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public UserDto setEmail(String email) {
        this.email = email;
        return this;
    }

    public ResidenceDto getResidence() {
        return residence;
    }

    public UserDto setResidence(ResidenceDto residence) {
        this.residence = residence;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public UserDto setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public String getFreelance() {
        return freelance;
    }

    public UserDto setFreelance(String freelance) {
        this.freelance = freelance;
        return this;
    }

    public String getProfession() {
        return profession;
    }

    public UserDto setProfession(String profession) {
        this.profession = profession;
        return this;
    }

    public String getSummary() {
        return summary;
    }

    public UserDto setSummary(String summary) {
        this.summary = summary;
        return this;
    }

    public List<WorkExperienceDto> getWorkExperienceList() {
        return workExperienceList;
    }

    public UserDto setWorkExperienceList(List<WorkExperienceDto> workExperienceList) {
        this.workExperienceList = workExperienceList;
        return this;
    }

    @Override
    public String toString() {
        return String.format("UserDto{id=%d, name='%s', surname='%s', birthDay=%s, email='%s', residence=%s, phone='%s', freelance='%s', profession='%s', summary='%s'}", id, name, surname, birthDay, email, residence, phone, freelance, profession, summary);
    }

    public String getFullName() {
        return name + " " + surname;
    }


}


