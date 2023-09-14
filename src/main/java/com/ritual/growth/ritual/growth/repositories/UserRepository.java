package com.ritual.growth.ritual.growth.repositories;

import com.ritual.growth.ritual.growth.entties.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
