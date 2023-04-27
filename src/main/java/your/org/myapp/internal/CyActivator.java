package your.org.myapp.internal;

import java.util.Properties;

import org.cytoscape.model.CyNetworkFactory;
import org.cytoscape.model.CyNetworkManager;
import org.cytoscape.service.util.AbstractCyActivator;

import org.osgi.framework.BundleContext;
import org.cytoscape.work.ServiceProperties;
import org.cytoscape.work.TaskFactory;
import org.cytoscape.session.CyNetworkNaming;


public class CyActivator extends AbstractCyActivator {
	
	/**
	 * This is the {@code start} method, which sets up your app. The
	 * {@code BundleContext} object allows you to communicate with the OSGi
	 * environment. You use {@code BundleContext} to import services or ask OSGi
	 * about the status of some service.
	 */

	@Override
	public void start(BundleContext context) throws Exception {
		
		
		CyNetworkManager cyNetworkManagerServiceRef = getService(context,CyNetworkManager.class);
		CyNetworkNaming cyNetworkNamingServiceRef = getService(context,CyNetworkNaming.class);
		CyNetworkFactory cyNetworkFactoryServiceRef = getService(context,CyNetworkFactory.class);
		
		HelloWorldTaskFactory helloWorldTaskFactory  = new HelloWorldTaskFactory(cyNetworkManagerServiceRef,
		cyNetworkNamingServiceRef, cyNetworkFactoryServiceRef);


		 // Set menu properties
	    Properties props = new Properties();
	    props.setProperty("title", "Hello world!");
        props.put(ServiceProperties.PREFERRED_MENU, "Tools.HelloWorld");
		props.put(ServiceProperties.TITLE, "Hello world!");


		registerService(context,helloWorldTaskFactory, TaskFactory.class,  props);
	}
}  
        
        
       


