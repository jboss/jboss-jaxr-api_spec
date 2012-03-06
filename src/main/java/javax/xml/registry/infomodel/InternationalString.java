package javax.xml.registry.infomodel;

import java.util.Collection;
import java.util.Locale;
import javax.xml.registry.JAXRException;

/**
 * @author Scott.Stark@jboss.org
 * @version $Revision$
 */
public interface InternationalString
{
   public void addLocalizedString(LocalizedString localizedString) throws JAXRException;
   public void addLocalizedStrings(Collection localizedStrings) throws JAXRException;
   public LocalizedString getLocalizedString(Locale locale, String charsetName) 
      throws JAXRException;
   public Collection getLocalizedStrings() throws JAXRException;
   public String getValue() throws JAXRException;
   public String getValue(Locale locale) throws JAXRException;
   public void removeLocalizedString(LocalizedString localizedString) throws JAXRException;
   public void removeLocalizedStrings(Collection localizedStrings) throws JAXRException;
   public void setValue(String value) throws JAXRException;
   public void setValue(Locale locale, String value) throws JAXRException;

}
