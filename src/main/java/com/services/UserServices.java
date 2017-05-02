package com.services;

import com.entities.Users;
import java.util.List;

public interface UserServices {

    public List<Users> list();
    public boolean delete(Users users);
    public boolean saveOrUpdate(Users users);
}

