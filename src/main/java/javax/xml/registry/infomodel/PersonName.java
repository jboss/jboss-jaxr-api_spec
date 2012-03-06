package javax.xml.registry.infomodel;

import javax.xml.registry.JAXRException;

/**
 * @author Scott.Stark@jboss.org
 * @version $Revision$
 */
public interface PersonName
{
   public String getFirstName() throws JAXRException;
   public String getFullName() throws JAXRException;
   public String getLastName() throws JAXRException;
   public String getMiddleName() throws JAXRException;
   public void setFirstName(String firstName) throws JAXRException;
   public void setFullName(String fullName) throws JAXRException;
   public void setLastName(String lastName) throws JAXRException;
   public void setMiddleName(String middleName) throws JAXRException;
}
