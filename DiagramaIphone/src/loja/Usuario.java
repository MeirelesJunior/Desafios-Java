package loja;

import musica.ReprodutorMusicial;
import sistema.Iphone;
import telefone.AparelhoTelefonico;

public class Usuario {
	public static void main(String[] args) {
		
		Iphone meuIphone = new Iphone();
		
		meuIphone.selecionarMusica();
		meuIphone.tocar();
		meuIphone.pausar();
		
		
		System.out.println("*-----------*");
		
		meuIphone.ligar();
		meuIphone.atender();
		meuIphone.correioVoz();
		
		System.out.println("*-----------*");
		
		meuIphone.exibirPagina();
		meuIphone.adicionarNovaAba();
		meuIphone.atualizarPagina();
		
		
		
		
	}
}
