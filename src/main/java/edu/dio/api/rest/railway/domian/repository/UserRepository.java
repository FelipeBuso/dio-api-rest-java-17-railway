package edu.dio.api.rest.railway.domian.repository;

import edu.dio.api.rest.railway.domian.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
