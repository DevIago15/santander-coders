# Curso Git - Trilha Digital | Web Back-End 
O git é uma ferramenta de versionamento de código, onde podemos usar para versionar completamente nosso código caso necessário, além de poder salva-los em um repositório online.

Essa ferramenta segue uma ordem cronológica de estados onde o arquivo/projeto passa por todas elas até chegar no repositório.

Há quatro tipos de estados no GIT, sendo eles:

## Untracked
Um arquivo que ainda não foi trackeado, ou seja, não iniciamos o GIT nele ainda.

## Unmodified
Um arquivo que já foi trackeado com o GIT, porém não foi MODIFICADO.

## Modified
Um arquivo que já foi trackeado com o GIT e MODIFICADO.

* Podemos utilizar o *git status* no terminal para mostrar o status do arquivo/projeto.

* Pode-se utilizar também o *git diff* no terminal para mostrar exatamente o que foi modificado, qual linha e o que foi feito. Caso dermos um *git add*, o *diff* não irá funcionar com a última atualização do repositório, então teremos que dar um *git diff --staged* para mostrar as diferenças que foram adicionadas no arquivo.

## Staged
Esse estado se define em fazer todas as configurações do arquivo (git add, git branch, git remote add origin...) até dar o COMMIT para o repositório.

* Podemos utilizar o *git log* onde é mostrado todo o histórico dos commits do arquivo/projeto.

* Podemos utilizar o *git restore* para retornar uma versão, podemos passar no restore todos os arquivos ou algo específico como por exemplo: *git restore ./README.md* onde só ira retornar a última atualização do readme.md.

* O comando *git restore* pode ser utilizado tanto na área de STAGED (quando já preparamos o arquivo/projeto para commitar) ou no estado MODIFIED (quando modificamos mas não demos add).

* O comando *git pull* serve para puxar do repositório online todas as alterações que foram feitas no arquivo/projeto e AUTOMATICAMENTE mergear o mesmo.

* Para verificar antes o que irá vir para o código, podemos utilizar o comando *git fetch* que não irá mergear AUTOMATICAMENTE, ele apenas irá puxar o que está no repositório online e juntamente com um comando de *git diff origin/nome_branch* iremos ver quais foram as alterações e aí sim decidir se iremos fazer o *pull* ou não.

# O que são Branches?
Branches são ramificações onde pode-se desenvolver arquivos/projetos em paralelo, exemplo: Eu estou desenvolvendo o front-end da minha aplicação na branch *master*, outra pessoa, juntamente com a criação da sua branch *main* pode fazer o back-end da aplicação e posteriormente poderemos juntarmos as duas branches com o *merged*.

## Como criar uma branch?
Criamos uma branch com o seguinte comando: *git branch nome_branch*

* Para saber qual branch você está atuando pode-se utilizar o seguinte comando *git log --oneline --decorate* (para onde o ponteiro HEAD estiver apontando, significa qual branch estamos).

* Para apontarmos o HEAD para a branch que foi criada utilizamos o comando *git checkout nome_branch*.

* O novo arquivo *gitinigore* serve para dizer ao GIT o que queremos que ele ignore o rastreamento. (criei uma branch chamada "teste", inclui um gitignore somente nela, commitei, e dei checkout para a main, fazendo com que o arquivo gitignore suma da main e fique somente na branch teste).

* Para listar todas as branches existentes, podemos utilizar o comando *git branch*

* Para mergear as branches utilizamos o comando *git merge nome_branch*