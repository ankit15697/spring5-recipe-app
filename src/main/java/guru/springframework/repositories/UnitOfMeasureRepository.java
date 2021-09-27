package guru.springframework.repositories;

import guru.springframework.domain.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;


public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {
    @Override
    Optional<UnitOfMeasure> findById(Long aLong);
    Optional<UnitOfMeasure> findByDescription(String description);
}