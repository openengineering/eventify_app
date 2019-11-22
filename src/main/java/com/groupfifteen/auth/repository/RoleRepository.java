package com.groupfifteen.auth.repository;
import com.groupfifteen.auth.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long>{
}
