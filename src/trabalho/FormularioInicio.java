package trabalho;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FormularioInicio extends JFrame {

	private JPanel contentPane;

	public FormularioInicio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox<String> combo = new JComboBox();
		combo.setBounds(63, 58, 161, 20);
		combo.addItem("Selecione uma categoria");
		combo.addItem("Conhecimentos Gerais");
		combo.addItem("Filmes");
		combo.addItem("Esportes");
		contentPane.add(combo);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				ConhecimentosGerais c = new ConhecimentosGerais();
				c.PerguntasConhecimentosGerais();
				
			}
		});
		btnNewButton.setBounds(10, 145, 161, 29);
		contentPane.add(btnNewButton);
		
		
	}
}
