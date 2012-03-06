package javax.xml.registry.infomodel;

import javax.activation.DataHandler;
import javax.xml.registry.JAXRException;

/**
 * @author Scott.Stark@jboss.org
 * @version $Revision$
 */
public interface ExtrinsicObject
   extends RegistryEntry
{
   public String getMimeType() throws JAXRException;
   public DataHandler getRepositoryItem() throws JAXRException;
   public boolean isOpaque() throws JAXRException;
   public void setMimeType(String mimeType) throws JAXRException;
   public void setOpaque(boolean flag) throws JAXRException;
   public void setRepositoryItem(DataHandler item) throws JAXRException;

}
