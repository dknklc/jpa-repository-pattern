package com.dekankilic.hibernate.repository;

import com.dekankilic.hibernate.model.User;
import com.dekankilic.hibernate.repository.base.BaseRepository;

// We normally extend JpaRepository, but here we are extending our own Repository that does the same things as Spring Data Jpa normally does.

public interface UserRepository extends BaseRepository<User, Integer> {
}
