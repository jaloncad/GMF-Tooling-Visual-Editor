package org.msl.simple.gmfmap.model.edit.properties;

import java.util.Collection;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.msl.simple.gmfmap.model.edit.IItemPropertyDescriptorProvider;
import org.msl.simple.gmfmap.simplemappings.SimpleChildNode;
import org.msl.simple.gmfmap.simplemappings.SimpleChildReference;
import org.msl.simple.gmfmap.simplemappings.SimpleMapping;
import org.msl.simple.gmfmap.simplemappings.SimpleNode;
import org.msl.simple.gmfmap.simplemappings.SimplemappingsPackage;

public class SimpleNodeItemPropertyDescriptorProvider extends
		AdapterImpl implements IItemPropertyDescriptorProvider {
	
	@Override
	public ItemPropertyDescriptor createItemPropertyDescriptor(
			AdapterFactory adapterFactory, ResourceLocator resourceLocator,
			String displayName, String description, EStructuralFeature feature,
			boolean isSettable, boolean multiLine, boolean sortChoices,
			Object staticImage, String category, String[] filterFlags) {

		return new SimpleNodeItemPropertyDescriptor(adapterFactory, 
				  resourceLocator, 
				  displayName, 
				  description, 
				  feature, 
				  isSettable, 
				  multiLine, 
				  sortChoices, 
				  staticImage, 
				  category, 
				  filterFlags);
	}

	
	class SimpleNodeItemPropertyDescriptor extends ItemPropertyDescriptor {
  
		public SimpleNodeItemPropertyDescriptor
		     (AdapterFactory adapterFactory,
		      ResourceLocator resourceLocator,
		      String displayName,
		      String description,
		      EStructuralFeature feature, 
		      boolean isSettable,
		      boolean multiLine,
		      boolean sortChoices,
		      Object staticImage,
		      String category,
		      String [] filterFlags)
		{
			super(adapterFactory, 
				  resourceLocator, 
				  displayName, 
				  description, 
				  feature, 
				  isSettable, 
				  multiLine, 
				  sortChoices, 
				  staticImage, 
				  category, 
				  filterFlags);
		}
		
		@Override
		public Collection<?> getChoiceOfValues(Object object) {
			
			if(feature==SimplemappingsPackage.Literals.SIMPLE_NODE_REFERENCE__CONTAINMENT_FEATURE)
			{
				Collection<Object> choiceOfValues = new UniqueEList<Object>();
				
				if(object instanceof SimpleChildNode)
				{
					EClass parentMetaElement = ((SimpleChildNode)object).getParentMetaElement();
					choiceOfValues.addAll(parentMetaElement.getEAllContainments());
				}
				
				return choiceOfValues;
			}
			
			if(feature==SimplemappingsPackage.Literals.SIMPLE_NODE__DOMAIN_META_ELEMENT)
			{
				Collection<Object> choiceOfValues = new UniqueEList<Object>();
				
				EReference containmentFeature = ((SimpleNode)object).getContainmentFeature();
				
				if(containmentFeature!=null)
					for(Object choice:super.getChoiceOfValues(object))
						if(choice instanceof EClass && ((EClass)containmentFeature.getEType()).isSuperTypeOf((EClass)choice))
								choiceOfValues.add(choice);	
				
				
				
				return choiceOfValues;
			}
			
			if(feature==SimplemappingsPackage.Literals.SIMPLE_NODE__LABEL_ATTRIBUTES)
			{
				Collection<Object> choiceOfValues = new UniqueEList<Object>();
				
				EClass domainMetaElement = ((SimpleNode)object).getDomainMetaElement();
				
				if(domainMetaElement!=null)
					for(EAttribute attribute:domainMetaElement.getEAllAttributes())
					{
						Class<?> attributeInstanceClass = attribute.getEType().getInstanceClass(); 
						Class<?> stringInstanceClass = EcorePackage.eINSTANCE.getEString().getInstanceClass();
						if(attributeInstanceClass!=null && stringInstanceClass.isAssignableFrom(attributeInstanceClass))
							choiceOfValues.add(attribute);							
					}

				return choiceOfValues;
			}
			
			if(feature==SimplemappingsPackage.Literals.SIMPLE_CHILD_REFERENCE__REFERENCED_SIMPLE_NODE)
			{
				Collection<Object> choiceOfValues = new UniqueEList<Object>();
				
				EReference containmentFeature = ((SimpleChildReference)object).getContainmentFeature();
				
				if(containmentFeature!=null)
					for(Object choice:super.getChoiceOfValues(object))
						if(choice instanceof SimpleNode && ((EClass)containmentFeature.getEType()).isSuperTypeOf(((SimpleNode)choice).getDomainMetaElement()))
								choiceOfValues.add(choice);	
				
				return choiceOfValues;
			}
			
			return super.getChoiceOfValues(object); 
		}
		
		@Override
		public boolean canSetProperty(Object object) {
			
			boolean defaultValue = super.canSetProperty(object);
			
			switch (feature.getEContainingClass().getEAllStructuralFeatures().indexOf(feature))
			{
				case SimplemappingsPackage.SIMPLE_MAPPING__DOMAIN_META_ELEMENT:{
					if(object instanceof SimpleMapping)
						return false;
				}
				case SimplemappingsPackage.SIMPLE_NODE__DOMAIN_META_ELEMENT:{
					if(object instanceof SimpleChildReference)
						return false;					
				}

				case SimplemappingsPackage.SIMPLE_NODE__LABEL_ATTRIBUTES:{
					if(object instanceof SimpleChildReference)
						return false;					
				}
			}
			
			return defaultValue;
		}

	}
	
}
