/**
 * 
 */
package de.htwsaar.smog.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import de.htwsaar.smog.exceptions.MeasurementNotFoundException;
import de.htwsaar.smog.model.Measurement;

/**
 * @author	Thomas Schoenfeld
 * @date	2015-01-24
 * @version	20150124_01
 *
 */
@Service
public class MongoDBMeasurementService implements MeasurementService {

	@Autowired
	private MeasurementRepository repo;
	
	/* (non-Javadoc)
	 * @see de.htwsaar.smog.dao.MeasurementService#findById(java.lang.String)
	 */
	@Override
	public Measurement findById(String id) {
		Measurement measurement = this.findMeasurementByValue(id);
		return measurement;
	}

	/* (non-Javadoc)
	 * @see de.htwsaar.smog.dao.MeasurementService#findHostname()
	 */
	@Override
	public List<Measurement> findByHostname(String hostname) {
		
		List<Measurement> measurements = repo.findByHostname(hostname);
		
		if (measurements.isEmpty()) {
			throw new MeasurementNotFoundException();
		}
		
		return measurements;
	}
	
	/* (non-Javadoc)
	 * @see de.htwsaar.smog.dao.MeasurementService#findAll()
	 */
	@Override
	public List<Measurement> findAll() {
		
		List<Measurement> measurements = repo.findAll();
		
		if (measurements.isEmpty()) {
			throw new MeasurementNotFoundException();
		}
		
		return measurements;
	}
	
	// provides exception handling in functional Java 1.8 style
	private Measurement findMeasurementByValue(String value) {
		Optional<Measurement> result = repo.findOne(value);
		return result.orElseThrow(() -> new MeasurementNotFoundException(value));
	}
	
}
