package javax.xml.registry;

/**
 * @author Scott.Stark@jboss.org
 * @version $Revision$
 */
public interface Query
{
   public static final int QUERY_TYPE_EBXML_FILTER_QUERY=2;
   public static final int QUERY_TYPE_SQL=0;
   public static final int QUERY_TYPE_XQUERY=1;

   public int getType() throws JAXRException;
   public String toString();
}
