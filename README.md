API para Sistema de Avaliação de Créditos
=========================================

Uma empresa de empréstimo precisa criar um sistema de análise de solicitação de crédito. Sua tarefa será criar uma **API REST SPRING BOOT E KOTLIN** 🍃💜 para a empresa fornecer aos seus clientes as seguintes funcionalidades:

*   ### Cliente (Customer):
    
    *   **Cadastrar:**
        1.  **Request:** _firstName, lastName, cpf, income, email, password, zipCode e street_
        2.  **Response:** _String_
    *   **Editar cadastro:**
        1.  **Request:** _id, firstName, lastName, income, zipCode, street_
        2.  **Response:** _firstName, lastName, income, cpf, email, income, zipCode, street_
    *   **Visualizar perfil:**
        1.  **Request:** _id_
        2.  **Response:** _firstName, lastName, income, cpf, email, income, zipCode, street_
    *   **Deletar cadastro:**
        1.  **Request:** _id_
        2.  **Response:** _sem retorno_
*   ### Solicitação de Empréstimo (Credit):
    
    *   **Cadastrar:**
        1.  **Request:** _creditValue, dayFirstOfInstallment, numberOfInstallments e customerId_
        2.  **Response:** _String_
    *   **Listar todas as solicitações de emprestimo de um cliente:**
        1.  **Request:** _customerId_
        2.  **Response:** _creditCode, creditValue, numberOfInstallment_
    *   **Visualizar um emprestimo:**
        1.  **Request:** _customerId e creditCode_
        2.  **Response:** _creditCode, creditValue, numberOfInstallment, status, emailCustomer e incomeCustomer_
    
    ![API para Sistema de Avaliação de Créditos](https://i.imgur.com/7phya16.png)  
    Diagrama UML Simplificado de uma API para Sistema de Avaliação de Crédito
    
    ![Arquitetura em 3 camadas Projeto Spring Boot](https://i.imgur.com/1Ea5PH3.png)  
    Arquitetura em 3 camadas Projeto Spring Boot
    
    ### DESAFIO
    
    Implemente as regras de negócio a seguir para a solicitação de empréstimo:
    
    1.  o máximo de parcelas permitido será 48
    2.  data da primeira parcela deverá ser no máximo 3 meses após o dia atual
    
    * * *
    
    ### Links Úteis
    
    *   https://start.spring.io/#!type=gradle-project&language=kotlin&platformVersion=3.0.3&packaging=jar&jvmVersion=17&groupId=me.dio&artifactId=credit-application-system&name=credit-application-system&description=Credit%20Application%20System%20with%20Spring%20Boot%20and%20Kotlin&packageName=me.dio.credit-application-system&dependencies=web,validation,data-jpa,flyway,h2
    *   https://docs.spring.io/spring-boot/docs/2.0.x/reference/html/common-application-properties.html
    *   https://medium.com/cwi-software/versionar-sua-base-de-dados-com-spring-boot-e-flyway-be4081ddc7e5
    *   https://strn.com.br/artigos/2018/12/11/todas-as-anota%C3%A7%C3%B5es-do-jpa-anota%C3%A7%C3%B5es-de-mapeamento/
    *   https://pt.wikipedia.org/wiki/Objeto\_de\_Transfer%C3%AAncia\_de\_Dados
    *   https://pt.wikipedia.org/wiki/CRUD
    *   https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#repository-query-keywords
    *   https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#jpa.query-methods.at-query
    *   https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#glossary
    
    * * *
    
    ### Autor
    
    [![](https://avatars.githubusercontent.com/u/64323124?v=4)  
    **Camila Cavalcante**](https://www.instagram.com/camimi_la/) [](https://www.instagram.com/camimi_la/ "Instagram")Feito com ❤️ por Cami-la 👋🏽 Entre em contato! \[!\[Linkedin Badge\](https://img.shields.io/badge/-Camila-blue?style=flat-square&logo=Linkedin&logoColor=white&link=https://www.linkedin.com/in/cami-la/)\](https://www.linkedin.com/in/cami-la/) \[!\[Gmail Badge\](https://img.shields.io/badge/-camiladsantoscavalcante@gmail.com-c14438?style=flat-square&logo=Gmail&logoColor=white&link=mailto:camiladsantoscavalcante@gmail.com)\](mailto:camiladsantoscavalcante@gmail.com)
    
    ### Contribuindo
    
    Este repositório foi criado para fins de estudo, então contribua com ele.  
    Se te ajudei de alguma forma, ficarei feliz em saber. E caso você conheça alguém que se identifique com o conteúdo, não deixe de compatilhar. Se possível: ⭐️ Star o projeto 🐛 Encontrar e relatar issues