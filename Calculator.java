package start;
import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;



public class Calculator {
  	public  Object test(String val, int operation) throws Exception{
	    ScriptEngineManager mgr = new ScriptEngineManager();
	    ScriptEngine engine = mgr.getEngineByName("JavaScript");

	    Object result = "";
	    try{
	    	if(operation==1){
	    		result = new Float(engine.eval(val).toString())/100;
	    	}
	    	else if(operation == 2){
	    		result = Math.sqrt(new Float(engine.eval(val).toString()));
	    	}
	    	else{
	    		result = engine.eval(val);
	    	}
	    		
	    }
	    catch(Exception e){
	    	result = "";
	    }
	    return result;
    } 
}
