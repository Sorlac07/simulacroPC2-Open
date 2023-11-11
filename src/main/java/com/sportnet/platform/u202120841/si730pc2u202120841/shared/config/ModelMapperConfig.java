package com.sportnet.platform.u202120841.si730pc2u202120841.shared.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Model mapper config class
 * Provides a bean to map DTOs to entities and vice versa
 * @author Jean Achamizo
 * @version 1.0, 2023-11-11
 */
@Configuration
public class ModelMapperConfig {
    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }
}
