package az.company.resume.repository;

import az.company.resume.entity.ResidenceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResidenceRepository extends JpaRepository<ResidenceEntity, Long> {
}
