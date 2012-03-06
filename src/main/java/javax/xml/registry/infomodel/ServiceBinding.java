package javax.xml.registry.infomodel;

import java.util.Collection;
import javax.xml.registry.JAXRException;

/**
 * @author Scott.Stark@jboss.org
 * @version $Revision$
 */
public interface ServiceBinding
   extends RegistryObject, URIValidator
{
   public void addSpecificationLink(SpecificationLink specificationLink) throws JAXRException;
   public void addSpecificationLinks(Collection specificationLinks) throws JAXRException;
   public String getAccessURI() throws JAXRException;
   public Service getService() throws JAXRException;
   public Collection getSpecificationLinks() throws JAXRException;
   public ServiceBinding getTargetBinding() throws JAXRException;
   public void removeSpecificationLink(SpecificationLink specificationLink) throws JAXRException;
   public void removeSpecificationLinks(Collection specificationLinks) throws JAXRException;
   public void setAccessURI(String uri) throws JAXRException;
   public void setTargetBinding(ServiceBinding binding) throws JAXRException;

}
