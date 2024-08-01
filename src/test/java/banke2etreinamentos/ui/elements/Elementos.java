package banke2etreinamentos.ui.elements;

import org.openqa.selenium.By;

public class Elementos {

	// Abertura de conta
	
	// Pagina principal
	
	public By btnAbrirConta = By.xpath("//button[@class='open-account-button']");
	public By campoDigiteSeuCpf = By.id("cpf-input");
	public By btnContinuar = By.xpath("//button[text()='Continuar']");
	
	
	// Formulario Dados Pessoais
	
	public By campoNome = By.xpath("//input[@name='firstName']");
	public By campoSobrenome = By.xpath("//input[@name='lastName']");
	public By campoEmail = By.xpath("//input[@name='email']");
	public By campoTelefone = By.xpath("//input[@name='phoneNumber']");
	public By campoEndereco = By.xpath("//input[@name='address']");
	public By campoRg = By.xpath("//input[@name='rg']");
	public By campoCep = By.xpath("//input[@name='cep']");
	public By campoNumero = By.xpath("//input[@name='number']");
	public By campoEstado = By.xpath("//input[@name='state']");
	public By campoCidade = By.xpath("//input[@name='city']");
	public By campoDataDeNascimento = By.xpath("//input[@name='dataBirthday']");
	public By btnEnviarPessoais = By.xpath("//button[@class='form-button']");
	
	
	// Formulario Dados Profissionais
	
	public By campoGrupoAtual = By.xpath("//input[@name='actualGroup']");
	public By campoPrimeiroGrupo = By.xpath("//input[@name='firstGroup']");
	public By campoCargo = By.xpath("//input[@name='job']");
	public By campoSalario = By.xpath("//input[@placeholder='Salário']");
	public By btnEnviarProfissionais = By.id("btnEnviar");
	
	
	// Crie sua senha de acesso a conta
	
	public By campoDigiteASenha = By.xpath("//input[@name='password']");
	public By campoConfirmeASenha = By.xpath("//input[@name='confirmPassword']");
	public By btnCadastrar = By.xpath("//button[@class='form-button'][2]");
	
}
