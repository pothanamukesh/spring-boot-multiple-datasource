package com.codetech.multipledatabase.primary.repository;

import com.codetech.multipledatabase.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrimaryRepository extends JpaRepository<UserEntity,Integer> {
}
