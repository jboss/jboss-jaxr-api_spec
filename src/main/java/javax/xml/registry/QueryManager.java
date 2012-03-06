package javax.xml.registry;

import java.util.Collection;
import javax.xml.registry.infomodel.RegistryObject;

/** This is the common base interface for all QueryManagers in the API.
 * 
 * @author Scott.Stark@jboss.org
 * @version $Revision$
 */
public interface QueryManager
{
   public RegistryObject getRegistryObject(String id) throws JAXRException;
   public RegistryObject getRegistryObject(String id, String objectType)
      throws JAXRException;

   public BulkResponse getRegistryObjects() throws JAXRException;
   public BulkResponse getRegistryObjects(String objectType)
      throws JAXRException;
   public BulkResponse getRegistryObjects(Collection objectKeys)
      throws JAXRException;
   public BulkResponse getRegistryObjects(Collection objectKeys, String objectType)
      throws JAXRException;

   public RegistryService getRegistryService() throws JAXRException;
}
