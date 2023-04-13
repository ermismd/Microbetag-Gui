package your.org.myapp.internal;

import java.awt.event.ActionEvent;

import org.cytoscape.application.swing.AbstractCyAction;
import org.cytoscape.application.swing.CySwingApplication;
import org.cytoscape.application.swing.CytoPanel;
import org.cytoscape.application.swing.CytoPanelName;
import org.cytoscape.application.swing.CytoPanelState;

public class MyCytoPanelAction extends AbstractCyAction {

	 private static final long serialVersionUID = 1L;
	 private CySwingApplication desktopApp;
	 private MyCytoPanel myPanel;

	 public MyCytoPanelAction(CySwingApplication desktopApp, MyCytoPanel myPanel) {
	        super("Show/Hide My Panel");
	        this.desktopApp = desktopApp;
	        this.myPanel = myPanel;
	    }

	

	 @Override
	    public void actionPerformed(ActionEvent e) {
	        CytoPanel cytoPanel = desktopApp.getCytoPanel(CytoPanelName.EAST);
	        if (cytoPanel.indexOfComponent(myPanel) < 0) {
	            cytoPanel.add("My Panel", myPanel);
	        }
	        cytoPanel.setSelectedIndex(cytoPanel.indexOfComponent(myPanel));
	    }
	}
