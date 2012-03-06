package javax.xml.registry.infomodel;

import javax.xml.registry.JAXRException;

/**
 * @author Scott.Stark@jboss.org
 * @version $Revision$
 */
public interface PostalAddress
   extends ExtensibleObject
{
   public String getCity() throws JAXRException;
   public String getCountry() throws JAXRException;
   public String getPostalCode() throws JAXRException;
   public ClassificationScheme getPostalScheme() throws JAXRException;
   public String getStateOrProvince() throws JAXRException;
   public String getStreet() throws JAXRException;
   public String getStreetNumber() throws JAXRException;
   public String getType() throws JAXRException;
   public void setCity(String city) throws JAXRException;
   public void setCountry(String coutry) throws JAXRException;
   public void setPostalCode(String code ) throws JAXRException;
   public void setPostalScheme(ClassificationScheme scheme) throws JAXRException;
   public void setStateOrProvince(String state) throws JAXRException;
   public void setStreet(String street) throws JAXRException;
   public void setStreetNumber(String number) throws JAXRException;
   public void setType(String type) throws JAXRException;

}
