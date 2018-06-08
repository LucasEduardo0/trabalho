package perguntas;

public class ConhecimentosGerais extends Padrao{

	@Override
	public void cadastrarPerguntas() {

		//1º Objeto
				Pergunta p1 = new Pergunta();
				p1.setPergunta("Quem era o homem mais sedutor do mundo?");
				p1.setQuestaoA("Dom Juan");
				p1.setQuestaoB("Dom Antônio");
				p1.setQuestaoC("Dom Marco");
				p1.setQuestaoD("Dom Carlos");
				p1.setResposta('a');
				Padrao.conjuntoPerguntas.add(p1);
				
				//2º Objeto
				Pergunta p2 = new Pergunta();
				p2.setPergunta("De quantos anos é constituído um século?");
				p2.setQuestaoA("50");
				p2.setQuestaoB("100");
				p2.setQuestaoC("1000");
				p2.setQuestaoD("1500");
				p2.setResposta('c');
				Padrao.conjuntoPerguntas.add(p2);
				
				//3º Objeto
				Pergunta p3 = new Pergunta();
				p3.setPergunta("Qual é o coletivo de cães?");
				p3.setQuestaoA("Matilha");
				p3.setQuestaoB("Rebanho");
				p3.setQuestaoC("Cardume");
				p3.setQuestaoD("Manada");
				p3.setResposta('a');
				Padrao.conjuntoPerguntas.add(p3);
				
				//4º Objeto
				Pergunta p4 = new Pergunta();
				p4.setPergunta("Segundo a Bíblia, em que rio Jesus foi batizado por João Batista?");
				p4.setQuestaoA("Rio Nilo");
				p4.setQuestaoB("Rio Sena");
				p4.setQuestaoC("Rio Reno");
				p4.setQuestaoD("Rio Jordão");
				p4.setResposta('d');
				Padrao.conjuntoPerguntas.add(p4);
				
				//5º Objeto
				Pergunta p5 = new Pergunta();
				p5.setPergunta("Qual é a maior floresta do planeta?");
				p5.setQuestaoA("Negra");
				p5.setQuestaoB("Sherwood");
				p5.setQuestaoC("Tijuca");
				p5.setQuestaoD("Amazônica");
				p5.setResposta('d');
				Padrao.conjuntoPerguntas.add(p5);
				
				Pergunta p6 = new Pergunta();
				p6.setPergunta("Qual é o naipe do baralho que tem o desenho de coração?");
				p6.setQuestaoA("Ouros");
				p6.setQuestaoB("Paus");
				p6.setQuestaoC("Copas");
				p6.setQuestaoD("Espadas");
				p6.setResposta('c');
				Padrao.conjuntoPerguntas.add(p6);
				
				Pergunta p7 = new Pergunta();
				p7.setPergunta("Qual atriz estrelou no filme: 'A lagoa azul'?");
				p7.setQuestaoA("Alicia Silverstone");
				p7.setQuestaoB("Brooke Shields");
				p7.setQuestaoC("Julia Roberts");
				p7.setQuestaoD("Jessica Lange");
				p7.setResposta('b');
				Padrao.conjuntoPerguntas.add(p7);
				
				Pergunta p8 = new Pergunta();
				p8.setPergunta("Qual casal foi expulso do Paraíso?");
				p8.setQuestaoA("Sansão de Dalila");
				p8.setQuestaoB("Sara e Abraão");
				p8.setQuestaoC("José e Maria");
				p8.setQuestaoD("Adão e Eva");
				p8.setResposta('d');
				Padrao.conjuntoPerguntas.add(p8);
				
				Pergunta p9 = new Pergunta();
				p9.setPergunta("Segundo os contos, qual animal ao ser beijado se transforma em príncipe?");
				p9.setQuestaoA("Cavalo");
				p9.setQuestaoB("Cão");
				p9.setQuestaoC("Gato");
				p9.setQuestaoD("Sapo");
				p9.setResposta('d');
				Padrao.conjuntoPerguntas.add(p9);
				
				Pergunta p10 = new Pergunta();
				p10.setPergunta("Qual é o santo que só acreditou vendo?");
				p10.setQuestaoA("Santo Antônio");
				p10.setQuestaoB("São Judas Tadeu");
				p10.setQuestaoC("São Pedro");
				p10.setQuestaoD("São Tomé");
				p10.setResposta('d');
				Padrao.conjuntoPerguntas.add(p10);
				
				Pergunta p11 = new Pergunta();
				p11.setPergunta("Qual é o fruto conhecido no nordeste do Brasil como 'jerimum'?");
				p11.setQuestaoA("Caju");
				p11.setQuestaoB("Abóbora");
				p11.setQuestaoC("Chuchu");
				p11.setQuestaoD("Coco");
				p11.setResposta('b');
				Padrao.conjuntoPerguntas.add(p11);
				
				Pergunta p12 = new Pergunta();
				p12.setPergunta("Em qual parte do corpo humano são implantadas as 'pontes de safena'?");
				p12.setQuestaoA("Estômago");
				p12.setQuestaoB("Intestino");
				p12.setQuestaoC("Pulmão");
				p12.setQuestaoD("Coração");
				p12.setResposta('d');
				Padrao.conjuntoPerguntas.add(p12);
				
				Pergunta p13 = new Pergunta();
				p13.setPergunta("Como é conhecido o jogador Edmundo?");
				p13.setQuestaoA("Tigrão");
				p13.setQuestaoB("Gatinho");
				p13.setQuestaoC("Animal");
				p13.setQuestaoD("Cobra");
				p13.setResposta('c');
				Padrao.conjuntoPerguntas.add(p13);
				
				Pergunta p14 = new Pergunta();
				p14.setPergunta("Na literatura, quem foi o criador da boneca Emília?");
				p14.setQuestaoA("Monteiro Lobato");
				p14.setQuestaoB("Maurício de Souza");
				p14.setQuestaoC("Walt Disney\"");
				p14.setQuestaoD("Jorge Amado");
				p14.setResposta('a');
				Padrao.conjuntoPerguntas.add(p14);
				
				Pergunta p15 = new Pergunta();
				p15.setPergunta("Quem é o primeiro substituto do Presidente?");
				p15.setQuestaoA("Veriador");
				p15.setQuestaoB("Vice-presidente");
				p15.setQuestaoC("Senador");
				p15.setQuestaoD("Deputado");
				p15.setResposta('b');
				Padrao.conjuntoPerguntas.add(p15);
				
				Pergunta p16 = new Pergunta();
				p16.setPergunta("Segundo o romance, que animal era 'Moby Dick'?");
				p16.setQuestaoA("Tubarão");
				p16.setQuestaoB("Polvo");
				p16.setQuestaoC("Golfinho");
				p16.setQuestaoD("Baleia");
				p16.setResposta('d');
				Padrao.conjuntoPerguntas.add(p16);
				
				Pergunta p17 = new Pergunta();
				p17.setPergunta("Que animal é o Pateta?");
				p17.setQuestaoA("Cavalo");
				p17.setQuestaoB("Burro");
				p17.setQuestaoC("Cachorro");
				p17.setQuestaoD("Raposa");
				p17.setResposta('c');
				Padrao.conjuntoPerguntas.add(p17);
				
				Pergunta p18 = new Pergunta();
				p18.setPergunta("Em qual cidade está o Cristo Redentor do Corcovado?");
				p18.setQuestaoA("Rio de Janeiro");
				p18.setQuestaoB("São Paulo");
				p18.setQuestaoC("Curitiba");
				p18.setQuestaoD("Belo Horizonte");
				p18.setResposta('a');
				Padrao.conjuntoPerguntas.add(p18);
				
				Pergunta p19 = new Pergunta();
				p19.setPergunta("Quem é conhecido como o 'playboy brasileiro'?");
				p19.setQuestaoA("Joãozinho Trinta");
				p19.setQuestaoB("Zeca Pagodinho");
				p19.setQuestaoC("Chiquinho Scarpa");
				p19.setQuestaoD("Chico Buarque");
				p19.setResposta('c');
				Padrao.conjuntoPerguntas.add(p19);
				
				Pergunta p20 = new Pergunta();
				p20.setPergunta("Quantos centímetros equivalem a um metro?");
				p20.setQuestaoA("10");
				p20.setQuestaoB("100");
				p20.setQuestaoC("1000");
				p20.setQuestaoD("10000");
				p20.setResposta('b');
				Padrao.conjuntoPerguntas.add(p20);
		
	}

}
