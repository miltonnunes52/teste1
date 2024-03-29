package com.entities;
// default package
// Generated 3/Mai/2014 21:44:14 by Hibernate Tools 4.0.0

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * SensingDataValue generated by hbm2java
 */
@Entity
@Table(name = "sensing_data_value", catalog = "camcof")
public class SensingDataValue implements java.io.Serializable {

	private Integer idSensingDataValue;
	private SensingData sensingData;
	private String valueAddress;
	private String value;
	private Set<ValueUnits> valueUnitses = new HashSet<ValueUnits>(0);

	public SensingDataValue() {
	}

	public SensingDataValue(SensingData sensingData) {
		this.sensingData = sensingData;
	}

	public SensingDataValue(SensingData sensingData, String valueAddress,
			String value, Set<ValueUnits> valueUnitses) {
		this.sensingData = sensingData;
		this.valueAddress = valueAddress;
		this.value = value;
		this.valueUnitses = valueUnitses;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "idSensing_data_value", unique = true, nullable = false)
	public Integer getIdSensingDataValue() {
		return this.idSensingDataValue;
	}

	public void setIdSensingDataValue(Integer idSensingDataValue) {
		this.idSensingDataValue = idSensingDataValue;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "Sensing_idSensing", referencedColumnName = "idSensing", nullable = false),
			@JoinColumn(name = "Sensing_idSensor_node", referencedColumnName = "Sensor_node_idSensor_node", nullable = false) })
	public SensingData getSensingData() {
		return this.sensingData;
	}

	public void setSensingData(SensingData sensingData) {
		this.sensingData = sensingData;
	}

	@Column(name = "value_address", length = 45)
	public String getValueAddress() {
		return this.valueAddress;
	}

	public void setValueAddress(String valueAddress) {
		this.valueAddress = valueAddress;
	}

	@Column(name = "value", length = 45)
	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "sensingDataValue")
	public Set<ValueUnits> getValueUnitses() {
		return this.valueUnitses;
	}

	public void setValueUnitses(Set<ValueUnits> valueUnitses) {
		this.valueUnitses = valueUnitses;
	}

}
