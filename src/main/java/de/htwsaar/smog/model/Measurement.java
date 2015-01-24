package de.htwsaar.smog.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 
 * @author	Thomas Schoenfeld
 * @date	2015-01-24
 * @version	20150124_01
 * 
 * Class Measurement describes an entity representing a measurement collection inside the MongoDB.
 * (db name: smog, collection: measurements)
 *
 */
@Document(collection = "measurements")
public class Measurement {

	
	
	// attributes
	@Id
	private String id;
	private String dateUtc;
	private String dateLocal;
	private String timeUtc;
	private String timeLocal;
	private String location;
	private String hostname;
	private int value;

	
	
	//constructors
	
	/**
	 * Measurement class standard constructor
	 */
	public Measurement() {};

	/**
	 * Measurement class contructor
	 *  
	 * @param id			measurement id
	 * @param dateUtc		date of measurement in utc time
	 * @param dateLocal		date of measurement in local time
	 * @param timeUtc		time of measurement in utc time
	 * @param timeLocal		time of measurement in local time
	 * @param location		location name of sensor unit 
	 * @param hostname		hostname of sensor unit
	 * @param value			measurement value
	 */
	public Measurement(String id, String dateUtc, String dateLocal, String timeUtc, String timeLocal, String location, String hostname ,int value) {
		this.id			= id;
		this.dateUtc	= dateUtc;
		this.dateLocal	= dateLocal;
		this.timeUtc	= timeUtc;
		this.timeLocal	= timeLocal;
		this.location	= location;
		this.hostname	= hostname;
		this.value		= value;
	}
	
	/**
	 * Measurement class copy constructor
	 *  
	 * @param measurement	Measurement object to copy
	 */
	public Measurement(Measurement measurement) {
		this.id			= measurement.id;
		this.dateUtc	= measurement.dateUtc;
		this.dateLocal	= measurement.dateLocal;
		this.timeUtc	= measurement.timeUtc;
		this.timeLocal	= measurement.timeLocal;
		this.location	= measurement.location;
		this.hostname	= measurement.hostname;
		this.value		= measurement.value;
	}

	
	
	// getter and setter methods
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDateUtc() {
		return dateUtc;
	}

	public void setDateUtc(String dateUtc) {
		this.dateUtc = dateUtc;
	}

	public String getDateLocal() {
		return dateLocal;
	}

	public void setDateLocal(String dateLocal) {
		this.dateLocal = dateLocal;
	}

	public String getTimeUtc() {
		return timeUtc;
	}

	public void setTimeUtc(String timeUtc) {
		this.timeUtc = timeUtc;
	}

	public String getTimeLocal() {
		return timeLocal;
	}

	public void setTimeLocal(String timeLocal) {
		this.timeLocal = timeLocal;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getHostname() {
		return hostname;
	}

	public void setHostname(String hostname) {
		this.hostname = hostname;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	
	
	// the compulsive toString(), hashcode() and equals() methods
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Measurement [id=");
		builder.append(id);
		builder.append(", dateUtc=");
		builder.append(dateUtc);
		builder.append(", dateLocal=");
		builder.append(dateLocal);
		builder.append(", timeUtc=");
		builder.append(timeUtc);
		builder.append(", timeLocal=");
		builder.append(timeLocal);
		builder.append(", location=");
		builder.append(location);
		builder.append(", hostname=");
		builder.append(hostname);
		builder.append(", value=");
		builder.append(value);
		builder.append("]");
		return builder.toString();
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((dateLocal == null) ? 0 : dateLocal.hashCode());
		result = prime * result + ((dateUtc == null) ? 0 : dateUtc.hashCode());
		result = prime * result
				+ ((hostname == null) ? 0 : hostname.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result
				+ ((location == null) ? 0 : location.hashCode());
		result = prime * result
				+ ((timeLocal == null) ? 0 : timeLocal.hashCode());
		result = prime * result + ((timeUtc == null) ? 0 : timeUtc.hashCode());
		result = prime * result + value;
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Measurement))
			return false;
		Measurement other = (Measurement) obj;
		if (dateLocal == null) {
			if (other.dateLocal != null)
				return false;
		} else if (!dateLocal.equals(other.dateLocal))
			return false;
		if (dateUtc == null) {
			if (other.dateUtc != null)
				return false;
		} else if (!dateUtc.equals(other.dateUtc))
			return false;
		if (hostname == null) {
			if (other.hostname != null)
				return false;
		} else if (!hostname.equals(other.hostname))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (timeLocal == null) {
			if (other.timeLocal != null)
				return false;
		} else if (!timeLocal.equals(other.timeLocal))
			return false;
		if (timeUtc == null) {
			if (other.timeUtc != null)
				return false;
		} else if (!timeUtc.equals(other.timeUtc))
			return false;
		if (value != other.value)
			return false;
		return true;
	}

}
