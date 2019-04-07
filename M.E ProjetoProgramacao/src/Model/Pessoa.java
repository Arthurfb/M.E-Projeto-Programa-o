/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author Arthurfb
 */
public class Pessoa {

    private String nome, rg, cpf, sexo;
    private int anoNasc;
    ArrayList<Pessoa> DadosPessoa;
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getAnoNasc() {
        return anoNasc;
    }

    public void setAnoNasc(int anoNasc) {
        this.anoNasc = anoNasc;
    }

    public void cadastrar() {
        DadosPessoa = new ArrayList();
    }

    public void exibirInf() {

    }

    public ArrayList<Pessoa> getDadosPessoa() {
        return DadosPessoa;
    }

    public void setDadosPessoa(ArrayList<Pessoa> DadosPessoa) {
        this.DadosPessoa = DadosPessoa;
    }
    
    

}
