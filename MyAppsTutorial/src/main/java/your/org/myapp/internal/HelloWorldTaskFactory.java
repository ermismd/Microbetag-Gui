package your.org.myapp.internal;

import org.cytoscape.work.AbstractTaskFactory;
import org.cytoscape.work.TaskIterator;

import org.cytoscape.model.CyNetworkFactory;
import org.cytoscape.model.CyNetworkManager;

import org.cytoscape.session.CyNetworkNaming;
import org.cytoscape.view.model.CyNetworkViewFactory;
import org.cytoscape.view.model.CyNetworkViewManager;

public class HelloWorldTaskFactory extends AbstractTaskFactory {

    private final CyNetworkManager helloworldtaskmanager;
	private final CyNetworkFactory helloworldtaskfactory;
	private final CyNetworkNaming nameU; 
	
	private final CyNetworkViewFactory networkView;
	private final CyNetworkViewManager networkViewManager;
	
	    public HelloWorldTaskFactory(final CyNetworkManager helloworldtaskmanager, 
	    		final CyNetworkNaming nameU, 
                final CyNetworkFactory helloworldtaskfactory,
                final CyNetworkViewFactory networkView,
                final CyNetworkViewManager networkViewManager) {
	    	
            this.helloworldtaskmanager = helloworldtaskmanager;
		    this.nameU = nameU;
		    this.helloworldtaskfactory = helloworldtaskfactory;
		    this.networkViewManager=networkViewManager;	
		    this.networkView=networkView;
	    }
	

        public TaskIterator createTaskIterator() {
            return new TaskIterator(new HelloWorldTask(helloworldtaskmanager, nameU, helloworldtaskfactory,networkView,networkViewManager)); // Fill in task iterator here
        }

        public boolean isReady() {
            // Return whether the factory is ready to create tasks or not
            return true;
        }
}
    