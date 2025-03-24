package com.concursoninja.demo.dtos;

import com.concursoninja.demo.enums.TipoUsuario;

import java.util.Objects;

public class UsuarioDTO {
    private Long id;
    private String primeiroNome;
    private String segundoNome;
    private String email;
    private String telefone;
    private TipoUsuario tipo;

    public UsuarioDTO() {
    }

    public UsuarioDTO(Long id, String primeiroNome, String segundoNome, String email, String telefone, TipoUsuario tipo) {
        this.id = id;
        this.primeiroNome = primeiroNome;
        this.segundoNome = segundoNome;
        this.email = email;
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
        UsuarioDTO that = (UsuarioDTO) o;
        return Objects.equals(id, that.id) && Objects.equals(primeiroNome, that.primeiroNome) && Objects.equals(segundoNome, that.segundoNome) && Objects.equals(email, that.email) && Objects.equals(telefone, that.telefone) && tipo == that.tipo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, primeiroNome, segundoNome, email, telefone, tipo);
    }
}
