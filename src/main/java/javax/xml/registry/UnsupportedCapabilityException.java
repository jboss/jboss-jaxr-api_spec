package javax.xml.registry;

/**
 * @author Scott.Stark@jboss.org
 * @version $Revision$
 */
public class UnsupportedCapabilityException
   extends JAXRException
{
   public UnsupportedCapabilityException()
   {
   }
   public UnsupportedCapabilityException(String msg)
   {
      super(msg);
   }
   public UnsupportedCapabilityException(String msg, Throwable cause)
   {
      super(msg, cause);
   }
   public UnsupportedCapabilityException(Throwable cause)
   {
      super(cause);
   }
}
