# InspetorPublico - WEB
  Este projeto se define em fornecer uma aplicação que auxilie no envio de notificações entre empresa e cliente. A empresa hoje em dia mantém gastos para manter um canal de comunicação (SMS, E-mail) entre o cliente, apenas para fornecer feedback. A aplicação propõe manter um canal de comunicação que está disponível com os usuários em seus smartphones por meio de notificações. Utilizando a tecnologia de notificações Push a empresa poderá enviará as mensagens que desejar para vários usuários ou para usuário específico.

# Depêndencias do Projeto

  -WEB

* WildFly 8 [http://wildfly.org/downloads/](http://wildfly.org/downloads/)
* Git
* Maven
* Java JDK 1.8 [http://www.oracle.com/technetwork/java/javase/
downloads/jdk8-downloads-2133151.html](http://www.oracle.com/technetwork/java/javase/
downloads/jdk8-downloads-2133151.html)
* framework AngularJS [https://code.angularjs.org/1.3.14/](https://code.angularjs.org/1.3.14/)

  -Mobile
  
* Android Studio
* Java JDK 1.8
* Graddle

# Descrição de pastas
  - WEB = Contem todas os artefatos que estão relacionadas ao projeto WEB e o backend
  - Mobile = Contem todos os artefatos que estão relacionados ao projeto Mobile.


## Versionamento
Nomenclatura de versionamento:
a.b.c.d

* a - Grandes alterações = Alterações de inclusão de novas features e novos módulos, inclusão de novas persistências, exclusão de features e môdulos.
* b - Alterações médias = Inclusão e alteração de novos mêtodos utilitários e classes, que não deixam as versões imcompatíveis.
* c - Pequenas alterações ou correções = Mudanças internas que afetam o desempenho, escalabilidade.
* d - hotfix

Todos os deploys em produção devem partir do ** branch master ** com sua respectiva tag (Obedecendo a nomenclatura acima).

Qualquer alteração em uma tag gerada previamente é denominada como **hotfix**.


