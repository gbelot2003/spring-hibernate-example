package com.serivesImp;

import com.dao.UserDao;
import com.entities.Users;
import com.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersServicesImpl implements UserServices{

    @Autowired
    UserDao userDao;

    @Override
    public List<Users> list() {
        return userDao.list();
    }

    @Override
    public boolean delete(Users users) {
        return userDao.delete(users);
    }

    @Override
    public boolean saveOrUpdate(Users users) {
        return userDao.saveOrUpdate(users);
    }
}
