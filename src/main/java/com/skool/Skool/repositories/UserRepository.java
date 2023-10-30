package com.skool.Skool.repositories;

import com.skool.Skool.models.UserModel;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;

@Transactional
public interface UserRepository extends JpaRepository<UserModel, Integer> {
}
