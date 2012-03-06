package javax.xml.registry.infomodel;

import java.util.Collection;
import javax.xml.registry.JAXRException;

/**
 * @author Scott.Stark@jboss.org
 * @version $Revision$
 */
public interface ExtensibleObject
{
	public void addSlot(Slot slot) throws JAXRException;
	public void addSlots(Collection slots) throws JAXRException;
	public Slot getSlot(String slotName) throws JAXRException;
	public java.util.Collection getSlots() throws JAXRException;
	public void removeSlot(String slotName) throws JAXRException;
	public void removeSlots(Collection slotNames) throws JAXRException;
}
