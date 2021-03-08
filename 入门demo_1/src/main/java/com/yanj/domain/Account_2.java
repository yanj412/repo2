package com.yanj.domain;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class Account_2 implements Serializable {

    Integer id;
    String name;
    Float money;

    List<User> userList;

    Map<String,User> map;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getMoney() {
        return money;
    }

    public void setMoney(Float money) {
        this.money = money;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    public Map<String, User> getMap() {
        return map;
    }

    public void setMap(Map<String, User> map) {
        this.map = map;
    }

    @Override
    public String toString() {
        return "Account_2{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", money=" + money +
                ", userList=" + userList +
                ", map=" + map +
                '}';
    }
}
