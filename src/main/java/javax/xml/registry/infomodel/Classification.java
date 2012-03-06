package javax.xml.registry.infomodel;

import javax.xml.registry.JAXRException;

/**
 * @author Scott.Stark@jboss.org
 * @version $Revision$
 */
public interface Classification
   extends RegistryObject
{
   public abstract ClassificationScheme getClassificationScheme() throws JAXRException;

   public abstract RegistryObject getClassifiedObject() throws JAXRException;

   public abstract Concept getConcept() throws JAXRException;

   public abstract String getValue() throws JAXRException;

   public abstract boolean isExternal() throws JAXRException;

   public abstract void setClassificationScheme(ClassificationScheme classificationScheme)
      throws JAXRException;

   public abstract void setClassifiedObject(RegistryObject classifiedObject)
      throws JAXRException;

   public abstract void setConcept(Concept concept)
      throws JAXRException;

   public abstract void setValue(String value)
      throws JAXRException;

}
