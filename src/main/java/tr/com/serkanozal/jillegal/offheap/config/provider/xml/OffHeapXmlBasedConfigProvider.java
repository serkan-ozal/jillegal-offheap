/**
 * @author SERKAN OZAL
 *         
 *         E-Mail: <a href="mailto:serkanozal86@hotmail.com">serkanozal86@hotmail.com</a>
 *         GitHub: <a>https://github.com/serkan-ozal</a>
 */

package tr.com.serkanozal.jillegal.offheap.config.provider.xml;

import tr.com.serkanozal.jillegal.offheap.config.provider.OffHeapConfigProvider;

public class OffHeapXmlBasedConfigProvider implements OffHeapConfigProvider {

	public static final String XML_FILE_NAME = "jillegal-offheap.xml";
	
	@Override
	public boolean isAvailable() {
		// TODO Check about if there is "jillegal-offheap.xml" file 
		return false;
	}
	
}
