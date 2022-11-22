package com.nttfix.users.clients.models;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.stereotype.Repository;

@Entity
@Table
@Repository
public class UserData {
    Long id;

    String username;

    String password;

    String email;

    String account;

    Boolean exprired;

    public UserData() {}

    public UserData(Long id, String username, String password, String email, String account, Boolean exprired) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.account = account;
        this.exprired = exprired;
    }

    public String toString() {
        return "Userdata{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", account='" + account + '\'' +
                ", exprired=" + exprired +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public Boolean getExprired() {
        return exprired;
    }

    public void setExprired(Boolean exprired) {
        this.exprired = exprired;
    }
}