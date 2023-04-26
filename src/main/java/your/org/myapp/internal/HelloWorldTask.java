package your.org.myapp.internal;

import org.cytoscape.model.CyNetwork;
import org.cytoscape.model.CyNetworkFactory;
import org.cytoscape.model.CyNetworkManager;
import org.cytoscape.model.CyNode;
import org.cytoscape.model.CyTable;
import org.cytoscape.work.AbstractTask;
import org.cytoscape.work.TaskMonitor;
import org.cytoscape.session.CyNetworkNaming;

public class HelloWorldTask extends AbstractTask {

	private final CyNetworkFactory helloworldtaskfactory;
	private final CyNetworkManager helloworldtaskmanager;
	private final CyNetworkNaming  nameU;
	
	
	
	public HelloWorldTask (final CyNetworkManager helloworldtaskmanager, final CyNetworkNaming nameU, final CyNetworkFactory helloworldtaskfactory) {
		
		this.helloworldtaskmanager = helloworldtaskmanager;
		this.helloworldtaskfactory = helloworldtaskfactory;
		this.nameU = nameU;
	}
		

	
	public void run(TaskMonitor monitor) throws Exception {
		// Create an empty network
			CyNetwork myNet = helloworldtaskfactory.createNetwork();
			myNet.getRow(myNet).set(CyNetwork.NAME, nameU.getSuggestedNetworkTitle("Hello World Network"));
		
		
		// Add two nodes to the network
			CyNode node1 = myNet.addNode();
			CyNode node2 = myNet.addNode();
				
		// set name for new nodes
			
			CyTable nodeTable = myNet.getDefaultNodeTable(); // Added CyTable nodeTable = myNet.getDefaultNodeTable(); to get the node table for the network.
			
			myNet.getDefaultNodeTable().getRow(node1.getSUID()).set("name", "Node1");
			myNet.getDefaultNodeTable().getRow(node2.getSUID()).set("name", "Node2");	

		// Add an edge
			myNet.addEdge(node1, node2, true);
			
			
			
			
			helloworldtaskmanager.addNetwork(myNet);
			
		// Set the variable destroyNetwork to true, the following code will destroy a network
			boolean destroyNetwork = false;
			if (destroyNetwork){
				// Destroy it
				helloworldtaskmanager.destroyNetwork(myNet);			
			
		}					
	}
}
