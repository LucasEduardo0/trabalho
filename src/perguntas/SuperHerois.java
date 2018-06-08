package perguntas;

public class SuperHerois extends Padrao{

	@Override
	public void cadastrarPerguntas() {
		
		//1º Objeto
		Pergunta p1 = new Pergunta();
		p1.setPergunta("Em qual filme do Homem-Aranha, Dr. Octopus ataca?");
		p1.setQuestaoA("Homem-Aranha 2");
		p1.setQuestaoB("Homem-Aranha 1");
		p1.setQuestaoC("Homem-Aranha 3");
		p1.setQuestaoD("O espetacular Homem-Aranha");
		p1.setResposta('a');
		Padrao.conjuntoPerguntas.add(p1);
		
		//2º Objeto
		Pergunta p2 = new Pergunta();
		p2.setPergunta("Como Hulk se transforma?");
		p2.setQuestaoA("Picado por uma aranha radioativa");
		p2.setQuestaoB("Uma radiação cósmica");
		p2.setQuestaoC("Poderes que apareceram de repente");
		p2.setQuestaoD("Caiu no lixo tóxico");
		p2.setResposta('b');
		Padrao.conjuntoPerguntas.add(p2);
		
		//3º Objeto
		Pergunta p3 = new Pergunta();
		p3.setPergunta("De onde Super Homem veio?");
		p3.setQuestaoA("Kripton");
		p3.setQuestaoB("Terra");
		p3.setQuestaoC("Marte");
		p3.setQuestaoD("Plutâo");
		p3.setResposta('a');
		Padrao.conjuntoPerguntas.add(p3);
		
		//4º Objeto
		Pergunta p4 = new Pergunta();
		p4.setPergunta("Quem é o parceiro do Batman?");
		p4.setQuestaoA("Super Homem");
		p4.setQuestaoB("Lanterna Verde");
		p4.setQuestaoC("Robin");
		p4.setQuestaoD("Hulk");
		p4.setResposta('c');
		Padrao.conjuntoPerguntas.add(p4);
		
		//5º Objeto
		Pergunta p5 = new Pergunta();
		p5.setPergunta("Qual o maior inimigo do Homem-Aranha?");
		p5.setQuestaoA("Magneto");
		p5.setQuestaoB("Dr. Caveira");
		p5.setQuestaoC("Loki");
		p5.setQuestaoD("Venon");
		p5.setResposta('d');
		Padrao.conjuntoPerguntas.add(p5);
		
		Pergunta p6 = new Pergunta();
		p6.setPergunta("Qual foi o primeiro herói da América?");
		p6.setQuestaoA("Homem de Ferro");
		p6.setQuestaoB("Hulk");
		p6.setQuestaoC("Thor");
		p6.setQuestaoD("Capitão América");
		p6.setResposta('d');
		Padrao.conjuntoPerguntas.add(p6);
		
		Pergunta p7 = new Pergunta();
		p7.setPergunta("Qual é a mulher mágica da Marvel Universe?");
		p7.setQuestaoA("Feiticeira Escalante");
		p7.setQuestaoB("Feiticeira Escalasse");
		p7.setQuestaoC("Feituçuss");
		p7.setQuestaoD("Nenhuma das alternativas");
		p7.setResposta('b');
		Padrao.conjuntoPerguntas.add(p7);
		
		Pergunta p8 = new Pergunta();
		p8.setPergunta("Qual é o sobrenome de Zatanna, a mulher mágica da Liga da Justiça?");
		p8.setQuestaoA("Zatanes");
		p8.setQuestaoB("Zatara");
		p8.setQuestaoC("Zatâvez");
		p8.setQuestaoD("Zatarra");
		p8.setResposta('b');
		Padrao.conjuntoPerguntas.add(p8);
		
		Pergunta p9 = new Pergunta();
		p9.setPergunta("Qual o nome inteiro de Arlequina, a vilã de Batman e capacho de Coringa?");
		p9.setQuestaoA("Dr. Arle Quina");
		p9.setQuestaoB("Dr. Harley Quinzel");
		p9.setQuestaoC("Dr. Harleen Quinzel");
		p9.setQuestaoD("Dr. Harley Quina");
		p9.setResposta('c');
		Padrao.conjuntoPerguntas.add(p9);
		
		Pergunta p10 = new Pergunta();
		p10.setPergunta("Qual o nome do ator que fez Steve Rogers, vugo Capitão América no filme Os Vingadores?");
		p10.setQuestaoA("Chris Evans");
		p10.setQuestaoB("Chris Brown");
		p10.setQuestaoC("Chris Hemsworth");
		p10.setQuestaoD("Chris Egan");
		p10.setResposta('a');
		Padrao.conjuntoPerguntas.add(p10);
		
		Pergunta p11 = new Pergunta();
		p11.setPergunta("Nos filmes \"Quarteto Fantástico\" e \"Quarteto Fantástico e o Surfista Prateado\", Chris Evans atuou como um personagem. No filme \"Os Vingadores\" ele atuou como outro personagem. Que personagens são esses?");
		p11.setQuestaoA("Tocha Humana e Thor");
		p11.setQuestaoB("Coisa e Thor");
		p11.setQuestaoC("Sr. Fantástico e Capitão America");
		p11.setQuestaoD("Tocha Humana e Capitão América");
		p11.setResposta('d');
		Padrao.conjuntoPerguntas.add(p11);
		
		Pergunta p12 = new Pergunta();
		p12.setPergunta("Qual o nome do irmão de Thor, o vilão do filme \"Os Vingadores\"?");
		p12.setQuestaoA("Loki");
		p12.setQuestaoB("Loqui");
		p12.setQuestaoC("Koki");
		p12.setQuestaoD("Koqui");
		p12.setResposta('a');
		Padrao.conjuntoPerguntas.add(p12);
		
		Pergunta p13 = new Pergunta();
		p13.setPergunta("Thor e Capitão América são de que grupo?");
		p13.setQuestaoA("Os Vingativos");
		p13.setQuestaoB("Liga da Justiça");
		p13.setQuestaoC("Liga da Injustiça");
		p13.setQuestaoD("Os Vingadores");
		p13.setResposta('d');
		Padrao.conjuntoPerguntas.add(p13);
		
		Pergunta p14 = new Pergunta();
		p14.setPergunta("Em que reino Thor nasceu?");
		p14.setQuestaoA("Asgard");
		p14.setQuestaoB("Eisgard (pronuncia-se Aisgard)");
		p14.setQuestaoC("Midgard");
		p14.setQuestaoD("Millygard");
		p14.setResposta('a');
		Padrao.conjuntoPerguntas.add(p14);
		
		Pergunta p15 = new Pergunta();
		p15.setPergunta("O reino de Midgard é que planeta?");
		p15.setQuestaoA("Marte");
		p15.setQuestaoB("Terra");
		p15.setQuestaoC("Reino de Odim (onde Thor nasceu)");
		p15.setQuestaoD("Júpiter, o planeta dos Anelídeos (inimigos de Thor)");
		p15.setResposta('b');
		Padrao.conjuntoPerguntas.add(p15);
		
		Pergunta p16 = new Pergunta();
		p16.setPergunta("Como é o nome do ajudante digital do Homem de Ferro?");
		p16.setQuestaoA("Jarbas");
		p16.setQuestaoB("Stark Mobile");
		p16.setQuestaoC("Jarvis");
		p16.setQuestaoD("Alfred");
		p16.setResposta('c');
		Padrao.conjuntoPerguntas.add(p16);
		
		Pergunta p17 = new Pergunta();
		p17.setPergunta("Thor e Hulk são de qual grupo?");
		p17.setQuestaoA("Ligua da Justiça");
		p17.setQuestaoB("Vingadores");
		p17.setQuestaoC("Quarteto Fantastico");
		p17.setQuestaoD("Carreta Furação");
		p17.setResposta('b');
		Padrao.conjuntoPerguntas.add(p17);
		
		Pergunta p18 = new Pergunta();
		p18.setPergunta("Thor e Hulk são de qual grupo?");
		p18.setQuestaoA("Ligua da Justiça");
		p18.setQuestaoB("Vingadores");
		p18.setQuestaoC("Quarteto Fantastico");
		p18.setQuestaoD("Carreta Furação");
		p18.setResposta('b');
		Padrao.conjuntoPerguntas.add(p18);
		
		Pergunta p19 = new Pergunta();
		p19.setPergunta("Thor e Hulk são de qual grupo?");
		p19.setQuestaoA("Ligua da Justiça");
		p19.setQuestaoB("Vingadores");
		p19.setQuestaoC("Quarteto Fantastico");
		p19.setQuestaoD("Carreta Furação");
		p19.setResposta('b');
		Padrao.conjuntoPerguntas.add(p19);
		
		Pergunta p20 = new Pergunta();
		p20.setPergunta("Thor e Hulk são de qual grupo?");
		p20.setQuestaoA("Ligua da Justiça");
		p20.setQuestaoB("Vingadores");
		p20.setQuestaoC("Quarteto Fantastico");
		p20.setQuestaoD("Carreta Furação");
		p20.setResposta('b');
		Padrao.conjuntoPerguntas.add(p20);
		
		
	}

}