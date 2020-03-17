package com.rbm.multipledb.dao.user;

import com.rbm.multipledb.model.user.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository
        extends CrudRepository<User, Long> { }
