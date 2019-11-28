# 8º Meetup QA Joinville

## Testing Dojo - Selenium

### Proposta de teste para o site olx.com.br

1. Login
2. Inclusão de anúncio
3. Pesquisa de anúncios relacionados
4. Edição do anúncio
5. Fechamento do anúncio  
  
Todo o progresso do dojo está no arquivo `OlxTestDojo.java`. Basicamente, conseguimos chegar na metade do segundo teste e é exatamente nesse estado que o código se encontra. Os testes foram realizados em um ambiente com os mesmos requisitos do [1º Workshow Selenium](https://github.com/qajoinville/qajoinville10_2019) (realizado no 7º Meetup QA Joinville).

## Requisitos

> IDE Eclipse instalado.

* [Tutorial 1 (Português)](https://blog.dankicode.com/como-instalar-eclipse/)
* [Tutorial 2 (Inglês)](https://www.eclipse.org/downloads/packages/installer)


> Baixar o driver do navegador.

* [Driver Chrome](https://chromedriver.chromium.org/downloads)
* [Driver Firefox](https://github.com/mozilla/geckodriver/releases)

> Links de ajuda:

* [Documentação do selenium](https://www.seleniumhq.org/docs/)
* [Beginner guide (Manual do iniciante)](https://www.valuebound.com/resources/blog/selenium-a-beginner-guide-to-automation-testing-tool/)
* [Documentação do chromedriver para uso no selenium](https://chromedriver.chromium.org/getting-started)

## Roteiro utilizado no workshop

* Criamos um maven project; (Novo->Other->Maven->Maven Project)
* Adicionamos a dependência do seleniumhq; (Procuramos por `seleniumqh maven` no google, entramos no site do maven, recortamos a tag `<dependency>` e inserimos no pom)
* Adicionamos o JUnit 4 nas bibliotecas; (Click com botão direito no projeto -> Build Path -> Add libraries)
* Executar o update do maven project; (Click com botão direito no projeto->Maven->Update Project
* Criar a classe de teste com setUpBeforeClass e tearDownAfterClass; (Novo->JUnit Test Case [setar a criação das funçoes citadas])

