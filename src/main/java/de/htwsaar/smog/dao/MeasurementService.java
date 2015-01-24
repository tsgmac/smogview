package de.htwsaar.smog.dao;

import java.util.List;

import de.htwsaar.smog.model.Measurement;

/**
 * @author	Thomas Schoenfeld
 * @date	2015-01-24
 * @version	20150124_01
 * 
 * Interface MeasurementService for Entity Manager class MongoDBMeasurementService
 *
 */
public interface MeasurementService {
	
	/**
	 * Finds a measurement by its id.
	 * 
	 * @param id	id of the searched measurement 
	 * @return		the searched measurement
	 */
	Measurement findById(String id);	
	
	/**
	 * Provides all measurements inside the database.
	 * 
	 * @return		all measurements inside the database
	 */
	List<Measurement> findAll();	

}
