Rest API<a name="TOP"></a>
===================
- - - - 
As definições dos conceitos envolvidos;
As principais características deste conceito (pelo menos umas cinco).

# Definição de API #

API é um acrônimo em inglês para Application Programming Interface, traduzindo, Interface de Programação de Aplicações.
Ou seja, uma junção de padrões, ferramentas e protocolos, permitindo integração e comunicação de softwares.


### Funcionamento de uma API ###    

<details>
  <summary>API WEB</summary>
</details>
            
API WEB serve como ponte entre cliente e servidor, sendo utilizado protocolos web, como o HTTP
* O que é HTTP


    HTTP, sigla para Hypertext Transfer Protocol, é um protocolo fundamental para a comunicação na internet. Ele define como as informações são transferidas entre um navegador web e um servidor, permitindo que você acesse páginas web, baixe arquivos e utilize diversos serviços online.
        
* Seu funcionamento acontece da seguinte forma:

    * O servidor aguarda por requisições.
    * O cliente envia uma requisição HTTP para o endpoint adequado no servidor (por exemplo, GET /tasks ou POST /tasks).
    * O servidor processa a requisição, realiza as operações necessárias (obter ou adicionar tarefas) e retorna uma resposta ao cliente, geralmente em formato JSON.
    * O cliente recebe a resposta e pode então processar os dados conforme necessário.
      
<details>
  <summary>APIs de Biblioteca</summary>
</details>

Conjuntos de funções, procedimentos, classes ou módulos incorporados diretamente no código para facilitar tarefas específicas ou adicionar funcionalidades.
A pessoa desenvolvedora inclui a biblioteca em seu projeto e utiliza métodos como ___GET___ ou ___POST___ para realizar requisições HTTP sem precisar se preocupar com a complexidade subjacente da comunicação pela rede.
* Exemplo: Matplotlib em Python para criação de gráficos.

<details>
  <summary>APIs de Sistema Operacional (OS APIs)</summary>
</details>

As APIs do Sistema Operacional permitem que programas de software interajam com o sistema operacional subjacente, acessando recursos e serviços específicos do sistema.
* Exemplo: A WinAPI (Windows API) é uma extensa coleção de interfaces de programação que permite interagir com o sistema operacional Windows, pois se trata de um conjunto robusto de ferramentas que abrange uma variedade de funcionalidades, desde manipulação de janelas até manipulação de arquivos, acesso a recursos do sistema e muito mais.

<details>
  <summary>APIs de Banco de Dados</summary>
</details>

As APIs de Banco de Dados permitem que aplicações interajam com sistemas de gerenciamento de bancos de dados (SGBDs), realizando operações como consulta, inserção, atualização e exclusão de dados.

Elas fornecem uma interface padronizada para haver comunicação eficiente com diferentes tipos de bancos de dados, como MySQL, PostgreSQL, Oracle, SQLite, entre outros.
* Exemplo: A SQLAlchemy é uma popular API de Banco de Dados em Python que oferece uma abstração de nível mais alto, facilitando a interação com diferentes SGBDs.
  
<details>
  <summary>APIs de Hardware</summary>
</details>
Proporcionam interface padronizada para interação com componentes físicos do sistema.

Permite controle de funcionalidades específicas sem conhecimento detalhado de baixo nível.
* Exemplo: OpenGL para gráficos tridimensionais.

<details>
  <summary>APIs de Hardware</summary>
</details>

* Interface padronizada para software interagir com componentes físicos do sistema.
* Permite acesso e controle de funcionalidades específicas sem conhecimento de baixo nível.
* Exemplos incluem OpenGL (gráficos tridimensionais) e DirectX (áudio, vídeo e entrada).

<details>
  <summary>APIs Sociais</summary>
</details>

* Integra funcionalidades ou dados de plataformas de mídia social em aplicações.
* Permite acesso a perfis de usuários, postagens, compartilhamento de conteúdo, etc.
* Exemplos: Facebook Graph API, Twitter API, Instagram Graph API, LinkedIn API.

<details>
  <summary>APIs de Serviços em Nuvem</summary>
</details>

* Interface para interação com serviços em plataformas de computação em nuvem.
* Acessa e gerencia serviços como armazenamento de dados, computação, aprendizado de máquina, etc.
* Exemplos: AWS, Microsoft Azure, Google Cloud Platform.

### Funções básicas de uma API ###  

Obter, enviar, alterar e excluir informações.

O aplicativo do usuário (cliente) envia solicitações para um aplicativo de terceiros (servidor) que retorna uma resposta.

A interação ocorre em três etapas: chamada de API pelo cliente, resposta do servidor para a API, transferência de dados da API para o cliente.

# Especificações REST API #

### Definição ###

Uma REST API (Representational State Transfer Application Programming Interface) é um estilo de arquitetura para sistemas distribuídos, especialmente em ambientes web, que se baseia nos princípios do REST.

### Principais Características REST API ###

* __Arquitetura Cliente-Servidor:__ Segue o modelo cliente-servidor, onde o cliente e o servidor são separados e independentes um do outro.

* __Stateless (Sem Estado):__ Cada solicitação do cliente para o servidor deve conter todas as informações necessárias para entender e processar a solicitação. O servidor não mantém nenhum estado sobre o cliente entre solicitações.

* __Recursos Identificáveis:__ Os recursos acessíveis através da API são identificados por URLs únicas. Cada recurso tem sua própria URL, que o cliente pode usar para acessar, modificar ou excluir esse recurso.

* __Operações HTTP:__ As operações CRUD (Create, Read, Update, Delete) são mapeadas aos métodos HTTP (GET, POST, PUT, DELETE), permitindo uma semântica clara e consistente.

* __Formatos de Representação:__ Suporta uma variedade de formatos de representação para os dados, como JSON (JavaScript Object Notation) e XML (eXtensible Markup Language).

### Funcionamento ###
O funcionamento de uma REST API envolve:

* O cliente envia uma requisição HTTP para o servidor, indicando o método HTTP apropriado (GET, POST, PUT, DELETE) e a URL do recurso desejado.

* O servidor processa a requisição e retorna uma resposta HTTP ao cliente, geralmente com um código de status indicando o resultado da operação e, se aplicável, os dados solicitados no formato especificado.

* A interação ocorre de forma stateless, ou seja, sem manter nenhum estado sobre o cliente entre as solicitações, garantindo assim uma maior escalabilidade e confiabilidade.

### Exemplo ###

Suponha que temos uma aplicação de gerenciamento de tarefas e desejamos criar uma REST API para permitir que os clientes realizem operações CRUD nas tarefas.

* Para listar todas as tarefas, o cliente faz uma requisição GET para a URL /tasks.
  
* Para criar uma nova tarefa, o cliente faz uma requisição POST para a URL /tasks, enviando os dados da nova tarefa no corpo da requisição.

* Para atualizar uma tarefa existente, o cliente faz uma requisição PUT para a URL /tasks/{id}, especificando o ID da tarefa a ser atualizada e enviando os novos dados no corpo da requisição.
* Para excluir uma tarefa, o cliente faz uma requisição DELETE para a URL /tasks/{id}, especificando o ID da tarefa a ser excluída.
