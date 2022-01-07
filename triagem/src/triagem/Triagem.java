package triagem;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class Triagem extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Triagem frame = new Triagem();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	private JRadioButton rdbtnNao_1, rdbtnNao_2, rdbtnNao_3, rdbtnNao_4, rdbtnNao_5, rdbtnNao_6, rdbtnNao_7, rdbtnNao_8, rdbtnNao_9, rdbtnNao_10, rdbtnSim_1, rdbtnSim_2, rdbtnSim_3, rdbtnSim_4, rdbtnSim_5, rdbtnSim_6, rdbtnSim_7, rdbtnSim_8, rdbtnSim_9, rdbtnSim_10;
	int soma = 0;
	
	/**
	 * Create the frame.
	 */
	public Triagem() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 591, 467);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTriagem = new JLabel("TRIAGEM");
		lblTriagem.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblTriagem.setBounds(245, 11, 85, 14);
		contentPane.add(lblTriagem);
		
		JLabel lblTextoIformacao = new JLabel("Responda o questin\u00E1rio conforme seus sintomas!");
		lblTextoIformacao.setForeground(Color.RED);
		lblTextoIformacao.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTextoIformacao.setBounds(128, 26, 318, 23);
		contentPane.add(lblTextoIformacao);
		
		JLabel lblFebre = new JLabel("Tem Febre?");
		lblFebre.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblFebre.setBounds(30, 57, 78, 14);
		contentPane.add(lblFebre);
		
		rdbtnSim_1 = new JRadioButton("SIM");
		rdbtnSim_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnSim_1.isSelected()) {
					rdbtnNao_1.setSelected(false);
					soma = soma + 5;
				}
			}
		});
		rdbtnSim_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		rdbtnSim_1.setBounds(30, 69, 50, 23);
		contentPane.add(rdbtnSim_1);
		
		rdbtnNao_1 = new JRadioButton("N\u00C3O");
		rdbtnNao_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNao_1.isSelected()) {
					rdbtnSim_1.setSelected(false);
					soma = soma + 5;
				}
			}
		});
		rdbtnNao_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		rdbtnNao_1.setBounds(82, 69, 50, 23);
		contentPane.add(rdbtnNao_1);
		
		JLabel lblNewLabel = new JLabel("Esteve em contato, nos \u00FAltimos 14 dias, com um caso diagnosticado com COVID-19?");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(30, 89, 532, 14);
		contentPane.add(lblNewLabel);

		rdbtnSim_2 = new JRadioButton("SIM");
		rdbtnSim_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnSim_2.isSelected()) {
					rdbtnNao_2.setSelected(false);
					soma = soma + 10;
				}
			}
		});
		rdbtnSim_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		rdbtnSim_2.setBounds(30, 101, 50, 23);
		contentPane.add(rdbtnSim_2);
		
		rdbtnNao_2 = new JRadioButton("N\u00C3O");
		rdbtnNao_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNao_2.isSelected()) {
					rdbtnSim_2.setSelected(false);
				}
			}
		});
		rdbtnNao_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		rdbtnNao_2.setBounds(82, 101, 50, 23);
		contentPane.add(rdbtnNao_2);
		
		JLabel lblDorCabeca = new JLabel("Tem dor de cabe\u00E7a?");
		lblDorCabeca.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDorCabeca.setBounds(30, 121, 125, 14);
		contentPane.add(lblDorCabeca);

		rdbtnSim_3 = new JRadioButton("SIM");
		rdbtnSim_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnSim_3.isSelected()) {
					rdbtnNao_3.setSelected(false);
					soma = soma + 1;
				}
			}
		});
		rdbtnSim_3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		rdbtnSim_3.setBounds(30, 133, 50, 23);
		contentPane.add(rdbtnSim_3);
		
		rdbtnNao_3 = new JRadioButton("N\u00C3O");
		rdbtnNao_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNao_3.isSelected()) {
					rdbtnSim_3.setSelected(false);
				}
			}
		});
		rdbtnNao_3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		rdbtnNao_3.setBounds(82, 133, 50, 23);
		contentPane.add(rdbtnNao_3);
		
		JLabel lblEspirro = new JLabel("Tem secre\u00E7\u00E3o nasal ou espirros?");
		lblEspirro.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEspirro.setBounds(30, 153, 206, 14);
		contentPane.add(lblEspirro);

		rdbtnSim_4 = new JRadioButton("SIM");
		rdbtnSim_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnSim_4.isSelected()) {
					rdbtnNao_4.setSelected(false);
					soma = soma + 1;
				}
			}
		});
		rdbtnSim_4.setFont(new Font("Tahoma", Font.PLAIN, 11));
		rdbtnSim_4.setBounds(30, 165, 50, 23);
		contentPane.add(rdbtnSim_4);
		
		rdbtnNao_4 = new JRadioButton("N\u00C3O");
		rdbtnNao_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNao_4.isSelected()) {
					rdbtnSim_4.setSelected(false);
				}
			}
		});
		rdbtnNao_4.setFont(new Font("Tahoma", Font.PLAIN, 11));
		rdbtnNao_4.setBounds(82, 165, 50, 23);
		contentPane.add(rdbtnNao_4);
		
		JLabel lblGarganta = new JLabel("Tem dor/irrita\u00E7\u00E3o na garganta? ");
		lblGarganta.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblGarganta.setBounds(30, 185, 206, 14);
		contentPane.add(lblGarganta);

		rdbtnSim_5 = new JRadioButton("SIM");
		rdbtnSim_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnSim_5.isSelected()) {
					rdbtnNao_5.setSelected(false);
					soma = soma + 1;
				}
			}
		});
		rdbtnSim_5.setFont(new Font("Tahoma", Font.PLAIN, 11));
		rdbtnSim_5.setBounds(30, 197, 50, 23);
		contentPane.add(rdbtnSim_5);
		
		rdbtnNao_5 = new JRadioButton("N\u00C3O");
		rdbtnNao_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNao_5.isSelected()) {
					rdbtnSim_5.setSelected(false);
				}
			}
		});
		rdbtnNao_5.setFont(new Font("Tahoma", Font.PLAIN, 11));
		rdbtnNao_5.setBounds(82, 197, 56, 23);
		contentPane.add(rdbtnNao_5);
		
		JLabel lblTosse = new JLabel("Tem tosse seca?");
		lblTosse.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTosse.setBounds(30, 217, 110, 14);
		contentPane.add(lblTosse);

		rdbtnSim_6 = new JRadioButton("SIM");
		rdbtnSim_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnSim_6.isSelected()) {
					rdbtnNao_6.setSelected(false);
					soma = soma + 3;
				}
			}
		});
		rdbtnSim_6.setFont(new Font("Tahoma", Font.PLAIN, 11));
		rdbtnSim_6.setBounds(30, 229, 50, 23);
		contentPane.add(rdbtnSim_6);
		
		rdbtnNao_6 = new JRadioButton("N\u00C3O");
		rdbtnNao_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNao_6.isSelected()) {
					rdbtnSim_6.setSelected(false);
				}
			}
		});
		rdbtnNao_6.setFont(new Font("Tahoma", Font.PLAIN, 11));
		rdbtnNao_6.setBounds(82, 229, 50, 23);
		contentPane.add(rdbtnNao_6);
		
		JLabel lblRespiracao = new JLabel("Tem dificuldade respirat\u00F3ria?");
		lblRespiracao.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblRespiracao.setBounds(30, 249, 206, 14);
		contentPane.add(lblRespiracao);

		rdbtnSim_7 = new JRadioButton("SIM");
		rdbtnSim_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnSim_7.isSelected()) {
					rdbtnNao_7.setSelected(false);
					soma = soma + 10;
				}
			}
		});
		rdbtnSim_7.setFont(new Font("Tahoma", Font.PLAIN, 11));
		rdbtnSim_7.setBounds(30, 261, 50, 23);
		contentPane.add(rdbtnSim_7);
		
		rdbtnNao_7 = new JRadioButton("N\u00C3O");
		rdbtnNao_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNao_7.isSelected()) {
					rdbtnSim_7.setSelected(false);
				}
			}
		});
		rdbtnNao_7.setFont(new Font("Tahoma", Font.PLAIN, 11));
		rdbtnNao_7.setBounds(82, 261, 50, 23);
		contentPane.add(rdbtnNao_7);
		
		JLabel lblDorCorpo = new JLabel("Tem dores no corpo?");
		lblDorCorpo.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDorCorpo.setBounds(30, 281, 146, 14);
		contentPane.add(lblDorCorpo);

		rdbtnSim_8 = new JRadioButton("SIM");
		rdbtnSim_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnSim_8.isSelected()) {
					rdbtnNao_8.setSelected(false);
					soma = soma + 1;
				}
			}
		});
		rdbtnSim_8.setFont(new Font("Tahoma", Font.PLAIN, 11));
		rdbtnSim_8.setBounds(30, 293, 50, 23);
		contentPane.add(rdbtnSim_8);
		
		rdbtnNao_8 = new JRadioButton("N\u00C3O");
		rdbtnNao_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNao_8.isSelected()) {
					rdbtnSim_8.setSelected(false);
				}
			}
		});
		rdbtnNao_8.setFont(new Font("Tahoma", Font.PLAIN, 11));
		rdbtnNao_8.setBounds(82, 293, 50, 23);
		contentPane.add(rdbtnNao_8);
		
		JLabel lblDiarreia = new JLabel("Tem diarreia?");
		lblDiarreia.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDiarreia.setBounds(30, 313, 102, 14);
		contentPane.add(lblDiarreia);

		rdbtnSim_9 = new JRadioButton("SIM");
		rdbtnSim_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnSim_9.isSelected()) {
					rdbtnNao_9.setSelected(false);
					soma = soma + 1;
				}
			}
		});
		rdbtnSim_9.setFont(new Font("Tahoma", Font.PLAIN, 11));
		rdbtnSim_9.setBounds(30, 325, 50, 23);
		contentPane.add(rdbtnSim_9);
		
		rdbtnNao_9 = new JRadioButton("N\u00C3O");
		rdbtnNao_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNao_9.isSelected()) {
					rdbtnSim_9.setSelected(false);
				}
			}
		});
		rdbtnNao_9.setFont(new Font("Tahoma", Font.PLAIN, 11));
		rdbtnNao_9.setBounds(82, 325, 50, 23);
		contentPane.add(rdbtnNao_9);
		
		JLabel lblAglomeracao = new JLabel("Esteve em locais com grande aglomera\u00E7\u00E3o?");
		lblAglomeracao.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblAglomeracao.setBounds(30, 345, 286, 14);
		contentPane.add(lblAglomeracao);

		rdbtnSim_10 = new JRadioButton("SIM");
		rdbtnSim_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnSim_10.isSelected()) {
					rdbtnNao_10.setSelected(false);
					soma = soma + 3;
				}
			}
		});
		rdbtnSim_10.setFont(new Font("Tahoma", Font.PLAIN, 11));
		rdbtnSim_10.setBounds(30, 357, 50, 23);
		contentPane.add(rdbtnSim_10);
		
		rdbtnNao_10 = new JRadioButton("N\u00C3O");
		rdbtnNao_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNao_10.isSelected()) {
					rdbtnSim_10.setSelected(false);
				}
			}
		});
		rdbtnNao_10.setFont(new Font("Tahoma", Font.PLAIN, 11));
		rdbtnNao_10.setBounds(82, 357, 50, 23);
		contentPane.add(rdbtnNao_10);
		
		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resultado(soma);
			}
		});
		btnEnviar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnEnviar.setBounds(243, 390, 89, 23);
		contentPane.add(btnEnviar);
	}
	
	void resultado(int soma) {
		if(soma >= 0 && soma <= 9 ) {
			JOptionPane.showMessageDialog(null, "SALA 1 - RISCO BAIXO\nO resultado foi de " + soma + " pontos");
		}
		else if(soma >= 10 && soma <= 19) {
			JOptionPane.showMessageDialog(null, "SALA 2 - RISCO MÉDIO\nO resultado foi de " + soma + " pontos");
		}
		else if(soma >= 20) {
			JOptionPane.showMessageDialog(null, "SALA 3 - RISCO ALTO\nO resultado foi de " + soma + " pontos");
		}
	}
}
