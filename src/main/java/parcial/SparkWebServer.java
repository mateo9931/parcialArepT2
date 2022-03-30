package parcial;
import static spark.Spark.*;

import parcial.dto.ResponseDTO;
import service.*;
import com.fasterxml.jackson.databind.ObjectMapper; 
import com.fasterxml.jackson.databind.ObjectWriter; 

public class SparkWebServer {
    
	 public static void main(String[] args) {
		 
	        port(getPort());

	        get("/sin",(req,res)-> {
	        	ResponseDTO response = new ResponseDTO();
	        	response.setOperation("sin");
	            Calculator calculadora = new Calculatorimpl();
	            Double result =calculadora.sin(Double.parseDouble(req.queryParams("value")));
	            response.setInput(req.queryParams("value"));
	            response.setOutput(result+"");
	            ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
	            String json = ow.writeValueAsString(response);
	            return json;
	            
	        });

	        get("/ln",(req,res)-> {
	        	ResponseDTO response = new ResponseDTO();
	        	response.setOperation("logaritmo natural");
	        	Calculator calculadora = new Calculatorimpl();
	            Double result =calculadora.logaritmoNatural(Double.parseDouble(req.queryParams("value")));
	            response.setInput(req.queryParams("value"));
	            response.setOutput(result+"");
	            ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
	            String json = ow.writeValueAsString(response);
	            return json;
	        });
	    }

    private static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }
    
}