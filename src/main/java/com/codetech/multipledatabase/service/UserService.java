package com.codetech.multipledatabase.service;

import com.codetech.multipledatabase.entity.UserEntity;
import com.codetech.multipledatabase.primary.repository.PrimaryRepository;
import com.codetech.multipledatabase.secondary.repository.SecondaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private PrimaryRepository primaryRepository;

    @Autowired
    private SecondaryRepository secondaryRepository;

    public UserEntity saveUser(UserEntity user) {
        if(user.getCountry().equals("India")){
            return primaryRepository.save(user);
        }else {
            return secondaryRepository.save(user);
        }

    }

    public void saveData(){
        UserEntity primaryUser =new UserEntity();
        primaryUser.setName("Mukesh");
        primaryUser.setCountry("India");
        primaryRepository.save(primaryUser);

//        SecondaryUserEntity secondaryUserEntity =new SecondaryUserEntity();
//        secondaryUserEntity.setName("Kumar");
//        secondaryUserEntity.setCountry("USA");
    }
}
