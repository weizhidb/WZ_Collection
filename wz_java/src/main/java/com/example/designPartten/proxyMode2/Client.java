package com.example.designPartten.proxyMode2;

import com.example.proxyMode2.ProxyHandler;
import com.example.proxyMode2.UserManager;
import com.example.proxyMode2.UserManagerImpl;

public class Client {
  
    /** 
     * @param args 
     */  
    public static void main(String[] args) {  
  
        com.example.designPartten.proxyMode2.ProxyHandler proxyHandler = new com.example.designPartten.proxyMode2.ProxyHandler();
        com.example.designPartten.proxyMode2.UserManager userManager = (com.example.designPartten.proxyMode2.UserManager)proxyHandler.newProxyInstance(new com.example.designPartten.proxyMode2.UserManagerImpl());
          
        String name = userManager.findUser("0001");  
        System.out.println("client.main-->>" + name);  
    }  
  
} 