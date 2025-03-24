package com.concursoninja.demo.dtos;

import com.concursoninja.demo.enums.TypeUser;

import java.util.Objects;

public class UserDTO {
    private Long id;
    private String firstName;
    private String secondName;
    private String email;
    private String phone;
    private TypeUser type;

    public UserDTO() {
    }

    public UserDTO(Long id, String firstName, String secondName, String email, String phone, TypeUser type) {
        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
        this.email = email;
        this.phone = phone;
        this.type = type;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public TypeUser getType() {
        return type;
    }

    public void setType(TypeUser type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        UserDTO that = (UserDTO) o;
        return Objects.equals(id, that.id) && Objects.equals(firstName, that.firstName) && Objects.equals(secondName, that.secondName) && Objects.equals(email, that.email) && Objects.equals(phone, that.phone) && type == that.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, secondName, email, phone, type);
    }
}
