package com.sportnet.platform.u202120841.si730pc2u202120841.booking.SportEvent.dto.response;

import lombok.Data;

import java.time.LocalDate;

/**
 * Sport Events Response DTO Class
 * The response DTO for the sport events controller class
 * @author Jean Achamizo - u202120841
 * @version 1.0, 2023-11-11
 */
@Data
public class SportEventResponseDTO {
    Long id;
    String eventName;
    String sportType;
    Long organizerId;
    String location;
    int capacity;
    LocalDate eventDate;
}
