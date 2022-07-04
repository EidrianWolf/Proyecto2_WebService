package com.web.user.resources;

// @author adr20
import com.web.user.logic.Service;
import com.web.user.logic.User;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Create extends Thread {
    
    private String id;
    private String nombre;
    
    public Create(String id, String nombre){
        this.id = id;
        this.nombre = nombre;
    }

    @Override
    public void run() {
        try {
            Proceso.add(id, nombre);
        } catch (Exception ex) {
            Logger.getLogger(Create.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
