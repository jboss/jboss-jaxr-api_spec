package javax.xml.registry.infomodel;

import javax.xml.registry.JAXRException;

/**
 * @author Scott.Stark@jboss.org
 * @version $Revision$
 */
public interface ExternalLink
   extends RegistryObject, URIValidator
{
	public String getExternalURI() throws JAXRException;
	public java.util.Collection getLinkedObjects() throws JAXRException;
	public void setExternalURI(String uri) throws JAXRException;
}
