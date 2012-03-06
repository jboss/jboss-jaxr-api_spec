package javax.xml.registry;

/**
 * @author Scott.Stark@jboss.org
 * @version $Revision$
 */
public class FindException
   extends RegistryException
{
   public FindException()
   {
      
   }
   public FindException(String reason)
   {
      super(reason);
   }
   public FindException(String reason, Throwable cause)
   {
      super(reason, cause);
   }

   public FindException(Throwable cause)
   {
      super(cause);
   }
}
