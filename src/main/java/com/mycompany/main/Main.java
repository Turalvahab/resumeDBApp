/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.main;

import com.company.daou.impl.UserDaoImpl;
import com.mycompany.bean.User;
import com.mycompany.dao.inter.UserDaoInter;
import java.util.List;

/**
 *
 * @author User
 */
public class Main {
   
    public static void main(String[] args)throws Exception {
        UserDaoInter userDao=new UserDaoImpl();
        /*List<User>list=userDao.getAll();
        userDao.removeUser(1);
        List<User>list2=userDao.getAll();
        System.out.println("list "+list);
        System.out.println("list2 "+list2);*/
        User u=userDao.getById(2);
        
        u.setName("Eldar");
        userDao.updateUser(u);
        
        
        
    }
    
}
