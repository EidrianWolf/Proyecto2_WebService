package com.web.user.logic;

 // @author adr20
public class User {

    String id;
    String nombre;

    public User(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public User() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", nombre=" + nombre + '}';
    }

}
