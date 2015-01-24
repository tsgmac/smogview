package de.htwsaar.smog.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import de.htwsaar.smog.model.Measurement;

/**
 * @author	Thomas Schoenfeld
 * @date	2015-01-24
 * @version	20150124_01
 * 
 * Interface MeasurementRepository for Entity Manager class MongoDBMeasurementService
 *
 */
public interface MeasurementRepository extends Repository<Measurement, String> {

	/**
	 * Finds a measurement by its id.
	 * 
	 * @param id	id of the searched measurement 
	 * @return		the searched measurement
	 */
	Measurement findById(@Param("id") String id);	
	
	/**
	 * Provides all measurements inside the database.
	 * 
	 * @return		all measurements inside the database
	 */
	List<Measurement> findAll();
	
	Optional<Measurement> findOne(String id);
	
}
