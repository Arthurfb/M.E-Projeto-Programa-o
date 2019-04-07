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
public class Aluno extends Pessoa {

    Curso c = new Curso();
    Pessoa p = new Pessoa();

    private int codigo;
    private String interesse;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getInteresse() {
        return interesse;
    }

    public void setInteresse(String interesse) {
        this.interesse = interesse;
    }

    public void cadastrarAluno() {

    }

    public void exibirAluno() {

    }
}
