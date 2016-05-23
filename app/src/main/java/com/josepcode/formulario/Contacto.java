package com.josepcode.formulario;

import java.util.Date;

/**
 * Created by JR on 21/05/2016.
 */
public class Contacto {

    private String  mNombre;
    private String  mFechaNaciemiento;
    private String  mTelefono;
    private String  mEmail;
    private String  mComentarios;

    public Contacto(String nombre, String telefono, String email) {
        mNombre = nombre;
        mTelefono = telefono;
        mEmail = email;
    }

    public String getNombre() {
        return mNombre;
    }

    public void setNombre(String nombre) {
        mNombre = nombre;
    }

    public String getFechaNaciemiento() {
        return mFechaNaciemiento;
    }

    public void setFechaNaciemiento(String fechaNaciemiento) {
        mFechaNaciemiento = fechaNaciemiento;
    }

    public String getTelefono() {
        return mTelefono;
    }

    public void setTelefono(String telefono) {
        mTelefono = telefono;
    }

    public String getEmail() {
        return mEmail;
    }

    public void setEmail(String email) {
        mEmail = email;
    }

    public String getComentarios() {
        return mComentarios;
    }

    public void setComentarios(String comentarios) {
        mComentarios = comentarios;
    }
}

