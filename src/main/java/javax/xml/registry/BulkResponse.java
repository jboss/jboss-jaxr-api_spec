package javax.xml.registry;

import java.util.Collection;

/** Contains the response of a method in the API that performs a bulk operation
 * and returns a bulk response. Partial commits are allowed on a bulk operation. 
 * 
 * In the event of a partial success where only a subset of objects were
 * processed successfully, the getStatus method of the BulkResponse must return
 * JAXRResponse.STATUS_WARNING. In this case, a Collection of JAXRException
 * instances is included in the BulkResponse instance. The JAXRExceptions
 * provide information on each error that prevented some objects in the request
 * to not be processed successfully.
 * 
 * @author Scott.Stark@jboss.org
 * @author Farrukh S. Najmi (javadoc)
 * @version $Revision$
 */
public interface BulkResponse extends JAXRResponse
{
   public Collection getCollection() throws JAXRException;
   public Collection getExceptions() throws JAXRException;
   public boolean isPartialResponse() throws JAXRException;
}
