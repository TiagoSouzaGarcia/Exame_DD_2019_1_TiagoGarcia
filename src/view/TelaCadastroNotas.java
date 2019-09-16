package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.AlunoController;
import model.bo.AlunoBO;
import model.vo.Aluno;

import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

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
	private Aluno novoAluno = null;
	private String[] niveis = {AlunoController.NIVEL_BASICO, AlunoController.NIVEL_INTERMEDIARIO, AlunoController.NIVEL_AVANCADO, AlunoController.NIVEL_ESPECIALISTA, AlunoController.NIVEL_SELECIONE};

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
		
		JLabel lblMatricula = new JLabel("Matrícula");
		lblMatricula.setBounds(16, 62, 55, 16);
		contentPane.add(lblMatricula);
		
		textMatricula = new JTextField();
		textMatricula.setBounds(83, 56, 122, 28);
		contentPane.add(textMatricula);
		textMatricula.setColumns(10);
		
		JLabel lblNivel = new JLabel("N\u00EDvel");
		lblNivel.setBounds(239, 62, 55, 16);
		contentPane.add(lblNivel);
		
		JComboBox comboBoxNivel = new JComboBox(niveis);
		comboBoxNivel.setModel(new DefaultComboBoxModel(new String[] {"Selecione", "B\u00E1sico", "Intermedi\u00E1rio", "Avan\u00E7ado", "Especialista"}));
		comboBoxNivel.setBounds(307, 53, 122, 26);
		contentPane.add(comboBoxNivel);
		
		JLabel lblNotaProva1 = new JLabel("NP1");
		lblNotaProva1.setBounds(17, 113, 55, 16);
		contentPane.add(lblNotaProva1);
		
		textNotaProvaUm = new JTextField();
		textNotaProvaUm.setBounds(136, 107, 69, 28);
		contentPane.add(textNotaProvaUm);
		textNotaProvaUm.setColumns(10);
		
		JLabel lblNotaProva2 = new JLabel("NP2");
		lblNotaProva2.setBounds(239, 113, 55, 16);
		contentPane.add(lblNotaProva2);
		
		textNotaProvaDois = new JTextField();
		textNotaProvaDois.setBounds(360, 107, 69, 28);
		contentPane.add(textNotaProvaDois);
		textNotaProvaDois.setColumns(10);
		
		JLabel lblNotaTrabalho1 = new JLabel("T1");
		lblNotaTrabalho1.setBounds(17, 153, 55, 16);
		contentPane.add(lblNotaTrabalho1);
		
		textTrabalhoUm = new JTextField();
		textTrabalhoUm.setBounds(136, 147, 69, 28);
		contentPane.add(textTrabalhoUm);
		textTrabalhoUm.setColumns(10);
		
		JLabel lblNotaTrabalho2 = new JLabel("T2");
		lblNotaTrabalho2.setBounds(239, 153, 55, 16);
		contentPane.add(lblNotaTrabalho2);
		
		textTrabalhoDois = new JTextField();
		textTrabalhoDois.setBounds(360, 147, 69, 28);
		contentPane.add(textTrabalhoDois);
		textTrabalhoDois.setColumns(10);
		
		JLabel lblPesoProvas = new JLabel("Peso das Provas");
		lblPesoProvas.setBounds(17, 200, 107, 16);
		contentPane.add(lblPesoProvas);
		
		textPesoProvas = new JTextField();
		textPesoProvas.setBounds(136, 194, 69, 28);
		contentPane.add(textPesoProvas);
		textPesoProvas.setColumns(10);
		
		JLabel lblPesoTrabalhos = new JLabel("Peso dos Trabalhos");
		lblPesoTrabalhos.setBounds(235, 200, 113, 16);
		contentPane.add(lblPesoTrabalhos);
		
		textPesoTrabalhos = new JTextField();
		textPesoTrabalhos.setBounds(360, 194, 69, 28);
		contentPane.add(textPesoTrabalhos);
		textPesoTrabalhos.setColumns(10);
		
		JLabel lblResultado = new JLabel("Cursando");
		lblResultado.setBounds(374, 262, 55, 16);
		contentPane.add(lblResultado);
		
		JButton btnSalvarECalcular = new JButton("Salvar e Calcular Média Final");
		btnSalvarECalcular.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String mensagemValidacao = validarPreenchimentoCampos();
				
				if (!mensagemValidacao.equals("")) {
					JOptionPane.showMessageDialog(null, mensagemValidacao, "Atenção", JOptionPane.ERROR_MESSAGE);
				}
				else {
				AlunoController controlador = new AlunoController();
				
				Aluno novoAluno = construirAlunoDaTela();
				
				String situacao = controlador.salvar(novoAluno);
				
			}

			private Aluno construirAlunoDaTela() {
				// TODO Auto-generated method stub
				return null;
			}

			private String validarPreenchimentoCampos() {
				// TODO Auto-generated method stub
				return null;
				
			}
		}
	}
			);
		/*btnSalvarECalcular.addActionListener(new ActionListener() {
			@SuppressWarnings("null")
			public void actionPerformed(ActionEvent e) {
				AlunoController notasController = new AlunoController ();
				String nomeDigitado = textFieldNome.getText();
				String sobrenomeDigitado = textFieldSobrenome.getText();
				String matricula = textMatricula.getText();
				Double notaProvaUm = Double.parseDouble(textNotaProvaUm.getText());
				Double notaProvaDois = Double.parseDouble(textNotaProvaDois.getText());
				Double trabalhoUm = Double.parseDouble(textTrabalhoUm.getText());
				Double trabalhoDois = Double.parseDouble(textTrabalhoDois.getText());
				String nivel = (String) comboBoxNivel.getSelectedItem();
				Double pesoProva = Double.parseDouble(textPesoProvas.getText());
				Double pesoTrabalho = Double.parseDouble(textPesoTrabalhos.getText());
				String situacao = lblResultado.getText();				
				Double media = null;
				
				String mensagem = notasController.validarCamposSalvar(nomeDigitado, 
						sobrenomeDigitado, matricula, notaProvaUm, notaProvaDois, 
						trabalhoUm, trabalhoDois, pesoProva, pesoTrabalho);
				
				
			/*	if (mensagem.isEmpty()) {
					novoAluno = new Aluno(nomeDigitado,  sobrenomeDigitado,  matricula,  nivel,  notaProvaUm,
							notaProvaDois,  trabalhoUm,  trabalhoDois, situacao,
							 pesoProva,  pesoTrabalho, media);
					novoAluno = |AlunoController.salvar(novoAluno);
					
					if (novoAluno.getId() > 0) {
						btnSalvarECalcular.setEnabled(true);
						
					} else {
						JOptionPane.showMessageDialog(null,  mensagem, "Atenção", JOptionPane.WARNING_MESSAGE);
					}
				}
				
				notasController.validarSoma(null);*/
				
				
						
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
		
		JLabel lblSitucao = new JLabel("Situa\u00E7\u00E3o");
		lblSitucao.setBounds(239, 262, 55, 16);
		contentPane.add(lblSitucao);
		
		JLabel lblNewLabel_9 = new JLabel("Media");
		lblNewLabel_9.setBounds(136, 262, 55, 16);
		contentPane.add(lblNewLabel_9);
	}
}
