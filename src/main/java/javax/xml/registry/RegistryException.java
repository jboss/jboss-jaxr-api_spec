package javax.xml.registry;

import javax.xml.registry.infomodel.Key;

/**
 * @author Scott.Stark@jboss.org
 * @version $Revision$
 */
public class RegistryException
   extends JAXRException
{
   private static final long serialVersionUID = -2972094643801708304L;
   
   private Key key;

	public RegistryException()
   {
   }
	public RegistryException(String msg)
   {
      this(msg, null);
   }
	public RegistryException(String msg, Throwable cause)
   {
      super(msg, cause);
   }

	public RegistryException(Throwable cause)
   {
      super(cause);
   }

	public Key getErrorObjectKey() throws JAXRException
   {
      return key;
   }
	public void setErrorObjectKey(Key key) throws JAXRException
   {
      this.key = key;
   }
}
