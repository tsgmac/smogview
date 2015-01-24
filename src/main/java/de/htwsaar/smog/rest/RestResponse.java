package de.htwsaar.smog.rest;

/**
* @author	Thomas Schoenfeld
* @date	2015-01-24
* @version	20150124_01
* 
* Class RestResponse returns REST status information.
*/
public class RestResponse {

	private String message;
	private String error;
	
	public RestResponse(String message, String error) {
		this.message	= message;
		this.error		= error;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("RestResponse [message=");
		builder.append(message);
		builder.append(", error=");
		builder.append(error);
		builder.append("]");
		return builder.toString();
	}
	
}