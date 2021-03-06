/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bostonHacks.DontTrashMyHouse.models;

import com.bostonHacks.DontTrashMyHouse.mdbModels.MdbUser;

/**
 *
 * @author Etienne
 */

public class User {

    private String id;
    private String name;
    private String email;
    private String password;
    private int age;
    private String credit_num;
    private String exp;
    private int ccv;

    public User() {
    }

    public User(String id, String name, String email, String password, int age, String credit_num, String exp, int ccv) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.age = age;
        this.credit_num = credit_num;
        this.exp = exp;
        this.ccv = ccv;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCredit_num() {
        return credit_num;
    }

    public void setCredit_num(String credit_num) {
        this.credit_num = credit_num;
    }

    public String getExp() {
        return exp;
    }

    public void setExp(String exp) {
        this.exp = exp;
    }

    public int getCcv() {
        return ccv;
    }

    public void setCcv(int ccv) {
        this.ccv = ccv;
    }

    public MdbUser toMdbUser(){
        return new MdbUser(this.id,this.name, this.email, this.password, this.age, this.credit_num, this.exp, this.ccv);
    }
}
