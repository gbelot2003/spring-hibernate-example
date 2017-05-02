package com.daoImp;

import com.dao.UserDao;
import com.entities.Users;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;


@Repository
@Transactional
public class UsersDaoImp implements UserDao{

    @Autowired
    SessionFactory session;

    public boolean saveOrUpdate(Users users)
    {
        session.getCurrentSession().saveOrUpdate(users);
        return true;
    }

    public boolean delete(Users users)
    {
        try {
            session.getCurrentSession().delete(users);
        } catch (HibernateException e) {
            e.printStackTrace();
        }
        return true;
    }

    public List<Users> list()
    {
        return session.getCurrentSession().createQuery("from Users").list();
    }
}
