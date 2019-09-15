package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.ControllerNotas;

import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaCadastroNotas extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldNome;
	private JTextField textFieldSobrenome;
	private JTextField textMatricula;
	private JTextField textNotaProvaUm;
	private JTextField textNotaProvaDois;
	private JTextField textTrabalhoUm;
	private JTextField textTrabalhoDois;
	private JTextField textPesoProvas;
	private JTextField textPesoTrabalhos;
	private String[] niveis = {ControllerNotas.NIVEL_BASICO, ControllerNotas.NIVEL_INTERMEDIARIO, ControllerNotas.NIVEL_AVANCADO};

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastroNotas frame = new TelaCadastroNotas();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaCadastroNotas() {
		setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		setTitle("CURSO CAMINHO SUAVE - CADASTRO DE NOTAS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(16, 19, 55, 16);
		contentPane.add(lblNome);
		
		JLabel lblSobrenome = new JLabel("Sobrenome");
		lblSobrenome.setBounds(235, 19, 81, 16);
		contentPane.add(lblSobrenome);
		
		textFieldNome = new JTextField();
		textFieldNome.setBounds(83, 13, 122, 28);
		contentPane.add(textFieldNome);
		textFieldNome.setColumns(10);
		
		textFieldSobrenome = new JTextField();
		textFieldSobrenome.setBounds(307, 13, 122, 28);
		contentPane.add(textFieldSobrenome);
		textFieldSobrenome.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Matrícula");
		lblNewLabel.setBounds(16, 62, 55, 16);
		contentPane.add(lblNewLabel);
		
		textMatricula = new JTextField();
		textMatricula.setBounds(83, 56, 122, 28);
		contentPane.add(textMatricula);
		textMatricula.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("N\u00EDvel");
		lblNewLabel_1.setBounds(239, 62, 55, 16);
		contentPane.add(lblNewLabel_1);
		
		JComboBox comboBoxNivel = new JComboBox(niveis);
		comboBoxNivel.setBounds(307, 53, 122, 26);
		contentPane.add(comboBoxNivel);
		
		JLabel lblNewLabel_2 = new JLabel("NP1");
		lblNewLabel_2.setBounds(17, 113, 55, 16);
		contentPane.add(lblNewLabel_2);
		
		textNotaProvaUm = new JTextField();
		textNotaProvaUm.setBounds(136, 107, 69, 28);
		contentPane.add(textNotaProvaUm);
		textNotaProvaUm.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("NP2");
		lblNewLabel_3.setBounds(239, 113, 55, 16);
		contentPane.add(lblNewLabel_3);
		
		textNotaProvaDois = new JTextField();
		textNotaProvaDois.setBounds(360, 107, 69, 28);
		contentPane.add(textNotaProvaDois);
		textNotaProvaDois.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("T1");
		lblNewLabel_4.setBounds(17, 153, 55, 16);
		contentPane.add(lblNewLabel_4);
		
		textTrabalhoUm = new JTextField();
		textTrabalhoUm.setBounds(136, 147, 69, 28);
		contentPane.add(textTrabalhoUm);
		textTrabalhoUm.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("T2");
		lblNewLabel_5.setBounds(239, 153, 55, 16);
		contentPane.add(lblNewLabel_5);
		
		textTrabalhoDois = new JTextField();
		textTrabalhoDois.setBounds(360, 147, 69, 28);
		contentPane.add(textTrabalhoDois);
		textTrabalhoDois.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Peso das Provas");
		lblNewLabel_6.setBounds(17, 200, 107, 16);
		contentPane.add(lblNewLabel_6);
		
		textPesoProvas = new JTextField();
		textPesoProvas.setBounds(136, 194, 69, 28);
		contentPane.add(textPesoProvas);
		textPesoProvas.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Peso dos Trabalhos");
		lblNewLabel_7.setBounds(235, 200, 113, 16);
		contentPane.add(lblNewLabel_7);
		
		textPesoTrabalhos = new JTextField();
		textPesoTrabalhos.setBounds(360, 194, 69, 28);
		contentPane.add(textPesoTrabalhos);
		textPesoTrabalhos.setColumns(10);
		
		JButton btnSalvarECalcular = new JButton("Salvar e Calcular Média Final");
		btnSalvarECalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ControllerNotas notasController = new ControllerNotas ();
				
			}
		});
		
		btnSalvarECalcular.setBounds(17, 321, 199, 28);
		contentPane.add(btnSalvarECalcular);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldNome.setText("");
				textFieldSobrenome.setText("");
				textMatricula.setText("");
				textNotaProvaUm.setText("");
				textNotaProvaDois.setText("");
				textTrabalhoUm.setText("");
				textTrabalhoDois.setText("");
				textPesoTrabalhos.setText("");
				textPesoProvas.setText("");
				comboBoxNivel.setSelectedItem("");
				
			}
		});
		
		btnLimpar.setBounds(339, 321, 90, 28);
		contentPane.add(btnLimpar);
		
		JLabel lblMediaFinal = new JLabel("Media Final");
		lblMediaFinal.setBounds(17, 262, 107, 16);
		contentPane.add(lblMediaFinal);
		
		JLabel lblSituao = new JLabel("Situa\u00E7\u00E3o");
		lblSituao.setBounds(239, 262, 55, 16);
		contentPane.add(lblSituao);
		
		JLabel lblNewLabel_8 = new JLabel("Cursando");
		lblNewLabel_8.setBounds(374, 262, 55, 16);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Media");
		lblNewLabel_9.setBounds(136, 262, 55, 16);
		contentPane.add(lblNewLabel_9);
	}
}
