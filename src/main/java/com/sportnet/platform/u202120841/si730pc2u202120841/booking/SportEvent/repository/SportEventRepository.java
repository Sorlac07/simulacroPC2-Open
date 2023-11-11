package com.sportnet.platform.u202120841.si730pc2u202120841.booking.SportEvent.repository;

import com.sportnet.platform.u202120841.si730pc2u202120841.booking.SportEvent.model.SportEvent;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

/**
 * Sport Events Repository Interface
 * Provides methods to obtain and create new sport events in the database
 * @author Jean Achamizo
 * @version 1.0, 2023-11-11
 */
public interface SportEventRepository extends JpaRepository<SportEvent, Long> {
    List<SportEvent> findAll();
    Optional<SportEvent> findById(Long id);
     boolean existsByEventNameAndSportTypeAndLocation(String eventName, String sportType, String location);
     boolean existsByOrganizerIdAndEventDate(Long organizerId, LocalDate eventDate);
}
