/*
 * generated by Xtext
 */
package org.opendaylight.nemo.tool.eclipse.plugin;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class EditorUiInjectorProvider implements IInjectorProvider {
	
	@Override
	public Injector getInjector() {
		return org.opendaylight.nemo.tool.eclipse.plugin.ui.internal.EditorActivator.getInstance().getInjector("org.opendaylight.nemo.tool.eclipse.plugin.Editor");
	}
	
}
