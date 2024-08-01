package banke2etreinamentos.ui.steps;

import banke2etreinamentos.ui.pages.RegisterPage;
import banke2etreinamentos.ui.runner.Executa;
import banke2etreinamentos.ui.utils.DataGenerator;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterSteps {

	RegisterPage registerPage = new RegisterPage();

	@Given("acesse a tela principal da e2e bank")
	public void acesseATelaPrincipalDaE2eBank() {
		Executa.startTest("http://52.2.114.98/");
	}

	@When("informar cpf de funcionario nao cadastrado")
	public void informarCpfDeFuncionarioNaoCadastrado() {
		// Massa unica, atenção ao usa-la
		registerPage.informarCpf("777.486.700-57");
	}

	@When("preencher formulario de dados pessoais com informacoes validas")
	public void preencherFormularioDeDadosPessoaisComInformacoesValidas() throws InterruptedException{
		registerPage.preencherDadosPessoais(DataGenerator.firstNameRandom(), DataGenerator.lastNameRandom(),
				DataGenerator.firstNameRandom() + "@e2etreinamentos.com.br", DataGenerator.phoneRandom(),
				DataGenerator.addressRandom(), DataGenerator.rgRandom(), DataGenerator.zipcodeRandom(),
				DataGenerator.numberHouseRandom(), DataGenerator.stateRandom(), DataGenerator.cityRandom(),
				DataGenerator.dateRandom());
	}

	@When("preencher formulario de dados profissionais com informacoes validas")
	public void preencherFormularioDeDadosProfissionaisComInformacoesValidas() {
		// continuar daqui
	}

	@When("criar senha de acesso valida")
	public void criarSenhaDeAcessoValida() {
		
	}

	@Then("cadastro efetuado com sucesso")
	public void cadastroEfetuadoComSucesso() {

	}

	@When("informe cpf de nao funcionario")
	public void informeCpfDeNaoFuncionario() {

	}

	@When("informe cpf ja cadastrado")
	public void informeCpfJaCadastrado() {

	}

	@Then("sistema retorna mensagens de erro de cpf")
	public void sistemaRetornaMensagensDeErroDeCpf() {

	}

	@When("informe cpf de funcionario nao cadastrado")
	public void informeCpfDeFuncionarioNaoCadastrado() {

	}

	@When("preencher formulario com dados pessoais invalidos")
	public void preencherFormularioComDadosPessoaisInvalidos() {

	}

	@Then("sistema retorna mensagens de erro no formulario de dados pessoais")
	public void sistemaRetornaMensagensDeErroNoFormularioDeDadosPessoais() {

	}

	@When("preencher formulario de dados profissionais com informacoes invalidas")
	public void preencherFormularioDeDadosProfissionaisComInformacoesInvalidas() {

	}

	@Then("sistema retorna mensagens de erro no formulario de dados profissionais")
	public void sistemaRetornaMensagensDeErroNoFormularioDeDadosProfissionais() {

	}

	@When("tentar criar uma senha invalida")
	public void tentarCriarUmaSenhaInvalida() {

	}

	@Then("sistema retorna mensagem de erro de nova senha invalida")
	public void sistemaRetornaMensagemDeErroDeNovaSenhaInvalida() {

	}

	@When("tentar criar uma senha que nao coincide")
	public void tentarCriarUmaSenhaQueNaoCoincide() {

	}

	@Then("sistema retorna mensagem de erro nova senha nao coincide")
	public void sistemaRetornaMensagemDeErroNovaSenhaNaoCoincide() {

	}

	@When("nao preencher formulario com dados pessoais")
	public void naoPreencherFormularioComDadosPessoais() {

	}

	@Then("sistema retorna mensagens de erro de campos obrigatorios no formulario de dados pessoais")
	public void sistemaRetornaMensagensDeErroDeCamposObrigatoriosNoFormularioDeDadosPessoais() {

	}

	@When("nao preencher formulario com dados profissionais")
	public void naoPreencherFormularioComDadosProfissionais() {

	}

	@When("sistema retorna mensagens de erro de campos obrigatorios no formulario de dados profissionais")
	public void sistemaRetornaMensagensDeErroDeCamposObrigatoriosNoFormularioDeDadosProfissionais() {

	}

	@When("nao preencher campos de nova senha")
	public void naoPreencherCamposDeNovaSenha() {

	}

	@Then("sistema retorna mensagem de erro de campos obrigatorios na nova senha")
	public void sistemaRetornaMensagemDeErroDeCamposObrigatoriosNaNovaSenha() {

	}

}
