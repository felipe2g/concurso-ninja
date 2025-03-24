package com.concursoninja.demo.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import com.concursoninja.demo.enums.TipoUsuario;
import jakarta.persistence.Id;

import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "usuarios")
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String primeiroNome;

    @Column(nullable = false)
    private String segundoNome;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    @JsonIgnore
    private String senha;

    @Column(nullable = false, unique = true)
    private String telefone;

    @Enumerated(EnumType.STRING)
    @Column()
    private TipoUsuario tipo = TipoUsuario.CANDIDATO;

    public Usuario() {
    }

    public Usuario(Long id, String primeiroNome, String segundoNome, String email, String senha, String telefone, TipoUsuario tipo) {
        this.id = id;
        this.primeiroNome = primeiroNome;
        this.segundoNome = segundoNome;
        this.email = email;
        this.senha = senha;
        this.telefone = telefone;
        this.tipo = tipo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getSegundoNome() {
        return segundoNome;
    }

    public void setSegundoNome(String segundoNome) {
        this.segundoNome = segundoNome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public TipoUsuario getTipo() {
        return tipo;
    }

    public void setTipo(TipoUsuario tipo) {
        this.tipo = tipo;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(id, usuario.id) && Objects.equals(primeiroNome, usuario.primeiroNome) && Objects.equals(segundoNome, usuario.segundoNome) && Objects.equals(email, usuario.email) && Objects.equals(senha, usuario.senha) && Objects.equals(telefone, usuario.telefone) && tipo == usuario.tipo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, primeiroNome, segundoNome, email, senha, telefone, tipo);
    }
}
