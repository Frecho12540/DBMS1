import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.StringReader;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Element;
import org.xml.sax.InputSource;

public class DDL 
{
	//Variable para mostrar mensajes en la Interfaz Grafica.
	public static String mensaje;
	public static ArchivoXML XMLfile;
	
	public Database createDatabase(String nombre)
	{
		boolean success = false;
		Database database = new Database();
		try{
			File folder = new File("C:/Users/Sophia/Documents/DBMS/Bases de Datos");
			File[] listOfDB = folder.listFiles();
			ArrayList<String> bds = getNames();
			if (!bds.contains(nombre)){
				File directorio = new File("C:/Users/Sophia/Documents/DBMS/Bases de Datos/" +nombre);
				success = directorio.mkdir();
				
				database.setNombre(nombre);
				mensaje="Se ha creado la Base de Datos exitosamente";			
			}
			else{
				mensaje="Error al crear la Base de Datos";
			}			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		return database;
	}
	
	public void showDatabases()
	{
		File folder = new File("C:/Users/Sophia/Documents/DBMS/Bases de Datos");
		File[] listOfDB = folder.listFiles();
		String titulo="Bases de Datos actuales";
		String datos="";
		
		for(int i = 0; i < listOfDB.length; i++)
		{
			if (listOfDB[i].isDirectory())
			{
				datos= datos +"\n- " + listOfDB[i].getName();
			}
		}
		mensaje=titulo+datos;
	}
	
	public ArrayList<String> getNames()
	{
		File folder = new File("C:/Users/Sophia/Documents/DBMS/Bases de Datos");
		File[] listOfFiles = folder.listFiles();
		ArrayList<String> nameOfFiles = new ArrayList<String>();
		for(int i = 0; i < listOfFiles.length; i++)
		{
			nameOfFiles.add(listOfFiles[i].getName());
		}
		return nameOfFiles;
	}
	
	public ArrayList<String> getNamesTables(String pathDB)
	{
		File folder = new File(pathDB);
		File[] listOfFiles = folder.listFiles();
		ArrayList<String> nameOfFiles = new ArrayList<String>();
		for(int i = 0; i < listOfFiles.length; i++)
		{
			nameOfFiles.add(listOfFiles[i].getName());
		}
		return nameOfFiles;
	}
	
	
	public void alterDatabase(String oldName, String newName)
	{
		ArrayList<String> names = getNames();
		File oldDir = new File("C:/Users/Sophia/Documents/DBMS/Bases de Datos/" + oldName);
		File newDir = new File("C:/Users/Sophia/Documents/DBMS/Bases de Datos/" + newName);
		if(!names.contains(oldName))
		{
			mensaje="La Base de Datos que intenta renombrar no existe";
		}
		else if(names.contains(newName) == true)
		{
			mensaje="No se puede renombrar ya que existe una Base de Datos con ese nombre";	
		}  
		else if(oldDir.isDirectory())
		{
			oldDir.renameTo(newDir);
			showDatabases();
		}  
	}
	
	public String useDatabase(String nombre)
	{
		ArrayList<String> names = getNames();
		String newDirectory = "";
		if(!names.contains(nombre))
		{ 
			mensaje="La Base de Datos no existe";
			newDirectory = null;
		}
		else 
		{
			newDirectory = ("C:/Users/Sophia/Documents/DBMS/Bases de Datos/" + nombre + "/");
		}
		mensaje=newDirectory;
		return newDirectory;
	}
	
	public ArrayList<Column> crearColumnas(ArrayList<String> nombres, ArrayList<String> tipos)
	{
		ArrayList<Column> columnas = new ArrayList<Column>();
		Column nombresColumnas = new Column();
		if(nombres.size()==tipos.size())
		{
			for(int i=0; i<nombres.size(); i++)
			{
				nombresColumnas.setNombre(nombres.get(i));
				nombresColumnas.setTipo(tipos.get(i));
			}
			columnas.add(nombresColumnas);	
		}
		return columnas;
	}
	
	//Este metodo solo crea el objeto Tabla, no lo está guardando en ningun xml ni almacenandolo en metadata
	public Table crearTabla(String path, String nombre, ArrayList<Column> columnas) //FALTA ArrayList<Constraint> constraints
	{
		Table Tabla = new Table();
		if(path == ""){
			mensaje = "No se ha seleccionado una base de datos";
		}
		else{
			File archivo = new File(path +nombre);
			if(!archivo.exists())
			{
				Tabla.setNombre(nombre);
				Tabla.setColumnas(columnas);
				//Tabla.setConstraints(constraints);
			}
		}
		return Tabla;	
	}
	
	public void dropDatabase(String nombre)
	{
		File database = new File("C:/Users/Sophia/Documents/DBMS/Bases de Datos/" + nombre);
		File[] archivos = database.listFiles();
		for(int i = 0; i < archivos.length; i++)
		{
			if(archivos[i].isFile())
			{
				archivos[i].delete();
			}
		}
		database.delete();
		mensaje="Se han borrado " + Integer.toString(archivos.length) + " archivos exitosamente.\n Se ha eliminado la Base de Datos " + nombre + " exitosamente.";
	}
	/*
	 * Recibe dos parametros. nombreDB es el nombre de la bases de datos en la que se encuentra esa tabla y nombreTabla es
	 * el nombre de la tabla a eliminar
	 * SE AGREGO LA CONDICION DE VERIFICAR PRIMERO SI EXISTE LA TABLA EN DICHA DB
	 */
	public void dropTable(String pathDB, String nombreTabla)
	{
		File database = new File(pathDB);
		File[] archivos = database.listFiles();
		ArrayList<String> nombresTablas = new ArrayList<>();
		for(int i = 0; i<archivos.length; i++){
			nombresTablas.add(archivos[i].getName());
		}
		if(!nombresTablas.contains(nombreTabla + ".xml"))
		{
			mensaje = "La tabla que intenta borrar no existe";
		}
		else
		{
			for(int i = 0; i < archivos.length; i++)
			{
				if(archivos[i].getName().equals(nombreTabla + ".xml"))
				{
					//aqui solo la esta borrando de la lista de archivos
					archivos[i].delete();
					//faltaba esta instruccion para que la borre de la base de datos
					database.delete();
					mensaje="Se ha eliminado correctamente la Tabla "+nombreTabla;
					
				}
			}
		}
	}
	
	/*
	 * Este metodo es identico al de ShowDatabases, solo que recibe un parametro indicando 
	 * el nombre de las base de datos de la cual quiere obtener las tablas.
	 */
	public void showTables(String pathDB)
	{
		File folder = new File(pathDB);
		File[] listOfTables = folder.listFiles();
		String titulo="Tablas actuales:";
		String datos="";
		for(int i = 0; i < listOfTables.length; i++)
		{
			if (listOfTables[i].isFile())
			{
				datos= datos +"\n- " + listOfTables[i].getName();
			}
		}
		mensaje=titulo+datos;
	}
	
	/*
	 * Creo que este metodo si funciona.
	 * Recibe el nombre de la tabla, de esa tabla saca el ArrayList de las columnas.
	 * Se crea el iterador para ir recorriendo ese ArrayList de las columnas.
	 * Se recorre ese ArrayList y dentro, se revisa si el iterador tiene un siguiente objeto.
	 * Si es asi, en base al objeto nombres de Column, obtenemos el nombre y lo guardamos en un String
	 * Al final, se devuelve ese String.
	 * NO LO HE PROBADO!!!
	 */
	
	public void showColumnsFrom(String pathDB, String tabla)
	{
		try{
			File file = new File(pathDB + tabla + ".xml");
			FileReader archivo = new FileReader(file);
			BufferedReader br = new BufferedReader(archivo);
			String entrada;
			String cadena = "";
			
			while ((entrada = br.readLine()) != null){
				cadena += entrada;
			}
			
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			
			InputSource archivo2 = new InputSource();
			archivo2.setCharacterStream(new StringReader(cadena));
			
			Document documento = dBuilder.parse(archivo2);
			documento.getDocumentElement().normalize();
			NodeList nList = documento.getElementsByTagName("Columna");
			
			mensaje = "";
			for(int i = 0; i<nList.getLength(); i++){
				Node primerNodo = nList.item(i);
				String nombreCol;
				String tipoCol;
				
				if(primerNodo.getNodeType() == Node.ELEMENT_NODE){
					Element primerElem = (Element) primerNodo;
					
					NodeList primerNombreElemList = primerElem.getElementsByTagName("NombreColumna");
					Element primerNombreElem = (Element) primerNombreElemList.item(0);
					NodeList primerNombre = primerNombreElem.getChildNodes();
					nombreCol = ((Node) primerNombre.item(0)).getNodeValue().toString();
					mensaje += "\nNombre Columna: " + nombreCol;
					
					NodeList segundoNombreElemList = primerElem.getElementsByTagName("TipoColumna");
					Element segundoNombreElem = (Element) segundoNombreElemList.item(0);
					NodeList segundoNombre = segundoNombreElem.getChildNodes();
					tipoCol = ((Node) segundoNombre.item(0)).getNodeValue().toString();
					mensaje += "\nTipo Columna: " + tipoCol;
					
				}
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public void alterTable(String pathDB, String oldName, String newName)
	{
		ArrayList<String> names = getNamesTables(pathDB);
		File oldDir = new File(pathDB + oldName + ".xml");
		File newDir = new File(pathDB + newName + ".xml");
		if(!names.contains(oldName + ".xml"))
		{
			mensaje="La tabla que intenta renombrar no existe";
		}
		else if(names.contains(newName + ".xml") == true)
		{
			mensaje="No se puede renombrar ya que existe una tabla con ese nombre";	
		}  
		else if(oldDir.isFile())
		{
			oldDir.renameTo(newDir);
			showTables(pathDB);
		}  
	}

	
	
}
