package javax.xml.registry;

/**
 * @author Scott.Stark@jboss.org
 * @version $Revision$
 */
public class DeleteException
   extends RegistryException
{
	public DeleteException()
   {
      
   }
	public DeleteException(String msg)
   {
      super(msg);
   }
	public DeleteException(String msg, Throwable cause)
   {
      super(msg, cause);
   }
	public DeleteException(Throwable cause)
   {
      super(cause);
   }
}
