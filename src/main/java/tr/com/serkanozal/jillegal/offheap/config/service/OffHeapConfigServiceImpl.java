/**
 * @author SERKAN OZAL
 *         
 *         E-Mail: <a href="mailto:serkanozal86@hotmail.com">serkanozal86@hotmail.com</a>
 *         GitHub: <a>https://github.com/serkan-ozal</a>
 */

package tr.com.serkanozal.jillegal.offheap.config.service;

import tr.com.serkanozal.jillegal.core.config.service.BaseConfigService;
import tr.com.serkanozal.jillegal.offheap.config.provider.OffHeapConfigProvider;
import tr.com.serkanozal.jillegal.offheap.config.provider.annotation.OffHeapAnnotationBasedConfigProvider;
import tr.com.serkanozal.jillegal.offheap.config.provider.properties.OffHeapPropertiesBasedConfigProvider;
import tr.com.serkanozal.jillegal.offheap.config.provider.xml.OffHeapXmlBasedConfigProvider;

public class OffHeapConfigServiceImpl extends BaseConfigService<OffHeapConfigProvider> implements OffHeapConfigService {

	@Override
	protected void init() {
		addConfigProviderIfAvailable(new OffHeapAnnotationBasedConfigProvider());
		addConfigProviderIfAvailable(new OffHeapXmlBasedConfigProvider());
		addConfigProviderIfAvailable(new OffHeapPropertiesBasedConfigProvider());
	}

}
