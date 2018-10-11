package com.demon.democore.user;

import com.demon.democore.userdao.UserDao;
import com.demon.democore.userdaoimpl.UserDaoImpl;

import java.util.List;

;

public class User {
    private int id;
    private int create_at;
    private int update_at;
    private String name;
    private int age;
    private int sex;
    private String pro;
    private String brother;
    private UserDao userDao;
    private UserDaoImpl userdao;

    public User(){}
    public User(String name){
        setName(name);
    }
    public User(String name,int age){
        setName(name);
        setAge(age);
    }


    public String getPro() {
        return pro;
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCreate_at() {
        return create_at;
    }

    public void setCreate_at(int create_at) {
        this.create_at = create_at;
    }

    public int getUpdate_at() {
        return update_at;
    }

    public void setUpdate_at(int updatae_at) {
        this.update_at = updatae_at;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getPro(String pro) {
        return this.pro;
    }

    public void setPro(String pro) {
        this.pro = pro;
    }

    public String getBrother() {
        return brother;
    }

    public void setBrother(String brother) {
        this.brother = brother;
    }

    public List<User> findAllUser(){
        return userDao.findAllUser();
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", create_at=" + create_at +
                ", update_at=" + update_at +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", pro='" + pro + '\'' +
                ", brother='" + brother + '\'' +
                '}';
    }


    public void setUserdao(UserDaoImpl userdao) {
        this.userdao = userdao;
    }

    public UserDaoImpl getUserdao() {
        return userdao;
    }
}
