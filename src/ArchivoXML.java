

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.*;
import javax.xml.transform.dom.*;
import javax.xml.transform.stream.*;

import org.w3c.dom.*;
 
public class ArchivoXML 
{
    /*
     * ESTE METODO GENERA UN ARCHIVO (QUE NO EXISTIA) QUE CONTIENE LA METADATA DE LAS TABLAS EN CADA BASE DE DATOS
     * O SEA, SE CREA EL ARCHIVO DE METADATA CUANDO SE CREA LA PRIMERA TABLA DE UNA BASE DE DATOS
     */
	public void generateMDTabla(String path, String nameArchivo, Table tablaNueva, ArrayList<String> nombreCols, ArrayList<String> tipoCols) throws Exception
    { 
 
        if(nombreCols.isEmpty() || tipoCols.isEmpty() || nombreCols.size()!=tipoCols.size())
        {
            System.out.println("ERROR empty ArrayList");
            return;
        }
        else
        {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            DOMImplementation implementation = builder.getDOMImplementation();
            
            Document document = implementation.createDocument(null, nameArchivo, null);
            document.setXmlVersion("1.0");
 
          //Main Node
            Element rootElement = document.getDocumentElement();
            
            	//Un elemento Tabla
            	Element tablaElement = document.createElement("Tabla");
	            	//Nombre de la tabla
		            Element nameTNode = document.createElement("nombreTabla");
		            Text nameTNodeValue = document.createTextNode(tablaNueva.getNombre());
		            nameTNode.appendChild(nameTNodeValue);
		            tablaElement.appendChild(nameTNode);
		            for(int i=0; i<nombreCols.size(); i++)
		            {
		                //Item Node
		                Element columnNode = document.createElement("Columna");
		                	//Nodo nombreColumna
			                Element nameNode = document.createElement("NombreColumna");
			                Text nodeNameValue = document.createTextNode(nombreCols.get(i));
			                nameNode.appendChild(nodeNameValue);
			                columnNode.appendChild(nameNode);
			                
			                //Nodo tipoColumna
			                Element tipoNode = document.createElement("TipoColumna"); 
			                Text nodeTipoValue = document.createTextNode(tipoCols.get(i));                
			                tipoNode.appendChild(nodeTipoValue);
			                columnNode.appendChild(tipoNode);
		                tablaElement.appendChild(columnNode);
		                
		            }
		            rootElement.appendChild(tablaElement);               
            //Generate XML
            Source source = new DOMSource(document);
            //Indicamos donde lo queremos almacenar
            Result result = new StreamResult(new java.io.File(path + nameArchivo+".xml")); //nombre del archivo
            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            transformer.transform(source, result);
        }
    }
    
	/*
     * ESTE ARCHIVO GUARDA LA METADATA DE LA TABLA QUE SE ESTE CREANDO
	 * SI EL ARCHIVO QUE CONTIENE LA METADATA DE LAS TABLAS NO EXISTE, LLAMA AL METODO QUE LO CREA Y AGREGA LOS DATOS DE LA TABLA QUE SE ESTA CREANDO
	 * SI EL ARCHIVO QUE CONTIENE LA METADATA DE LAS TABLAS YA EXISTE, SOLO AGREGA A ESTE LOS DATOS DE LA TABLA QUE SE ESTA CREANDO
	 */
	
    public void crearTablaMD(String path, String nameFile, Table tablaNueva, ArrayList<String> nombreCols, ArrayList<String> tipoCols) throws Exception
    { 
    	File file = new File(path + nameFile + ".xml");
    	if(!file.exists()){
    		generateMDTabla(path, nameFile, tablaNueva, nombreCols, tipoCols);
    	}
    	else
    	{
    		if(tablaNueva.getColumnas().isEmpty())
	        {
	            System.out.println("ERROR empty ArrayList");
	            return;
	        }
	        else
	        {
	            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
	            DocumentBuilder builder = factory.newDocumentBuilder();
	            Document document = builder.parse(path + nameFile + ".xml");
	           
	            //Main Node
	            Element rootElement = document.getDocumentElement();
	            
	            	//Un elemento Tabla
	            	Element tablaElement = document.createElement("Tabla");
		            	//Nombre de la tabla
			            Element nameTNode = document.createElement("nombreTabla");
			            Text nameTNodeValue = document.createTextNode(tablaNueva.getNombre());
			            nameTNode.appendChild(nameTNodeValue);
			            tablaElement.appendChild(nameTNode);
			            for(int i=0; i<nombreCols.size(); i++)
			            {
			                //Item Node
			                Element columnNode = document.createElement("Columna");
			                	//Nodo nombreColumna
				                Element nameNode = document.createElement("NombreColumna");
				                Text nodeNameValue = document.createTextNode(nombreCols.get(i));
				                nameNode.appendChild(nodeNameValue);
				                columnNode.appendChild(nameNode);
				                
				                //Nodo tipoColumna
				                Element tipoNode = document.createElement("TipoColumna"); 
				                Text nodeTipoValue = document.createTextNode(tipoCols.get(i));                
				                tipoNode.appendChild(nodeTipoValue);
				                columnNode.appendChild(tipoNode);
			                tablaElement.appendChild(columnNode);
			                
			            }
			            rootElement.appendChild(tablaElement);
			            
	            //Generate XML
	            Source source = new DOMSource(document);
	            //Indicamos donde lo queremos almacenar
	            Result result = new StreamResult(new java.io.File(path + nameFile+".xml")); //nombre del archivo
	            Transformer transformer = TransformerFactory.newInstance().newTransformer();
	            transformer.transform(source, result);
	        }
    	}
    }
    
    
    
    
    /*
     * archivo de metadata para las bases de datos
     */
    public void generateMDDatabase(Database database) throws Exception
    { 
 
        try{
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            DOMImplementation implementation = builder.getDOMImplementation();
            
            Document document = implementation.createDocument(null, "metadataDB", null);
            document.setXmlVersion("1.0");
 
          //Main Node
            Element rootElement = document.getDocumentElement();
            
            	//Un elemento Database
            	Element databaseElement = document.createElement("Database");
	            	//Nombre de la database
		            Element nameDBNode = document.createElement("nombreDB");
		            Text nameDBNodeValue = document.createTextNode(database.getNombre());
		            nameDBNode.appendChild(nameDBNodeValue);
		            databaseElement.appendChild(nameDBNode);
		            
		            String nombreDB = database.getNombre();
		            File folder = new File("C:/Users/Sophia/Documents/DBMS/Bases de Datos/" + nombreDB);
		    		File[] listOfDB = folder.listFiles();
		    		Element cantTablasNode = document.createElement("cantidadTablas");
		    		Text cantTablasNodeValue = document.createTextNode(Integer.toString(listOfDB.length));
		    		cantTablasNode.appendChild(cantTablasNodeValue);
		    		databaseElement.appendChild(cantTablasNode);
		    		rootElement.appendChild(databaseElement);               
            //Generate XML
            Source source = new DOMSource(document);
            //Indicamos donde lo queremos almacenar
            Result result = new StreamResult(new java.io.File("C:/Users/Sophia/Documents/DBMS/Bases de Datos/metadataDB.xml")); //nombre del archivo
            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            transformer.transform(source, result);
        }
        catch(Exception e){
        	e.printStackTrace();
        }
    }
        
    public void createDatabaseXML(Database database){
    	try
    	{
    		File file = new File("C:/Users/Sophia/Documents/DBMS/Bases de Datos/metadataDB.xml");
        	if(!file.exists()){
        		generateMDDatabase(database);
        	}
        	else
        	{
        		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
                DocumentBuilder builder = factory.newDocumentBuilder();
                Document document = builder.parse("C:/Users/Sophia/Documents/DBMS/Bases de Datos/metadataDB.xml");
               
                //Main Node
                Element rootElement = document.getDocumentElement();
                //Un elemento Database
            	Element databaseElement = document.createElement("Database");
                	//Nombre de la database
    	            Element nameDBNode = document.createElement("nombreDB");
    	            Text nameDBNodeValue = document.createTextNode(database.getNombre());
    	            nameDBNode.appendChild(nameDBNodeValue);
    	            databaseElement.appendChild(nameDBNode);
    	            
    	            String nombreDB = database.getNombre();
    	            File folder = new File("C:/Users/Sophia/Documents/DBMS/Bases de Datos/" + nombreDB);
    	    		File[] listOfDB = folder.listFiles();
    	    		Element cantTablasNode = document.createElement("cantidadTablas");
    	    		Text cantTablasNodeValue = document.createTextNode(Integer.toString(listOfDB.length));
    	    		cantTablasNode.appendChild(cantTablasNodeValue);
    	    		databaseElement.appendChild(cantTablasNode);
    	    		rootElement.appendChild(databaseElement); 
    	    		
    	    		//Generate XML
    	            Source source = new DOMSource(document);
    	            //Indicamos donde lo queremos almacenar
    	            Result result = new StreamResult(new java.io.File("C:/Users/Sophia/Documents/DBMS/Bases de Datos/metadataDB.xml")); //nombre del archivo
    	            Transformer transformer = TransformerFactory.newInstance().newTransformer();
    	            transformer.transform(source, result);
        		
        	}
    	}
    	catch(Exception e){
    		e.printStackTrace();
    	}
        	
    }
        
 
    
    
    
    
    
    
    
    
    
    
    
    
    
    public void AddDatabaseXML(String pathDB, String nombreMetadata, Database dbnueva) throws Exception
    {
    	DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(pathDB+nombreMetadata+".xml");
        Element root = document.getDocumentElement();
            
        Element rootElement = document.getDocumentElement();
        
        Collection<Database> dbs = new ArrayList<Database>();
        dbs.add(new Database());
        
        for(Database i : dbs){
        	Element db = document.createElement("database");
        	rootElement.appendChild(db);
        	
        	Element nombre = document.createElement("nombreDB");
        	nombre.appendChild(document.createTextNode(i.getNombre()));
        	db.appendChild(nombre);
        	
        	Element cantTablas = document.createElement("cantidadTablas");
        	cantTablas.appendChild(document.createTextNode(Integer.toString(i.getTablas().size())));
        	db.appendChild(cantTablas);
        	
        	root.appendChild(db);
        }
        
        DOMSource source = new DOMSource(document);
        TransformerFactory tFactory = TransformerFactory.newInstance();
        Transformer transformer = tFactory.newTransformer();
        StreamResult result = new StreamResult(pathDB+nombreMetadata+".xml");
        transformer.transform(source, result);
    	
    	
        
        
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    }
}
 
