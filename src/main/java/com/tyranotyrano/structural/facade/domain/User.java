package com.tyranotyrano.structural.facade.domain;

public class User {
    private String id;
    private String password;
    private String email;

    private User(String id, String password, String email) {
        this.id = id;
        this.password = password;
        this.email = email;
    }

    public static User createForJoin(String id, String password, String email) {
        return new User(id, password, email);
    }

    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }
}
