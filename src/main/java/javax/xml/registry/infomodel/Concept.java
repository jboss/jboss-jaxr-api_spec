package javax.xml.registry.infomodel;

import java.util.Collection;
import javax.xml.registry.JAXRException;

/**
 * @author Scott.Stark@jboss.org
 * @version $Revision$
 */
public interface Concept
   extends RegistryObject
{
   public void addChildConcept(Concept concept) throws JAXRException;
   public void addChildConcepts(Collection concepts) throws JAXRException;
   public int getChildConceptCount() throws JAXRException;
   public Collection getChildrenConcepts() throws JAXRException;
   public ClassificationScheme getClassificationScheme() throws JAXRException;
   public Collection getDescendantConcepts() throws JAXRException;
   public RegistryObject getParent() throws JAXRException;
   public Concept getParentConcept() throws JAXRException;
   public String getPath() throws JAXRException;
   public String getValue() throws JAXRException;
   public void removeChildConcept(Concept concept) throws JAXRException;
   public void removeChildConcepts(Collection concepts) throws JAXRException;
   public void setValue(String value) throws JAXRException;
}
