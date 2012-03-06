package javax.xml.registry;

import java.util.Collection;
import javax.xml.registry.infomodel.Association;

/**
 * @author Scott.Stark@jboss.org
 * @version $Revision$
 */
public interface BusinessLifeCycleManager
   extends LifeCycleManager
{
   public void confirmAssociation(Association assoc)
      throws JAXRException, InvalidRequestException;
   public BulkResponse deleteAssociations(Collection associationKeys) throws JAXRException;
   public BulkResponse deleteClassificationSchemes(Collection schemeKeys) throws JAXRException;
   public BulkResponse deleteConcepts(Collection conceptKeys) throws JAXRException;
   public BulkResponse deleteOrganizations(Collection organizationKeys) throws JAXRException;
   public BulkResponse deleteServiceBindings(Collection bindingKeys) throws JAXRException;
   public BulkResponse deleteServices(Collection serviceKeys) throws JAXRException;
   public BulkResponse saveAssociations(Collection associations, boolean replace)
      throws JAXRException;
   public BulkResponse saveClassificationSchemes(Collection schemes) throws JAXRException;
   public BulkResponse saveConcepts(Collection concepts) throws JAXRException;
   public BulkResponse saveOrganizations(Collection organizations) throws JAXRException;
   public BulkResponse saveServiceBindings(Collection bindings) throws JAXRException;
   public BulkResponse saveServices(Collection services) throws JAXRException;
   public void unConfirmAssociation(Association assoc)
      throws JAXRException, InvalidRequestException;

}
