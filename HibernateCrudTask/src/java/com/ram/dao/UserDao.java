/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ram.dao;

import com.ram.bean.User;
import com.ram.utility.HibernateUtil;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
//import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Administrator
 */
public class UserDao {
    
   SessionFactory sf=HibernateUtil.getSessionFactory();
    Session session=sf.openSession();
    Transaction transaction=session.beginTransaction();
    public int AddUser(User user){
         
    
        int result=0;
        Object ob=session.save(user);
        transaction.commit();
        if(ob!=null){
            result++;
        }
        return result;
    }
    
    public List<User> LoginCheck(String username,String password){
       int result=0;
        Query q=session.createQuery("select u from User u where username=:n and password=:p ");
        q.setParameter("n", username);
        q.setParameter("p", password);
        List<User> al=q.list();
        if(al.size()>0){
            result++;
        }
        return al;
    }
     
    
    public static void main(String[] args) {
        User u=new User();
        
        u.setUserid(2);
        u.setName("shivam kumar");
        u.setUsername("shivam@12");
        u.setPassword("shivam123");
        
        UserDao ud=new UserDao();
        
//       int x=ud.AddUser(u);
//        if(x>0){
//            System.out.println("User Added");
//        }else{
//            System.out.println("User Not added");
//        }


            List<User> x=ud.LoginCheck("shivam@12", "shivam123");
            for(User y:x){
                System.out.println("Username"+y.getUsername());
                System.out.println("Password"+y.getPassword());
            }
            
    }

}
