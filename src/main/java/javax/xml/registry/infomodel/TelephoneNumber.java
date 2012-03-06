package javax.xml.registry.infomodel;

import javax.xml.registry.JAXRException;

/**
 * @author Scott.Stark@jboss.org
 * @version $Revision$
 */
public interface TelephoneNumber
{
   public String getAreaCode() throws JAXRException;
   public String getCountryCode() throws JAXRException;
   public String getExtension() throws JAXRException;
   public String getNumber() throws JAXRException;
   public String getType() throws JAXRException;
   public String getUrl() throws JAXRException;
   public void setAreaCode(String areaCode) throws JAXRException;
   public void setCountryCode(String cc) throws JAXRException;
   public void setExtension(String ext) throws JAXRException;
   public void setNumber(String number) throws JAXRException;
   public void setType(String type) throws JAXRException;
   public void setUrl(String url) throws JAXRException;

}
