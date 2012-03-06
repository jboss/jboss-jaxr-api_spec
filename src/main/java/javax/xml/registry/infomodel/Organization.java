package javax.xml.registry.infomodel;

import java.util.Collection;
import javax.xml.registry.JAXRException;

/**
 * @author Scott.Stark@jboss.org
 * @version $Revision$
 */
public interface Organization
   extends RegistryObject
{
   public void addChildOrganization(Organization org) throws JAXRException;
   public void addChildOrganizations(Collection orgs) throws JAXRException;
   public void addService(Service service) throws JAXRException;
   public void addServices(Collection services) throws JAXRException;
   public void addUser(User user) throws JAXRException;
   public void addUsers(Collection users) throws JAXRException;
   public int getChildOrganizationCount() throws JAXRException;
   public Collection getChildOrganizations() throws JAXRException;
   public Collection getDescendantOrganizations() throws JAXRException;
   public Organization getParentOrganization() throws JAXRException;
   public PostalAddress getPostalAddress() throws JAXRException;
   public User getPrimaryContact() throws JAXRException;
   public Organization getRootOrganization() throws JAXRException;
   public Collection getServices() throws JAXRException;
   public Collection getTelephoneNumbers(String phoneType) throws JAXRException;
   public Collection getUsers() throws JAXRException;
   public void removeChildOrganization(Organization org) throws JAXRException;
   public void removeChildOrganizations(Collection orgs) throws JAXRException;
   public void removeService(Service service) throws JAXRException;
   public void removeServices(Collection services) throws JAXRException;
   public void removeUser(User user) throws JAXRException;
   public void removeUsers(Collection users) throws JAXRException;
   public void setPostalAddress(PostalAddress addr) throws JAXRException;
   public void setPrimaryContact(User user) throws JAXRException;
   public void setTelephoneNumbers(Collection phoneNumbers) throws JAXRException;

}
