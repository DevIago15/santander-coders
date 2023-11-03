# Curso Git - Trilha Digital | Web Back-End (GIT)
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
