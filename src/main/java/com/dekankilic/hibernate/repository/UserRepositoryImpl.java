package com.dekankilic.hibernate.repository;

import com.dekankilic.hibernate.model.User;
import com.dekankilic.hibernate.repository.base.BaseRepositoryImpl;
import org.springframework.stereotype.Component;

@Component
public class UserRepositoryImpl extends BaseRepositoryImpl<User, Integer> implements UserRepository {

    public UserRepositoryImpl() {
        super(User.class);
    }
}
