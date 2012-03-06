package javax.xml.registry.infomodel;

import java.util.Collection;
import java.net.URL;
import javax.xml.registry.JAXRException;

/**
 * @author Scott.Stark@jboss.org
 * @version $Revision$
 */
public interface User
   extends RegistryObject
{
	public Collection getEmailAddresses() throws JAXRException;
	public Organization getOrganization() throws JAXRException;
	public PersonName getPersonName() throws JAXRException;
	public Collection getPostalAddresses() throws JAXRException;
	public Collection getTelephoneNumbers(String phoneType) throws JAXRException;
	public String getType() throws JAXRException;
	public URL getUrl() throws JAXRException;
	public void setEmailAddresses(Collection emailAddresses) throws JAXRException;
	public void setPersonName(PersonName name) throws JAXRException;
	public void setPostalAddresses(Collection addresses) throws JAXRException;
	public void setTelephoneNumbers(Collection numbers) throws JAXRException;
	public void setType(String type) throws JAXRException;
	public void setUrl(URL url) throws JAXRException;
}
