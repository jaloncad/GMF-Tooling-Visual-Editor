/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.msl.simple.gmfmap.simplemappings.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.msl.simple.gmfmap.simplemappings.*;
import org.msl.simple.gmfmap.simplemappings.SimpleChildNode;
import org.msl.simple.gmfmap.simplemappings.SimpleCompartment;
import org.msl.simple.gmfmap.simplemappings.SimpleLabelNode;
import org.msl.simple.gmfmap.simplemappings.SimpleLinkMapping;
import org.msl.simple.gmfmap.simplemappings.SimpleMapping;
import org.msl.simple.gmfmap.simplemappings.SimpleNode;
import org.msl.simple.gmfmap.simplemappings.SimpleParentNode;
import org.msl.simple.gmfmap.simplemappings.SimpleSubNode;
import org.msl.simple.gmfmap.simplemappings.SimpleTopNode;
import org.msl.simple.gmfmap.simplemappings.SimplemappingsPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.msl.simple.gmfmap.simplemappings.SimplemappingsPackage
 * @generated
 */
public class SimplemappingsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SimplemappingsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimplemappingsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SimplemappingsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimplemappingsSwitch<Adapter> modelSwitch =
		new SimplemappingsSwitch<Adapter>() {
			@Override
			public Adapter caseSimpleMapping(SimpleMapping object) {
				return createSimpleMappingAdapter();
			}
			@Override
			public Adapter caseSimpleTopNode(SimpleTopNode object) {
				return createSimpleTopNodeAdapter();
			}
			@Override
			public Adapter caseSimpleCompartment(SimpleCompartment object) {
				return createSimpleCompartmentAdapter();
			}
			@Override
			public Adapter caseSimpleLabelNode(SimpleLabelNode object) {
				return createSimpleLabelNodeAdapter();
			}
			@Override
			public Adapter caseSimpleLinkMapping(SimpleLinkMapping object) {
				return createSimpleLinkMappingAdapter();
			}
			@Override
			public Adapter caseSimpleNode(SimpleNode object) {
				return createSimpleNodeAdapter();
			}
			@Override
			public Adapter caseSimpleParentNode(SimpleParentNode object) {
				return createSimpleParentNodeAdapter();
			}
			@Override
			public Adapter caseSimpleChildNode(SimpleChildNode object) {
				return createSimpleChildNodeAdapter();
			}
			@Override
			public Adapter caseSimpleSubNode(SimpleSubNode object) {
				return createSimpleSubNodeAdapter();
			}
			@Override
			public Adapter caseSimpleMappingElementWithFigure(SimpleMappingElementWithFigure object) {
				return createSimpleMappingElementWithFigureAdapter();
			}
			@Override
			public Adapter caseSimpleChildReference(SimpleChildReference object) {
				return createSimpleChildReferenceAdapter();
			}
			@Override
			public Adapter caseSimpleNodeReference(SimpleNodeReference object) {
				return createSimpleNodeReferenceAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.msl.simple.gmfmap.simplemappings.SimpleMapping <em>Simple Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.msl.simple.gmfmap.simplemappings.SimpleMapping
	 * @generated
	 */
	public Adapter createSimpleMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.msl.simple.gmfmap.simplemappings.SimpleTopNode <em>Simple Top Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.msl.simple.gmfmap.simplemappings.SimpleTopNode
	 * @generated
	 */
	public Adapter createSimpleTopNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.msl.simple.gmfmap.simplemappings.SimpleCompartment <em>Simple Compartment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.msl.simple.gmfmap.simplemappings.SimpleCompartment
	 * @generated
	 */
	public Adapter createSimpleCompartmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.msl.simple.gmfmap.simplemappings.SimpleLabelNode <em>Simple Label Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.msl.simple.gmfmap.simplemappings.SimpleLabelNode
	 * @generated
	 */
	public Adapter createSimpleLabelNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.msl.simple.gmfmap.simplemappings.SimpleLinkMapping <em>Simple Link Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.msl.simple.gmfmap.simplemappings.SimpleLinkMapping
	 * @generated
	 */
	public Adapter createSimpleLinkMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.msl.simple.gmfmap.simplemappings.SimpleNode <em>Simple Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.msl.simple.gmfmap.simplemappings.SimpleNode
	 * @generated
	 */
	public Adapter createSimpleNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.msl.simple.gmfmap.simplemappings.SimpleParentNode <em>Simple Parent Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.msl.simple.gmfmap.simplemappings.SimpleParentNode
	 * @generated
	 */
	public Adapter createSimpleParentNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.msl.simple.gmfmap.simplemappings.SimpleChildNode <em>Simple Child Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.msl.simple.gmfmap.simplemappings.SimpleChildNode
	 * @generated
	 */
	public Adapter createSimpleChildNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.msl.simple.gmfmap.simplemappings.SimpleSubNode <em>Simple Sub Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.msl.simple.gmfmap.simplemappings.SimpleSubNode
	 * @generated
	 */
	public Adapter createSimpleSubNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.msl.simple.gmfmap.simplemappings.SimpleMappingElementWithFigure <em>Simple Mapping Element With Figure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.msl.simple.gmfmap.simplemappings.SimpleMappingElementWithFigure
	 * @generated
	 */
	public Adapter createSimpleMappingElementWithFigureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.msl.simple.gmfmap.simplemappings.SimpleChildReference <em>Simple Child Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.msl.simple.gmfmap.simplemappings.SimpleChildReference
	 * @generated
	 */
	public Adapter createSimpleChildReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.msl.simple.gmfmap.simplemappings.SimpleNodeReference <em>Simple Node Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.msl.simple.gmfmap.simplemappings.SimpleNodeReference
	 * @generated
	 */
	public Adapter createSimpleNodeReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //SimplemappingsAdapterFactory
