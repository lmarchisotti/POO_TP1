TP Programacao Orientada a Objeto
Jogo Adventure

Execução:

Utilizando alguma IDE para abrir o projeto java, executar o arquivo Game.java

----------------------------------------------------------------------------------------------------
Descrições do Trabalho:

Trabalho não apresenta falhas caso siga as orientações corretamente:

1- Executar os comando exatamente como especificado abaixo;
2- Como descrito na especificação do trabalho, quando o jogador encontrar a sala 03 e entrar na porta C, ele ganha;
3- Se entrar em uma sala que tambem tenha um troll, caso tente pegar o ouro ou os diamantes antes de matar o troll, o jogador perde todo o ouro e diamantes pelo ataque do troll;
4- As localizações dos trolls são previamente fixadas.
5- Os itens no mapa são distribuidos aleatoriamente.

----------------------------------------------------------------------------------------------------
Modelagem do problema:

Neste jogo, seguimos a especificação do trabalho na criação do ambiente, a disposição das salas correm exatamente como especificado. Entre as salas, caso tenha alguma porta, existe um corredor que liga uma sala a outra e nao existem trolls nos corredores, somente nas salas. Os corredores são identificados pela interface, no topo superior ao centro como Sala 0.

----------------------------------------------------------------------------------------------------
Movimentos: 

view		- Exibe no console os itens disponivel na sala e os trolls existentes caso tenha algum.
viewBag		- Exibe no console os itens que o jogador carrega
moveTo A door	- Faz o jogador se mover para a porta escolhida, sendo A o id da porta (o mesmo para corredores)
moveTo axe	- Faz o jogador se mover para a posição do machado
moveTo key	- Faz o jogador se mover para a posição da chave
moveTo gold	- Faz o jogador se mover para a posição do monte de ouro
moveTo diamond	- Faz o jogador se mover para a posição do monte de diamantes
moveTo pot	- Faz o jogador se mover para a posição da poção
pickUp axe	- Faz o jogador coletar o machado e adicionar a mochila
pickUp key	- Faz o jogador coletar a chave e adicionar a mochila
pickUp gold	- Faz o jogador coletar o ouro e adicionar a mochila
pickUp diamond	- Faz o jogador coletar os diamantes e adicionar a mochila
pickUp pot	- Faz o jogador coletar a poção e adicionar a mochila

Divirta-se!

----------------------------------------------------------------------------------------------------
Integrantes do grupo:

 Aluno:  Avner Maximiliano de Paulo	Matricula:  122050020
 Aluno:  Lucas Marchisotti de Souza	Matricula:  172050060
 Aluno:  Paola Angelica Silva		Matricula:  162050110

----------------------------------------------------------------------------------------------------
Referência:

Devido ao curto tempo disponível dos integrantes para a execução do trabalho, decidimos utilizar um código como base e a partir dae implementar os métodos e classes necessárias para a adequação à especificação do trabalho.


