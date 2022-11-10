package com.springboot.firstdto;

import com.springboot.firstdto.domain.Location;
import com.springboot.firstdto.domain.User;
import com.springboot.firstdto.persistance.LocationRepository;
import com.springboot.firstdto.persistance.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstDtoApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(FirstDtoApplication.class, args);
    }

    @Autowired
    UserRepository userRepository;

    @Autowired
    LocationRepository locationRepository;

    @Override
    public void run(String... args) throws Exception {
        Location location= new Location();
        location.setPlace("Harare");
        location.setDescription("Harare is the Capital");
        location.setLongitude(50.7);
        location.setLatitude(40.0);
        locationRepository.save(location);

        User user = new User();
        user.setFirstName("Tafaddzwa");
        user.setLastName("Muungani");
        user.setEmail("muunganitafadzwa@gmail.com");
        user.setPassword("jbjhdbnjkbg");
        user.setLocation(location);
        userRepository.save(user);

        User user1 = new User();
        user1.setFirstName("Esther");
        user1.setLastName("Muungani");
        user1.setEmail("Esther@gmail.com");
        user1.setPassword("566546");
        user1.setLocation(location);
        userRepository.save(user1);


    }
}
