package javax.xml.registry.infomodel;

import java.util.Collection;
import javax.xml.registry.JAXRException;

/**
 * @author Scott.Stark@jboss.org
 * @version $Revision$
 */
public interface SpecificationLink
   extends RegistryObject
{
   public ServiceBinding getServiceBinding() throws JAXRException;
   public RegistryObject getSpecificationObject() throws JAXRException;
   public InternationalString getUsageDescription() throws JAXRException;
   public Collection getUsageParameters() throws JAXRException;
   public void setSpecificationObject(RegistryObject obj) throws JAXRException;
   public void setUsageDescription(InternationalString usageDescription) throws JAXRException;
   public void setUsageParameters(Collection usageParams) throws JAXRException;

}
