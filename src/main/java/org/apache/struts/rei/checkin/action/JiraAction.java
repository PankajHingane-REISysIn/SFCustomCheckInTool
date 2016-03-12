package org.apache.struts.rei.checkin.action;

import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts.rei.checkin.jira.JIRAConnection;
import org.apache.struts.rei.checkin.jira.TicketHelper;
import org.apache.struts.rei.checkin.model.JiraTicket;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;
import com.sforce.ws.ConnectionException;

public class JiraAction extends ActionSupport implements Preparable,SessionAware {
	private Map<String, Object> sessionMap;
	private List jiraTickets;
	private String selectedJiraTicket;
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
	
	public String getJiraTicketList() throws URISyntaxException, Exception {
		jiraTickets = new ArrayList<JiraTicket>();
		JiraTicket j = new  JiraTicket();
		JIRAConnection jira = new JIRAConnection("pankaj.hingane", "Ved@123.com");
		jiraTickets = new TicketHelper(jira.getConnection()).getOpenTicketList("State of MA - Internal", "pankaj.hingane");
		jiraTickets.add(j);
		return SUCCESS;
	}



	/**
	 * @return the jiraTickets
	 */
	public List getJiraTickets() {
		return jiraTickets;
	}



	/**
	 * @param jiraTickets the jiraTickets to set
	 */
	public void setJiraTickets(List jiraTickets) {
		this.jiraTickets = jiraTickets;
	}



	/**
	 * @return the selectedJiraTicket
	 */
	public String getSelectedJiraTicket() {
		return selectedJiraTicket;
	}



	/**
	 * @param selectedJiraTicket the selectedJiraTicket to set
	 */
	public void setSelectedJiraTicket(String selectedJiraTicket) {
		this.selectedJiraTicket = selectedJiraTicket;
	}

}
