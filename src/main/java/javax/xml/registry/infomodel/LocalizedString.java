package javax.xml.registry.infomodel;

import java.util.Locale;
import javax.xml.registry.JAXRException;

/**
 * @author Scott.Stark@jboss.org
 * @version $Revision$
 */
public interface LocalizedString
{
   public static final String DEFAULT_CHARSET_NAME="UTF-8";

   public String getCharsetName() throws JAXRException;
   public java.util.Locale getLocale() throws JAXRException;
   public String getValue() throws JAXRException;
   public void setCharsetName(String charsetName) throws JAXRException;
   public void setLocale(Locale locale) throws JAXRException;
   public void setValue(String value) throws JAXRException;
}
