package javax.xml.registry;

import java.util.Collection;
import javax.xml.registry.infomodel.Key;
import javax.xml.registry.infomodel.Concept;
import javax.xml.registry.infomodel.ClassificationScheme;

/**
 * @author Scott.Stark@jboss.org
 * @version $Revision$
 */
public interface BusinessQueryManager
   extends QueryManager
{
   public BulkResponse findAssociations(Collection findQualifiers,
      String sourceObjectId, String targetObjectId,
      Collection associationTypes)
      throws JAXRException;
   public BulkResponse findCallerAssociations(Collection findQualifiers,
      Boolean confirmedByCaller, Boolean confirmedByOtherParty,
      Collection associationTypes)
      throws JAXRException;
   public ClassificationScheme findClassificationSchemeByName(
      Collection findQualifiers, String namePattern)
      throws JAXRException;
   public BulkResponse findClassificationSchemes(Collection findQualifiers,
      Collection namePatterns, Collection classifications,
      Collection externalLinks)
      throws JAXRException;
   public Concept findConceptByPath(String path)
      throws JAXRException;
   public BulkResponse findConcepts(Collection findQualifiers,
      Collection namePatterns, Collection classifications,
      Collection externalIdentifiers, Collection externalLinks)
      throws JAXRException;
   public BulkResponse findOrganizations(Collection findQualifiers,
      Collection namePatterns, Collection classifications,
      Collection specifications, Collection externalIdentifiers,
      Collection externalLinks)
      throws JAXRException;
   public BulkResponse findRegistryPackages(Collection findQualifiers,
      Collection namePatterns, Collection classifications,
      Collection externalLinks)
      throws JAXRException;
   public BulkResponse findServiceBindings(Key serviceKey,
      Collection findQualifiers, Collection classifications,
      Collection specifications)
      throws JAXRException;
   public BulkResponse findServices(Key orgKey, Collection findQualifiers,
      Collection namePatterns, Collection classifications,
      Collection specifications)
      throws JAXRException;

}
