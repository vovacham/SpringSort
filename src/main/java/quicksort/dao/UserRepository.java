package quicksort.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import quicksort.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findByUsername(String username);
}
