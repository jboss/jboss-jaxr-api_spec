package javax.xml.registry;

import java.util.Set;

/**
 * @author Scott.Stark@jboss.org
 * @version $Revision$
 */
public interface Connection
{
   public void close() throws JAXRException;
   public Set getCredentials() throws JAXRException;
   public RegistryService getRegistryService() throws JAXRException;
   public boolean isClosed() throws JAXRException;
   public boolean isSynchronous() throws JAXRException;
   public void setCredentials(Set credentials) throws JAXRException;
   public void setSynchronous(boolean synch) throws JAXRException;

}
