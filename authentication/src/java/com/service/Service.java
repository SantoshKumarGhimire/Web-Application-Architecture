/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service;

import com.model.LoginModel;

/**
 *
 * @author 985277
 */
public class Service {
    LoginModel model = new LoginModel();
    public boolean authenticate(String username,String password){
        if(model.getName().equals(username) && model.getPassword().equals(password)){
            return true;
        }
       return false;
    }
    
}
