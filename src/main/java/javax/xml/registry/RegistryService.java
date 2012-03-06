package javax.xml.registry;

import javax.xml.registry.infomodel.ClassificationScheme;

/**
 * @author Scott.Stark@jboss.org
 * @version $Revision$
 */
public interface RegistryService
{
   public BulkResponse getBulkResponse(String requestId)
      throws InvalidRequestException, JAXRException;
   public BusinessLifeCycleManager getBusinessLifeCycleManager()
      throws JAXRException;
   public BusinessQueryManager getBusinessQueryManager() throws JAXRException;
   public CapabilityProfile getCapabilityProfile() throws JAXRException;
   public DeclarativeQueryManager getDeclarativeQueryManager()
      throws JAXRException, UnsupportedCapabilityException;
   public ClassificationScheme getDefaultPostalScheme() throws JAXRException;
   public String makeRegistrySpecificRequest(String request) throws JAXRException;

}
