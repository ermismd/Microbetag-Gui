package your.org.myapp.internal;

import java.util.Properties;

import org.cytoscape.application.swing.CyAction;
import org.cytoscape.application.swing.CySwingApplication;
import org.cytoscape.application.swing.CytoPanelComponent;
import org.cytoscape.service.util.AbstractCyActivator;
import org.osgi.framework.BundleContext;

public class CyActivator extends AbstractCyActivator {
	public CyActivator() {
		super();
	}

	@Override
	public void start(BundleContext bc) {
		CySwingApplication cytoscapeDesktopService = getService(bc, CySwingApplication.class);

		MyCytoPanel myPanel = new MyCytoPanel();
		MyCytoPanelAction cytopanelaction = new MyCytoPanelAction(cytoscapeDesktopService, myPanel);

		registerService(bc, myPanel, CytoPanelComponent.class, new Properties());
		registerService(bc, cytopanelaction, CyAction.class, new Properties());

	}
}
