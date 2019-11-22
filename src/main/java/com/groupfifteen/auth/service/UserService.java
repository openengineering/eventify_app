package com.groupfifteen.auth.service;

import com.groupfifteen.auth.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
