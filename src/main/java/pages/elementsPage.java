package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class elementsPage extends BasePage {

    public elementsPage(WebDriver navegador){
        super(navegador);
    }

    public elementsPage inserirNome(String nome){
        navegador.findElement((By.name("nome"))).sendKeys(nome);
        return this;
    }
    public elementsPage inserirPreco(String preco){
        navegador.findElement(By.name("preco")).sendKeys(preco);
        return this;
    }
    public elementsPage inserirValidade(String validade){
        navegador.findElement(By.name("validade")).sendKeys(validade);
        return this;
    }
    public elementsPage clicarAdicionar(){
        navegador.findElement(By.xpath("//*[@id=\"form\"]/button")).click();
        return this;
    }
    public String conteudoTabela(){
        String conteudoTabelaAtual = null;
        conteudoTabelaAtual = navegador.findElement(By.id("conteudoTabela")).getText();

        return conteudoTabelaAtual;
    }
    public String messageInvalidaCampoValidade(){
        String messageAtual=null;
        messageAtual = navegador.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div")).getText();

        return messageAtual;
    }
    public String messageInvalidaCampoPreco(){
        String messageAtual=null;
        messageAtual = navegador.findElement(By.xpath("//*[@id=\"form\"]/div[2]/div")).getText();

        return messageAtual;
    }
    public String messageInvalidaCampoNome(){
        String messageAtual=null;
        messageAtual = navegador.findElement(By.xpath("//*[@id=\"form\"]/div[1]/div")).getText();

        return messageAtual;
    }



}
