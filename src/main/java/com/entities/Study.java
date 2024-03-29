package com.entities;
// default package
// Generated 3/Mai/2014 21:44:14 by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Study generated by hbm2java
 */
@Entity
@Table(name = "study", catalog = "camcof")
public class Study implements java.io.Serializable {

	private Integer idStudy;
	private DataContext dataContext;
	private String description;
	private String context;
	private String elements;
	private String timeCreation;

	public Study() {
	}

	public Study(DataContext dataContext) {
		this.dataContext = dataContext;
	}

	public Study(DataContext dataContext, String description, String context,
			String elements, String timeCreation) {
		this.dataContext = dataContext;
		this.description = description;
		this.context = context;
		this.elements = elements;
		this.timeCreation = timeCreation;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "idStudy", unique = true, nullable = false)
	public Integer getIdStudy() {
		return this.idStudy;
	}

	public void setIdStudy(Integer idStudy) {
		this.idStudy = idStudy;
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

	@Column(name = "context", length = 45)
	public String getContext() {
		return this.context;
	}

	public void setContext(String context) {
		this.context = context;
	}

	@Column(name = "elements", length = 45)
	public String getElements() {
		return this.elements;
	}

	public void setElements(String elements) {
		this.elements = elements;
	}

	@Column(name = "timeCreation", length = 45)
	public String getTimeCreation() {
		return this.timeCreation;
	}

	public void setTimeCreation(String timeCreation) {
		this.timeCreation = timeCreation;
	}

}
