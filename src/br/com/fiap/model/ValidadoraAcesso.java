package br.com.fiap.model;

import java.util.ArrayList;

public class ValidadoraAcesso {

    private boolean validacao = false;
    private ArrayList<String> listaCpf;


    public boolean validaAcesso(String cpf){
        for (String item : listaCpf) {
            if(cpf.equals(item)){
                validacao = true;
                return validacao;
            }
        }
        return validacao;
    }

    public boolean isValidacao() {
        return validacao;
    }

    public void setValidacao(boolean validacao) {
        this.validacao = validacao;
    }

    public ArrayList<String> getListaCpf() {
        return listaCpf;
    }

    public void setListaCpf(ArrayList<String> listaCpf) {
        this.listaCpf = listaCpf;
    }
}
