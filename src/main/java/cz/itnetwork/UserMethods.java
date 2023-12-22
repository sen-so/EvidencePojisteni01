package cz.itnetwork;

import java.util.ArrayList;
import java.util.List;

public  class UserMethods {     //implementovat rozhrani, kde budou metody


   // User user = new User();


    List<User> userList = new ArrayList<>();


    public static List<User> saveUser(User user){

        List<User> userList = new ArrayList<>();
userList.add(user);
        System.out.println("User: " + user.getName() + " " + user.getSurname() + " has been saved.");
        return userList;
    }


    public static List<User> saveUsers(List<User> usersList){
        List<User> users = new ArrayList<>();
        users.addAll(usersList);
        return users;
    }


    public static void deleteUser(List<User> userList,User user){
    userList.remove(user.getId());
    }

    public static void findUserById(){

    }

    public static void  printAllUser(List<User> users){
        for(User user :users){
            System.out.println(user.toString());
        }

    }





}
