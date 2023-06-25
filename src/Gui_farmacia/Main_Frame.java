package Gui_farmacia;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;
import javax.swing.JSeparator;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import java.awt.Label;
import java.util.regex.Pattern;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class Main_Frame extends JFrame implements ActionListener {

	private JPanel controlPanel;
	private JPanel Panel;
	private JTextField txtNameMedicament;
	private static JTextField txtQtyMedicament;
	private JButton btnConfirm;
	private JButton btnErase;
	private JComboBox cmbBxTypeMedicament;
	private ButtonGroup groupVendor;
	private JRadioButton rdbtnCofarma;
	private JRadioButton rdbtnEmpsephar;
	private JRadioButton rdbtnCemefar;
	private JCheckBox chckbxMainBranch;
	private JCheckBox chckbxSecondaryBranch;
	private Label label;
	private static JLabel[] lblError = new JLabel[5];
	
	public Main_Frame() {
		setBackground(Color.WHITE);
		setTitle("ACTIVIDAD 1 PLATAFORMAS DE DESARROLLO DE SOFTWARE ESTUDIANTE: JUAN CARLOS MUNOZ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 778, 400);
		taskOneComponents();
		setResizable(false);

}
	
	private void taskOneComponents() {
	
		controlPanel = new JPanel();
		controlPanel.setBackground(Color.WHITE);
		controlPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(controlPanel);
		controlPanel.setLayout(null);
		
		JLabel lblTitle = new JLabel("SELECCIONE SU PEDIDO");
		lblTitle.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTitle.setBounds(209, 11, 215, 14);
		controlPanel.add(lblTitle);
		
		JLabel lblNameMedicament = new JLabel("Nombre del Medicamento:");
		lblNameMedicament.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNameMedicament.setBounds(10, 68, 180, 14);
		controlPanel.add(lblNameMedicament);
		
		JLabel lblTypeMedicament = new JLabel("Tipo de Medicamento:");
		lblTypeMedicament.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTypeMedicament.setBounds(10, 112, 180, 14);
		controlPanel.add(lblTypeMedicament);
		
		JLabel lblQtyMedicament = new JLabel("Cantidad:");
		lblQtyMedicament.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblQtyMedicament.setBounds(10, 156, 180, 14);
		controlPanel.add(lblQtyMedicament);
		
		JLabel lblNameVendor = new JLabel("Distribuidor:");
		lblNameVendor.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNameVendor.setBounds(10, 198, 180, 14);
		controlPanel.add(lblNameVendor);
		
		JLabel lblKindBranch = new JLabel("Sucursal a donde enviar el pedido");
		lblKindBranch.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblKindBranch.setBounds(10, 254, 225, 14);
		controlPanel.add(lblKindBranch);
		
	
		
		txtNameMedicament = new JTextField();
		txtNameMedicament.setBounds(193, 67, 314, 20);
		controlPanel.add(txtNameMedicament);
		txtNameMedicament.setColumns(10);
		txtNameMedicament.addFocusListener(createFocusListener(0));
		
		
	
	
		
		cmbBxTypeMedicament = new JComboBox();
		cmbBxTypeMedicament.setModel(new DefaultComboBoxModel(new String[] {"ANALGESICO", "ANALEPTICO", "ANESTESICO", "ANTIACIDO", "ANTIDEPRESIVO", "ANTIBIOTICO"}));
		cmbBxTypeMedicament.setSelectedIndex(-1);
		cmbBxTypeMedicament.setBounds(200, 110, 237, 22);
		controlPanel.add(cmbBxTypeMedicament);
		cmbBxTypeMedicament.addFocusListener(createFocusListener(1));
		
		
		txtQtyMedicament = new JTextField();
		txtQtyMedicament.setBounds(200, 155, 86, 20);
		controlPanel.add(txtQtyMedicament);
		txtQtyMedicament.setColumns(10);
		txtQtyMedicament.addFocusListener(createFocusListener(2));
		

		
		txtQtyMedicament.addKeyListener(new KeyAdapter() {

	         public void keyPressed(KeyEvent ke) {
	            String value = txtQtyMedicament.getText();
	  
	            if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9' || ke.getKeyChar()==ke.VK_BACK_SPACE || ke.getKeyChar()==ke.VK_DELETE  || ke.getKeyChar()==ke.VK_LEFT || ke.getKeyChar()==ke.VK_RIGHT) {
	            	lblError[2].setText("");
	            	txtQtyMedicament.setEditable(true);
	            	
	           
	            } else {
	            	lblError[2].setText("La Cantidad de Medicamento Solo Acepta Numeros");
	            	
	            	txtQtyMedicament.setEditable(false);
	           
	            }
	         }
	      });
		
		rdbtnCofarma = new JRadioButton("COFARMA");
		rdbtnCofarma.setBounds(156, 196, 133, 23);
		controlPanel.add(rdbtnCofarma);
		rdbtnCofarma.addFocusListener(createFocusListener(3));
		
		rdbtnEmpsephar = new JRadioButton("EMPSEPHAR");
		rdbtnEmpsephar.setBounds(301, 194, 113, 23);
		controlPanel.add(rdbtnEmpsephar);
		rdbtnEmpsephar.addFocusListener(createFocusListener(3));
		
		rdbtnCemefar = new JRadioButton("CEMEFAR");
		rdbtnCemefar.setBounds(426, 196, 108, 23);
		controlPanel.add(rdbtnCemefar);
		rdbtnCemefar.addFocusListener(createFocusListener(3));
		
		groupVendor = new ButtonGroup();
		
		groupVendor.add(rdbtnCofarma); 
		groupVendor.add(rdbtnEmpsephar); 
		groupVendor.add(rdbtnCemefar);
		
		chckbxMainBranch = new JCheckBox("Principal");
		chckbxMainBranch.setBounds(232, 250, 93, 23);
		controlPanel.add(chckbxMainBranch);
		chckbxMainBranch.addFocusListener(createFocusListener(4));
		
		chckbxSecondaryBranch = new JCheckBox("Secundaria");
		chckbxSecondaryBranch.setBounds(323, 252, 127, 23);
		controlPanel.add(chckbxSecondaryBranch);
		chckbxSecondaryBranch.addFocusListener(createFocusListener(4));
		
		
		
		lblError[0] = new JLabel("");
		lblError[0].setBounds(510, 70, 250, 14);
		lblError[0].setForeground(Color.red);
		controlPanel.add(lblError[0]);
		
		lblError[1] = new JLabel("");
		lblError[1].setBounds(447, 114, 186, 14);
		lblError[1].setForeground(Color.red);
		controlPanel.add(lblError[1]);
		
		lblError[2] = new JLabel();
		lblError[2].setForeground(Color.red);
		lblError[2].setBounds(299, 158, 331, 17);
		controlPanel.add(lblError[2]);
		
		lblError[3] = new JLabel("");
		lblError[3].setBounds(530, 200, 300, 14);
		lblError[3].setForeground(Color.red);
		controlPanel.add(lblError[3]);
		
		lblError[4] = new JLabel("");
		lblError[4].setBounds(450, 254, 300, 14);
		lblError[4].setForeground(Color.red);
		controlPanel.add(lblError[4]);
		
	

		btnErase = new JButton("BORRAR");
		btnErase.setBounds(143, 312, 157, 38);
		btnErase.addActionListener(this);
		controlPanel.add(btnErase);
		
		btnConfirm = new JButton("CONFIRMAR");
		btnConfirm.setBounds(377, 312, 157, 38);
		btnConfirm.addActionListener(this);
		
		controlPanel.add(btnConfirm);
	
		
		
	}

// borrar los mensajes de error cuando se pierde el enfoque
	
	 public static FocusListener createFocusListener(int field) {
	        return new FocusListener() {
	            @Override
	            public void focusGained(FocusEvent e) {
	                // Not used
	            }
	            @Override
	            public void focusLost(FocusEvent e) {
	
	            	lblError[field].setText("");
	            	txtQtyMedicament.setEditable(true);
	         
           
	            }
	        };
	    }
	 
	 
	@Override
		public void actionPerformed(ActionEvent e) {

		String [] messageError= new String[5];
		String   nameMedicament = "";
		boolean nameMedicamentValidate = false;
		boolean qtyMedicamentValidate = false;
		boolean typeMedicamentValidate = false;
		boolean vendorValidate = false;
		boolean branchValidate = false;
		boolean  mainBranch = false;
		boolean  secondaryBranch = false;
		String   nameVendor="";
//	
		
		if (e.getSource()==btnConfirm) {
			
			
			//verificar nombre de medicamento no sea vacio ni con caracteres especiales
			 if (txtNameMedicament.getText().isEmpty()) {
									
				 	messageError[0] = "El nombre de medicamento no puede estar vacio";
				 	lblError[0].setText("Esta Vacio, corregir");
		
				
			  } else {		
							
				  nameMedicament = txtNameMedicament.getText();
			  
				  String validCharacters = "[a-zA-Z0-9]+"; 
				  nameMedicamentValidate = nameMedicament.matches(validCharacters);
				  if (nameMedicamentValidate == false) {
				  messageError[0] = "El nombre de medicamento no puede tener caracteres especiales";
				  lblError[0].setText("Tiene caracteres especiales, corregir");
				  }
			  }
		    
			//validacion si el tipo de medicamento no este vacio 
			String   typeMedicament=""; 
			
			if (cmbBxTypeMedicament.getSelectedItem() == null) {
				typeMedicamentValidate = false;	
				messageError[1]="Debe Seleccionar el tipo de medicamento";
				lblError[1].setText("Seleccione el tipo, corregir");
			
			} else {
				typeMedicamentValidate = true;
				typeMedicament = cmbBxTypeMedicament.getSelectedItem().toString();
			}
			
			
			
		//	validacion cantidad de medicamento no sea vacio, la validacion numerica se realizo como evento en la escritura de la cantidad dentro del JTextField
			 int  qtyMedicament=0;
			
			 if (txtQtyMedicament.getText().isEmpty()) {
			
				 messageError[2]="La cantidad de medicamento no puede estar vacio";
					lblError[2].setText("Esta Vacio, corregir");
				 
				 qtyMedicamentValidate = false;	
			
			 } else {
				 qtyMedicamentValidate = true;
				 qtyMedicament  = Integer.parseInt(txtQtyMedicament.getText());
			 }
			 
			 
			 
						
			if (rdbtnCofarma.isSelected()) {

				vendorValidate = true;
				nameVendor = "Cofarma";

	        } else if (rdbtnEmpsephar.isSelected()) {
	        	vendorValidate = true;
	        	nameVendor = "Empsephar";
	        	
	        	
	        } else if (rdbtnCemefar.isSelected()) {
	        	vendorValidate = true;
	        	nameVendor = "Cemefar";
	        } else {
	        	vendorValidate = false;
	       
	        	messageError[3] = "No ha Seleccionado Ningun Distribuidor";
	        	lblError[3].setText("Seleccione Distribudor, corregir");
	        }
	        
			
			//verificar si al menos alguna sucursal esta asiggnada 
			 if (chckbxMainBranch.isSelected()) {		            
				 mainBranch = true;
		        } 
			 
			 if (chckbxSecondaryBranch.isSelected()) {
				 secondaryBranch = true;
		        } 
			 			 
			 if (mainBranch == false && secondaryBranch == false) {
				 
				 branchValidate = false;
				 messageError[4] = "No ha seleccionado la Sucursal Principal y/o Secundaria";
					lblError[4].setText("Seleccione la(s) sucursal(es), corregir");
			 } else {
				 branchValidate = true;
			 }
			
			
//			   verificacion de totdos los campos del formulario y envio de mensaje 
			 if (nameMedicamentValidate==false || qtyMedicamentValidate == false || typeMedicamentValidate == false || vendorValidate == false || branchValidate == false) {
			 
			 
			 	String[] options = {"Corregir"};

		        JPanel panel = new JPanel();
		        panel.setPreferredSize(new Dimension(500, 200));
		        panel.setLayout(null);
		        
		        String messageErrorTxt = "<html><ul>";
		        for (String x : messageError) {
		        	
		        	if (x != null ) {
		        		messageErrorTxt = messageErrorTxt + "<li>" + x + "</li>";
		        		
		        	}
		        }
		        messageErrorTxt = messageErrorTxt + "</ul></html>";
		        
		        
		        
		    	JLabel dataReview = new JLabel(messageErrorTxt);
		    	dataReview.setFont(new Font("Tahoma", Font.PLAIN, 14));
				dataReview.setBounds(50, -30, 400, 240);
		
		        panel.add(dataReview);

		        		JOptionPane.showOptionDialog(null,
		                panel,
		                "Hay Inconsistencias en su pedido, revisar:",
		                JOptionPane.DEFAULT_OPTION,
		                JOptionPane.PLAIN_MESSAGE,
		                null,
		                options,
		                options[0]);
		
			 }  else {
		
				FrmConfirm frmConfirm = new FrmConfirm();
				frmConfirm.setDato(nameMedicament, typeMedicament, qtyMedicament, nameVendor, mainBranch, secondaryBranch);
				frmConfirm.setVisible(true);
				
			 }
			}
		
		// borrar los datos del formulario
			if (e.getSource()==btnErase) {
				erasePanel();
			}
		
		
		
	}

	private void erasePanel() {
		txtNameMedicament.setText("");
		txtQtyMedicament.setText("");
		cmbBxTypeMedicament.setSelectedIndex(-1);
		groupVendor.clearSelection();
		chckbxMainBranch.setSelected(false);
		chckbxSecondaryBranch.setSelected(false);
		
		for (int i = 0; i < 5; i++) {
			lblError[i].setText("");
			}
		
		
	}
}

	