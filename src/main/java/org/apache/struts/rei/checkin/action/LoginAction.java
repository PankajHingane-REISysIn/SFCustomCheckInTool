package org.apache.struts.rei.checkin.action;

import java.io.FileNotFoundException;
import java.util.Map;

import org.apache.struts.rei.checkin.model.Login;
import org.apache.struts.rei.checkin.service.LoginService;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;
import com.sforce.soap.partner.PartnerConnection;
import com.sforce.ws.ConnectionException;

public class LoginAction extends ActionSupport implements Preparable,SessionAware {
	private Login login;
	private Map<String, Object> sessionMap;

    /**
     * 
     * 
     * 
     * @throws Exception 
     */
    @Override
    public void prepare() throws Exception {
    	login = new Login();
    	login.setUserName("Pankaj");
    	login.setPassword("Pankaj");
    }
    
    /**
     * @throws ConnectionException 
     * @throws FileNotFoundException 
     */
    public String login() throws FileNotFoundException, ConnectionException {
    	PartnerConnection forceDelegate;
		//try {
			forceDelegate = new LoginService().LoginToPMO(login);
			sessionMap.put("pmoConnection", forceDelegate);
			//sessionMap.put("sessionKey", forceDelegate.getSessionHeader().getSessionId());
			//sessionMap.put("userName", forceDelegate.getUserInfo().getUserName());
			System.out.println("sessionMap=======" + sessionMap);
			if(forceDelegate!= null) {
				return SUCCESS;
			} else {
				return SUCCESS;
			}
		/*} catch (ConnectionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			addActionError(e.getMessage());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			addActionError(e.getMessage());
			e.printStackTrace();
		}*/
    }

	/**
	 * @return the login
	 */
	public Login getLogin() {
		return login;
	}

	/**
	 * @param login the login to set
	 */
	public void setLogin(Login login) {
		this.login = login;
	}

	@Override
	public void setSession(Map<String, Object> arg0) {
		// TODO Auto-generated method stub
		this.sessionMap = arg0;
	}

}
