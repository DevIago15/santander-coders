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
São os modelos que dão vida ao padrão de protocolos que intercalam a conexão de comunicação.

* OSI: Esse modelo é dividido em 7 camadas que podem ser analisadas de baixo para cima ou de cima para baixo, essa conexão acontece de duas formas, a partir de um usuário que pesquisa no browser por um site e através disso acessa a etapa de Aplicação até chegar na etapa Física (de cima para baixo), enquanto o site recebe esse usuário a partir da etapa Física até a etapa de Aplicação (de baixo para cima). As 7 camadas são:
    * Aplicação: Onde estão as informações do browser, redirecionar os domínios, protocolos DNS, SSH.
    * Apresentação: Onde acontece a criptografia com os dados para que deixe a aplicação segura.
    * Sessão: Responsável por estabelecer uma sessão entre a origem e o destino final. 
    * Transporte: Ela é responsável por fazer a conexão com os protocolos que enviam os dados para o destino final, dividido em dois adjacentes:
        * TCP: É um adjacente do transporte que todas as vezes que envia um dado, pergunta ao receptor se aquele dado foi recebido com sucesso e caso não tenha sido recebido, envia novamente, utilizado muito para transações bancárias, sites. 
        * DP: É um adjacente do transporte que não pergunta ao receptor se o dado foi recebido com sucesso, é pra ser mais rápido e não necessita dessa verificação, temos como exemplo serviços de streaming, áudios, vídeos.
    * Rede: Aonde acontece a separação de pacotes e envio de dados para outros roteadores.
    * Enlace: Responsável por fragmentar o pacote de dados da rede, enviados para o destino final.
    * Física: É a camada onde estão os cabos, redes, switches, roteadores.

* TCP/IP: É dividido em 4 camadas, são as mesmas informações do modelo OSI porém mudam a segmentação de camadas.
    * Aplicação: Onde estão as informações do browser, redirecionar os domínios, protocolos DNS, SSH. Nesse caso engloba todas as camadas de "Apresentação e Sessão do modelo OSI".
    * Transporte: Ela é responsável por fazer a conexão com os protocolos que enviam os dados para o destino final, dividido em dois adjacentes:
        * TCP: É um adjacente do transporte que todas as vezes que envia um dado, pergunta ao receptor se aquele dado foi recebido com sucesso e caso não tenha sido recebido, envia novamente, utilizado muito para transações bancárias, sites. 
        * DP: É um adjacente do transporte que não pergunta ao receptor se o dado foi recebido com sucesso, é pra ser mais rápido e não necessita dessa verificação, temos como exemplo serviços de streaming, áudios, vídeos.
    * Internet: Tem o mesmo propósito da camada "Rede" do modelo OSI.
    * Acesso a Rede: Engloba as camadas de "Enlace e Física" do modelo OSI.

## IPV4 e IPV6
* IP: O termo IP (Internet Protocol) é o protocolo responsável pelo endereçamento dos pacotes de rede na camada 3 do modelo OSI, ou seja, é responsável por gerar um endereço ao seu computador, ou qualquer servidor no momento que este conecta-se à internet. Atualmente existem os formatos IPV4 e IPV6.

* O que é bit e o que é byte?
    * O bit é o pulso elétrico (1 = ligado e 0 = desligado).
    * E o byte é um conjunto de 8 bits.

* IPV4: É formatado em 32 bits divididos em 8 octetos onde cada octeto pode varia de 0 até 255, exemplo: 192.168.0.1
Esse modelo é o mais utilizado porém ele tem um problema em que somente permite 5 bilhões de conexões em endereços IPV4 disponíveis pelo mundo, e já passamos esse limite, para tratar essa dor, foi criado o NAT onde todos os dados que são passados e recebidos vão através de um IPV4 público que não sobrecarrega o IPV4 privados.

* IPV6: É formatado em 128 bits dividido em 16 pares, exemplo: 1050:0000:0000:0000:0005:0600:300c:326b (1050:0:0:0:5:600:300c:326b).
Esse modelo foi criado para sanar a limitação do IPV4, permitindo uma limitação de até o infinito de conexões. Esse modelo há uma grande dificuldade para ser implementado, desde a estruturação do modelo para empresas, seria uma grande transformação que levaria muito tempo.

## Cálculo de Sub Rede
Foi criado para dividir a rede em partes, em um exemplo comum podemos dizer que uma empresa tem 3 departamentos e estão com uma rede só, não seria muito legal o departamento x conseguir acessar a planilha do departamento y, para isso foi criado o *cálculo de sub rede* que divide a rede em partes para cada departamento e que não permite certas ações dependendo do departamento.

* Classes de Endereço IP: São segmentações que ditam nichos específicos para a utilização da rede, quantos dispositivos poderão estar conectados em nossa rede, quanto mais redes suportadas, menos endereços por rede serão suportados.
    * A -> Começa em 1 até 127 Octetos e suporta até 125 redes
    * B -> Começa em 128 até 191 Octetos e suporta até 16.382 redes
    * C -> Começa em 192 até 223 Octetos e suporta até 2.097.150 redes
    * D -> Começa em 224 até 239 Octetos e suporta até N/A redes
    * E -> Começa em 240 até 255 Octetos e suporta até N/A redes

## Domínios, DNS e Latência
* O que é um domínio ou DNS?
O domínio ou DNS é basicamente um nome bonito para um IP, ao invés de acessar um site passando um IP, passamos uma URL amigável onde fica mais fácil para o usuário final decorar ao invés de ficar passando números.

Os serviços DNS são divididos em diversos servidores, temos os servidores raízes que são responsáveis por receber a requisição e passar para outros servidores subordinados, exemplo:
O servidor *ROOT* (raíz) recebe uma requisição para um usuário que quer entrar no site idosystems.com.br, esse *ROOT* envia a requisição para o servidor *.com* que através dele encontra o idosystems e redireciona o usuário para o site.

* E o que seria Latência?
A latência é a duração da nossa requisição, podendo ser rápida ou lenta, dependendo da internet local, da distância da troca de dados, etc..

## Principais Comandos de Configurações
* ipconfig: mostra nossas configurações de IP do Windows.
* ipconfig /flushdns: é o comando que limpa o cache DNS da máquina.
* ping "site": envia pacotes para um destino e retorna o resultado da latência.
* nslookup "site": consulta o dns e endereço do site.
* tracert "site": mapeia quantos roteadores você vai se conectar para chegar até o destino final.
* route print: mapeia tabelas de roteamentos.
* netstat: mapear quais portas estão sendo utilizadas no nosso computador.

## Segurança

## Wireless
