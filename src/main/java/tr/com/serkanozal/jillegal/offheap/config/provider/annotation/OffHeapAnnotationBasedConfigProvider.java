/**
 * @author SERKAN OZAL
 *         
 *         E-Mail: <a href="mailto:serkanozal86@hotmail.com">serkanozal86@hotmail.com</a>
 *         GitHub: <a>https://github.com/serkan-ozal</a>
 */

package tr.com.serkanozal.jillegal.offheap.config.provider.annotation;

import tr.com.serkanozal.jillegal.offheap.config.provider.OffHeapConfigProvider;

public class OffHeapAnnotationBasedConfigProvider implements OffHeapConfigProvider {

	@Override
	public boolean isAvailable() {
		// Annotation based configuration provider is always available
		return true;
	}

}
