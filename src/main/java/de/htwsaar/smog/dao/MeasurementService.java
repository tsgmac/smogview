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
	 * @param id		id of the searched measurement 
	 * @return			the searched measurement
	 */
	Measurement findById(String id);
	
	/**
	 * Finds all measurements of a certain host identified by its hostname.
	 * 
	 * @param hostname	searched hostname
	 * @return			the searched hostname
	 */
	List<Measurement> findByHostname(String hostname);
	
	/**
	 * Provides all measurements inside the database.
	 * 
	 * @return			all measurements inside the database
	 */
	List<Measurement> findAll();	

}
