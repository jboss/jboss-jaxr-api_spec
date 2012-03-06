package javax.xml.registry;

/** A JAXR requests' response.
 * @author Scott.Stark@jboss.org
 * @version $Revision$
 */
public interface JAXRResponse
{
   public static final int STATUS_FAILURE = 2;
   public static final int STATUS_SUCCESS = 0;
   public static final int STATUS_UNAVAILABLE = 3;
   public static final int STATUS_WARNING = 1;

   public String getRequestId() throws JAXRException;
   public int getStatus() throws JAXRException;
   public boolean isAvailable() throws JAXRException;
}
