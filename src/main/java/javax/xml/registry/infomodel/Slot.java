package javax.xml.registry.infomodel;

import java.util.Collection;
import javax.xml.registry.JAXRException;

/**
 * @author Scott.Stark@jboss.org
 * @version $Revision$
 */
public interface Slot
{
   public static final String ADDRESS_LINES_SLOT="addressLines";
   public static final String AUTHORIZED_NAME_SLOT="authorizedName";
   public static final String OPERATOR_SLOT="operator";
   public static final String SORT_CODE_SLOT="sortCode";

   public String getName() throws JAXRException;
   public String getSlotType() throws JAXRException;
   public Collection getValues() throws JAXRException;
   public void setName(String name) throws JAXRException;
   public void setSlotType(String type) throws JAXRException;
   public void setValues(Collection values) throws JAXRException;

}
