package javax.xml.registry;

/**
 * @author Scott.Stark@jboss.org
 * @version $Revision$
 */
public class SaveException
   extends RegistryException
{
	public SaveException()
   {
   }
	public SaveException(String msg)
   {
      this(msg, null);
   }
	public SaveException(String msg, Throwable cause)
   {
      super(msg, cause);
   }

	public SaveException(Throwable cause)
   {
      super(cause);
   }

}
