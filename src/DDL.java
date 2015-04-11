import java.io.File;
import java.util.ArrayList;

public class DDL 
{
	public static String mensaje;
	
	public void createDatabase(String nombre)
	{
		File directorio = new File("C:/Users/Sophia/Documents/DBMS/Bases de Datos/" +nombre);
		boolean success = directorio.mkdir();
		if(success)
			mensaje="Se ha creado la Base de Datos exitosamente";
		else
			mensaje="Error al crear la Base de Datos";
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
				//concatenar datos con datos, sino solo muestra el ultimo elemento de la lista
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
	
	public Table crearTabla(String path, String nombre, ArrayList<Column> columnas) //FALTA ArrayList<Constraint> constraints
	{
		Table Tabla = new Table();
		File archivo = new File(path +nombre);
		if(!archivo.exists())
		{
			Tabla.setNombre(nombre);
			Tabla.setColumnas(columnas);
			//Tabla.setConstraints(constraints);
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
		mensaje="Se han borrado " + Integer.toString(archivos.length) + " exitosamente.\n Se ha eliminado la Base de Datos " + nombre + " exitosamente.";
	}
	
	
}
