/**
 * 
 */
package de.htwsaar.smog.exceptions;

/**
 * @author	Thomas Schoenfeld
 * @date	2015-01-24
 * @version	20150124_01
 *
 * To be thrown when a searched measurement was not found.
 */
public class MeasurementNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 3829454129329591223L;
	
	public MeasurementNotFoundException() {
		throw new RuntimeException("No measurements found!\n");
	}
	
	public MeasurementNotFoundException(String id) {
		throw new RuntimeException("Measurement with ID " + id + " not found!\n");
	}

}
