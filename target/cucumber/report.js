$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "Login",
  "description": "",
  "id": "login",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Login com sucesso",
  "description": "",
  "id": "login;login-com-sucesso",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "Estou na home page",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "Clico em Login",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "Insiro email e senha validos",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "Clico no botao de login",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Home page e apresentada com sucesso",
  "keyword": "Then "
});
formatter.match({
  "location": "Login.openHomePage()"
});
formatter.result({
  "duration": 9322240615,
  "status": "passed"
});
formatter.match({
  "location": "Login.clickOnLoginButton()"
});
formatter.result({
  "duration": 168804659,
  "status": "passed"
});
formatter.match({
  "location": "Login.insertEmail()"
});
formatter.result({
  "duration": 367808297,
  "status": "passed"
});
formatter.match({
  "location": "Login.clico_no_botao_de_login()"
});
formatter.result({
  "duration": 311029084,
  "status": "passed"
});
formatter.match({
  "location": "Login.showHomePage()"
});
formatter.result({
  "duration": 2958548713,
  "status": "passed"
});
});