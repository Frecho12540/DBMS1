import java.util.ArrayList;


public class Database
{
	
	private String nombre;
	private ArrayList<Table> tablas;
	
	
	public String getNombre() 
	{
		return nombre;
	}
	
	public void setNombre(String nombre) 
	{
		this.nombre = nombre;
	}
	
	public ArrayList<Table> getTablas() 
	{
		return tablas;
	}
	
	public void setTablas(ArrayList<Table> tablas) 
	{
		this.tablas = tablas;
	}
	
}
