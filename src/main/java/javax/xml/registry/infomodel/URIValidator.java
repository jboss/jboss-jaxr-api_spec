package javax.xml.registry.infomodel;

import javax.xml.registry.JAXRException;

/**
 * @author Scott.Stark@jboss.org
 * @version $Revision$
 */
public interface URIValidator
{
   public boolean getValidateURI() throws JAXRException;
   public void setValidateURI(boolean validate) throws JAXRException;

}
