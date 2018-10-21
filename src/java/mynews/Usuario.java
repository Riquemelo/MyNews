/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mynews;

/**
 *
 * @author riquemlo
 */
public class Usuario {
    private int id;
    private String nome;
    private String email;
    private String password;
    private int dataNascimento;
    private int dataCadastro;
    private int profile;
    private int maisUsado;

    public Usuario(int id, String nome, String email, String password, int dataNascimento, int dataCadastro) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.password = password;
        this.dataNascimento = dataNascimento;
        this.dataCadastro = dataCadastro;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(int dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public int getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(int dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public int getProfile() {
        return profile;
    }

    public void setProfile(int profile) {
        this.profile = profile;
    }

    public int getMaisUsado() {
        return maisUsado;
    }

    public void setMaisUsado(int maisUsado) {
        this.maisUsado = maisUsado;
    }
    
    
}
