import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.EmptyBorder;
import java.awt.Scrollbar;


@SuppressWarnings("serial")
public class Jfprincipal extends JFrame
{
	private JPanel contentPane;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					Jfprincipal frame = new Jfprincipal();
					frame.setVisible(true);
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Jfprincipal()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Manejador de Bases de Datos");
		setBounds(100, 100, 631, 367);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JTextArea TAMostrarResultados = new JTextArea();
		TAMostrarResultados.setLineWrap(true);
		TAMostrarResultados.setBounds(10, 156, 364, 172);
		TAMostrarResultados.setBackground(Color.black);
		TAMostrarResultados.setForeground(Color.white);
		TAMostrarResultados.setEditable(false);
		Font font = new Font("OCR A Extended", Font.BOLD, 12);
		TAMostrarResultados.setFont(font);
		contentPane.add(TAMostrarResultados);
		
		//NO QUIERE FUNCIONAR LO DE LOS SCROLL BAR
		/*JScrollPane scrollTerminal = new JScrollPane(TAMostrarResultados);
		scrollTerminal.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
		scrollTerminal.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		contentPane.add(TAMostrarResultados);
		contentPane.add(scrollTerminal);*/
		
		JTextArea TARecibirQuerys = new JTextArea();
		TARecibirQuerys.setLineWrap(true);
		TARecibirQuerys.setFont(new Font("Lucida Console", Font.PLAIN, 13));
		TARecibirQuerys.setBounds(10, 11, 364, 134);
		contentPane.add(TARecibirQuerys);
	
		JButton btnInsertarArchivo = new JButton("Importar Archivo");
		btnInsertarArchivo.setBounds(449, 71, 138, 35);
		contentPane.add(btnInsertarArchivo);
		btnInsertarArchivo.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				abrirArchivo();
			}
		});
		
				
		JButton btnEjecutar = new JButton("Ejecutar");
		btnEjecutar.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				String mensaje=ejecutar(TARecibirQuerys);
				TAMostrarResultados.setText(mensaje);
			}
		});
		btnEjecutar.setBounds(449, 143, 138, 35);
		contentPane.add(btnEjecutar);

	}
	
	public String ejecutar(JTextArea area)
	{
		String entrada = RetornarTextoArea(area);
		Generador lalala = new Generador();
		String mensaje=lalala.verificar(entrada);
		return mensaje;
	}
	
	//Toma el texto que inresa en las Querys.
	public static String RetornarTextoArea(JTextArea area)
	{
		String texto=area.getText();
		return texto;
	}
	
	
	//Abre el archivo seleccionado.
	private String abrirArchivo()
	{
		String aux="";   
		String texto="";
		try
		{
			 /**llamamos el metodo que permite cargar la ventana*/
			 JFileChooser file=new JFileChooser();
			 file.showOpenDialog(this);
			 /**abrimos el archivo seleccionado*/
			 File abre=file.getSelectedFile();
			 
			 /**recorremos el archivo, lo leemos para plasmarlo
			 *en el area de texto*/
			 if(abre!=null)
			 {     
				 FileReader archivos=new FileReader(abre);
				 BufferedReader lee=new BufferedReader(archivos);
				 while((aux=lee.readLine())!=null)
				 {
					 texto+= aux+ "\n";
				 }
				 lee.close();
				 JOptionPane.showMessageDialog(null, "Se importo correctamente el archivo!");
			 }    
		 }
		 catch(IOException ex)
		 {
			 JOptionPane.showMessageDialog(null,ex+"" +"\nNo se ha encontrado el archivo", "ADVERTENCIA!!!",JOptionPane.WARNING_MESSAGE);
		 }
		 return texto;//El texto se almacena en el JTextArea
	}
}
