# Curso Redes e Sistemas - Trilha Digital | Web Back-End

## Redes e Sistemas
* O que são redes?
    Redes são um conjunto de dois ou mais dispositivos eletrônicos conectados entre si, que trocam informações por meio de uma linguagem pré-estabelecida chamada protocolo.

    Essa conexão pode ocorrer de duas formas:
    * Conexão física via cabos de par trançados
    * Coaxial ou fibra óptica
    * Via Wireless através de rádio frequência, bluetooth ou infravermelho

* Qual foi a origem das redes?
Durante a Guerra Fria, os países queriam chegar a lua primeiro desenvolvendo tecnologias que pudessem facilitar a comunicação entre os militares.

* Darpa: foi criada pelos EUA para facilitar a comunicação entre os militares e enviada as universidades para ajudar nas pesquisas e melhorar a tecnologia, porém foi tão bem aceita que criaram a *Arpanet* que foi baseada na *Darpa* e espalharam pelo mundo inteiro.

## Infraestrutura de Redes e os Principais Equipamentos
A conexão das redes se dá graças aos Hardwares criados, temos como exemplos em ordem cronológica:

* NIC (Network Interface Card): Placa de rede, que conecta o cabo ETHERNET com a rede no computador.

* HUB: permite a conexão entre dispositivos através de cabos de par trançados e conectados entre si (não é mais utilizado porque não consegue gerir canais, um pcA manda uma mensagem para o pcB porém o pcC e o pcD também recebem a mesma mensagem).

* Switch: Responsável pela comutação dos quadros entre os dispositvos, podemos definir comutação como troca ou encaminhamento de informação (foi o substituto do HUB, ele não tem o mesmo problema).

* Roteador: Tem a mesma responsabilidade de procurar as melhores rotas da internet para entregar os pacotes do remetente ao destinatário ao menor tempo possível.

* Modem: É o equipamento responsável pela modulação e demodulação do sinal de Internet.

## Cabeamento Estruturado
São padrões estabelecidos que definem como serão as organizações dos cabos e seus periféricos possibilitando melhor organização e performance na rede através das normas.

* Normas:
    * -> NBR 14.565
    * -> ANSI/TIA 568
    * -> ANSI/TIA 569

Exemplos de tipos de cabos:
* Cabo de Par Trançado: São divididos em categorias que determinam a velocidade de transmissão dos dados e o alcance em metros que o cabo pode suportar sem a perda de pacotes, de cobre que tem 8 fios onde cada fio é responsável por enviar ou receber determinadas informações, são divididos em dois tipos:
    * UTP: Não tem isolamento, oferece ruído, interferência, perda de dados.
    * STP: Tem isolamento, cobrindo a deficiência do UTP.

* Cabo Coaxial: Feito de cobre, tendo um fio central responsável por ser o condutor do pulso elétrico, malha metálica realizando isolamento e uma blindagem plática contra interferências externas.

* Fibra Óptica: Guiada por cabos que oferecem a maior velocidade de transmissão de dados chegando a altas velocidades na casa dos GBPS. A fibra é composta por pedaços de vidros que permitem a propagação dos raios de luz que são convertidos por conversors nas extremidades das fibras.

* Rack: É um armário para hospedar os equipamentos de hardwares como switches, roteadores, modens, fibras ópticas e organizar os cabos em patch panels. Ele é essencial em data centers e infraestruturas de redes.

## Modelo OSI e TCP/IP