package az.company.resume.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "residence")
public class ResidenceEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    public ResidenceEntity() {

    }

    public Long getId() {
        return id;
    }

    public ResidenceEntity setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public ResidenceEntity setName(String name) {
        this.name = name;
        return this;
    }
}
