package javax.xml.registry.infomodel;

import java.util.Collection;
import java.util.Set;
import javax.xml.registry.JAXRException;

/**
 * @author Scott.Stark@jboss.org
 * @version $Revision$
 */
public interface RegistryPackage
   extends RegistryEntry
{
   public void addRegistryObject(RegistryObject registryObject) throws JAXRException;
   public void addRegistryObjects(Collection registryObjects) throws JAXRException;
   public Set getRegistryObjects() throws JAXRException;
   public void removeRegistryObject(RegistryObject registryObject) throws JAXRException;
   public void removeRegistryObjects(Collection registryObjects) throws JAXRException;

}
