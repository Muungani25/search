package zw.co.afrosoft.registration.repository;

import zw.co.afrosoft.registration.model.ERole;
import zw.co.afrosoft.registration.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
