package trabalho;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

public class FormularioConhecimentosGerais extends JFrame {

	private JPanel contentPane;

	public FormularioConhecimentosGerais() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		ConhecimentosGerais cg = new ConhecimentosGerais();
		
		JLabel lblPergunta = new JLabel(cg.questo);
		lblPergunta.setBounds(108, 27, 258, 14);
		contentPane.add(lblPergunta);
		
		JLabel lblResposta = new JLabel("resposta1");
		lblResposta.setBounds(120, 80, 181, 14);
		contentPane.add(lblResposta);
		
		JLabel lblResposta_1 = new JLabel("resposta2");
		lblResposta_1.setBounds(120, 119, 195, 14);
		contentPane.add(lblResposta_1);
		
		JLabel lblResposta_2 = new JLabel("resposta3");
		lblResposta_2.setBounds(120, 156, 181, 14);
		contentPane.add(lblResposta_2);
		
		JLabel lblResposta_3 = new JLabel("resposta4");
		lblResposta_3.setBounds(120, 196, 181, 14);
		contentPane.add(lblResposta_3);
		
		
		
		
	}
}
