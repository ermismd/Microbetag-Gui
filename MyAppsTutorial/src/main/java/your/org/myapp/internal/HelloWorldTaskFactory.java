package your.org.myapp.internal;

import org.cytoscape.work.AbstractTaskFactory;
import org.cytoscape.work.TaskIterator;

import org.cytoscape.model.CyNetworkFactory;
import org.cytoscape.model.CyNetworkManager;

import org.cytoscape.session.CyNetworkNaming;

public class HelloWorldTaskFactory extends AbstractTaskFactory {

    private final CyNetworkManager helloworldtaskmanager;
	private final CyNetworkFactory helloworldtaskfactory;
	private final CyNetworkNaming nameU; 
	
	    public HelloWorldTaskFactory(final CyNetworkManager helloworldtaskmanager, 
                                     final CyNetworkNaming nameU, 
                                     final CyNetworkFactory helloworldtaskfactory) {
            this.helloworldtaskmanager = helloworldtaskmanager;
		    this.nameU = nameU;
		    this.helloworldtaskfactory = helloworldtaskfactory;
	    }
	

        public TaskIterator createTaskIterator() {
            return new TaskIterator(new HelloWorldTask(helloworldtaskmanager, nameU, helloworldtaskfactory)); // Fill in task iterator here
        }

        public boolean isReady() {
            // Return whether the factory is ready to create tasks or not
            return true;
        }
}
    