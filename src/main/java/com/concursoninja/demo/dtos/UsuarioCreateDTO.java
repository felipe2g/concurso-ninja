package com.concursoninja.demo.dtos;

import com.concursoninja.demo.enums.TipoUsuario;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.util.Objects;

public class UsuarioCreateDTO {

    @NotBlank
    private String primeiroNome;

    @NotBlank
    private String segundoNome;

    @Email
    @NotBlank
    private String email;

    @NotBlank
    @Size(min = 6, message = "A senha deve ter pelo menos 6 caracteres")
    private String senha;

    @NotBlank
    private String telefone;

    private TipoUsuario tipo = TipoUsuario.CANDIDATO;

    public UsuarioCreateDTO() {
    }

    public UsuarioCreateDTO(String primeiroNome, String segundoNome, String email, String senha, String telefone, TipoUsuario tipo) {
        this.primeiroNome = primeiroNome;
        this.segundoNome = segundoNome;
        this.email = email;
        this.senha = senha;
        this.telefone = telefone;
        this.tipo = tipo;
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
        UsuarioCreateDTO that = (UsuarioCreateDTO) o;
        return Objects.equals(primeiroNome, that.primeiroNome) && Objects.equals(segundoNome, that.segundoNome) && Objects.equals(email, that.email) && Objects.equals(senha, that.senha) && Objects.equals(telefone, that.telefone) && tipo == that.tipo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(primeiroNome, segundoNome, email, senha, telefone, tipo);
    }
}
