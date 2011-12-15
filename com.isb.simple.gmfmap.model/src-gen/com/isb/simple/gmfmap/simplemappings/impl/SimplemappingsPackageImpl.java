/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.isb.simple.gmfmap.simplemappings.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.gmf.gmfgraph.GMFGraphPackage;
import org.eclipse.gmf.mappings.GMFMapPackage;
import org.eclipse.gmf.tooldef.GMFToolPackage;

import com.isb.simple.gmfmap.simplemappings.SimpleChildNode;
import com.isb.simple.gmfmap.simplemappings.SimpleCompartment;
import com.isb.simple.gmfmap.simplemappings.SimpleDomainMapElement;
import com.isb.simple.gmfmap.simplemappings.SimpleLabelNode;
import com.isb.simple.gmfmap.simplemappings.SimpleLinkMapping;
import com.isb.simple.gmfmap.simplemappings.SimpleMapping;
import com.isb.simple.gmfmap.simplemappings.SimpleNode;
import com.isb.simple.gmfmap.simplemappings.SimpleParentNode;
import com.isb.simple.gmfmap.simplemappings.SimpleRootNode;
import com.isb.simple.gmfmap.simplemappings.SimpleSubNode;
import com.isb.simple.gmfmap.simplemappings.SimpleSubNodeReference;
import com.isb.simple.gmfmap.simplemappings.SimpleTopNode;
import com.isb.simple.gmfmap.simplemappings.SimplemappingsFactory;
import com.isb.simple.gmfmap.simplemappings.SimplemappingsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SimplemappingsPackageImpl extends EPackageImpl implements SimplemappingsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleTopNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleCompartmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleLabelNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleLinkMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleChildNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleSubNodeReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleDomainMapElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleSubNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleRootNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleParentNodeEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see com.isb.simple.gmfmap.simplemappings.SimplemappingsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SimplemappingsPackageImpl() {
		super(eNS_URI, SimplemappingsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link SimplemappingsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SimplemappingsPackage init() {
		if (isInited) return (SimplemappingsPackage)EPackage.Registry.INSTANCE.getEPackage(SimplemappingsPackage.eNS_URI);

		// Obtain or create and register package
		SimplemappingsPackageImpl theSimplemappingsPackage = (SimplemappingsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SimplemappingsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SimplemappingsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		GMFMapPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSimplemappingsPackage.createPackageContents();

		// Initialize created meta-data
		theSimplemappingsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSimplemappingsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SimplemappingsPackage.eNS_URI, theSimplemappingsPackage);
		return theSimplemappingsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleMapping() {
		return simpleMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleMapping_Canvas() {
		return (EReference)simpleMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleMapping_Palette() {
		return (EReference)simpleMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleMapping_Mapping() {
		return (EReference)simpleMappingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleMapping_DomainModel() {
		return (EReference)simpleMappingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleTopNode() {
		return simpleTopNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleTopNode_Links() {
		return (EReference)simpleTopNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleCompartment() {
		return simpleCompartmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleCompartment_CompartmentMapping() {
		return (EReference)simpleCompartmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleCompartment_Compartment() {
		return (EReference)simpleCompartmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleCompartment_CompartmentLabel() {
		return (EReference)simpleCompartmentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleCompartment_Name() {
		return (EAttribute)simpleCompartmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleLabelNode() {
		return simpleLabelNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleLinkMapping() {
		return simpleLinkMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleLinkMapping_Name() {
		return (EAttribute)simpleLinkMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleLinkMapping_LinkMapping() {
		return (EReference)simpleLinkMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleLinkMapping_DiagramLink() {
		return (EReference)simpleLinkMappingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleLinkMapping_DiagramLabel() {
		return (EReference)simpleLinkMappingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleLinkMapping_Tool() {
		return (EReference)simpleLinkMappingEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleLinkMapping_Outputs() {
		return (EReference)simpleLinkMappingEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleLinkMapping_Inputs() {
		return (EReference)simpleLinkMappingEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleChildNode() {
		return simpleChildNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleChildNode_ParentNode() {
		return (EReference)simpleChildNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleChildNode_Parent() {
		return (EReference)simpleChildNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleChildNode_ParentRoot() {
		return (EReference)simpleChildNodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleChildNode_ParentMapping() {
		return (EReference)simpleChildNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleSubNodeReference() {
		return simpleSubNodeReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleSubNodeReference_SubNode() {
		return (EReference)simpleSubNodeReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleDomainMapElement() {
		return simpleDomainMapElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleDomainMapElement_DomainMetaElement() {
		return (EReference)simpleDomainMapElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleSubNode() {
		return simpleSubNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleSubNode_ParentSubNodeReference() {
		return (EReference)simpleSubNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleSubNode_Name() {
		return (EAttribute)simpleSubNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleSubNode_ParentRootNode() {
		return (EReference)simpleSubNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleSubNode_Children() {
		return (EReference)simpleSubNodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleRootNode() {
		return simpleRootNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleRootNode_SubNodes() {
		return (EReference)simpleRootNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleRootNode_Outputs() {
		return (EReference)simpleRootNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleRootNode_Inputs() {
		return (EReference)simpleRootNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleNode() {
		return simpleNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleNode_NodeReference() {
		return (EReference)simpleNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleNode_ContainmentFeature() {
		return (EReference)simpleNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleNode_Name() {
		return (EAttribute)simpleNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleNode_ParentMetaElement() {
		return (EReference)simpleNodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleNode_Tool() {
		return (EReference)simpleNodeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleNode_LabelAttributes() {
		return (EReference)simpleNodeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleNode_DiagramNode() {
		return (EReference)simpleNodeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleNode_DiagramLabel() {
		return (EReference)simpleNodeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleParentNode() {
		return simpleParentNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleParentNode_Children() {
		return (EReference)simpleParentNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimplemappingsFactory getSimplemappingsFactory() {
		return (SimplemappingsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		simpleMappingEClass = createEClass(SIMPLE_MAPPING);
		createEReference(simpleMappingEClass, SIMPLE_MAPPING__CANVAS);
		createEReference(simpleMappingEClass, SIMPLE_MAPPING__PALETTE);
		createEReference(simpleMappingEClass, SIMPLE_MAPPING__MAPPING);
		createEReference(simpleMappingEClass, SIMPLE_MAPPING__DOMAIN_MODEL);

		simpleTopNodeEClass = createEClass(SIMPLE_TOP_NODE);
		createEReference(simpleTopNodeEClass, SIMPLE_TOP_NODE__LINKS);

		simpleCompartmentEClass = createEClass(SIMPLE_COMPARTMENT);
		createEReference(simpleCompartmentEClass, SIMPLE_COMPARTMENT__COMPARTMENT_MAPPING);
		createEAttribute(simpleCompartmentEClass, SIMPLE_COMPARTMENT__NAME);
		createEReference(simpleCompartmentEClass, SIMPLE_COMPARTMENT__COMPARTMENT);
		createEReference(simpleCompartmentEClass, SIMPLE_COMPARTMENT__COMPARTMENT_LABEL);

		simpleLabelNodeEClass = createEClass(SIMPLE_LABEL_NODE);

		simpleLinkMappingEClass = createEClass(SIMPLE_LINK_MAPPING);
		createEAttribute(simpleLinkMappingEClass, SIMPLE_LINK_MAPPING__NAME);
		createEReference(simpleLinkMappingEClass, SIMPLE_LINK_MAPPING__LINK_MAPPING);
		createEReference(simpleLinkMappingEClass, SIMPLE_LINK_MAPPING__DIAGRAM_LINK);
		createEReference(simpleLinkMappingEClass, SIMPLE_LINK_MAPPING__DIAGRAM_LABEL);
		createEReference(simpleLinkMappingEClass, SIMPLE_LINK_MAPPING__TOOL);
		createEReference(simpleLinkMappingEClass, SIMPLE_LINK_MAPPING__OUTPUTS);
		createEReference(simpleLinkMappingEClass, SIMPLE_LINK_MAPPING__INPUTS);

		simpleNodeEClass = createEClass(SIMPLE_NODE);
		createEReference(simpleNodeEClass, SIMPLE_NODE__NODE_REFERENCE);
		createEReference(simpleNodeEClass, SIMPLE_NODE__CONTAINMENT_FEATURE);
		createEAttribute(simpleNodeEClass, SIMPLE_NODE__NAME);
		createEReference(simpleNodeEClass, SIMPLE_NODE__PARENT_META_ELEMENT);
		createEReference(simpleNodeEClass, SIMPLE_NODE__TOOL);
		createEReference(simpleNodeEClass, SIMPLE_NODE__LABEL_ATTRIBUTES);
		createEReference(simpleNodeEClass, SIMPLE_NODE__DIAGRAM_NODE);
		createEReference(simpleNodeEClass, SIMPLE_NODE__DIAGRAM_LABEL);

		simpleParentNodeEClass = createEClass(SIMPLE_PARENT_NODE);
		createEReference(simpleParentNodeEClass, SIMPLE_PARENT_NODE__CHILDREN);

		simpleChildNodeEClass = createEClass(SIMPLE_CHILD_NODE);
		createEReference(simpleChildNodeEClass, SIMPLE_CHILD_NODE__PARENT_NODE);
		createEReference(simpleChildNodeEClass, SIMPLE_CHILD_NODE__PARENT_MAPPING);
		createEReference(simpleChildNodeEClass, SIMPLE_CHILD_NODE__PARENT);
		createEReference(simpleChildNodeEClass, SIMPLE_CHILD_NODE__PARENT_ROOT);

		simpleSubNodeReferenceEClass = createEClass(SIMPLE_SUB_NODE_REFERENCE);
		createEReference(simpleSubNodeReferenceEClass, SIMPLE_SUB_NODE_REFERENCE__SUB_NODE);

		simpleDomainMapElementEClass = createEClass(SIMPLE_DOMAIN_MAP_ELEMENT);
		createEReference(simpleDomainMapElementEClass, SIMPLE_DOMAIN_MAP_ELEMENT__DOMAIN_META_ELEMENT);

		simpleSubNodeEClass = createEClass(SIMPLE_SUB_NODE);
		createEReference(simpleSubNodeEClass, SIMPLE_SUB_NODE__PARENT_SUB_NODE_REFERENCE);
		createEAttribute(simpleSubNodeEClass, SIMPLE_SUB_NODE__NAME);
		createEReference(simpleSubNodeEClass, SIMPLE_SUB_NODE__PARENT_ROOT_NODE);
		createEReference(simpleSubNodeEClass, SIMPLE_SUB_NODE__CHILDREN);

		simpleRootNodeEClass = createEClass(SIMPLE_ROOT_NODE);
		createEReference(simpleRootNodeEClass, SIMPLE_ROOT_NODE__SUB_NODES);
		createEReference(simpleRootNodeEClass, SIMPLE_ROOT_NODE__OUTPUTS);
		createEReference(simpleRootNodeEClass, SIMPLE_ROOT_NODE__INPUTS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		GMFGraphPackage theGMFGraphPackage = (GMFGraphPackage)EPackage.Registry.INSTANCE.getEPackage(GMFGraphPackage.eNS_URI);
		GMFToolPackage theGMFToolPackage = (GMFToolPackage)EPackage.Registry.INSTANCE.getEPackage(GMFToolPackage.eNS_URI);
		GMFMapPackage theGMFMapPackage = (GMFMapPackage)EPackage.Registry.INSTANCE.getEPackage(GMFMapPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		simpleMappingEClass.getESuperTypes().add(this.getSimpleDomainMapElement());
		simpleMappingEClass.getESuperTypes().add(this.getSimpleParentNode());
		simpleTopNodeEClass.getESuperTypes().add(this.getSimpleNode());
		simpleTopNodeEClass.getESuperTypes().add(this.getSimpleRootNode());
		simpleTopNodeEClass.getESuperTypes().add(this.getSimpleParentNode());
		simpleCompartmentEClass.getESuperTypes().add(this.getSimpleParentNode());
		simpleCompartmentEClass.getESuperTypes().add(this.getSimpleChildNode());
		simpleLabelNodeEClass.getESuperTypes().add(this.getSimpleNode());
		simpleLinkMappingEClass.getESuperTypes().add(this.getSimpleChildNode());
		simpleLinkMappingEClass.getESuperTypes().add(this.getSimpleParentNode());
		simpleNodeEClass.getESuperTypes().add(this.getSimpleChildNode());
		simpleNodeEClass.getESuperTypes().add(this.getSimpleDomainMapElement());
		simpleSubNodeReferenceEClass.getESuperTypes().add(this.getSimpleNode());
		simpleSubNodeReferenceEClass.getESuperTypes().add(this.getSimpleParentNode());
		simpleSubNodeEClass.getESuperTypes().add(this.getSimpleRootNode());
		simpleSubNodeEClass.getESuperTypes().add(this.getSimpleChildNode());

		// Initialize classes and features; add operations and parameters
		initEClass(simpleMappingEClass, SimpleMapping.class, "SimpleMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSimpleMapping_Canvas(), theGMFGraphPackage.getCanvas(), null, "canvas", null, 0, 1, SimpleMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimpleMapping_Palette(), theGMFToolPackage.getPalette(), null, "palette", null, 0, 1, SimpleMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimpleMapping_Mapping(), theGMFMapPackage.getMapping(), null, "mapping", null, 0, 1, SimpleMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimpleMapping_DomainModel(), ecorePackage.getEPackage(), null, "domainModel", null, 0, 1, SimpleMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simpleTopNodeEClass, SimpleTopNode.class, "SimpleTopNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSimpleTopNode_Links(), this.getSimpleLinkMapping(), null, "links", null, 0, -1, SimpleTopNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simpleCompartmentEClass, SimpleCompartment.class, "SimpleCompartment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSimpleCompartment_CompartmentMapping(), theGMFMapPackage.getCompartmentMapping(), null, "compartmentMapping", null, 0, 1, SimpleCompartment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleCompartment_Name(), ecorePackage.getEString(), "name", null, 0, 1, SimpleCompartment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimpleCompartment_Compartment(), theGMFGraphPackage.getCompartment(), null, "compartment", null, 0, 1, SimpleCompartment.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSimpleCompartment_CompartmentLabel(), theGMFGraphPackage.getLabel(), null, "compartmentLabel", null, 0, 1, SimpleCompartment.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(simpleLabelNodeEClass, SimpleLabelNode.class, "SimpleLabelNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(simpleLinkMappingEClass, SimpleLinkMapping.class, "SimpleLinkMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSimpleLinkMapping_Name(), ecorePackage.getEString(), "name", null, 0, 1, SimpleLinkMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimpleLinkMapping_LinkMapping(), theGMFMapPackage.getLinkMapping(), null, "linkMapping", null, 0, 1, SimpleLinkMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSimpleLinkMapping_DiagramLink(), theGMFGraphPackage.getConnection(), null, "diagramLink", null, 0, 1, SimpleLinkMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimpleLinkMapping_DiagramLabel(), theGMFGraphPackage.getDiagramLabel(), null, "diagramLabel", null, 0, 1, SimpleLinkMapping.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSimpleLinkMapping_Tool(), theGMFToolPackage.getAbstractTool(), null, "tool", null, 0, 1, SimpleLinkMapping.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSimpleLinkMapping_Outputs(), this.getSimpleRootNode(), this.getSimpleRootNode_Inputs(), "outputs", null, 0, -1, SimpleLinkMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimpleLinkMapping_Inputs(), this.getSimpleRootNode(), this.getSimpleRootNode_Outputs(), "inputs", null, 0, -1, SimpleLinkMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simpleNodeEClass, SimpleNode.class, "SimpleNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSimpleNode_NodeReference(), theGMFMapPackage.getNodeReference(), null, "nodeReference", null, 0, 1, SimpleNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSimpleNode_ContainmentFeature(), ecorePackage.getEReference(), null, "containmentFeature", null, 0, 1, SimpleNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleNode_Name(), ecorePackage.getEString(), "name", null, 0, 1, SimpleNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimpleNode_ParentMetaElement(), ecorePackage.getEClass(), null, "parentMetaElement", null, 0, 1, SimpleNode.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimpleNode_Tool(), theGMFToolPackage.getAbstractTool(), null, "tool", null, 0, 1, SimpleNode.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSimpleNode_LabelAttributes(), ecorePackage.getEAttribute(), null, "labelAttributes", null, 0, -1, SimpleNode.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimpleNode_DiagramNode(), theGMFGraphPackage.getNode(), null, "diagramNode", null, 0, 1, SimpleNode.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSimpleNode_DiagramLabel(), theGMFGraphPackage.getDiagramLabel(), null, "diagramLabel", null, 0, 1, SimpleNode.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(simpleParentNodeEClass, SimpleParentNode.class, "SimpleParentNode", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSimpleParentNode_Children(), this.getSimpleChildNode(), this.getSimpleChildNode_ParentNode(), "children", null, 0, -1, SimpleParentNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simpleChildNodeEClass, SimpleChildNode.class, "SimpleChildNode", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSimpleChildNode_ParentNode(), this.getSimpleParentNode(), this.getSimpleParentNode_Children(), "parentNode", null, 0, 1, SimpleChildNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimpleChildNode_ParentMapping(), this.getSimpleMapping(), null, "parentMapping", null, 0, 1, SimpleChildNode.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimpleChildNode_Parent(), this.getSimpleNode(), null, "parent", null, 0, 1, SimpleChildNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimpleChildNode_ParentRoot(), this.getSimpleParentNode(), null, "parentRoot", null, 0, 1, SimpleChildNode.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simpleSubNodeReferenceEClass, SimpleSubNodeReference.class, "SimpleSubNodeReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSimpleSubNodeReference_SubNode(), this.getSimpleSubNode(), this.getSimpleSubNode_ParentSubNodeReference(), "subNode", null, 0, 1, SimpleSubNodeReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simpleDomainMapElementEClass, SimpleDomainMapElement.class, "SimpleDomainMapElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSimpleDomainMapElement_DomainMetaElement(), ecorePackage.getEClass(), null, "domainMetaElement", null, 0, 1, SimpleDomainMapElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simpleSubNodeEClass, SimpleSubNode.class, "SimpleSubNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSimpleSubNode_ParentSubNodeReference(), this.getSimpleSubNodeReference(), this.getSimpleSubNodeReference_SubNode(), "parentSubNodeReference", null, 0, 1, SimpleSubNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleSubNode_Name(), ecorePackage.getEString(), "name", null, 0, 1, SimpleSubNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimpleSubNode_ParentRootNode(), this.getSimpleRootNode(), this.getSimpleRootNode_SubNodes(), "parentRootNode", null, 0, 1, SimpleSubNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimpleSubNode_Children(), this.getSimpleChildNode(), null, "children", null, 0, -1, SimpleSubNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simpleRootNodeEClass, SimpleRootNode.class, "SimpleRootNode", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSimpleRootNode_SubNodes(), this.getSimpleSubNode(), this.getSimpleSubNode_ParentRootNode(), "subNodes", null, 0, -1, SimpleRootNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimpleRootNode_Outputs(), this.getSimpleLinkMapping(), this.getSimpleLinkMapping_Inputs(), "outputs", null, 0, -1, SimpleRootNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimpleRootNode_Inputs(), this.getSimpleLinkMapping(), this.getSimpleLinkMapping_Outputs(), "inputs", null, 0, -1, SimpleRootNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// com.isb.simple.gmfmap.simplemapping.setting
		createComAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "settingDelegates", "com.isb.simple.gmfmap.simplemapping.setting"
		   });																	
	}

	/**
	 * Initializes the annotations for <b>com.isb.simple.gmfmap.simplemapping.setting</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createComAnnotations() {
		String source = "com.isb.simple.gmfmap.simplemapping.setting";			
		addAnnotation
		  (getSimpleMapping_DomainModel(), 
		   source, 
		   new String[] {
		   });		
		addAnnotation
		  (getSimpleCompartment_Compartment(), 
		   source, 
		   new String[] {
		   });		
		addAnnotation
		  (getSimpleCompartment_CompartmentLabel(), 
		   source, 
		   new String[] {
		   });		
		addAnnotation
		  (getSimpleLinkMapping_DiagramLink(), 
		   source, 
		   new String[] {
		   });		
		addAnnotation
		  (getSimpleLinkMapping_DiagramLabel(), 
		   source, 
		   new String[] {
		   });		
		addAnnotation
		  (getSimpleLinkMapping_Tool(), 
		   source, 
		   new String[] {
		   });		
		addAnnotation
		  (getSimpleNode_Name(), 
		   source, 
		   new String[] {
		   });		
		addAnnotation
		  (getSimpleNode_ParentMetaElement(), 
		   source, 
		   new String[] {
		   });		
		addAnnotation
		  (getSimpleNode_Tool(), 
		   source, 
		   new String[] {
		   });		
		addAnnotation
		  (getSimpleNode_LabelAttributes(), 
		   source, 
		   new String[] {
		   });		
		addAnnotation
		  (getSimpleNode_DiagramNode(), 
		   source, 
		   new String[] {
		   });		
		addAnnotation
		  (getSimpleNode_DiagramLabel(), 
		   source, 
		   new String[] {
		   });		
		addAnnotation
		  (getSimpleChildNode_ParentMapping(), 
		   source, 
		   new String[] {
		   });		
		addAnnotation
		  (getSimpleChildNode_Parent(), 
		   source, 
		   new String[] {
		   });		
		addAnnotation
		  (getSimpleChildNode_ParentRoot(), 
		   source, 
		   new String[] {
		   });		
		addAnnotation
		  (getSimpleSubNode_Name(), 
		   source, 
		   new String[] {
		   });		
		addAnnotation
		  (getSimpleSubNode_Children(), 
		   source, 
		   new String[] {
		   });
	}

} //SimplemappingsPackageImpl