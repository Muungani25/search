package com.springboot.firstdto.persistance;

import com.springboot.firstdto.domain.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Location , Long> {
}
