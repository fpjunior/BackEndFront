# Avaliação Informata

### Pré-requisito
 - Ter uma conta no bitbucket
   - Se não tiver, criar em https://bit.ly/12ksDg8
 - Clonar a feature que contém seu primeiro nome **_feature_avaliacao\_<seu_primeiro_nome>_**
    ```
    git clone --single-branch --branch feature_avaliacao_<seu_primeiro_nome> https://bitbucket.org/rafaelpereirainformata/avaliacao_informata_repository.git
    ```
    
### Quiz
 - Acessar o Quiz em https://bit.ly/2qoAI1f
 - Ao terminar, tirar um print screen da tela
 - Criar uma pasta na raíz do projeto chamada **quiz-resultado**
 - Colar o print na pasta
 - Submeter a pasta, contendo a imagem salva, para o repositório remoto

### Back-end
 - Criar um endpoint retornando uma lista de clientes. Exemplo:
    ```
    [
        {
            "id": 1,
            "nome": "Avaliação Informata",
            "cpf: "088.755.823-98"
        }
    ]
    ```
 - Executar o projeto:
    ```
    sh ./mvnw spring-boot:run
    ```
### Front-end
 - Exibir a lista no front
 - Ao utilizar o angular, aproveitar o projeto existente.
 - Executar o projeto:
    ```
    npm install
    ```
    ```
    ng serve
    ```
 - Caso queira utilizar outra tecnologia de front-end, fica a sua escolha.

### Finalização
 - Submeter todo o código para a sua feature remota
 - Avisar a um dos avaliadores que terminou
 
**Fique a vontade e use a criatividade!**