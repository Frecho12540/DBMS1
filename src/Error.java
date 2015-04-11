import java.util.BitSet;

import org.antlr.v4.runtime.ANTLRErrorListener;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;



public class Error implements ANTLRErrorListener 
{	
	boolean error = false;
	String errorString = "";

	public boolean isError() 
	{
		return error;
	}

	public void setError(boolean error)
	{
		this.error = error;
	}

	public String getErrorString() 
	{
		return errorString;
	}

	public void setErrorString(String errorString) 
	{
		this.errorString = errorString;
	}

	@Override
	public void reportAmbiguity(Parser arg0, DFA arg1, int arg2, int arg3,boolean arg4, BitSet arg5, ATNConfigSet arg6)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void reportAttemptingFullContext(Parser arg0, DFA arg1, int arg2,int arg3, BitSet arg4, ATNConfigSet arg5) 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void reportContextSensitivity(Parser arg0, DFA arg1, int arg2,int arg3, int arg4, ATNConfigSet arg5) 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void syntaxError(Recognizer<?, ?> arg0, Object arg1, int arg2,int arg3, String arg4, RecognitionException arg5)
	{
		error = true;
		errorString = "Linea " + arg2 + " en la posicion " + arg3 + ". Error " + arg4;
		// TODO Auto-generated method stub
		
	}

}
