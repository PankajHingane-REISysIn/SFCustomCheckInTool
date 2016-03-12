package org.apache.struts.rei.checkin.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts.rei.checkin.model.Project;
import org.apache.struts.rei.checkin.service.TestSF;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;
import com.sforce.soap.partner.PartnerConnection;
import com.sforce.ws.ConnectionException;

public class ProjectAction extends ActionSupport implements Preparable,SessionAware {
	private Map<String, Object> sessionMap;
	private List Projects;
	private String lastUsedProject;
    /**
     * 
     * 
     * 
     * @throws Exception 
     */
    @Override
    public void prepare() throws Exception {
    }
    
    
    
    /**
     */
    public String saveLastUsedProject() {
		return SUCCESS;
    }


	@Override
	public void setSession(Map<String, Object> arg0) {
		// TODO Auto-generated method stub
		this.sessionMap = arg0;
	}
	
	public String getProjectList() throws ConnectionException {
		Projects = new ArrayList<Project>();
		PartnerConnection forceDelegate = (PartnerConnection)sessionMap.get("pmoConnection");
		System.out.println("========forceDelegate:" + forceDelegate);
		TestSF testSF = new TestSF(forceDelegate);
		lastUsedProject = testSF.getLastUsedProjectId();
		if(lastUsedProject == null || lastUsedProject.isEmpty()){
			Projects = testSF.getActiveProjects();
		}
		return SUCCESS;
	}



	/**
	 * @return the projects
	 */
	public List getProjects() {
		return Projects;
	}



	/**
	 * @param projects the projects to set
	 */
	public void setProjects(List projects) {
		Projects = projects;
	}



	/**
	 * @return the lastUsedProject
	 */
	public String getLastUsedProject() {
		return lastUsedProject;
	}



	/**
	 * @param lastUsedProject the lastUsedProject to set
	 */
	public void setLastUsedProject(String lastUsedProject) {
		this.lastUsedProject = lastUsedProject;
	}

}
