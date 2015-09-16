# InspetorPublico - WEB
  Repositório do módulo Web. Este módulo é integrado ao módulo InspetorPublico Mobile

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
* Graddle

# Descrição de pastas
  - WEB = Contem todas os artefatos que estão relacionadas ao projeto WEB e o backend
  - Mobile = Contem todos os artefatos que estão relacionados ao projeto Mobile.


## Versionamento
Nomenclatura de versionamento:
a.b.c.d

* a = Grandes alterações = Alterações de inclusão de novas features e novos módulos, inclusão de novas persistências, exclusão de features e môdulos.
* b = Alterações médias = Inclusão e alteração de novos mêtodos utilitários e classes, que não deixam as versões imcompatíveis.
* c = Pequenas alterações ou correções = Mudanças internas que afetam o desempenho, escalabilidade.
* d= hotfix

Todos os deploys em produção devem partir do ** branch master ** com sua respectiva tag (Obedecendo a nomenclatura acima).

Qualquer alteração em uma tag gerada previamente é denominada como **hotfix**.


