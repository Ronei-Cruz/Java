package votacao;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Votacao {

	private JFrame frmNotas;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Votacao window = new Votacao();
					window.frmNotas.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Votacao() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private int m1, m2, m3, m4, m5, n1 = 0, n2 = 0, n3 = 0, n4 = 0, n5 = 0;
	private double media = 0, total = 0;
	JLabel lblSoma1, lblSoma2, lblSoma3, lblSoma4, lblSoma5, lblMedia, lblTotal;
	
	private void initialize() {
		frmNotas = new JFrame();
		frmNotas.setResizable(false);
		frmNotas.setTitle("Notas");
		frmNotas.setBounds(100, 100, 461, 424);
		frmNotas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmNotas.getContentPane().setLayout(null);
		
		JButton btnNumero1 = new JButton("1");
		btnNumero1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n1++;
				lblSoma1.setText("" + n1);
				total = (n1 + n2 + n3 + n4 + n5);
				m1 = n1 * 1;
				media = (m1 + m2 + m3 + m4 + m5)/total;
				String.valueOf(media);
				lblMedia.setText("" + String.format("%.1f", media).replaceAll(",", "."));
				String.valueOf(total);
				lblTotal.setText("" + String.format("%.0f", total));
			}
		});
		btnNumero1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNumero1.setBounds(40, 37, 45, 45);
		frmNotas.getContentPane().add(btnNumero1);
		
		JButton btnNumero2 = new JButton("2");
		btnNumero2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n2++;
				lblSoma2.setText("" + n2);
				total = (n1 + n2 + n3 + n4 + n5);
				m2 = n2 * 2;
				media = (m1 + m2 + m3 + m4 + m5)/total;
				String.valueOf(media);
				lblMedia.setText("" + String.format("%.1f", media).replaceAll(",", "."));
				String.valueOf(total);
				lblTotal.setText("" + String.format("%.0f", total));
			}
		});
		btnNumero2.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNumero2.setBounds(120, 37, 45, 45);
		frmNotas.getContentPane().add(btnNumero2);
		
		JButton btnNumero3 = new JButton("3");
		btnNumero3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n3++;
				lblSoma3.setText("" + n3);
				total = (n1 + n2 + n3 + n4 + n5);
				m3 = n3 * 3;
				media = (m1 + m2 + m3 + m4 + m5)/total;
				String.valueOf(media);
				lblMedia.setText("" + String.format("%.1f", media).replaceAll(",", "."));
				String.valueOf(total);
				lblTotal.setText("" + String.format("%.0f", total));
			}
		});
		btnNumero3.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNumero3.setBounds(200, 37, 45, 45);
		frmNotas.getContentPane().add(btnNumero3);
		
		JButton btnNumero4 = new JButton("4");
		btnNumero4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n4++;
				lblSoma4.setText("" + n4);
				total = (n1 + n2 + n3 + n4 + n5);
				m4 = n4 * 4;
				media = (m1 + m2 + m3 + m4 + m5)/total;
				String.valueOf(media);
				lblMedia.setText("" + String.format("%.1f", media).replaceAll(",", "."));
				String.valueOf(total);
				lblTotal.setText("" + String.format("%.0f", total));
			}
		});
		btnNumero4.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNumero4.setBounds(280, 37, 45, 45);
		frmNotas.getContentPane().add(btnNumero4);
		
		JButton btnNumero5 = new JButton("5");
		btnNumero5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n5++;
				lblSoma5.setText("" + n5);
				total = (n1 + n2 + n3 + n4 + n5);
				m5 = n5 * 5;
				media = (m1 + m2 + m3 + m4 + m5)/total;
				String.valueOf(media);
				lblMedia.setText("" + String.format("%.1f", media).replaceAll(",", "."));
				String.valueOf(total);
				lblTotal.setText("" + String.format("%.0f", total));
			}
		});
		btnNumero5.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNumero5.setBounds(360, 37, 45, 45);
		frmNotas.getContentPane().add(btnNumero5);
		
		JLabel lblNotas = new JLabel("Notas para o atendimento:");
		lblNotas.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNotas.setBounds(40, 11, 211, 25);
		frmNotas.getContentPane().add(lblNotas);
		
		JLabel lblNewLabel = new JLabel("P\u00E9ssimo");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(40, 93, 58, 14);
		frmNotas.getContentPane().add(lblNewLabel);
		
		JLabel lblExcelente = new JLabel("Excelente");
		lblExcelente.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblExcelente.setBounds(346, 94, 58, 14);
		frmNotas.getContentPane().add(lblExcelente);
		
		JLabel lblAtual = new JLabel("NOTA ATUAL");
		lblAtual.setFont(new Font("Arial", Font.BOLD, 15));
		lblAtual.setBounds(173, 123, 98, 14);
		frmNotas.getContentPane().add(lblAtual);
		
		JLabel lblVoto1 = new JLabel("Quantidade de votos 1 -");
		lblVoto1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblVoto1.setBounds(40, 190, 163, 14);
		frmNotas.getContentPane().add(lblVoto1);
		
		JLabel lblVoto2 = new JLabel("Quantidade de votos 2 -");
		lblVoto2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblVoto2.setBounds(40, 220, 150, 14);
		frmNotas.getContentPane().add(lblVoto2);
		
		JLabel lblVoto3 = new JLabel("Quantidade de votos 3 -");
		lblVoto3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblVoto3.setBounds(40, 250, 150, 14);
		frmNotas.getContentPane().add(lblVoto3);
		
		JLabel lblVoto4 = new JLabel("Quantidade de votos 4 -");
		lblVoto4.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblVoto4.setBounds(40, 280, 150, 14);
		frmNotas.getContentPane().add(lblVoto4);
		
		JLabel lblVoto5 = new JLabel("Quantidade de votos 5 -");
		lblVoto5.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblVoto5.setBounds(40, 310, 150, 14);
		frmNotas.getContentPane().add(lblVoto5);
		
		lblSoma1 = new JLabel("0");
		lblSoma1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSoma1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblSoma1.setForeground(Color.BLACK);
		lblSoma1.setBackground(new Color(255, 255, 255));
		lblSoma1.setBounds(200, 186, 42, 25);
		frmNotas.getContentPane().add(lblSoma1);
		
		lblSoma2 = new JLabel("0");
		lblSoma2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSoma2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblSoma2.setForeground(Color.BLACK);
		lblSoma2.setBackground(Color.WHITE);
		lblSoma2.setBounds(200, 216, 42, 25);
		frmNotas.getContentPane().add(lblSoma2);
		
		lblSoma3 = new JLabel("0");
		lblSoma3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSoma3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblSoma3.setForeground(Color.BLACK);
		lblSoma3.setBackground(Color.WHITE);
		lblSoma3.setBounds(200, 246, 42, 25);
		frmNotas.getContentPane().add(lblSoma3);
		
		lblSoma4 = new JLabel("0");
		lblSoma4.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSoma4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblSoma4.setForeground(Color.BLACK);
		lblSoma4.setBackground(Color.WHITE);
		lblSoma4.setBounds(200, 276, 42, 25);
		frmNotas.getContentPane().add(lblSoma4);
		
		lblSoma5 = new JLabel("0");
		lblSoma5.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSoma5.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblSoma5.setForeground(Color.BLACK);
		lblSoma5.setBackground(Color.WHITE);
		lblSoma5.setBounds(200, 306, 42, 25);
		frmNotas.getContentPane().add(lblSoma5);
		
		lblMedia = new JLabel("0");
		lblMedia.setHorizontalAlignment(SwingConstants.CENTER);
		lblMedia.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblMedia.setBounds(199, 144, 46, 31);
		frmNotas.getContentPane().add(lblMedia);
		
		JLabel lblTotalVotos = new JLabel("Total de votos");
		lblTotalVotos.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTotalVotos.setBounds(323, 191, 81, 14);
		frmNotas.getContentPane().add(lblTotalVotos);
		
		lblTotal = new JLabel("0");
		lblTotal.setFont(new Font("Tahoma", Font.BOLD, 27));
		lblTotal.setHorizontalAlignment(SwingConstants.CENTER);
		lblTotal.setBounds(323, 221, 81, 91);
		frmNotas.getContentPane().add(lblTotal);
	}
}
