package javax.xml.registry.infomodel;

import javax.xml.registry.JAXRException;

/**
 * @author Scott.Stark@jboss.org
 * @version $Revision$
 */
public interface Key
{
   String getId() throws JAXRException;

   void setId(String id) throws JAXRException;

}
