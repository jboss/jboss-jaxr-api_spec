package javax.xml.registry.infomodel;

import java.util.Date;
import javax.xml.registry.JAXRException;

/**
 * @author Scott.Stark@jboss.org
 * @version $Revision$
 */
public interface RegistryEntry
   extends RegistryObject, Versionable
{
   public static final int STABILITY_DYNAMIC=0;
   public static final int STABILITY_DYNAMIC_COMPATIBLE=1;
   public static final int STABILITY_STATIC=2;
   public static final int STATUS_APPROVED=1;
   public static final int STATUS_DEPRECATED=2;
   public static final int STATUS_SUBMITTED=0;
   public static final int STATUS_WITHDRAWN=3;

   public Date getExpiration() throws JAXRException;
   public int getStability() throws JAXRException;
   public int getStatus() throws JAXRException;
   public void setExpiration(Date expiration) throws JAXRException;
   public void setStability(int stability) throws JAXRException;

}
