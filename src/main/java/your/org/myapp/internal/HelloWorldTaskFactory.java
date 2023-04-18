package your.org.myapp.internal;

import org.cytoscape.work.AbstractTaskFactory;
import org.cytoscape.work.TaskIterator;
import java.util.Properties;

public class HelloWorldTaskFactory extends AbstractTaskFactory {

    public HelloWorldTaskFactory() {
        super();
    }

    public TaskIterator createTaskIterator() {
        return null; // Fill in task iterator here
    }

    public boolean isReady() {
        return true;
    }
}
    