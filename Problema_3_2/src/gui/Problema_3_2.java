package gui;

import java.awt.EventQueue;
import semana_03.Empleado;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Problema_3_2 extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	private JButton btnProcesar;
	private JScrollPane scrollPane;
	private JTextArea txtS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Problema_3_2 frame = new Problema_3_2();
					frame.setVisible(true);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Problema_3_2() {
		setTitle("Problema_3_2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(this);
		btnProcesar.setBounds(173, 11, 89, 23);
		contentPane.add(btnProcesar);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 48, 414, 403);
		contentPane.add(scrollPane);
		
		txtS = new JTextArea();
		txtS.setFont(new Font("Monospaced", Font.PLAIN, 13));
		scrollPane.setViewportView(txtS);
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnProcesar) {
			actionPerformedBtnProcesar(arg0);
		}
	}
	protected void actionPerformedBtnProcesar(ActionEvent arg0) {
		Empleado a = new Empleado(1585,0,978884927,"Elmo");
		Empleado b = new Empleado(45,"ivan");
		Empleado c = new Empleado(45,2,985658,"ELsa");
		
		listado(a);
		listado(b);
		listado(c);
		
		imprimir("Factor de descuento: " + Empleado.getDescuento());
		imprimir("Cantidad de objetos creado: " + Empleado.getEmpleadosCreados());
		imprimir("Suma de sueldos netos: " + Empleado.getSueldosNetos());
	}
	//  Métodos tipo void (sin parámetros)
	void imprimir() {
		imprimir("");
	}
	//  Métodos tipo void (con parámetros)
	void imprimir(String s) {
		txtS.append(s + "\n");
	}	
	void listado(Empleado x) {
		
		imprimir("DirMen: " + x );
		imprimir("codigo: " + x.getCodigo());
		imprimir("nombre: " + x.getNombre());
		imprimir("categoria:" + x.getCategoria());
		imprimir("numero de celular: " + x.getNumeroCelurar() );
		imprimir("sueldo bruto: " + x.sueldoBruto());
		imprimir("descuento: " + x.calcularDescuento());
		imprimir("Sueldo neto: " + x.calcularSueldoNeto());
		imprimir();
	}
	
}