package ru.gothmog.recaptcha.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.gothmog.recaptcha.model.User;
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
