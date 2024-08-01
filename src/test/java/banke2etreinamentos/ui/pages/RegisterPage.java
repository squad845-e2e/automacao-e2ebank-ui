package banke2etreinamentos.ui.pages;

import banke2etreinamentos.ui.elements.Elementos;
import banke2etreinamentos.ui.methods.Metodos;

public class RegisterPage {

	Metodos metodo = new Metodos();
	Elementos el = new Elementos();

	public void informarCpf(String cpf) {
		metodo.clicar(el.btnAbrirConta);
		metodo.escrever(el.campoDigiteSeuCpf, cpf);
		metodo.clicar(el.btnContinuar);
	}

	public void preencherDadosPessoais(String nome, String sobrenome, String email, String telefone, String endereco,
			String rg, String cep, String numero, String estado, String cidade, String dataNascimento) throws InterruptedException {
		Thread.sleep(5000);
		metodo.escrever(el.campoNome, nome);
		metodo.escrever(el.campoSobrenome, sobrenome);
		metodo.escrever(el.campoEmail, email);
		metodo.clicar(el.campoTelefone);
		metodo.escrever(el.campoTelefone, telefone);
		metodo.escrever(el.campoEndereco, endereco);
		metodo.escrever(el.campoRg, rg);
		metodo.clicar(el.campoCep);
		metodo.escrever(el.campoCep, cep);
		metodo.escrever(el.campoNumero, numero);
		metodo.escrever(el.campoEstado, estado);
		metodo.escrever(el.campoCidade, cidade);
		metodo.clicar(el.campoDataDeNascimento);
		metodo.escrever(el.campoDataDeNascimento, dataNascimento);
		metodo.clicar(el.btnEnviarPessoais);
		
	}

	public void preencherDadosProfissionais(String grupoAtual, String primeiroGrupo, String cargo, String salario) {
		metodo.escrever(el.campoGrupoAtual, grupoAtual);
		metodo.escrever(el.campoPrimeiroGrupo, primeiroGrupo);
		metodo.escrever(el.campoCargo, cargo);
		metodo.escrever(el.campoSalario, salario);
		metodo.clicar(el.btnEnviarProfissionais);
		
	}

	public void preencherSenhaNova(String novaSenha, String confirmacaoSenha) {
		metodo.escrever(el.campoDigiteASenha, novaSenha);
		metodo.escrever(el.campoConfirmeASenha, confirmacaoSenha);
		metodo.clicar(el.btnCadastrar);
	}
	

}
