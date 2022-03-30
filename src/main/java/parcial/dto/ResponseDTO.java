package parcial.dto;

public class ResponseDTO {

	
	private String operation;
	private String input;
	private String output;
	
	
	public String getOperation() {
		return operation;
	}
	public void setOperation(String operation) {
		this.operation = operation;
	}
	public String getInput() {
		return input;
	}
	public void setInput(String input) {
		this.input = input;
	}
	public String getOutput() {
		return output;
	}
	public void setOutput(String output) {
		this.output = output;
	}
	
	
	
	@Override
	public String toString() {
		return "ResponseDTO [operation=" + operation + ", input=" + input + ", output=" + output + "]";
	}
	
	
	
}
