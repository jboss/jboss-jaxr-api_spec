package javax.xml.registry.infomodel;

import javax.xml.registry.JAXRException;

/**
 * @author Scott.Stark@jboss.org
 * @version $Revision$
 */
public interface ExternalIdentifier
   extends RegistryObject
{
   public ClassificationScheme getIdentificationScheme() throws JAXRException;
   public RegistryObject getRegistryObject() throws JAXRException;
   public String getValue() throws JAXRException;
   public void setIdentificationScheme(ClassificationScheme identificationScheme)
      throws JAXRException;
   public void setValue(String value) throws JAXRException;

}
