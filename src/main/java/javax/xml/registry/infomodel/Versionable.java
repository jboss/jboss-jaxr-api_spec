package javax.xml.registry.infomodel;

import javax.xml.registry.JAXRException;

/**
 * @author Scott.Stark@jboss.org
 * @version $Revision$
 */
public interface Versionable
{
   public int getMajorVersion() throws JAXRException;
   public int getMinorVersion() throws JAXRException;
   public String getUserVersion() throws JAXRException;
   public void setMajorVersion(int majorVersion) throws JAXRException;
   public void setMinorVersion(int minorVersion) throws JAXRException;
   public void setUserVersion(String userVersion) throws JAXRException;
}
