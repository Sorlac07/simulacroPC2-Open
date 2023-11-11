package com.sportnet.platform.u202120841.si730pc2u202120841.booking.SportEvent.dto.request;

import lombok.Data;

import java.time.LocalDate;

/**
 * Sport Events Request DTO Class
 * The request DTO for the sport events controller class
 * @author Jean Achamizo
 * @version 1.0, 2023-11-08
 */
@Data
public class SportEventRequestDTO {
    String eventName;
    String sportType;
    Long organizerId;
    String location;
    int capacity;
    LocalDate eventDate;
}
