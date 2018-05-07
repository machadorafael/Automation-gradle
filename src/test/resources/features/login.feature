Feature: Login
  Scenario: Login com sucesso
    Given Estou na home page
    When Clico em Login
    And Insiro email e senha validos
    And Clico no botao de login
    Then Home page e apresentada com sucesso