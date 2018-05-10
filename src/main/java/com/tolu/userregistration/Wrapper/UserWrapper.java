package com.tolu.userregistration.Wrapper;

public class UserWrapper {
    //public int id;
    public String name;
    public String mail;
    public String password;
    public String username;
    //public String birthDate;
    public long phonenumber;
    public String address;


    @Override
    public String toString() {
        return "UserWrapper{" +
                " password='" + password + '\'' +
                ", mail='" + mail + '\'' +
                ", username='" + username + '\'' +
                ", phonenumber=" + phonenumber +
                ", address='" + address + '\'' +
                '}';
    }
}
