/**
 * @author SERKAN OZAL
 *         
 *         E-Mail: <a href="mailto:serkanozal86@hotmail.com">serkanozal86@hotmail.com</a>
 *         GitHub: <a>https://github.com/serkan-ozal</a>
 */

package tr.com.serkanozal.jillegal.offheap.config.provider.properties;

import tr.com.serkanozal.jillegal.offheap.config.provider.OffHeapConfigProvider;

public class OffHeapPropertiesBasedConfigProvider implements OffHeapConfigProvider {

	public static final String PROPERTIES_FILE_NAME = "jillegal-offheap.properties";
	
	@Override
	public boolean isAvailable() {
		// TODO Check about if there is "jillegal-offheap.properties" file 
		return false;
	}
	
}
