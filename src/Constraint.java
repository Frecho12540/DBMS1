import java.util.ArrayList;


public class Constraint
{
	private String nombreC;
	private String tipo;
	private ArrayList<Column> columnas;
	
	
	public String getNombreC() 
	{
		return nombreC;
	}
	
	public void setNombreC(String nombreC) 
	{
		this.nombreC = nombreC;
	}
	
	public String getTipo() 
	{
		return tipo;
	}
	
	public void setTipo(String tipo) 
	{
		this.tipo = tipo;
	}
	
	public ArrayList<Column> getColumnas() 
	{
		return columnas;
	}
	
	public void setColumnas(ArrayList<Column> columnas) 
	{
		this.columnas = columnas;
	}
	
}
