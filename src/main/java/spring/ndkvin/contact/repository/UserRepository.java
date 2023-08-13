package spring.ndkvin.contact.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import spring.ndkvin.contact.entitiy.User;

@Repository
public interface UserRepository extends JpaRepository<User, String> {


}
