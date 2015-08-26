# Notification
Sistema de Notificações

Este projeto se define em fornecer uma aplicação que auxilie no envio de notificações entre empresa e cliente. A empresa hoje em dia mantém gastos para manter um canal de comunicação (GSM, E-mail) entre o cliente, apenas para fornecer feedback. A aplicação propõe manter um canal de comunicação que está disponível com os usuários em seus smartphones por meio de notificações. Utilizando a tecnologia de notificações Push a empresa poderá enviará as mensagens que desejar para vários usuários ou para usuário específico.


Arquitetura do projeto

  - Projeto WEB = No projeto WEB é composto pela arquitetura no modelo MVC.

  - Projeto Mobile = No projeto mobile a organização das classes será baseado no padrão MVC.

  - GCM = Servidor de notificação.


Organização do repositório

  Descrição de pastas
    - WEB = Contem todas os artefatos que estão relacionadas ao projeto WEB e o backend
    - Mobile = Contem todos os artefatos que estão relacionados ao projeto Mobile.
    
  Itens de configuração
    - No repositório está sendo versionado todo o código fonte em linguagem JAVA do componente WEB e do componente Mobile. Não está sendo versionado as bibliotecas pois a gestão das dependências do projeto WEB está sendo realizado com a ferramenta Maven, já o gerenciamento das dependências do projeto Mobile está sendo realizado com a ferramenta Gradle. Não está sendo versionado na ferramenta GIT os artefatos relacionados a documentação.


Ambiente de desenvolvimento

...
