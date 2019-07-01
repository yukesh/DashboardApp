package com.project.dashboard.model;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Project {

	private String projectNumber;
	private String projectName;
	private String projectDescription;
	private String uinNumber;
	private String initNumber;
	private String projectType;
	private String ProjectStatus;
	private Calendar kickOffDt;
	private Calendar implementationDt;
	private List<String> productsInvolved;
	private List<String> teamInvolved;
	private List<String> clientsInvolved;
	private List<String> servicesInvolved;

	public String getProjectNumber() {
		return projectNumber;
	}

	public void setProjectNumber(String projectNumber) {
		this.projectNumber = projectNumber;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getProjectDescription() {
		return projectDescription;
	}

	public void setProjectDescription(String projectDescription) {
		this.projectDescription = projectDescription;
	}

	public String getUinNumber() {
		return uinNumber;
	}

	public void setUinNumber(String uinNumber) {
		this.uinNumber = uinNumber;
	}

	public String getInitNumber() {
		return initNumber;
	}

	public void setInitNumber(String initNumber) {
		this.initNumber = initNumber;
	}

	public String getProjectType() {
		return projectType;
	}

	public void setProjectType(String projectType) {
		this.projectType = projectType;
	}

	public String getProjectStatus() {
		return ProjectStatus;
	}

	public void setProjectStatus(String projectStatus) {
		ProjectStatus = projectStatus;
	}

	public Calendar getKickOffDt() {
		return kickOffDt;
	}

	public void setKickOffDt(Calendar kickOffDt) {
		this.kickOffDt = kickOffDt;
	}

	public Calendar getImplementationDt() {
		return implementationDt;
	}

	public void setImplementationDt(Calendar implementationDt) {
		this.implementationDt = implementationDt;
	}

	public List<String> getProductsInvolved() {
		if(null == productsInvolved) {
			productsInvolved = new ArrayList<String>();
		}
		return productsInvolved;
	}

	public void setProductsInvolved(List<String> productsInvolved) {
		this.productsInvolved = productsInvolved;
	}

	public List<String> getTeamInvolved() {
		if(null == teamInvolved) {
			teamInvolved = new ArrayList<String>();
		}
		return teamInvolved;
	}

	public void setTeamInvolved(List<String> teamInvolved) {
		this.teamInvolved = teamInvolved;
	}

	public List<String> getClientsInvolved() {
		if(null == clientsInvolved) {
			clientsInvolved = new ArrayList<String>();
		}
		return clientsInvolved;
	}

	public void setClientsInvolved(List<String> clientsInvolved) {
		this.clientsInvolved = clientsInvolved;
	}

	public List<String> getServicesInvolved() {
		if(null == servicesInvolved) {
			servicesInvolved = new ArrayList<String>();
		}
		return servicesInvolved;
	}

	public void setServicesInvolved(List<String> servicesInvolved) {
		this.servicesInvolved = servicesInvolved;
	}

}
