package com.entities;
// default package
// Generated 3/Mai/2014 21:44:14 by Hibernate Tools 4.0.0

import java.util.HashSet;
import java.util.Set;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * SensingData generated by hbm2java
 */
@Entity
@Table(name = "sensing_data", catalog = "camcof")
public class SensingData implements java.io.Serializable {

	private SensingDataId id;
	private UserProfile userProfile;
	private TransformationLevel transformationLevel;
	private MidlevelInformation midlevelInformation;
	private DataContext dataContext;
	private SensorNode sensorNode;
	private ClassificationTags classificationTags;
	private String timeCreation;
	private String description;
	private String resourceAddress;
	private Set<SensingDataValue> sensingDataValues = new HashSet<SensingDataValue>(
			0);

	public SensingData() {
	}

	public SensingData(SensingDataId id, UserProfile userProfile,
			TransformationLevel transformationLevel,
			MidlevelInformation midlevelInformation, DataContext dataContext,
			SensorNode sensorNode, ClassificationTags classificationTags) {
		this.id = id;
		this.userProfile = userProfile;
		this.transformationLevel = transformationLevel;
		this.midlevelInformation = midlevelInformation;
		this.dataContext = dataContext;
		this.sensorNode = sensorNode;
		this.classificationTags = classificationTags;
	}

	public SensingData(SensingDataId id, UserProfile userProfile,
			TransformationLevel transformationLevel,
			MidlevelInformation midlevelInformation, DataContext dataContext,
			SensorNode sensorNode, ClassificationTags classificationTags,
			String timeCreation, String description, String resourceAddress,
			Set<SensingDataValue> sensingDataValues) {
		this.id = id;
		this.userProfile = userProfile;
		this.transformationLevel = transformationLevel;
		this.midlevelInformation = midlevelInformation;
		this.dataContext = dataContext;
		this.sensorNode = sensorNode;
		this.classificationTags = classificationTags;
		this.timeCreation = timeCreation;
		this.description = description;
		this.resourceAddress = resourceAddress;
		this.sensingDataValues = sensingDataValues;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "idSensing", column = @Column(name = "idSensing", nullable = false)),
			@AttributeOverride(name = "sensorNodeIdSensorNode", column = @Column(name = "Sensor_node_idSensor_node", nullable = false)) })
	public SensingDataId getId() {
		return this.id;
	}

	public void setId(SensingDataId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "User_profile_idUser_profile", nullable = false)
	public UserProfile getUserProfile() {
		return this.userProfile;
	}

	public void setUserProfile(UserProfile userProfile) {
		this.userProfile = userProfile;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Transformation_level_idTransformation_level", nullable = false)
	public TransformationLevel getTransformationLevel() {
		return this.transformationLevel;
	}

	public void setTransformationLevel(TransformationLevel transformationLevel) {
		this.transformationLevel = transformationLevel;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Midlevel_information_idMidlevel_information", nullable = false)
	public MidlevelInformation getMidlevelInformation() {
		return this.midlevelInformation;
	}

	public void setMidlevelInformation(MidlevelInformation midlevelInformation) {
		this.midlevelInformation = midlevelInformation;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Data_context_idData_context", nullable = false)
	public DataContext getDataContext() {
		return this.dataContext;
	}

	public void setDataContext(DataContext dataContext) {
		this.dataContext = dataContext;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Sensor_node_idSensor_node", nullable = false, insertable = false, updatable = false)
	public SensorNode getSensorNode() {
		return this.sensorNode;
	}

	public void setSensorNode(SensorNode sensorNode) {
		this.sensorNode = sensorNode;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Classification_tags_idClassification_tags", nullable = false)
	public ClassificationTags getClassificationTags() {
		return this.classificationTags;
	}

	public void setClassificationTags(ClassificationTags classificationTags) {
		this.classificationTags = classificationTags;
	}

	@Column(name = "timeCreation", length = 45)
	public String getTimeCreation() {
		return this.timeCreation;
	}

	public void setTimeCreation(String timeCreation) {
		this.timeCreation = timeCreation;
	}

	@Column(name = "description", length = 45)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "resourceAddress", length = 45)
	public String getResourceAddress() {
		return this.resourceAddress;
	}

	public void setResourceAddress(String resourceAddress) {
		this.resourceAddress = resourceAddress;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "sensingData")
	public Set<SensingDataValue> getSensingDataValues() {
		return this.sensingDataValues;
	}

	public void setSensingDataValues(Set<SensingDataValue> sensingDataValues) {
		this.sensingDataValues = sensingDataValues;
	}

}