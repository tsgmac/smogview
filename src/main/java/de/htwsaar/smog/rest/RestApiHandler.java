/**
 * 
 */
package de.htwsaar.smog.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
@RequestMapping("/measurements")
public class RestApiHandler extends AbstractRestHandler {

	//Dependency Injection:
	
	@Autowired
	private MeasurementService		measurementService;
	
	@Autowired
	private MeasurementRepository 	measurementRepository;
	
	@Autowired
	private MongoTemplate			mongoTemplate;
	
	@RequestMapping(value = "utcdate/{dateUtc}", method = RequestMethod.GET)
	public @ResponseBody List<Measurement> findByDateUtc(@PathVariable("dateUtc") String dateUtc) {
		return this.measurementRepository.findByDateUtc(dateUtc);
	}	
	
	@RequestMapping(value = "localdate/{dateLocal}", method = RequestMethod.GET)
	public @ResponseBody List<Measurement> findByDateLocal(@PathVariable("dateLocal") String dateLocal) {
		return this.measurementRepository.findByDateLocal(dateLocal);
	}	

	@RequestMapping(value = "utctime/{timeUtc}", method = RequestMethod.GET)
	public @ResponseBody List<Measurement> findByTimeUtc(@PathVariable("timeUtc") String timeUtc) {
		return this.measurementRepository.findByTimeUtc(timeUtc);
	}
	
	@RequestMapping(value = "localtime/{timeLocal}", method = RequestMethod.GET)
	public @ResponseBody List<Measurement> findByTimeLocal(@PathVariable("timeLocal") String timeLocal) {
		return this.measurementRepository.findByTimeLocal(timeLocal);
	}

	@RequestMapping(value = "location/{location}", method = RequestMethod.GET)
	public @ResponseBody List<Measurement> findByLocation(@PathVariable("location") String location) {
		return this.measurementRepository.findByLocation(location);
	}	
	
	@RequestMapping(value = "hostname/{hostname}", method = RequestMethod.GET)
	public @ResponseBody List<Measurement> findHostname(@PathVariable("hostname") String hostname) {
		return this.measurementRepository.findByHostname(hostname);
	}
	
	@RequestMapping("all")
	public @ResponseBody List<Measurement> findAll() {
		return this.measurementRepository.findAll();
	}	
	
	@ExceptionHandler
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public void handleSampleNotFound(MeasurementNotFoundException ex) {}
}
