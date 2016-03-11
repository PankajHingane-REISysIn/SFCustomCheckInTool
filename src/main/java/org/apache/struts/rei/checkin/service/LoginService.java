package org.apache.struts.rei.checkin.service;

import java.io.FileNotFoundException;

import org.apache.struts.rei.checkin.model.Login;

import com.sforce.soap.partner.PartnerConnection;
import com.sforce.ws.ConnectionException;;
public class LoginService {
	
	public PartnerConnection LoginToPMO(Login login) throws FileNotFoundException, ConnectionException {
//		ForceDelegate forceDelegate;// = ForceDelegate.login(login.getUserName(), login.getPassword(), false, 26.0);
//		 todo - check orgnization Id
//		forceDelegate = ForceDelegate.login("gg.prod");
//		List lst = forceDelegate.queryMultiple("select.pmo.user");
//		if(lst.size() > 0) {
//			return forceDelegate;
//		}
//		return null;
		TestSF testSF = new TestSF();
		testSF.connectToSF(login);
		if(testSF.validePMOOrg()) {
			return testSF.getPartnerConnection();
		}
		return null;
	}
	
	public static void main(String str[]) throws Exception {
		LoginService l = new LoginService();
		Login l1 =new Login();
		l1.setUserName("shah@force.pmo");
		l1.setPassword("2Amange1");
		l.LoginToPMO(l1);
	}

}
