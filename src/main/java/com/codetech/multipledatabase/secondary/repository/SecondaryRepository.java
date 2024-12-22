package com.codetech.multipledatabase.secondary.repository;

import com.codetech.multipledatabase.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SecondaryRepository extends JpaRepository<UserEntity,Integer> {
}
