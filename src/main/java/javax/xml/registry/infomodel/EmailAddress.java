package javax.xml.registry.infomodel;

import javax.xml.registry.JAXRException;

/**
 * @author Scott.Stark@jboss.org
 * @version $Revision$
 */
public interface EmailAddress
{
	public String getAddress() throws JAXRException;
	public String getType() throws JAXRException;
	public void setAddress(String addr) throws JAXRException;
	public void setType(String type) throws JAXRException;
}
