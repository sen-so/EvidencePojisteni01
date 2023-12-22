package cz.itnetwork;

public class User {


    int id;
    String name;
    String surname;
    public User(){

    }

    public User(int id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    public int getId() {
        return id;    }

    public void setId(int id) {
        this.id = id;    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;    }

    public String getSurname() {
        return surname;    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }





}
