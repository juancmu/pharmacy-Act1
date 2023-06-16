package Gui_farmacia;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;

public class FrmConfirm extends JFrame implements ActionListener  {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmConfirm frame = new FrmConfirm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	private JButton btnCancel;
	private JButton btnSend;
	private JLabel lblConfirm;
	private JLabel lblRequest;
	private JLabel lblAdress;
	private JLabel lblNewLabel;
	public FrmConfirm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 350);
//		setTitle("ACTIVIDAD 1 PLATAFORMAS DE DESARROLLO DE SOFTWARE ESTUDIANTE: JUAN CARLOS MUNOZ");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		frmConfirmComponents();
//		System.out.println(value);

		
	}

	
	// recepcion de datos del formulario principal 
	String adressMessage = "<html>Para la Farmacia Situada en ";
	
	public void setDato(String nameMedicament, String typeMedicament, int qtyMedicament, String nameVendor, boolean mainBranch, boolean secondaryBranch){
		
		//nombre del distribuidor 
		setTitle("Pedido al Distribuidor " + nameVendor);
		
		//cantidad, tipo y medicamento a enviar
		lblRequest.setText(qtyMedicament + " Unidades del " + typeMedicament + " " + nameMedicament);
		
		
		
		//muestra de las direcciones del envio
		if (mainBranch == true) {
		 
	
		adressMessage = adressMessage + "Calle de la Rosa No. 28"; 
		}
		
		if (mainBranch == true && secondaryBranch == true) {
		
			adressMessage = adressMessage + " y <br>para la farmacia situada en ";	
		}
		if (secondaryBranch == true) {
			 
	
			adressMessage = adressMessage + "Calle Alcazabilla No. 3";
					
		}
		
		lblAdress.setText(adressMessage + "<html>");
		

		
	}
	
	private void frmConfirmComponents() {
	setContentPane(contentPane);
	contentPane.setLayout(null);
	
	btnCancel = new JButton("Cancelar");
	btnCancel.setBounds(80, 200, 100, 30);
	btnCancel.addActionListener(this);
	contentPane.add(btnCancel);
	
	btnSend = new JButton("Enviar");
	btnSend.setBounds(270, 200, 100, 30);
	btnSend.addActionListener(this);
	contentPane.add(btnSend);
	
	lblConfirm = new JLabel();
	lblConfirm.setBounds(80, 250, 287, 42);
	lblConfirm.setForeground(Color.green);
	contentPane.add(lblConfirm);
	
	lblRequest = new JLabel();
	lblRequest.setBounds(59, 64, 313, 30);
	contentPane.add(lblRequest);
	
	lblAdress = new JLabel();
	lblAdress.setBounds(59, 100, 372, 71);
	contentPane.add(lblAdress);
	
	lblNewLabel = new JLabel("PEDIDO:");
	lblNewLabel.setBounds(119, 11, 203, 14);
	contentPane.add(lblNewLabel);
	
	
	}


	@Override
	public void actionPerformed(ActionEvent e) {
	
		if (e.getSource()==btnCancel) {
		
			dispose();
			
		
	}
		
		
		if (e.getSource()==btnSend) {
			
			lblConfirm.setText("Pedido Enviado");
			System.out.println("Pedido Enviado");
				
			
		}
		
		
		
		
}
}

