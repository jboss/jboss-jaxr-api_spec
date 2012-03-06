package javax.xml.registry.infomodel;

import java.util.Collection;
import javax.xml.registry.JAXRException;


/**
 * @author Scott.Stark@jboss.org
 * @version $Revision$
 */
public interface Service
   extends RegistryEntry
{
   public void addServiceBinding(ServiceBinding serviceBinding) throws JAXRException;
   public void addServiceBindings(Collection serviceBindings) throws JAXRException;
   public Organization getProvidingOrganization() throws JAXRException;
   public Collection getServiceBindings() throws JAXRException;
   public void removeServiceBinding(ServiceBinding serviceBinding) throws JAXRException;
   public void removeServiceBindings(Collection serviceBindings) throws JAXRException;
   public void setProvidingOrganization(Organization providingOrganization) throws JAXRException;

}
