package br.com.fiap.test;

import br.com.fiap.model.CodigoPessoaFisica;
import org.junit.Test;

import static org.junit.Assert.*;

public class CodigoPessoaFisicaTest {
    CodigoPessoaFisica pessoaFisica = new CodigoPessoaFisica();
    @Test
    public void testRemoveCaracteresEspeciaisComPonto() {
        String justNumberCpf = pessoaFisica.removeCaracteresEspeciais("452.714.488.00");
        assertEquals("45271448800" , justNumberCpf);
    }
    @Test
    public void testRemoveCaracteresEspeciaisComTraco() {
        String justNumberCpf = pessoaFisica.removeCaracteresEspeciais("452-714-488-00");
        assertEquals("45271448800" , justNumberCpf);
    }
    @Test
    public void testRemoveCaracteresEspeciaisComBarra() {
        String justNumberCpf = pessoaFisica.removeCaracteresEspeciais("452/714/488/00");
        assertEquals("45271448800" , justNumberCpf);
    }
    @Test
    public void testRemoveCaracteresEspeciaisComBarraTracoEPonto() {
        String justNumberCpf = pessoaFisica.removeCaracteresEspeciais("452/714-488.00");
        assertEquals("45271448800" , justNumberCpf);
    }
    @Test
    public void testValidaCpfValido() {
        boolean validCpf = pessoaFisica.validaCPF("452.714.488-00");
        assertEquals(true,validCpf);
    }
    @Test
    public void testValidaCpfInvalido() {
        boolean validCpf = pessoaFisica.validaCPF("000.000.000-00");
        assertEquals(false,validCpf);
    }
}