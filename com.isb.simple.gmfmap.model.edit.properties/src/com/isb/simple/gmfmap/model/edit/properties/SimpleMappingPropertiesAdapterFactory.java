package com.isb.simple.gmfmap.model.edit.properties;

import org.eclipse.emf.common.notify.Adapter;

import com.isb.simple.gmfmap.model.edit.IItemPropertyDescriptorProvider;
import com.isb.simple.gmfmap.simplemappings.util.SimplemappingsAdapterFactory;

public class SimpleMappingPropertiesAdapterFactory extends
		SimplemappingsAdapterFactory {
	
	private static Adapter simpleNodeProvider = new SimpleNodeItemPropertyDescriptorProvider();
	private static Adapter simpleSubNodeProvider = new SimpleSubNodeItemPropertyDescriptorProvider();

	
	@Override
	public Adapter createSimpleNodeAdapter() {
		return simpleNodeProvider;
	}
	
	@Override
	public Adapter createSimpleSubNodeAdapter() {
		return simpleSubNodeProvider;
	}

	@Override
	public boolean isFactoryForType(Object object) {
		return object==IItemPropertyDescriptorProvider.class;
	}

}