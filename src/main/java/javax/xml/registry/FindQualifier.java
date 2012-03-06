package javax.xml.registry;

/** FindQualifier provides various constants that identify options that effect
 * find method behavior. A JAXR provider may silently ignore any qualifiers
 * marked as optional. A JAXR provider must support qualifiers not marked
 * optional.
 *  
 * @author Scott.Stark@jboss.org
 * @version $Revision$
 */
public interface FindQualifier
{
   public static final String AND_ALL_KEYS="andAllKeys";
   public static final String CASE_SENSITIVE_MATCH="caseSensitiveMatch";
   public static final String COMBINE_CLASSIFICATIONS="combineClassifications";
   public static final String EXACT_NAME_MATCH="exactNameMatch";
   public static final String OR_ALL_KEYS="orAllKeys";
   public static final String OR_LIKE_KEYS="orLikeKeys";
   public static final String SERVICE_SUBSET="serviceSubset";
   public static final String SORT_BY_DATE_ASC="sortByDateAsc";
   public static final String SORT_BY_DATE_DESC="sortByDateDesc";
   public static final String SORT_BY_NAME_ASC="sortByNameAsc";
   public static final String SORT_BY_NAME_DESC="sortByNameDesc";
   public static final String SOUNDEX="soundex";

}
