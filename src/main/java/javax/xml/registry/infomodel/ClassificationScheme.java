package javax.xml.registry.infomodel;

import java.util.Collection;

/**
 * @author Scott.Stark@jboss.org
 * @version $Revision$
 */
public interface ClassificationScheme
   extends RegistryEntry
{
   public static final int VALUE_TYPE_EMBEDDED_PATH=1;
   public static final int VALUE_TYPE_NON_UNIQUE=2;
   public static final int VALUE_TYPE_UNIQUE=0;

   public void addChildConcept(Concept concept) throws javax.xml.registry.JAXRException;
   public void addChildConcepts(Collection concepts) throws javax.xml.registry.JAXRException;
   public int getChildConceptCount() throws javax.xml.registry.JAXRException;
   public Collection getChildrenConcepts() throws javax.xml.registry.JAXRException;
   public Collection getDescendantConcepts() throws javax.xml.registry.JAXRException;
   public int getValueType() throws javax.xml.registry.JAXRException;
   public boolean isExternal() throws javax.xml.registry.JAXRException;
   public void removeChildConcept(Concept concept) throws javax.xml.registry.JAXRException;
   public void removeChildConcepts(Collection concepts) throws javax.xml.registry.JAXRException;
   public void setValueType(int valueType) throws javax.xml.registry.JAXRException;

}
