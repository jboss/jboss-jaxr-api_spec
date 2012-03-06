package javax.xml.registry.infomodel;

import java.util.Collection;
import javax.xml.registry.JAXRException;

/**
 * @author Scott.Stark@jboss.org
 * @version $Revision$
 */
public interface RegistryObject
   extends ExtensibleObject
{
   public void addAssociation(Association association) throws JAXRException;
   public void addAssociations(Collection associations) throws JAXRException;
   public void addClassification(Classification classification) throws JAXRException;
   public void addClassifications(Collection classifications) throws JAXRException;
   public void addExternalIdentifier(ExternalIdentifier externalIdentifier) throws JAXRException;
   public void addExternalIdentifiers(Collection externalIdentifiers) throws JAXRException;
   public void addExternalLink(ExternalLink externalLink) throws JAXRException;
   public void addExternalLinks(Collection externalLinks) throws JAXRException;
   public Collection getAssociatedObjects() throws JAXRException;
   public Collection getAssociations() throws JAXRException;
   public Collection getAuditTrail() throws JAXRException;
   public Collection getClassifications() throws JAXRException;
   public InternationalString getDescription() throws JAXRException;
   public Collection getExternalIdentifiers() throws JAXRException;
   public Collection getExternalLinks() throws JAXRException;
   public Key getKey() throws JAXRException;
   public javax.xml.registry.LifeCycleManager getLifeCycleManager() throws JAXRException;
   public InternationalString getName() throws JAXRException;
   public Concept getObjectType() throws JAXRException;
   public Collection getRegistryPackages() throws JAXRException;
   public Organization getSubmittingOrganization() throws JAXRException;
   public void removeAssociation(Association association) throws JAXRException;
   public void removeAssociations(Collection associations) throws JAXRException;
   public void removeClassification(Classification classification) throws JAXRException;
   public void removeClassifications(Collection classifications) throws JAXRException;
   public void removeExternalIdentifier(ExternalIdentifier externalIdentifier) throws JAXRException;
   public void removeExternalIdentifiers(Collection externalIdentifiers) throws JAXRException;
   public void removeExternalLink(ExternalLink externalLink) throws JAXRException;
   public void removeExternalLinks(Collection externalLinks) throws JAXRException;
   public void setAssociations(Collection associations) throws JAXRException;
   public void setClassifications(Collection classifications) throws JAXRException;
   public void setDescription(InternationalString desc) throws JAXRException;
   public void setExternalIdentifiers(Collection externalIdentifiers) throws JAXRException;
   public void setExternalLinks(Collection externalLinks) throws JAXRException;
   public void setKey(Key key) throws JAXRException;
   public void setName(InternationalString name) throws JAXRException;
   public String toXML() throws JAXRException;

}
