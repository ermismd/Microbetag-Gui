package your.org.myapp.internal;

import java.util.Properties;

import org.cytoscape.service.util.AbstractCyActivator;

import org.osgi.framework.BundleContext;





public class CyActivator extends AbstractCyActivator {
	
	/**
	 * This is the {@code start} method, which sets up your app. The
	 * {@code BundleContext} object allows you to communicate with the OSGi
	 * environment. You use {@code BundleContext} to import services or ask OSGi
	 * about the status of some service.
	 */
	


	@Override
	public void start(BundleContext context) throws Exception {
		
		
		 // Set menu properties
	    Properties props = new Properties();
	    props.setProperty("title", "Hello world!");
           
	}}  
        
        
       

