/**
 * @author SERKAN OZAL
 *         
 *         E-Mail: <a href="mailto:serkanozal86@hotmail.com">serkanozal86@hotmail.com</a>
 *         GitHub: <a>https://github.com/serkan-ozal</a>
 */

package tr.com.serkanozal.jillegal.offheap.initializer;

import org.apache.log4j.Logger;

public class OffHeapInitializer {

	private static final Logger logger = Logger.getLogger(OffHeapInitializer.class);
	
	private static volatile boolean initialized = false;
	
	private OffHeapInitializer() {
		
	}
	
	public synchronized static void init() {
		if (initialized == false) {
			// Initialize if needed
			initialized = true;
			logger.info("Jillegal-OffHeap module has been initialized ...");
		}
	}
	
}
