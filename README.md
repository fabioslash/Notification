# InspetorPublico - WEB
  O sistema Inspetor Público é uma ferramenta que tem o propósito de ser um canal de comunicação entre os orgãos municipais e os cidadãos. Fornece uma ferramenta para avaliação dos feitos realizados pela administração pública. O cidadão tem um aplicativo no sistema Android onde verifica os feitos realizados pela administração pública e avalia através de um nível de excelência já pré cadastrado (RUIM, REGULAR, BOM, MUITO BOM, EXCELENTE) e recebe feedbacks por mensagens PUSH da administração pública. A administração pública tem um sistema na plataforma WEB que cadastra os eventos e cadastra os usuários por níveis hierárquicos. Na plataforma WEB que é de uso exclusivo da administração pública, existe a funcionalidade de ver as notas que os cidadãos deram para cada evento cadastrado.
  
  
# Documentação
  Para mais informações sobre o projeto consultar a documentação
  - Documento de Visão
    https://github.com/fabioslash/Notification/wiki/Documento-de-vis%C3%A3o
  - Documento de Arquitetura

# Depêndencias do Projeto

  -WEB

* WildFly 8 [http://wildfly.org/downloads/](http://wildfly.org/downloads/)
* Git
* Maven - Contorle de dependências
* Java JDK 1.8 [http://www.oracle.com/technetwork/java/javase/
downloads/jdk8-downloads-2133151.html](http://www.oracle.com/technetwork/java/javase/
downloads/jdk8-downloads-2133151.html)
* framework AngularJS [https://code.angularjs.org/1.3.14/](https://code.angularjs.org/1.3.14/)

  -Mobile
  
* Android Studio
* Java JDK 1.8
* Graddle

# Descrição de pastas
  * WEB = Contem todas os artefatos que estão relacionadas ao projeto WEB e o backend
  * Mobile = Contem todos os artefatos que estão relacionados ao projeto Mobile.


# Componentes do sistema
## Backend
* Domain = Classes que serão persistidas e guardaram informações relevantes
* Daos = Componente responsável pela manipulação dos dados com o Banco de dados
* Services = Componente responsável pelo gerenciamento das regras de negócio, no qual ocorrerá as interações do que foi
passado do meio externo para a manipulação do backend.
* Facade = Componente que fica responsável por fornecer formas de comunicação do meio externo com o 		interno.

## Frontend
* Controller.js = Componente responsável por manter a comunicação com o Backend e fornecer os dados para as páginas HTML


## Versionamento
Nomenclatura de versionamento:
a.b.c.d

* a - Grandes alterações = Alterações de inclusão de novas features e novos módulos, inclusão de novas persistências, exclusão de features e môdulos.
* b - Alterações médias = Inclusão e alteração de novos mêtodos utilitários e classes, que não deixam as versões imcompatíveis.
* c - Pequenas alterações ou correções = Mudanças internas que afetam o desempenho, escalabilidade.
* d - hotfix

Todos os deploys em produção devem partir do ** branch master ** com sua respectiva tag (Obedecendo a nomenclatura acima).

Qualquer alteração em uma tag gerada previamente é denominada como **hotfix**.


