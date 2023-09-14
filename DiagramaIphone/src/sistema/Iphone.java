package sistema;

import musica.ReprodutorMusicial;
import navegador.NavegadorInternet;
import telefone.AparelhoTelefonico;

public class Iphone implements ReprodutorMusicial, AparelhoTelefonico, NavegadorInternet {

	@Override
	public void exibirPagina() {
		System.out.println("Exibindo pagina");

	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Adicionando nova aba");

	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando Pagina");

	}

	@Override
	public void ligar() {
		System.out.println("Ligando aparelho");

	}

	@Override
	public void atender() {
		System.out.println("Atendendo...");

	}

	@Override
	public void correioVoz() {
		System.out.println("Caixa de msg...");

	}

	@Override
	public void tocar() {
		System.out.println("Aparelho tocando musica");

	}

	@Override
	public void pausar() {
		System.out.println("Pausando musica");

	}

	@Override
	public void selecionarMusica() {
		System.out.println("Selecionando musica....");

	}

}
