package javax.xml.registry;

/**
 * @author Scott.Stark@jboss.org
 * @version $Revision$
 */
public class InvalidRequestException
   extends JAXRException
{
   public InvalidRequestException()
   {
      
   }
   public InvalidRequestException(String reason)
   {
      super(reason);
   }
   public InvalidRequestException(String reason, Throwable cause)
   {
      super(reason, cause);
   }

   public InvalidRequestException(Throwable cause)
   {
      super(cause);
   }
}
