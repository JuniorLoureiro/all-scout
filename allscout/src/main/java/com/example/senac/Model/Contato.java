package com.example.senac.Model;

public class Contato {

    private String nomeContato;
    private String telefone;
    private String email;

    public Contato(String nomeContato,String telefone, String email) {
        this.nomeContato = nomeContato;
        this.telefone = telefone;
        this.email = email;
    }

    public String getNomeContato() {
        return nomeContato;
    }
    public void setNomeContato(String nomeContato) {
        this.nomeContato = nomeContato;
    }
    
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    
}
  