package trabalho;

import java.util.Random;

import javax.swing.JOptionPane;

public class ConhecimentosGerais extends FormularioConhecimentosGerais{
	
	//Método para fazer as perguntas
	public void PerguntasConhecimentosGerais() {
		
String[][] questoes = new String[30][6];
		
		questoes[0][0] = "Quem era o homem mais sedutor do mundo?";
		questoes[0][1] = "a)Dom Juan";
		questoes[0][2] = "b)Dom Antônio";
		questoes[0][3] = "c)Dom Marco";
		questoes[0][4] = "d)Dom Carlos";
		questoes[0][5] = "a";

		questoes[1][0] = "De quantos anos é constituído um século?";
		questoes[1][1] = "a)50";
		questoes[1][2] = "b)100";
		questoes[1][3] = "c)1000";
		questoes[1][4] = "d)1500";
		questoes[1][5] = "b";

		questoes[2][0] = "Qual é o coletivo de cães?";
		questoes[2][1] = "a)Matilha";
		questoes[2][2] = "b)Rebanho";
		questoes[2][3] = "c)Cardume";
		questoes[2][4] = "d)Manada";
		questoes[2][5] = "a";

		questoes[3][0] = "Segundo a Bíblia, em que rio Jesus foi batizado por João Batista?";
		questoes[3][1] = "a)Rio Nilo";
		questoes[3][2] = "b)Rio Sena";
		questoes[3][3] = "c)Rio Reno";
		questoes[3][4] = "d)Rio Jordão";
		questoes[3][5] = "d";

		questoes[4][0] = "Qual é a maior floresta do planeta?";
		questoes[4][1] = "a)Negra";
		questoes[4][2] = "b)Sherwood";
		questoes[4][3] = "c)Tijuca";
		questoes[4][4] = "d)Amazônica";
		questoes[4][5] = "d";

		questoes[5][0] = "Qual é o naipe do baralho que tem o desenho de coração?";
		questoes[5][1] = "a)Ouros";
		questoes[5][2] = "b)Paus";
		questoes[5][3] = "c)Copas";
		questoes[5][4] = "d)Espadas";
		questoes[5][5] = "c";
		
		questoes[6][0] = "Qual atriz estrelou no filme: 'A lagoa azul'?";
		questoes[6][1] = "a)Alicia Silverstone";
		questoes[6][2] = "b)Brooke Shields";
		questoes[6][3] = "c)Julia Roberts";
		questoes[6][4] = "d)Jessica Lange";
		questoes[6][5] = "b";

		questoes[7][0] = "Qual casal foi expulso do Paraíso?";
		questoes[7][1] = "a)Sansão de Dalila";
		questoes[7][2] = "b)José e Maria";
		questoes[7][3] = "c)Sara e Abraão";
		questoes[7][4] = "d)Adão e Eva";
		questoes[7][5] = "d";

		questoes[8][0] = "Segundo os contos, qual animal ao ser beijado se transforma em príncipe?";
		questoes[8][1] = "a)Cavalo";
		questoes[8][2] = "b)Cão";
		questoes[8][3] = "c)Gato";
		questoes[8][4] = "d)Sapo";
		questoes[8][5] = "d";

		questoes[9][0] = "Qual é o santo que só acreditou vendo?";
		questoes[9][1] = "a)Santo Antônio";
		questoes[9][2] = "b)São Judas Tadeu";
		questoes[9][3] = "c)São Pedro";
		questoes[9][4] = "d)São Tomé";
		questoes[9][5] = "d";

		questoes[10][0] = "Qual é o fruto conhecido no nordeste do Brasil como 'jerimum'?";
		questoes[10][1] = "a)Caju";
		questoes[10][2] = "b)Abóbora";
		questoes[10][3] = "c)Chuchu";
		questoes[10][4] = "d)Coco";
		questoes[10][5] = "b";

		questoes[11][0] = "Em qual parte do corpo humano são implantadas as 'pontes de safena'?";
		questoes[11][1] = "a)Estômago";
		questoes[11][2] = "b)Intestino";
		questoes[11][3] = "c)Pulmão";
		questoes[11][4] = "d)Coração";
		questoes[11][5] = "d";

		questoes[12][0] = "Como é conhecido o jogador Edmundo?";
		questoes[12][1] = "a)Tigrão";
		questoes[12][2] = "b)Gatinho";
		questoes[12][3] = "c)Animal";
		questoes[12][4] = "d)Cobra";
		questoes[12][5] = "c";

		questoes[13][0] = "Na literatura, quem foi o criador da boneca Emília?";
		questoes[13][1] = "a)Monteiro Lobato";
		questoes[13][2] = "b)Maurício de Souza";
		questoes[13][3] = "c)Walt Disney";
		questoes[13][4] = "d)Jorge Amado";
		questoes[13][5] = "a";

		questoes[14][0] = "Quem é o primeiro substituto do Presidente?";
		questoes[14][1] = "a)Veriador";
		questoes[14][2] = "b)Vice-presidente";
		questoes[14][3] = "c)Senador";
		questoes[14][4] = "d)Deputado";
		questoes[14][5] = "b";

		questoes[15][0] = "Segundo o romance, que animal era 'Moby Dick'?";
		questoes[15][1] = "a)Tubarão";
		questoes[15][2] = "b)Golfinho";
		questoes[15][3] = "c)Polvo";
		questoes[15][4] = "d)Baleia";
		questoes[15][5] = "d";

		questoes[16][0] = "Que animal é o Pateta?";
		questoes[16][1] = "a)Cavalo";
		questoes[16][2] = "b)Burro";
		questoes[16][3] = "c)Cachorro";
		questoes[16][4] = "d)Raposa";
		questoes[16][5] = "c";

		questoes[17][0] = "Em qual cidade está o Cristo Redentor do Corcovado?";
		questoes[17][1] = "a)Rio de Janeiro";
		questoes[17][2] = "b)São Paulo";
		questoes[17][3] = "c)Curitiba";
		questoes[17][4] = "d)Belo Horizonte";
		questoes[17][5] = "a";

		questoes[18][0] = "Quem é conhecido como o 'playboy brasileiro'?";
		questoes[18][1] = "a)Joãozinho Trinta";
		questoes[18][2] = "b)Zeca Pagodinho";
		questoes[18][3] = "c)Chiquinho Scarpa";
		questoes[18][4] = "d)Chico Buarque";
		questoes[18][5] = "c";

		questoes[19][0] = "Quantos centímetros equivalem a um metro?";
		questoes[19][1] = "a)10";
		questoes[19][2] = "b)100";
		questoes[19][3] = "c)1000";
		questoes[19][4] = "d)10000";
		questoes[19][5] = "b";
		
		int[] numero = new int[19];
		Random r = new Random();
		int n = 0;
				
			for(int x = 0; x < 1; x++) {
				n = r.nextInt(19);
				if(x != 0) {
					for(int  y = 0; y < x; y++) {
						if(n == numero[y]) {
							y = x;
							x--;
						}else if(y == x-1) {
							numero[x] = n;
							
						}
					}
				
				}else {
					numero[x] = n;
					
				}
		
			}
			

	}

}
