package perguntas;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class PrincipalSuperHerois {

	public static void main(String[] args) {
		
		//Carregar todas as 20 quest�es
		SuperHerois sh = new SuperHerois();
		sh.cadastrarPerguntas();
		
		//Obter tr�s �ndices aleat�rios
		Padrao.gerarValoresAleatorios();
		
		//Exibir as perguntas do �ndice aleat�rio
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
