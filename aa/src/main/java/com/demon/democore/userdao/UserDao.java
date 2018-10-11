package com.demon.democore.userdao;


import com.demon.democore.user.User;

import java.util.List;

public interface UserDao {

    List<User> findAllUser();
}
