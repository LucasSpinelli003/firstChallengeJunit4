package br.com.fiap.test;

import br.com.fiap.model.LogCpf;
import br.com.fiap.model.ValidadoraAcesso;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class LogCpfTest {

    LogCpf log = new LogCpf();
    ValidadoraAcesso validadora = new ValidadoraAcesso();

    @Test
    public void logarCpfValido() {
        String mensagem = log.logarCpf(true);
        assertEquals("Seu CPF é válido para acesso ao sistema",log.getMensagem());
    }
    @Test
    public void logarCpfInvalido() {
        log.logarCpf(false);
        assertEquals("Seu CPF é inválido para acesso ao sistema",log.getMensagem());
    }
}