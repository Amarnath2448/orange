package com.hrms.testscripts;
import com.hrms.lib.General;
public class TC002 {
public static void main(String args[]) {
General obj =new General();
obj.openApplication();
obj.login();
obj.enterFrame();
obj.addNewEmp();
obj.exitFrame();
obj.logout();
obj.closeApplication();

	
}
}
