import java.util.ArrayList;

abstract class dateChapters extends Texts{
 
  protected ArrayList<Chapters> chapters;
  protected ArrayList<String> textos;

     public ArrayList<Chapters> getdateChapters() {

        this.textos = new ArrayList<String>();
        this.textos = getChapterText();
        this.chapters = new ArrayList<Chapters>();
        
        //capitulo 0
        ArrayList<Option> pathChapter0 = new ArrayList<Option>();
        
        pathChapter0.add(new Option("Falar com seus pais e se despedir deles.", 25,"FALAR", "\nVocê então decide dar adeus para seus pais antes de adentrar nas incertezas do mundo.\nVocê chega na cozinha e avista sua mãe, que logo lhe fala...\nMãe : “Olha como você cresceu... Me sinto orgulhosa de você filho, tenha cuidado e que Saradomin te acompanhe.”\nLogo após, seu pai chega e com lágrimas nos olhos, lhe dá um abraço e diz...\nPai : “Meu filho,\rque Deus lhe proteja, indepentende de onde quer que esteja, rezarei por você.”\nApós isso, você abraça-os e parte em direção ao desconhecido, em busca de seu grande sonho de ser um grande aventureiro.\n"));

        pathChapter0.add(new Option("Você vai embora sem falar ou fazer nada.", 12,"IR EMBORA","\nVocê ignora formalidades e sentimentalismo,  partindo para sua tão desejada aventura rumo ao desconhecido."));

        pathChapter0.add(new Option("Arrumar suprimentos para a jornada.", 12,"PEGAR","\nVocê vai uma última vez ao seu quarto para pegar suprimentos e outros itens importantes.\nVocê acha sobre sua cômoda algumas roupas e comida, e um pequeno colar que sua mãe lhe deu de presente.\nVocê coloca todos os itens em sua bolsa e sai em sua aventura."));
        //Adicionar texto do capitulo
        chapters.add(new Chapters(this.textos.get(0), pathChapter0));
      
        //Capitulo 1
        ArrayList<Option> pathChapter1 = new ArrayList<Option>();

        pathChapter1.add(new Option("em frente e ir em busca de explorar o mundo atrás de aventuras.",10,"CONTINUAR", "\nVocê deixa esse pensamento de lado, o melhor a se fazer é não \nse apegar a esse sentimento. Seguindo então seu caminho para \nalém do reino, almejando uma incontável qunatidade de riquezas, conquistas e aventuras de tirar o fôlego.\n[VOCÊ GANHA +10 DE HP]"));

        pathChapter1.add(new Option("para casa e ter uma vida pacata de aldeão.",-1000,"VOLTAR","\nVocê se sente inseguro em encarar o mundo fora das muralhas com tão pouca idade, decidindo ficar em Praven.\nVocê então vive o resto de sua vida como artesão, profissão que herdou do seu pai, morrendo aos 87 anos depois de uma longa \nvida simples na cidade,se perguntando como sua vida seria caso tivesse escolhido se aventurar por este vasto mundo.\n\nFim!"));
        chapters.add(new Chapters(this.textos.get(1), pathChapter1));
        
        //Capitulo 2
        ArrayList<Option> pathChapter2 = new ArrayList<Option>();

        pathChapter2.add(new Option("o convite, e conversar por algumas horas.", -5, "ACEITAR", "\nVocês entram no restaurante, e se refrescam com uma água de coco gelada.\nConversam sobre a vida, e logo se despede para dar início na sua aventura.\n\r[A BEBIDA DO RESTAURANTE ESTAVA INFECTADA, TE DEIXANDO UM POUCO MAL DO ESTOMAGO. PERDA DE -5 HP]"));

        pathChapter2.add(new Option("o convite de Philip e seguir sua jornada.", 0, "RECUSAR", "Você responde que tem uma longa viagem pela frente e recusa educadamente. Se despedindo de Philip e seguindo seu caminho.\n[SEUS STATUS NÃO SOFREM ALTERAÇÕES]"));
        
        chapters.add(new Chapters(this.textos.get(2),pathChapter2));

        //Capitulo 3
        ArrayList<Option> pathChapter3 = new ArrayList<Option>();
        pathChapter3.add(new Option("o ouro do goblin sem que ele perceba.", -25, "ROUBAR", "\nO goblin percebe seus movimentos na surdina e rapidamente reage,\nte dando um chute e correndo floresta adentro.\n[PERDA DE -25HP]"));

        pathChapter3.add(new Option("contra ele, para conseguir derrotar seu primeiro inimigo nessa jornada.", -10, "LUTAR", "\nApós uma difícil luta, você derrota o goblin e sai vitorioso, com um pouco de ouro a mais como recompensa.\n[VOCE GASTA UM POUCO DE SUAS ENERGIAS NESSA BATALHA. PERDA DE -10HP]"));

        pathChapter3.add(new Option("sua jornada desviando do goblin.", 5, "SEGUIR", "Você decide poupar sua energia, tentando passar despercebido pelo goblin. Seu plano funciona perfeitamente e você segue o caminho sem maiores problemas.\n[BONUS DE +5 DE ENERGIA]"));
        chapters.add(new Chapters(this.textos.get(3),pathChapter3));
        //Capitulo 4
        ArrayList<Option> pathChapter4 = new ArrayList<Option>();

        pathChapter4.add(new Option("um pouco e se recuperar até a chuva passar.", 25,"AGUARDAR", "\nApós uma espera de 45 minutos, a chuva vai embora, você está se sentindo bem e pronto pra continuar a jornada.\n[POR SER RECUPERAR E DESCANSAR POR UM TEMPO, VOCE GANHA UM BONUS DE +25 HP]"));

        pathChapter4.add(new Option("a jornada, pois você não tem tempo pra perder.", -10, "CONTINUAR", "\nVocê então decide continuar, alguns passos a frente, você derrapa em alguns galhos devido ao solo escorregadio. Esta não foi uma das melhores decisões, você se cansa e machuca seu joelho.\n[ISTO AFETA SUA SAÚDE. PERDA DE –10 HP]"));

        pathChapter4.add(new Option("tomando um pouco de água da mochila de suprimentos e seguir.", -5,"HIDRATAR", "\nVocê se hidrata e se sente um pouco melhor, mas ainda assim a chuva e a areia molhada te faz cansar.\n[ISTO AFETA SUA SAÚDE. PERDA DE -5 HP]"));
        chapters.add(new Chapters(this.textos.get(4),pathChapter4));
      //capitulo 5
      ArrayList<Option> pathChapter5 = new ArrayList<Option>();

      pathChapter5.add(new Option("a ajuda e acreditar que eles só querem ajudar", -25, "ACEITAR", "\nEles então se aproximam de você com más intenções, roubam sua comida e te agridem. Te deixam ferido e sem suprimentos. [ISSO FEZ COM QUE VOCÊ FICASSE FERIDO. PERDA DE -25HP]"));

      pathChapter5.add(new Option ("e agradecer para evitar algo inesperado.", -10, "RECUSAR", "\nVocê recusa e eles vão embora, porém sua escalada continuou dificil e foi preciso de bastante energia, fazendo com que você se desgastasse muito. [PERDA DE - 10 DE ENERGIA]"));

      pathChapter5.add(new Option("pois você não conhece e não quer ajuda de estranhos.", 4, "IGNORAR", "\nVocê finge que não escutou e ignora eles, deixando-os bastante chateados. [ESTA DECISÃO TE TROUXE MAIS QUATRO INIMIGOS. +4 INIMIGOS]"));
      chapters.add(new Chapters(this.textos.get(5),pathChapter5));
      //Capitulo 6
      ArrayList<Option> pathChapter6 = new ArrayList<Option>();

      pathChapter6.add(new Option("a janta.", 20, "ACEITAR", "\nVocê então conhece o líder, e fala fervorosamente sobre sua viagem e suas ambições. Deixando-o curioso para saber que tipo de realizações um jovem com tais ambições pode alcançar. Empolgado com a sua história, o líder então decide te presentear com algumas armas e suprimentos para sua jornada. [ESTE JANTAR TE FEZ DESCANSAR E FORTALECER SUAS ENERGIAS. +20 DE ENERGIA.]"));

      pathChapter6.add(new Option("e seguir sua viagem.", 3, "RECUSAR", "\nMaravilhado com a aldeia e a sua hospitalidade, você agradece pelos presentes e suprimentos, seguindo viagem entusiasmado imaginado o que esta aventura reserva pra você. Ao sentirem sua energia e ver o quão ambicioso você é, os aldeões ficam contentes por você e mal podem esperar para escutar as histórias sobre seus feitos.Você ganha novos aliados, para futuras necessidades. [+3 aliados]"));

      chapters.add(new Chapters(this.textos.get(6),pathChapter6));

      //Capitulo 7
      ArrayList<Option> pathChapter7 = new ArrayList<Option>();

      pathChapter7.add(new Option("sua barraca e dormir.",15, "MONTAR", "\nVocê então procura madeiras ao redor, e com folhas de arvores da floresta, consegue montar um abrigo para esta noite. Assim, você consegue dormir tranquilamente e repor suas energias. [ESTA NOITE DESCANSANDO FEZ VOCE GANHAR ENERGIA E HP.  +15 DE ENERGIA . + 15HP]"));

      pathChapter7.add(new Option("ao ar livre.", -20,"DORMIR", "\nVocê decide dormir ao ar livre, mas é atacado por uma aranha venenosa, e isso te faz ficar doente e perder mobilidade. Esta foi uma péssima noite.[-20 HP]"));

      pathChapter7.add(new Option("e ficar acordado para evitar ataques.", -25, "VIGIAR", "\nSua decisão é ficar acordado a noite toda, para evitar ataques de animais ou de caçadores. Porém, isso te faz ficar cansado e sem energias. [-25 DE ENERGIA]"));
      chapters.add(new Chapters(this.textos.get(7),pathChapter7));
      //Capitulo 8
       ArrayList<Option> pathChapter8 = new ArrayList<Option>();

       pathChapter8.add(new Option("mais de perto, a oportunidade de ver um pássaro tão incomum.", 10,"ADMIRAR", "\nVocê chega mais perto do pássaro com cuidado para não o afugentar. O falcão então se aproxima de você e permite que o toque. Após isso, você segue sua jornada rumo a Zanaris, a cidade dos elfos. [ESTE MOMENTO TE FAZ RENOVAR AS ENERGIAS E SE MANTER POSITIVO. +10 ENERGIA]"));

       pathChapter8.add(new Option("sua viagem e não perder mais tempo.", 0, "SEGUIR", "\nVocê então continua sua viagem rumo agora a cidade dos elfos, Zanaris. [SEUS ATRIBUTOS NÃO SOFRERAM NENHUMA ALTERAÇÃO]"));
       chapters.add(new Chapters(this.textos.get(8),pathChapter8));
       // Capitulo 9 
       ArrayList<Option> pathChapter9 = new ArrayList<Option>();

       pathChapter9.add(new Option("sua caminhada e esperar um pouco antes de prosseguir." ,15, "PARAR", "\nVocê então para, senta um pouco e observa... A pedra começa a se mover, logo você percebe que não é realmente uma pedra, mas sim alguma espécime de criatura. Por sorte ela não parece agressiva. Ela levanta e vai embora lentamente. Você chega a conclusão que deve tomar mais cuidado e prestar atenção as coisas ao seu entorno.[ESSA DESCOBERTA TE DEIXA MAIS ALERTA AO AMBIENTE. VOCÊ GANHOU +15 DE ENERGIA]"));

       pathChapter9.add(new Option("sua caminhada ignorando totalmente a pedra.", 0, "SEGUIR", "\nVocê então ignora a pedra no meio do caminho e segue em prol do seu objetivo maior que é chegar em Zanaris. Mas, a que custo...? [SUAS ESTATISTICAS NÃO SOFREM ALTERAÇÕES]"));

       chapters.add(new Chapters(this.textos.get(9),pathChapter9));
       // Capitulo 10
       ArrayList<Option> pathChapter10 = new ArrayList<Option>();

       pathChapter10.add(new Option("mesmo assim e se banhar.", -5, "MERGULHAR", "\nAo mergulhar, você se sente revigorado. Mas logo é surpreendido por um carangueijo, ele belisca seu dedo do pé, arrancando um pedaço e te deixando ferido.\n[ESTE BELISCÃO DE DEIXOU MAIS FRACO -5 HP]"));

       pathChapter10.add(new Option("Molhar apenas os pés e ficar na vontade pelo banho.", -5, "PES", "\nVocê decide apenas molhar os pés, isso não te satisfaz e você anseia por poder entrar e se banhar por completo. Esta decisão te deixa com um certo rancor. [ESTE RANCOR TE FAZ DESANIMAR UM POUCO. PERDA DE -5 HP]"));

       pathChapter10.add(new Option("Você deixa o rio e vai em direção as frutas se alimentar.", 5, "COMER", "\nVocê colhe maças e laranjas suculentas, para em seguida comê-lás. Suas energias são repostas. Você se sente revigorado, além de cada vez mais motivado para este longo dia. [AUMENTO DE +5 HP]"));
       chapters.add(new Chapters(this.textos.get(10),pathChapter10));
       //capitulo 11
       ArrayList<Option> pathChapter11 = new ArrayList<Option>();

       pathChapter11.add(new Option("alguma comida para tentar domesticar o cavalo.",0, "DAR", "\nVocê então começa a colher algumas maçãs das árvores em volta. Com as maças em mão, você se aproxima devagar do cavalo.\nO cavalo a princípio se assusta, mas ao ver as maçãs em sua mão ele começa a se aproximar. Você então consegue a confiança do cavalo e ele o segue na jornada.\n[SEUS ATRIBUTOS NÃO SOFREM ALTERAÇÕES]"));

       pathChapter11.add(new Option("o animal com uma corda.", 0, "LAÇAR", "\nVocê então joga uma corda no pescoço do cavalo e o domina, fazendo ele lhe acompanhar a força mesmo sem vontade de te ajudar. O cavalo luta, mas acaba cedendo pouco tempo depois.\n[SEUS ATRIBUTOS NÃO SOFREM ALTERAÇÕES]"));
       chapters.add(new Chapters(this.textos.get(11),pathChapter11));

        //capitulo12
        ArrayList<Option> pathChapter12 = new ArrayList<Option>();

        pathChapter12.add(new Option("até o calor passar", 15, "PARAR" , "\nVocê encontra uma sombra embaixo de uma árvore, local refrescante e ventilado para esperar a temperatura diminuir e assim, prosseguir com a jornada. [ESTE DESCANSO TE RENDEU +15 DE HP.]"));

        pathChapter12.add(new Option("com a água na mochila de suprimentos.", -15, "HIDRATAR","\nVocê acha água na sua mochila, mas a água está quente e você não se hidrata da melhor maneira. Ficando ainda um pouco indisposto para caminhada. [ESTA INDISPOSIÇÃO TE FEZ PERDER ENERGIA. -15 DE ENERGIA]"));

        pathChapter12.add(new Option("andando mesmo assim, pois você se considera forte", -20, "CONTINUAR","\nVocê tenta resistir a forte temperatura e seguir mesmo assim, mas logo vem as consequências. Seus pés enchem de bolhas de sangue, a falta de água no seu corpo é notória e você perde energia. [-20 de HP]"));
           chapters.add(new Chapters(this.textos.get(12),pathChapter12));

        
        //capitulo 13
        ArrayList<Option> pathChapter13 = new ArrayList<Option>();

        pathChapter13.add(new Option("comprar água", 10, "ÁGUA", "\nVocê então compra água potável, uma bebida de tamanha importância para funcionamento do corpo humano. Você se hidrata e se sente bem melhor. E carregado para os próximos dias. [+10 DE ENERGIA]"));

        pathChapter13.add(new Option("comprar comida", 15, "COMIDA", "\nVocê compra alimento, isso te faz ficar mais forte e resistente nos próximos dias. Já que fazia dias que você não comia um bom alimento. [+15 DE HP]"));

        pathChapter13.add(new Option("comprar ferramentas", -15, "FERRAMENTAS", "\nVocê decide que não é necessário comprar água e comida, escolhendo ferramentas para ajudar na sua jornada. Porém, logo vem as consequências. A falta de água te deixa desidratado e a falta de comida te deixa fraco.[- 15 DE ENERGIA]"));
       chapters.add(new Chapters(this.textos.get(13),pathChapter13));
       
        //capitulo 14
        ArrayList<Option> pathChapter14 = new ArrayList<Option>();

        pathChapter14.add(new Option("-se aos aventureiros, pois ajuda é sempre bem-vinda.",2, "JUNTAR", "\nVocês então conversam sobre suas jornadas e logo viram bons amigos. Os dois aventureiros falam que estão indo para a cidade de Ardonha, cidade próxima de Zanaris e te acompanham até uma parte do percurso, se despedindo de você após uns 40 minutos. [ESTA CONVERSA TE FEZ GANHAR 2 ALIADOS. GANHOU +2 ALIADOS]"));

        pathChapter14.add(new Option("pois você precisa de companhia.", -10, "SOZINHO","\nVocê opta por continuar sozinho, pois você já sabe o caminho e outras pessoas só irão te fazer perder tempo. Depois de um tempo, você se sente um pouco solitário e se arrepende por não ter feito amizade. [ESTA SOLIDÃO TE FAZ PERDER – 10 DE ENERGIA.]"));
        chapters.add(new Chapters(this.textos.get(14),pathChapter14));

        //capitulo 15
        ArrayList<Option> pathChapter15 = new ArrayList<Option>();

        pathChapter15.add(new Option("sua barraca e dormir.", 15, "MONTAR", "\nVocê então procuras madeiras ao redor, e com folhas de arvores da floresta, consegue montar um abrigo para esta noite. Assim, você consegue dormir tranquilamente e repor suas energias. [ESTA NOITE DESCANSANDO FEZ VOCE GANHAR ENERGIA E HP.  +15 DE ENERGIA . + 15HP]"));

        pathChapter15.add(new Option("ao ar livre." , -5, "DORMIR", "\nVocê decide dormir ao ar livre, mas é constantemente picado por mosquitos, fazendo você perder o sono sempre que estava quase dormindo. Esta foi uma péssima noite. [-5 DE ENERGIA]" ));

        pathChapter15.add(new Option("e ficar acordado para evitar ataques.", -25, "VIGIAR", "\nSua decisão é ficar acordado a noite toda, para evitar ataques de animais ou de caçadores. Porém, isso te faz ficar cansado e sem energias.\n[-25 DE ENERGIA]"));
          chapters.add(new Chapters(this.textos.get(15),pathChapter15));
        //CAPITULO 16
           ArrayList<Option> pathChapter16 = new ArrayList<Option>();

          pathChapter16.add(new Option("em meio ao corpo itens e riquezas que ele possa ter deixado.", -15, "VASCULHA", "\nVocê então decide vasculhar o corpo do aventureiro. Ao fazer a pilhagem você encontra algumas peças de ouro e alguns suprimentos já podres. Você começa a observar que uma fumaça estranha começa a sair do corpo do aventureiro que rapidamente faz você tossir incessantemente. Você dá o fora dali o mais rápido possível, mas a tosse persiste por algumas horas. [A FUMAÇA FAZ VOCÊ PERDER -15 HP]"));

          pathChapter16.add(new Option("o corpo de perto, mas não toca em nada.", 20, "ANALISA", "\nVocê chega um pouco mais perto do cadáver e percebe algo inusitado: há um pequeno fungo crescendo através das roupas do aventureiro morto. Você logo repara que pode ser o fungo que matou aquele rapaz e então começa a ficar mais atento aos perigos da floresta. Logo após, você segue a sua jornada. [SUA ATENÇÃO AUMENTA E COM ISSO VOCÊ RECEBE +20 DE ENERGIA]"));

          pathChapter16.add(new Option("o corpo jogado e segue a sua viagem.", 0, "IGNORA", "\nVocê olha o cadáver, mas sem muito espanto e então decide seguir seu caminho e simplesmente ignorar o corpo moribundo do pobre aventureiro.\n[SEUS ATRIBUTOS NÃO SOFREM ALTERAÇÕES]"));
          chapters.add(new Chapters(this.textos.get(16),pathChapter16));

          //CAPITULO 17
        ArrayList<Option> pathChapter17 = new ArrayList<Option>();

        pathChapter17.add(new Option("os guardas com mentiras para tentar entrar.", 0, "LUDIBRIA", "\nVocê tenta ludibriar os guardas dizendo ser um rico senhor de terras de Praven que está tentando entrar na cidade para fazer negócios. A princípio, os guardas não acreditam muito, mas o deixam entrar mesmo assim."));

        pathChapter17.add(new Option("os guardas com dinheiro para tentar entrar.", 0, "SUBORNA", "\nVocê então conversa com os guardas amigavelmente e tenta lhes oferecer uma quantia em dinheiro para o deixarem entrar. Os guardas não hesitam muito e o deixam passar após o leve suborno. Bem... a guarda real não deve pagar tão bem assim."));

        pathChapter17.add(new Option("os guardas para tentar entrar.", -100, "AMEDRONTA","\nVocê fala com os guardas com um tom de agressividade e eles parecem não gostar muito disso. Você começa uma briga com um dos guardas e acaba sendo preso. Pelas rígidas leis de Zanaris, por ter agredido um cidadão zanariense e guarda real, você é setenciado a morte."));
           chapters.add(new Chapters(this.textos.get(17),pathChapter17));
        
      //CAPITULO 18
        ArrayList<Option> pathChapter18 = new ArrayList<Option>();

        pathChapter18.add(new Option("com alguns habitantes de Zanaris para tentar se comunicar.",0,"GESTICULAR","\nVocê chega em alguns elfos e começa a gesticular em sua direção para tentar se comunicar de alguma forma.\nVocê só não sabia que alguns dos gestos que você fez eram ofensas para o povo e você acaba se envolvendo em uma discursão com os elfos do local. Por sorte você consegue fugir do local antes da situação piorar e continua andando.\n[SEUS ATRIBUTOS NAO SOFREM ALTERAÇÕES]"));

        pathChapter18.add(new Option("por alguma taverna ou hospedaria para descansar.",0,"PROCURAR","\nVocê decide andar pela cidade por conta própria para tentar encontrar algum local de descanso.\nDepois de andar por alguns distritos, você observa de longe uma construção que se aparenta com uma taberna e decide andar em sua direção.\n[SEUS ATRIBUTOS NAO SOFREM ALTERAÇÕES]"));

        pathChapter18.add(new Option("fazer nada e esperar o tempo passar.",0,"NAO","\nVocê fica ali parado observando o local e avista um grupo de humanos, você decide segui-los, mas após algum tempo andando você os perde de vista e decide continuar seguindo o caminho sozinho.\n[SEUS ATRIBUTOS NAO SOFREM ALTERAÇÕES]"));
        chapters.add(new Chapters(this.textos.get(18),pathChapter18));
        

        //Capitulo 19
        ArrayList<Option> pathChapter19 = new ArrayList<Option>();

        pathChapter19.add(new Option("Pedir uma bebida a garçonete.", -10, "BEBIDA", "\nVocê pede uma bebida para a garçonete, que logo após se tornam 2,3,4... e se inicia uma longa noite de bebedeira.\nApós muitas doses de hidromel, você acaba caindo desacordado e dormindo ali mesmo na mesa, cordando no outro dia sem parte de suas moedas e com uma tremenda dor de cabeça.\n[VOCE PERDE -10 DE HP]"));

        pathChapter19.add(new Option("pedir um quarto para dormir.", +25, "QUARTO", "\nVocê decide que após uma longa e exaustiva jornada, nada melhor que uma boa cama para deitar e descansar.\nVocê pede a garçonete alguma acomodação e ela lhe leva para um dos quartos. Você então paga a garçonete e se prepara para dormir. Você tem uma ótima noite de sono e acorda revigorado para enfrentar mais um dia.\n[VOCÊ GANHOU +25 DE HP.]"));

        pathChapter19.add(new Option("pedir por informações.", 10, "INFORMAÇÃO", "\nVocê pergunta a garçonete se ela não sabe de nenhuma noticia “interessante” que está acontecendo pela cidade nos últimos dias, mas ela diz não saber de nenhuma novidade ou aventura ultimamente e que a cidade estava bem calma.\nVocê agradece a ela e sobe para uma das acomodações para dormir.\n[VOCÊ GANHA +10 DE HP]"));
        chapters.add(new Chapters(this.textos.get(19),pathChapter19));

        //Capitulo 20
        ArrayList<Option> pathChapter20 = new ArrayList<Option>();
        pathChapter20.add(new Option("o taberneiro para que ele lhe diga sobre o tesouro.",0,"AMEACAR","\nVocê diz ao taberneiro que não está com muito saco para enrolação e manda ele lhe dizer logo o que sabe, antes que a coisa fique feia. O taberneiro fica com medo e então lhe conta detalhadamente sobre o tesouro escondido. [SEUS ATRIBUTOS NÃO SOFREM ALTERAÇÕES]"));

        pathChapter20.add(new Option("ao taberneiro para ele lhe dizer o que sabe.",0,"PAGAR","\nVocê então acha alguns trocados no bolso e paga ao taberneiro para que ele lhe fale o que você quer. Seu dinheiro não é muito mas o taberneiro decide contar mesmo assim sobre o tesouro escondido. [SEUS ATRIBUTOS NÃO SOFREM ALTERAÇÕES]"));

        pathChapter20.add(new Option("fazer nada e tentar descobrir sobre o tesouro por conta própria.",0,"NAO","\nVocê decide não pagar ao taberneiro e sai da taberna, mas em frente a taberna haviam 2 humanos conversando exatamente sobre o mesmo assunto. Sem que eles percebam, você se aproxima e começa a escutar tudo que eles sabem sobre o tesouro escondido. [SEUS ATRIBUTOS NÃO SOFREM ALTERAÇÕES]"));
        chapters.add(new Chapters(this.textos.get(20),pathChapter20));
        //capitulo 21
        ArrayList<Option> pathChapter21 = new ArrayList<Option>();

        pathChapter21.add(new Option("por livros que contém a história da cidade.",0,"PROCURAR","\nVocê pega alguns livros e tenta entender o que está escrito, mas você realmente não entende élfico. Uma jovem elfa que estava ali se aproxima de você e começa a conversar. Ela fala a língua dos humanos perfeitamente. Após uma longa conversa, vocês viram amigos.\n[VOCE GANHOU +1 ALIADO]"));

        pathChapter21.add(new Option("com alguém para aprender mais sobre a cidade.",0,"CONVERSAR","\nVocê avista uma elfa lendo em uma mesa e tenta falar com ela na esperança de que ela entenda sua língua. Por sorte, a elfa entende o idioma humano e vocês começam a conversar e ela lhe conta melhor sobre a cidade e suas lendas e histórias. No fim do papo, vocês viram amigos.\n[VOCE GANHOU +1 ALIADO]"));
        chapters.add(new Chapters(this.textos.get(21),pathChapter21));
        
        //CAPITULO 22
        ArrayList<Option> pathChapter22 = new ArrayList<Option>();

        pathChapter22.add(new Option("Para a taberna e se alojar por mais uma noite.",20,"VOLTAR","\nVocê decide então voltar para a taberna e pedir um novo quarto para passar a noite. O taberneiro te dá um quarto e você tem uma ótima noite de sono acordando revigorado no dia seguinte. [VOCÊ GANHOU +20 DE HP]"));

        pathChapter22.add(new Option("pela cidade e depois procurar alojamento.",-20,"FICAR","\nVocê decide ir aproveitar a noite pela cidade. Você conhece vários pontos noturnos como um cassino élfico e decide ir ate lá um pouco. Sem ver o tempo, a noite acabou e você sai do cassino pela manhã muito cansado. [VOCÊ PERDEU -20 DE HP]"));
        chapters.add(new Chapters(this.textos.get(22),pathChapter22));
        
        //CAPITULO 23
        ArrayList<Option> pathChapter23 = new ArrayList<Option>();

        pathChapter23.add(new Option("através da rocha e tentar passar.",-5,"ESGUEIRAR","\nVocê se espreme através da rocha e consegue passar, mas se arranha um pouco no processo. Tiwlip lhe acompanha logo depois. [VOCE SE ARRANOU LEVEMENTE. -5 DE HP]"));

        pathChapter23.add(new Option("a rocha com a ajuda de Tiwlip.",-10,"MOVER","\nCom a ajuda de Tiwlip, você consegue mover a rocha de lugar liberando a passagem para o outro lado. [VOCE FEZ MUITA FORÇA, -10 DE HP]"));
        chapters.add(new Chapters(this.textos.get(23),pathChapter23));

        //CAPITULO 24
        ArrayList<Option> pathChapter24 = new ArrayList<Option>();

        pathChapter24.add(new Option("a escadaria no escuro.",-8,"DESCER","\nVocês cuidadosamente descem as escadas. Porém, em certa parte Tiwlip se desequilibra e acaba caindo. Ela esbarra em você e os dois rolam escadaria abaixo. Vocês então se levantam e veem que estão no fim da escadaria. [APÓS A QUEDA, VOCE PERDE -8 DE HP]"));

        pathChapter24.add(new Option("a tocha de alguma maneira.",0,"ACENDER","\nVocê procura algo em sua mochila que possa usar para acender a tocha novamente. Você acha um isqueiro e rapidamente acende a tocha. Você e Tiwlip descem as escadas cuidadosamente e conseguem chegar no seu final. [SEUS ATRIBUTOS NÃO SOFREM ALTERAÇÕES]"));
        chapters.add(new Chapters(this.textos.get(24),pathChapter24));
        
        //CAPITULO 25
        ArrayList<Option> pathChapter25 = new ArrayList<Option>();

        pathChapter25.add(new Option("em direção a porta.",0,"CAMINHAM","\nVocê e Tiwlip caminham em direção ao fim do corredor e chegam na porta misteriosa. A porta está trancada com um apenas um buraco para algum tipo de chave e uns símbolos estranhos ao seu lado. Tiwlip olha os símbolos com atenção e percebe que aquilo é um encantamento antigo. Ela então recita os versos do encantamento e a porta se abre. [SEUS ATRIBUTOS NÃO SOFREM ALTERAÇÕES]"));

        pathChapter25.add(new Option("o saguão em busca de informações.",0,"VASCULHAM","\nVocês decidem primeiro vasculhar o local em busca de alguma informação que explique o que é aquele lugar. Enquanto está andando, Tiwlip percebe que uma parte do piso está um tanto quanto suspeita. Você decide então dar um forte pisão no chão, que se quebra e revela uma chave de cristal. Vocês pegam a chave e usam na fechadura que há na porta e ela se abre. [SEUS ATRIBUTOS NÃO SOFREM ALTERAÇÕES]"));
        chapters.add(new Chapters(this.textos.get(25),pathChapter25));

        //CAPITULO 26
        ArrayList<Option> pathChapter26 = new ArrayList<Option>();

        pathChapter26.add(new Option("contra o grupo de ladrões.",-15,"LUTAR","\nVocê e Tiwlip acreditam que os ladrões não são tão fortes e decidem lutar contra o bando. Após uma árdua luta, vocês conseguem afugentar os ladrões, mas saem levemente feridos pós combate. Logo após, vocês passam pela porta dando acesso a uma nova sala. [VOCÊ PERDE -15 DE HP APÓS A LUTA]"));

        pathChapter26.add(new Option("para a sala depois da porta.",0,"FUGIR","\nVocês decidem correr em direção a porta. Os ladrões logo começam a prossegui-los, mas, assim que você e Tiwlip passam pela porta ela se fecha, deixando os ladrões chupando dedo no saguão. [SEUS ATRIBUTOS NÃO SOFREM ALTERAÇÕES] "));
        chapters.add(new Chapters(this.textos.get(26),pathChapter26));

        //CAPITULO 27
        ArrayList<Option> pathChapter27 = new ArrayList<Option>();

        pathChapter27.add(new Option("os cristais.",0,"TOCAR","\nVocês tocam em um dos cristais e... ... ... ... Não acontece absolutamente nada. Você e Tiwlip ficam intrigados por não conseguirem desvendar nada desse saguão. [SEUS ATRIBUTOS NÃO SOFRERAM ALTERAÇÕES]"));

        pathChapter27.add(new Option("por pistas pela sala.",0,"PROCURAR","\nVocê e Tiwlip vasculham a sala e observam os cristais para tentar encontrar alguma explicação para aquilo, mas não conseguem encontrar nada que os ajude a desvendar aquele mistério. [SEUS ATRIBUTOS NÃO SOFRERAM ALTERAÇÕES]"));
        chapters.add(new Chapters(this.textos.get(27),pathChapter27));

        //CAPITULO 28
        ArrayList<Option> pathChapter28 = new ArrayList<Option>();

        pathChapter28.add(new Option("o baú e ver o que tem dentro.",-30,"ABRIR","\nVocê então vai em direção ao baú e o abre. Ao abrir, você sente como se uma energia ruim tomasse conta do ambiente.\nOlhando para dentro do baú, tudo que você encontra são pergaminhos antigos, umas runas estranhas e um medalhão negro que emanava uma energia extremamente pesada. Enquanto você olhava o baú sem entender o que era aquilo, Tiwlip começa a rir de uma forma um tanto maligna perto de você. Você fica ainda mais confuso com toda aquela situação.\n[SUA VIDA ABAIXA EM -30 PONTOS]"));

        pathChapter28.add(new Option("fazer nada.",-30,"NAO","\nVocê então decide não abrir o baú de forma precipitada e analisar cuidadosamente o que levou ao seu aparecimento repentino. Contudo, Tiwlip vai rapidamente em direção ao baú e o abre sem pensar duas vezes.\nAo abrir, você sente como se uma energia ruim tomasse conta do ambiente. Tiwlip então começa a gargalhar e retira lá de dentro um medalhão negro e o coloca em seu pescoço.\n[SUA VIDA ABAIXA EM -30 PONTOS]"));
        chapters.add(new Chapters(this.textos.get(28),pathChapter28));

        //CAPITULO 29
        ArrayList<Option> pathChapter29 = new ArrayList<Option>();
        pathChapter29.add(new Option("o saguão usando uma das runas do baú.",-100,"DESTRUIR","\nVocê observa que no baú ainda existem algumas runas não usadas por Tiwlip e que podem ser usadas para auto destruir o local. Você então corre em direção ao baú e consegue pegar 2 runas do Fogo, 1 runa da Lei e 2 runas da Alma. Com essas runas em mãos, você começa a conjurar um poderoso feitiço chamado Onipoder.\nAssim que você termina de recitar o encantamento, você lança o ataque sobre o saguão que rapidamente desmorona e cai sobre você, Tiwlip e o portal do vazio. Após sofrer os danos causados pelo desmoronamento, Tiwlip não consegue terminar o ritual e morre no local.\nO portal do vazio e o Senhor Sombrio são expurgados novamente de Tamriel e Zanaris é salva por você.\nVocê infelizmente também morre após o desmoronamento, mas sua história ficará marcada para sempre, como o herói que salvou Zanaris da aniquilação e tirania do Senhor Sombrio.    Fim!?"));

        pathChapter29.add(new Option("contra Tiwlip para impedir o ritual.",-100,"LUTAR","\nVendo todo aquele cenário horripilante e as consequências negativas que a volta do Senhor Sombrio poderia trazer para Zanaris e toda Tamriel, você vai em direção a uma luta de vida ou morte contra Tiwlip para tentar encerrar o ritual ainda a tempo.\nAntes de partir para a violência, você tenta conversar com Tiwlip e apela para o lado emocional afim de fazer com que ela não de continuidade no ritual, mas é totalmente em vão. Você então parte para cima de Tiwlip com todas as suas forças, mas o medalhão negro envolto em seu pescoço faz com que uma aura protetora se forma através de Tiwlip deixando-a invulnerável a qualquer dano direto.\nVendo que seria incapaz de ferir o corpo de Tiwlip, você tenta um ultimo movimento: Tirar o colar do pescoço de Tiwlip. Com uma pequena adaga você faz um leve corte na sua pele e usa o sangue para cegar Tiwlip temporariamente. Enquanto ela limpa seu rosto, você agarra o colar do seu pescoço e o puxa, deixando Tiwlip vulnerável de vez.\nCom um movimento rápido você apunhala Tiwlip que sangra lentamente nos seus braços ate perder totalmente a consciência e morrer definitivamente. O portal do vazio se fechou e você consegue voltar em segurança para Zanaris.\nNão demorou muito para a sua história se espalhar pela cidade e você receber uma condecoração de Herói pelo prefeito da cidade. Sua jornada então acaba, mas seria esse o fim?!"));

        pathChapter29.add(new Option("que o Senhor Sombrio regresse seu corpo para Tamriel.",-100,"IMPEDIR","\nOlhando toda aquela situação catastrófica, você se sente na obrigação de impedir a volta do Senhor Sombrio de qualquer maneira. Sem saber como reagir num momento desses, você respira e tenta pensar em o que fazer parar conter essa ameaça iminente a Zanaris.\nApós um breve momento, lhe vem uma ideia na cabeça: talvez o jeito para impedir a quebra do selo, seja selando novamente. Você então vai em direção a Tiwlip tentando de forma desesperada conseguir parar o ritual e fechar o selo novamente.\nPorém, com o poder do medalhão envolto em seu pescoço Tiwlip estava praticamente invulnerável. Vendo que o Senhor Sombrio já estava quase reestabelecendo seu corpo nos domínios de Tamriel, você se joga em direção ao portal empurrando o Senhor Sombrio novamente parar o Vazio e se sacrificando afim de conter a volta do Lorde Nefasto.\nSeu plano dá certo, após entrar no vazio o portal é selado novamente. Tiwlip fugiu do local e nunca mais foi vista e você se tornou um mártir para o povo, sendo lembrado eternamente como O Herói Vazio e deixando sua marca na história de Zanaris. Fim."));

        chapters.add(new Chapters(this.textos.get(29),pathChapter29));
       return chapters;
    }
}