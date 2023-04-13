package your.org.myapp.internal;

import java.awt.Component;

import javax.swing.Icon;
import javax.swing.JPanel;
import org.cytoscape.application.swing.CytoPanelComponent;
import org.cytoscape.application.swing.CytoPanelName;
import javax.swing.JLabel;

public class MyCytoPanel extends JPanel implements CytoPanelComponent {

	 private static final long serialVersionUID = 1L;
	 private JLabel label;

	 public MyCytoPanel() {
	        label = new JLabel("Hello World!");
	        add(label);
	    }

	 @Override
	    public String getComponentName() {
	        return "My Panel";
	    }

	 @Override
	    public CytoPanelName getCytoPanelName() {
	        return CytoPanelName.EAST;
	    }

	 @Override
	    public String getTitle() {
	        return "My Panel";
	    }

	 @Override
	    public javax.swing.Icon getIcon() {
	        return null;
	    }
}