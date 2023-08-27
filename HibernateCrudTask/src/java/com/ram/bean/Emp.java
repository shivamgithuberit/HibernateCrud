package com.ram.bean;
// Generated Jul 28, 2023 3:34:26 PM by Hibernate Tools 4.3.1



/**
 * Emp generated by hbm2java
 */
public class Emp  implements java.io.Serializable {


     private Integer empno;
     private String name;
     private Float sal;
     private Integer deptno;
     private String gender;
     private Float comm;

    public Emp() {
    }

    public Emp(String name, Float sal, Integer deptno, String gender, Float comm) {
       this.name = name;
       this.sal = sal;
       this.deptno = deptno;
       this.gender = gender;
       this.comm = comm;
    }
   
    public Integer getEmpno() {
        return this.empno;
    }
    
    public void setEmpno(Integer empno) {
        this.empno = empno;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public Float getSal() {
        return this.sal;
    }
    
    public void setSal(Float sal) {
        this.sal = sal;
    }
    public Integer getDeptno() {
        return this.deptno;
    }
    
    public void setDeptno(Integer deptno) {
        this.deptno = deptno;
    }
    public String getGender() {
        return this.gender;
    }
    
    public void setGender(String gender) {
        this.gender = gender;
    }
    public Float getComm() {
        return this.comm;
    }
    
    public void setComm(Float comm) {
        this.comm = comm;
    }

    @Override
    public String toString() {
        return "Emp{" + "empno=" + empno + ", name=" + name + ", sal=" + sal + ", deptno=" + deptno + ", gender=" + gender + ", comm=" + comm + '}';
    }




}


