package br.com.fiap.model;

public class LogCpf {

    private String mensagem;

    public String logarCpf(boolean validacao){
        if(validacao){
            mensagem = "Seu CPF é válido para acesso ao sistema";
            return mensagem;
        }
        mensagem = "Seu CPF é inválido para acesso ao sistema";
        return mensagem;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
}
