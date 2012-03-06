package javax.xml.registry.infomodel;

import javax.xml.registry.JAXRException;

/**
 * @author Scott.Stark@jboss.org
 * @version $Revision$
 */
public interface Association
   extends RegistryObject
{
   public Concept getAssociationType() throws JAXRException;
   public RegistryObject getSourceObject() throws JAXRException;
   public RegistryObject getTargetObject() throws JAXRException;
   public boolean isConfirmed() throws JAXRException;
   public boolean isConfirmedBySourceOwner() throws JAXRException;
   public boolean isConfirmedByTargetOwner() throws JAXRException;
   public boolean isExtramural() throws JAXRException;
   public void setAssociationType(Concept associationType) throws JAXRException;
   public void setSourceObject(RegistryObject srcObject) throws JAXRException;
   public void setTargetObject(RegistryObject targetObject) throws JAXRException;

}
