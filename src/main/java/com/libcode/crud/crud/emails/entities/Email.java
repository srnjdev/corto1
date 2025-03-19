package com.libcode.crud.crud.emails.entities;

import jakarta.persistence.*;

@Entity
@Table(name="emails")
public class Email {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "email")
    private String email;
    
    @Column(name = "aprobado")
    private boolean aprobado;


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isAprobado() {
        return aprobado;
    }

    public void setAprobado(boolean aprobado) {
        this.aprobado = aprobado;
    }

    public Email(String email,boolean aprobado) {
        this.email = email;
        this.aprobado = aprobado;
    }

    public Email() {
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
