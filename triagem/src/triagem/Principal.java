package triagem;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * 
 * @author Ronei Diego Almeida Cruz
 * RA: 19146676-5
 *
 */

public class Principal {

	private JFrame frmCadastroDePacientes;
	private JTextField textNome;
	private JTextField textCpf;
	private JTextField textIdade;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal window = new Principal();
					window.frmCadastroDePacientes.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Principal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private JRadioButton rdbtnMasculino;
	private JRadioButton rdbtnFeminino;
	private String sexo;
	
	triagem.Paciente pct = new Paciente();
	triagem.Triagem trg = new Triagem();
	
	private void initialize() {
		frmCadastroDePacientes = new JFrame();
		frmCadastroDePacientes.setResizable(false);
		frmCadastroDePacientes.setTitle("Cadastro de pacientes");
		frmCadastroDePacientes.setBounds(100, 100, 340, 252);
		frmCadastroDePacientes.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCadastroDePacientes.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SISTEMA  DE TRIAGEM");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(65, 11, 189, 14);
		frmCadastroDePacientes.getContentPane().add(lblNewLabel);
		
		JLabel lblNewNome = new JLabel("Nome:");
		lblNewNome.setBounds(21, 44, 46, 14);
		frmCadastroDePacientes.getContentPane().add(lblNewNome);
		
		textNome = new JTextField();
		textNome.setColumns(10);
		textNome.setBounds(21, 58, 277, 20);
		frmCadastroDePacientes.getContentPane().add(textNome);
		
		textCpf = new JTextField();
		textCpf.setColumns(10);
		textCpf.setBounds(21, 101, 141, 20);
		frmCadastroDePacientes.getContentPane().add(textCpf);
		
		JLabel lblNewCpf = new JLabel("CPF:");
		lblNewCpf.setBounds(21, 87, 46, 14);
		frmCadastroDePacientes.getContentPane().add(lblNewCpf);
		
		JLabel lblNewSexo = new JLabel("Sexo:");
		lblNewSexo.setBounds(21, 132, 46, 14);
		frmCadastroDePacientes.getContentPane().add(lblNewSexo);
		
		rdbtnMasculino = new JRadioButton("Masculino");
		rdbtnMasculino.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnMasculino.isSelected()) {
					rdbtnFeminino.setSelected(false);
					setSexo("Masculino");
				}
			}
		});
		rdbtnMasculino.setFont(new Font("Tahoma", Font.PLAIN, 11));
		rdbtnMasculino.setBounds(65, 128, 71, 23);
		frmCadastroDePacientes.getContentPane().add(rdbtnMasculino);
		
		rdbtnFeminino = new JRadioButton("Feminino");
		rdbtnFeminino.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnFeminino.isSelected()) {
					rdbtnMasculino.setSelected(false);
					setSexo("Feminino");
				}
			}
		});
		rdbtnFeminino.setFont(new Font("Tahoma", Font.PLAIN, 11));
		rdbtnFeminino.setBounds(144, 128, 76, 23);
		frmCadastroDePacientes.getContentPane().add(rdbtnFeminino);
		
		textIdade = new JTextField();
		textIdade.setColumns(10);
		textIdade.setBounds(266, 101, 32, 20);
		frmCadastroDePacientes.getContentPane().add(textIdade);
		
		JLabel lblNewIdade = new JLabel("Idade:");
		lblNewIdade.setBounds(264, 87, 52, 14);
		frmCadastroDePacientes.getContentPane().add(lblNewIdade);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pct = new Paciente(textNome.getText(), textCpf.getText(), textIdade.getText(), sexo);
				trg.setVisible(true);
			}
		});
		btnSalvar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnSalvar.setBackground(Color.WHITE);
		btnSalvar.setBounds(65, 173, 89, 23);
		frmCadastroDePacientes.getContentPane().add(btnSalvar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textNome.setText("");
				textCpf.setText("");
				textIdade.setText("");
				rdbtnFeminino.setSelected(false);
				rdbtnMasculino.setSelected(false);
			}
		});
		btnCancelar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnCancelar.setBackground(Color.WHITE);
		btnCancelar.setBounds(159, 173, 89, 23);
		frmCadastroDePacientes.getContentPane().add(btnCancelar);

	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
}
