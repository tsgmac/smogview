/**
 * 
 */
package de.htwsaar.smog.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import de.htwsaar.smog.dao.MeasurementRepository;
import de.htwsaar.smog.dao.MeasurementService;
import de.htwsaar.smog.exceptions.MeasurementNotFoundException;
import de.htwsaar.smog.model.Measurement;

/**
 * @author	Thomas Schoenfeld
 * @date	2015-01-24
 * @version	20150124_01
 *
 * Class RestApiHandler implements the REST API. 
 */
@RestController
public class RestApiHandler extends AbstractRestHandler {

	//Dependency Injection:
	
	@Autowired
	private MeasurementService		measurementService;
	
	@Autowired
	private MeasurementRepository 	measurementRepository;
	
	@Autowired
	private MongoTemplate			mongoTemplate;
	
	@RequestMapping("all")
	public @ResponseBody List<Measurement> findAll() {
		List<Measurement> results = measurementRepository.findAll();
		return results;
	}
	
	@ExceptionHandler
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public void handleSampleNotFound(MeasurementNotFoundException ex) {}
}
