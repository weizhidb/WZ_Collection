package com.example.designPartten.proxyMode2;

import com.example.proxyMode2.*;
import com.example.proxyMode2.UserManager;

public class UserManagerImpl implements com.example.designPartten.proxyMode2.UserManager {
  
    public void addUser(String userId, String userName) {  
  
        try{  
            System.out.println("UserManagerImpl.addUser() userId-->>" + userId);  
        }catch(Exception e){  
            e.printStackTrace();  
              
            throw new RuntimeException();  
        }  
          
          
    }  
  
    public void delUser(String userId) {  
  
        System.out.println("UserManagerImpl.delUser() userId-->>" + userId);  
    }  
  
    public String findUser(String userId) {  
  
        System.out.println("UserManagerImpl.findUser() userId-->>" + userId);  
        return "����";  
    }  
  
    public void modifyUser(String userId, String userName) {  
  
        System.out.println("UserManagerImpl.modifyUser() userId-->>" + userId);  
    }  
  
} 