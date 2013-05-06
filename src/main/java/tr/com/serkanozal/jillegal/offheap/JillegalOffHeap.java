/**
 * @author SERKAN OZAL
 *         
 *         E-Mail: <a href="mailto:serkanozal86@hotmail.com">serkanozal86@hotmail.com</a>
 *         GitHub: <a>https://github.com/serkan-ozal</a>
 */

package tr.com.serkanozal.jillegal.offheap;

import tr.com.serkanozal.jillegal.offheap.initializer.OffHeapInitializer;

public class JillegalOffHeap {

	public static String VERSION = "1.0.0-RELEASE";

	private JillegalOffHeap() {
		
	}
	
	public static void init() {
		OffHeapInitializer.init();
	}
	
}
