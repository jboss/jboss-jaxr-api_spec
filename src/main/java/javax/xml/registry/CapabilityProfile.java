package javax.xml.registry;

/**
 * @author Scott.Stark@jboss.org
 * @version $Revision$
 */
public interface CapabilityProfile
{
   public int getCapabilityLevel() throws JAXRException;
   public String getVersion() throws JAXRException;
}
