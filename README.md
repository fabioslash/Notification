# Notification
## Sistema de Notificações

Este projeto se define em fornecer uma aplicação que auxilie no envio de notificações entre empresa e cliente. A empresa hoje em dia mantém gastos para manter um canal de comunicação (SMS, E-mail) entre o cliente, apenas para fornecer feedback. A aplicação propõe manter um canal de comunicação que está disponível com os usuários em seus smartphones por meio de notificações. Utilizando a tecnologia de notificações Push a empresa poderá enviará as mensagens que desejar para vários usuários ou para usuário específico.

Para mais informações sobre o projeto acesse: (https://github.com/fabioslash/Notification.wiki.git)

## Arquitetura do projeto

  - Projeto WEB = No projeto WEB é composto pela arquitetura no modelo MVC.

  - Projeto Mobile = No projeto mobile a organização das classes será baseado no padrão MVC.

  - GCM = Servidor de notificação.


## Organização do repositório

  - Descrição de pastas
      - WEB = Contem todas os artefatos que estão relacionadas ao projeto WEB e o backend
      - Mobile = Contem todos os artefatos que estão relacionados ao projeto Mobile.
    
  - Itens de configuração
      - No repositório está sendo versionado todo o código fonte em linguagem JAVA do componente WEB e do componente Mobile. Não está sendo versionado as bibliotecas pois a gestão das dependências do projeto WEB está sendo realizado com a ferramenta Maven, já o gerenciamento das dependências do projeto Mobile está sendo realizado com a ferramenta Gradle. Não está sendo versionado na ferramenta GIT os artefatos relacionados a documentação. Estes itens estão no link: m/fabioslash/Notification.wiki.git

  - Políticas de inclusão/exclusão de itens*
  - Política de acesso e alterações de fontes*
  - Políticas de baselines*

## Ambiente de desenvolvimento
   - A plataforma WEB será desenvolvida na IDE Eclipse Luna e será executado no servidor Apache Tomcat versão 8.0.
      - Quando estiver com essas ferramentas instaladas no seu ambiente de desenvolvimento, poderá utilizar na IDE Eclipse o wizard de import e escolher a opção de: Import from GIT ou poderá apenas fazer o download do ZIP no Github, descompactar no seu workspace e seguir os passos de import e selecionar a opção de: Import from archive ZIP.
      - Para executar a aplicação, apenas dê um RUN e selecione o servidor Apache Tomcat 8. Ele irá abrir na página inicial.
  
   - A plataforma Mobile será desenvolvida na IDE Android Studio versão 1.3.
      - Quando estiver com a ferramenta Android Studio instalada, vá na opção CVS e selecione: Import from Github e coloque o link do clone do projeto. Após importar poderá apenas executar o projeto clicando em RUN e selecionar o device no ADB.
  
