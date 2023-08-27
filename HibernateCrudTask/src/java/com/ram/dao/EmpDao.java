/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ram.dao;

import com.ram.bean.Emp;
import com.ram.utility.HibernateUtil;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Administrator
 */
public class EmpDao {
    SessionFactory sf=HibernateUtil.getSessionFactory();
    Session session=sf.openSession();
    Transaction transaction=session.beginTransaction();
    
    public int AddEmp(Emp emp){
        int result=0;
        Object ob=session.save(emp);
        transaction.commit();
        if(ob!=null){
            result++;
        }
        return result;
    }
    
    //Update Emp 
    
    public void UpdateEmp(Emp emp){
        session.update(emp);
        transaction.commit();
        session.close();
    }
    
    
    public void DeleteEmp(Emp emp){
        session.delete(emp);
        transaction.commit();
        session.close();
    }
    
    // DeleteById
    
    public void DeleteById(int n){
        Emp d=(Emp)session.load(Emp.class, n);
        session.delete(d);
        transaction.commit();
        session.close();
    }
    
    //Find by Id
    
    public List<Emp> FindById(int n){
        Query q=session.createQuery("select d from Emp d where d.empno=:n");
        q.setInteger("n",n);
        List<Emp> al=q.list();
        return al;
    }
    
    //Find All
    
    public List<Emp> FindAll(){
         Query q=session.createQuery("select d from Emp d");
         List<Emp> al=q.list();
         return al;
    }
            
    
    // Main method
    
    public static void main(String[] args) {
        Emp e=new Emp();
        //e.setEmpno(107);
//        e.setName("Vivek kumar");
//        e.setGender("Male");
//        e.setDeptno(103);
//        e.setComm(3000f);
//        e.setSal(30000f);
//        
        EmpDao ed=new EmpDao();
        
         //Add emp
//        int x=ed.AddEmp(e);
//        if(x>0){
//            System.out.println("Employee Added Success");
//        }else{
//            System.out.println("Employee Not Added");
//        }


        // Update Emp
     //   ed.UpdateEmp(e);
     
     
     // Delete Emp By id
     
    // ed.DeleteById(107);
    
    
//    Find By Id

//        List<Emp> al=ed.FindById(109);
//        for(Emp x:al){
//            System.out.println("\t"+x.getEmpno()+"\t"+x.getName()+"\t"+x.getGender()+"\t"+x.getComm()+"\t"+x.getSal());
//        }
//        



        // Find All Emp
        
        List<Emp> al=ed.FindAll();
         for(Emp x:al){
            System.out.println("\t"+x.getEmpno()+"\t"+x.getName()+"\t"+x.getGender()+"\t"+x.getComm()+"\t"+x.getSal());
        }
    }
    
    
}
