#Author: your.email@your.domain.com

@regressivo @aberturaConta
Feature: Abertura de conta
  Como funcionário da e2e bank
  Quero abrir uma conta bancaria na e2e bank
  Para utilizar os servicos bancarios

	Background: acessar tela principal
		Given acesse a tela principal da e2e bank

  @positive
  Scenario: Abertura de conta com sucesso
    When informar cpf de funcionario nao cadastrado
    And preencher formulario de dados pessoais com informacoes validas
    And preencher formulario de dados profissionais com informacoes validas
    And criar senha de acesso valida
    Then cadastro efetuado com sucesso
    
  @negative
  Scenario: Abertura de conta com cpf invalido
 	 When informe cpf de nao funcionario
   And informe cpf ja cadastrado
   Then sistema retorna mensagens de erro de cpf
    
  @negative
  Scenario: Abertura de conta com dados pessoais invalidos
  	When informe cpf de funcionario nao cadastrado
  	And preencher formulario com dados pessoais invalidos
  	Then sistema retorna mensagens de erro no formulario de dados pessoais
  	
  @negative
  Scenario: Abertura de conta com dados profissionais invalidos
  	When informe cpf de funcionario nao cadastrado
  	And preencher formulario de dados pessoais com informacoes validas
    And preencher formulario de dados profissionais com informacoes invalidas
    Then sistema retorna mensagens de erro no formulario de dados profissionais
  	
  @negative
  Scenario: Abertura de conta com nova senha invalida
  	When informe cpf de funcionario nao cadastrado
  	And preencher formulario de dados pessoais com informacoes validas
    And preencher formulario de dados profissionais com informacoes validas
  	And tentar criar uma senha invalida
  	Then sistema retorna mensagem de erro de nova senha invalida
  	
  @negative
  Scenario: Abertura de conta com nova senha que nao coincide
  	When informe cpf de funcionario nao cadastrado
  	And preencher formulario de dados pessoais com informacoes validas
    And preencher formulario de dados profissionais com informacoes validas
  	And tentar criar uma senha que nao coincide
  	Then sistema retorna mensagem de erro nova senha nao coincide
  	
  @negative
  Scenario: Abertura de conta com dados pessoais em branco
  	When informe cpf de funcionario nao cadastrado
  	And nao preencher formulario com dados pessoais
  	Then sistema retorna mensagens de erro de campos obrigatorios no formulario de dados pessoais
  	
  @negative
  Scenario: Abertura de conta com dados profissionais em branco
  	When informe cpf de funcionario nao cadastrado
  	And nao preencher formulario com dados profissionais
    And sistema retorna mensagens de erro de campos obrigatorios no formulario de dados profissionais
  	
  @negative
  Scenario: Abertura de conta com nova senha em branco
  	When informe cpf de funcionario nao cadastrado
  	And preencher formulario de dados pessoais com informacoes validas
    And preencher formulario de dados profissionais com informacoes validas
  	And nao preencher campos de nova senha
  	Then sistema retorna mensagem de erro de campos obrigatorios na nova senha