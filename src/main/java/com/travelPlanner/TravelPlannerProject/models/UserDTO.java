package com.travelPlanner.TravelPlannerProject.models;

import java.time.LocalDate;

public class UserDTO {

    private String forename;
    private String username;
    private String email;
    private String password;
    private LocalDate accountCreated;

    public UserDTO(String forename, String username, String email, String password) {
        this.forename = forename;
        this.username = username;
        this.email = email;
        this.password = password;
        this.accountCreated = LocalDate.now();
    }

    public UserDTO() {
    }

    public String getForename() {
        return forename;
    }

    public void setForename(String forename) {
        this.forename = forename;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public LocalDate getAccountCreated() {
        return accountCreated;
    }

    public void setAccountCreated(LocalDate accountCreated) {
        this.accountCreated = accountCreated;
    }
}
