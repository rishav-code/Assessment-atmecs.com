package com.atmecs.assessment.testscripts;

import org.testng.annotations.Test;

import com.atmecs.assessment.constant.log.ValidateData;
import com.atmecs.assessment.constant.testbase.TestBase;
import com.atmecs.assessment.pages.ContextMenu;
import com.atmecs.assessment.validations.ContextMenuValidate;

public class ContextMenuScripts extends TestBase{
	ContextMenu contextmenu = new ContextMenu();
	ContextMenuValidate contextmenuvalidate = new ContextMenuValidate();
	ValidateData vd = new ValidateData();
	
	@Test
	public void contextMenuFlow() {
		contextmenu.mouseonService();
		contextmenuvalidate.servicetMenuValidate();
		
		
		contextmenu.mouseonDigitalLife();
		contextmenuvalidate.digitalLifeMenuValidate();
		contextmenu.mouseonInfraStructur();
		contextmenuvalidate.infastructureMenuValidate();
		
	}

}
