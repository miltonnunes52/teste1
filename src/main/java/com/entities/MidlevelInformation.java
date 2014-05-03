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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * MidlevelInformation generated by hbm2java
 */
@Entity
@Table(name = "midlevel_information", catalog = "camcof")
public class MidlevelInformation implements java.io.Serializable {

	private Integer idMidlevelInformation;
	private HighlevelInformation highlevelInformation;
	private DataContext dataContext;
	private String description;
	private String feature;
	private int highlevelInformationIdHighlevelInformation;
	private Set<SensingData> sensingDatas = new HashSet<SensingData>(0);

	public MidlevelInformation() {
	}

	public MidlevelInformation(DataContext dataContext,
			int highlevelInformationIdHighlevelInformation) {
		this.dataContext = dataContext;
		this.highlevelInformationIdHighlevelInformation = highlevelInformationIdHighlevelInformation;
	}

	public MidlevelInformation(HighlevelInformation highlevelInformation,
			DataContext dataContext, String description, String feature,
			int highlevelInformationIdHighlevelInformation,
			Set<SensingData> sensingDatas) {
		this.highlevelInformation = highlevelInformation;
		this.dataContext = dataContext;
		this.description = description;
		this.feature = feature;
		this.highlevelInformationIdHighlevelInformation = highlevelInformationIdHighlevelInformation;
		this.sensingDatas = sensingDatas;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "idMidlevel_information", unique = true, nullable = false)
	public Integer getIdMidlevelInformation() {
		return this.idMidlevelInformation;
	}

	public void setIdMidlevelInformation(Integer idMidlevelInformation) {
		this.idMidlevelInformation = idMidlevelInformation;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Highlevel-information_idHighlevel-information")
	public HighlevelInformation getHighlevelInformation() {
		return this.highlevelInformation;
	}

	public void setHighlevelInformation(
			HighlevelInformation highlevelInformation) {
		this.highlevelInformation = highlevelInformation;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Data_context_idData_context", nullable = false)
	public DataContext getDataContext() {
		return this.dataContext;
	}

	public void setDataContext(DataContext dataContext) {
		this.dataContext = dataContext;
	}

	@Column(name = "description", length = 45)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "feature", length = 45)
	public String getFeature() {
		return this.feature;
	}

	public void setFeature(String feature) {
		this.feature = feature;
	}

	@Column(name = "Highlevel-information_idHighlevel-information", nullable = false)
	public int getHighlevelInformationIdHighlevelInformation() {
		return this.highlevelInformationIdHighlevelInformation;
	}

	public void setHighlevelInformationIdHighlevelInformation(
			int highlevelInformationIdHighlevelInformation) {
		this.highlevelInformationIdHighlevelInformation = highlevelInformationIdHighlevelInformation;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "midlevelInformation")
	public Set<SensingData> getSensingDatas() {
		return this.sensingDatas;
	}

	public void setSensingDatas(Set<SensingData> sensingDatas) {
		this.sensingDatas = sensingDatas;
	}

}