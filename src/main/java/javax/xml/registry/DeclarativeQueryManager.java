package javax.xml.registry;

/**
 * @author Scott.Stark@jboss.org
 * @version $Revision$
 */
public interface DeclarativeQueryManager
   extends QueryManager
{
	public Query createQuery(int queryType, String queryString)
      throws InvalidRequestException, JAXRException;
	public BulkResponse executeQuery(Query query) throws JAXRException;
}
