
// import ANTLR's runtime libraries
import org.antlr.v4.runtime.*;
//import org.antlr.v4.runtime.tree.*;

public class Generador 
{
	Error errores = new Error();
	
	private ANTLRInputStream input;
	private GramaticaSQLLexer lexer;
	private CommonTokenStream tokens;
	private GramaticaSQLParser parser;
	
    public String verificar(String entrada) 
    {  
        input = new ANTLRInputStream(entrada);
        lexer = new GramaticaSQLLexer(input);
        lexer.removeErrorListeners();
        lexer.addErrorListener(errores);
        tokens = new CommonTokenStream(lexer);
        parser = new GramaticaSQLParser(tokens);
        parser.removeErrorListeners();
        parser.addErrorListener(errores);
        LogicaSQL logica = new LogicaSQL();
        String mensaje=logica.visit(parser.principal());
        return mensaje;  
    }
}