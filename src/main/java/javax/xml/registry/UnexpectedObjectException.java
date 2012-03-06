package javax.xml.registry;

/**
 * @author Scott.Stark@jboss.org
 * @version $Revision$
 */
public class UnexpectedObjectException
   extends JAXRException
{
   public UnexpectedObjectException()
   {
   }
   public UnexpectedObjectException(String msg)
   {
      super(msg);
   }
   public UnexpectedObjectException(String msg, Throwable cause)
   {
      super(msg, cause);
   }
   public UnexpectedObjectException(Throwable cause)
   {
      super(cause);
   }
}
