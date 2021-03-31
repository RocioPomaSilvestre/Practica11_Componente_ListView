package com.rocio.poma.practica11_componente_listview;

public class Personas {
    String nombre;
    String apellido;
    String imagenUrl;
    String telefono;

    public Personas(String nombre, String apellido, String imagenUrl, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.imagenUrl = imagenUrl;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getImagenUrl() {
        return imagenUrl;
    }

    public void setImagenUrl(String imagenUrl) {
        this.imagenUrl = imagenUrl;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return getNombre()+" "+getApellido()+" "+getTelefono();
    }
}
