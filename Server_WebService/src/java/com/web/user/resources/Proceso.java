package com.web.user.resources;

 // @author adr20
import com.web.log.Log;
import com.web.user.logic.Service;
import com.web.user.logic.User;


public class Proceso {
    

    public static synchronized void add(String id, String nombre) throws Exception{
        User user = new User(id, nombre);
        System.out.println(user);
        Service.instance().usersCREATE(user);
        Log myLog = new Log("./log.log");
        myLog.addLine(id +" "+ nombre);
    }
}