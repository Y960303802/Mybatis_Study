package com.xizi.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Alias("user")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private int id;
    private  String name;
    private String pwd;

//    public User() {
//    }
//
//    public User(int id, String name, String password) {
//        this.id = id;
//        this.name = name;
//        this.pwd = password;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getPassword() {
//        return pwd;
//    }
//
//    public void setPassword(String password) {
//        this.pwd = password;
//    }
//
//    @Override
//    public String toString() {
//        return "User{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", password='" + pwd + '\'' +
//                '}';
//    }
}
