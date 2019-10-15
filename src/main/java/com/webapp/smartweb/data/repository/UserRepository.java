package com.webapp.smartweb.data.repository;

import com.webapp.smartweb.data.domain.User;

import java.util.List;

public interface UserRepository {
    long save(User user);
    User get(long id);
    List<User> list();
    void update(long id, User user);
    void delete(long id);
}
