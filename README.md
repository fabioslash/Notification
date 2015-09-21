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
* Maven - Controle de dependências
* Java JDK 1.8 [http://www.oracle.com/technetwork/java/javase/
downloads/jdk8-downloads-2133151.html](http://www.oracle.com/technetwork/java/javase/
downloads/jdk8-downloads-2133151.html)
* framework AngularJS [https://code.angularjs.org/1.3.14/](https://code.angularjs.org/1.3.14/)

-Mobile
  
* Android Studio
* Java JDK 1.8
* Graddle - Controle de dependências


# Descrição de pastas
  * WEB = Contem todas os artefatos que estão relacionadas ao projeto WEB e o backend
  * Mobile = Contem todos os artefatos que estão relacionados ao projeto Mobile.


# Componentes do sistema - Denominações de nomenclaturas de classes
## Backend
* Domain = Classes que serão persistidas e guardaram informações relevantes
* Daos = Componente responsável pela manipulação dos dados com o Banco de dados
* Services = Componente responsável pelo gerenciamento das regras de negócio, no qual ocorrerá as interações do que foi
passado do meio externo para a manipulação do backend.
* Facade = Componente que fica responsável por fornecer formas de comunicação do meio externo com o 		interno.

## Frontend
* Controller.js = Componente responsável por manter a comunicação com o Backend e fornecer os dados para as páginas HTML

## Mobile
* Domain = Classes que serão persistidas e guardaram informações relevantes
* Controller = Classe responsável por fazer a comunicação com o Banco de dados.
* Service = Interface responsável por fazer a comunicação com os serviços de Backend do sistema na WEB
* Activity = Classe responsável por fazer a manipulação das Views


# Versionamento

## GITFLOW
  * master = Versões atualizadas que já estão aptas para a implantação depois dos testes realizados no branch (media).
	* master-#.# = Versões antigas que foram mantidas por questões de compatibilidade e estão estáveis para implantação.
	* media = Versões que estão em fase de testes pela inclusão de novas features. Inclui os merges das versões do branch (dev).
	* dev = Versões que estão em desenvolvimento. Todas as novas features que serão implementadas devem partir deste branch.
	* feature/nomeDaFeature = Versões que foram puchadas do branch (dev) no qual cada desenvolvedor está realizando a feature.     A nomenclatura deve indicar o nome da feature que está trabalhando depois da barra do nome feature. O nome da feature é      indicada pelo nome da tarefa que foi criada no Trello.
	* hotfix = Versões que foram encontradas BUGS estão nesta branch.

## Itens de Configuração
  * Os arquivos que não serão versionados são: *.lib, *.jar.


## Definição de Baselines
  * As Baselines serão definidas pela última versão do branch (master) e por um documento no WIKI informando todas as          features que foram acrescentadas na Baseline. Este arquivo seguirá a seguinte nomenclatura: Baseline-Versão do branch master
