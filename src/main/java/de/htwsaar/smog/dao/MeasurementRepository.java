package de.htwsaar.smog.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import de.htwsaar.smog.model.Measurement;

/**
 * @author Thomas Schoenfeld
 * @date 2015-01-24
 * @version 20150124_01
 * 
 *          Interface MeasurementRepository for Entity Manager class
 *          MongoDBMeasurementService
 *
 */
public interface MeasurementRepository extends Repository<Measurement, String> {

	/**
	 * Finds a measurement by its id.
	 * 
	 * @param id
	 *            id of the searched measurement
	 * @return the searched measurement
	 */
	Measurement findById(@Param("id") String id);

	/**
	 * Finds all measurements of a certain utc date.
	 * 
	 * @param dateUtc	searched utc date
	 * @return			measurements of the searched utc date
	 */
	List<Measurement> findByDateUtc(String dateUtc);
	
	/**
	 * Finds all measurements of a certain local date.
	 * 
	 * @param dateLocal	searched local date
	 * @return			measurements of the searched local date
	 */
	List<Measurement> findByDateLocal(String dateLocal);		
	
	/**
	 * Finds all measurements of a certain utc time
	 * 
	 * @param timeUtc	searched utc time
	 * @return			measurements of the searched utc time
	 */
	List<Measurement> findByTimeUtc(String timeUtc);
	
	/**
	 * Finds all measurements of a certain local time
	 * 
	 * @param timeLocal	searched local time
	 * @return			measurements of the searched local time
	 */
	List<Measurement> findByTimeLocal(String timeLocal);
	
	/**
	 * Finds all measurements of a certain location.
	 * 
	 * @param location
	 *            searched location
	 * @return measurements of the searched location
	 */
	List<Measurement> findByLocation(String location);

	/**
	 * Finds all measurements of a certain host identified by its hostname.
	 * 
	 * @param hostname
	 *            searched hostname
	 * @return measurements of the searched hostname
	 */
	List<Measurement> findByHostname(@Param("hostname") String hostname);

	/**
	 * Provides all measurements inside the database.
	 * 
	 * @return all measurements inside the database
	 */
	List<Measurement> findAll();

	Optional<Measurement> findOne(String value);

}
