package com.sportnet.platform.u202120841.si730pc2u202120841.booking.SportEvent.service;

import com.sportnet.platform.u202120841.si730pc2u202120841.booking.SportEvent.dto.request.SportEventRequestDTO;
import com.sportnet.platform.u202120841.si730pc2u202120841.booking.SportEvent.dto.response.SportEventResponseDTO;

import java.util.List;

/**
 * Sport Events Service Interface
 * Provides methods to obtain and create new sport events in the database
 * @author Jean Achamizo - u202120841
 * @version 1.0, 2023-11-11
 */
public interface SportEventService {
    List<SportEventResponseDTO> getAllSportEvents();
    SportEventResponseDTO createSportEvent(SportEventRequestDTO sportEventRequest);
}
