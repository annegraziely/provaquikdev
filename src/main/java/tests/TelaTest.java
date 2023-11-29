package tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.elementsPage;
import suporte.Web;



public class TelaTest {

    private WebDriver navegador;
    @Before
    public void setUP(){
        navegador = Web.createChrome();
    }

    @Test
    public void testCamposPreenchidosCorretamente(){
        String conteudoTabelaAtual = new elementsPage(navegador)
                .inserirNome("chave")
                .inserirPreco("35")
                .inserirValidade("31/01/1992")
                .clicarAdicionar()
                .conteudoTabela();

        Assert.assertEquals("1 chave R$ 35,00 31/01/1992",conteudoTabelaAtual);
    }
    @Test
    public void testCampoValidadeInvalido() {
        String messageAtual = new elementsPage(navegador)
                .inserirNome("chave")
                .inserirPreco("50")
                .inserirValidade("")
                .clicarAdicionar()
                .messageInvalidaCampoValidade();

        Assert.assertEquals("Validade Invalida",messageAtual);
    }
    @Test
    public void testCampoPrecoInvalido(){
        String messageAtual =  new elementsPage(navegador)
                .inserirNome("chave")
                .inserirPreco("")
                .inserirValidade("22/01/1992")
                .clicarAdicionar().messageInvalidaCampoPreco();

        Assert.assertEquals("Preço invalido",messageAtual);
    }
    @Test
    public void testCampoNomeInvalido(){
        String messageAtual = new elementsPage(navegador)
                .inserirNome("")
                .inserirPreco("40")
                .inserirValidade("22/01/1992")
                .clicarAdicionar()
                .messageInvalidaCampoNome();

        Assert.assertEquals("Nome invalido",messageAtual);
        System.out.println(messageAtual);
    }

    @After
    public void saida(){
        navegador.quit();
    }


}
