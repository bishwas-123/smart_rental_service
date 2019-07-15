package com.ea.rentalproject.rentalea.config;


import com.ea.rentalproject.rentalea.domain.Hotel;
import com.ea.rentalproject.rentalea.repository.HotelRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
public class LoadDatabase {

    @Bean
    CommandLineRunner initDatabase(HotelRepository repository) {
        return args -> {
            log.info("Preloading " + repository.save(new Hotel("Hotel Pokhara Inn", "061-562345","hpokharainn@gmail.com","www.hotelpokharainn.com.np")));
            log.info("Preloading " + repository.save(new Hotel("River Side Resort", "071-520345","riversideresort@gmail.com","www.resortriverside.com")));
        };
    }
}
