package hu.elte.alkfejl.familytodolist.repository;

import hu.elte.alkfejl.familytodolist.app.model.TimeInterval;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

    public interface TimeIntervalRepository extends CrudRepository<TimeInterval, String> {
        Optional<TimeInterval> findById(int id);
        
        Optional<TimeInterval> findByStartTime(String startTime);
        
        Optional<TimeInterval> findByTerminationTime(String terminationTime);
}
