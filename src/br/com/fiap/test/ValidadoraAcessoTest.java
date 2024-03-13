package br.com.fiap.test;

import br.com.fiap.model.ValidadoraAcesso;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ValidadoraAcessoTest {

    ValidadoraAcesso validadora = new ValidadoraAcesso();

    @Before
     public void setupValidadora(){
        ArrayList<String> listaCpf = new ArrayList<>();
        listaCpf.add("452.714.488-00");
        validadora.setListaCpf(listaCpf);
    }
    @Test
    public void validaAcessoCpfValido(){
        boolean acesso = validadora.validaAcesso("452.714.488-00");
        assertEquals(true, acesso);
    }
    @Test
    public void validaAcessoCpfInvalido(){
        boolean acesso = validadora.validaAcesso("487.140.498-64");
        assertEquals(false, acesso);
    }

}