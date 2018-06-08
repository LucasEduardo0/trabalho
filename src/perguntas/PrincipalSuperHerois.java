package perguntas;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class PrincipalSuperHerois {

	public static void main(String[] args) {
		
		//Carregar todas as 20 questões
		SuperHerois sh = new SuperHerois();
		sh.cadastrarPerguntas();
		
		//Obter três índices aleatórios
		Padrao.gerarValoresAleatorios();
		
		//Exibir as perguntas do índice aleatório
		for(int i = 0; i < 13; i++) {
			int indiceExibirQuestao = Padrao.indicesAleatorios[i];
			System.out.println(Padrao.conjuntoPerguntas.get(indiceExibirQuestao).getPergunta());
			System.out.println(indiceExibirQuestao);
			
			JFrame formulario = new JFrame();
			formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			formulario.setSize(500, 300);
			formulario.setLocationRelativeTo(null);
			formulario.setLayout(null);
			formulario.setVisible(true);
			
			JLabel pergunta = new JLabel(Padrao.conjuntoPerguntas.get(indiceExibirQuestao).getPergunta());
			pergunta.setBounds(10, 10, 200, 20);
			formulario.add(pergunta);
			
		}

	}

}
