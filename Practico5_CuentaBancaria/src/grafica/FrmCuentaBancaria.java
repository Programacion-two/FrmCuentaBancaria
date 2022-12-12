package grafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import logica.CuentaBancaria;

import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrmCuentaBancaria extends JFrame {
	private JPanel contentPane;
	private JLabel lblUser;
	private JLabel lblPass;
	private JTextField txtUser;
	private JTextField txtPass;
	private JTextField txtVerSaldo;
	private JTextField txtRE;
	private JButton btnVerSaldo;
	private JButton btnRetirar;
	private JButton btnDepositar;

	public FrmCuentaBancaria() {
		iniciarComponentes();
		iniciarManejadoresEventos();
	}

	private void iniciarComponentes() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 493, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		lblUser = new JLabel("User");
		lblUser.setBounds(22, 47, 46, 14);
		contentPane.add(lblUser);

		lblPass = new JLabel("Pass");
		lblPass.setBounds(22, 97, 55, 16);
		contentPane.add(lblPass);

		txtUser = new JTextField();
		txtUser.setBounds(78, 44, 114, 20);
		contentPane.add(txtUser);
		txtUser.setColumns(10);

		txtPass = new JTextField();
		txtPass.setBounds(78, 95, 114, 20);
		contentPane.add(txtPass);
		txtPass.setColumns(10);

		btnVerSaldo = new JButton("Ver saldo");
		btnVerSaldo.setBounds(10, 180, 98, 26);
		contentPane.add(btnVerSaldo);

		txtVerSaldo = new JTextField();
		txtVerSaldo.setBounds(118, 183, 114, 20);
		contentPane.add(txtVerSaldo);
		txtVerSaldo.setColumns(10);

		btnRetirar = new JButton("Retirar");
		btnRetirar.setBounds(257, 180, 98, 26);
		contentPane.add(btnRetirar);

		btnDepositar = new JButton("Depositar");
		btnDepositar.setBounds(369, 180, 98, 26);
		contentPane.add(btnDepositar);

		txtRE = new JTextField();
		txtRE.setBounds(303, 149, 114, 20);
		contentPane.add(txtRE);
		txtRE.setColumns(10);
	}

	private void iniciarManejadoresEventos() {
		btnVerSaldo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String user = txtUser.getText();
					String pass = txtPass.getText();
					double saldo = Double.valueOf(txtVerSaldo.getText());
					CuentaBancaria c1 = new CuentaBancaria(user, pass, saldo);

					
					if(txtUser.getText().equals(user) || txtPass.getText().equals(pass)) {
						txtVerSaldo.setText(String.valueOf(c1.toString()));

					} else {

					}

					
				
				} catch (Exception exc) {
					txtVerSaldo.setText("error");
					JOptionPane.showMessageDialog(null, exc);
				}

			}
		});

		btnRetirar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtRE.getText();

			}
		});

		btnDepositar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmCuentaBancaria frame = new FrmCuentaBancaria();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
