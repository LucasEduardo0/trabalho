package perguntas;

import java.util.ArrayList;
import java.util.Random;

public abstract class Padrao {

	//ArrayList
	public static ArrayList<Pergunta> conjuntoPerguntas = new ArrayList<>();
	
	//Array contendo três números aleatórios
	public static int indicesAleatorios[] = new int[13];
	
	//Método obrigatório para cadastrar as perguntas no ArrayList
	public abstract void cadastrarPerguntas();
	
	//Método para gerar três números aleatórios
	public static void gerarValoresAleatorios() {
		
		//Variáveis
		int indicePrincipal = 0, obterNumeroGerado;
		boolean existe = false;
		
		//Inicializar o Array com -1
		for(int i = 0; i < 13; i++) {
			indicesAleatorios[i] = -1;
		}
		
		//Laço
		while(indicePrincipal < 13) {
			
			//Gerar número aleatório entre 0 e 4
			Random r = new Random();
			obterNumeroGerado = r.nextInt(20);
			
			//Verificar se existe o número no Array
			existe = false;
			for(int i = 0; i < 13; i++) {
				if(indicesAleatorios[i] == obterNumeroGerado) {
					existe = true;
				}
			}
			
			//Caso o número não exista no Array
			if(existe == false) {
				for(int i = 0; i < 13; i++) {
					if(indicesAleatorios[i] == -1) {
						indicesAleatorios[i] = obterNumeroGerado;
						indicePrincipal++;
						break;
					}
				}
			}
			
			
		}
	}
	

	
}
