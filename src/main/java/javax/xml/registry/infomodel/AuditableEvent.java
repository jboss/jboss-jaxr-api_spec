package javax.xml.registry.infomodel;

import java.sql.Timestamp;
import javax.xml.registry.JAXRException;

/**
 * @author Scott.Stark@jboss.org
 * @version $Revision$
 */
public interface AuditableEvent
   extends RegistryObject
{
	public static final int EVENT_TYPE_CREATED=0;
	public static final int EVENT_TYPE_DELETED=1;
	public static final int EVENT_TYPE_DEPRECATED=2;
	public static final int EVENT_TYPE_UNDEPRECATED=5;
	public static final int EVENT_TYPE_UPDATED=3;
	public static final int EVENT_TYPE_VERSIONED=4;

	public int getEventType() throws JAXRException;
	public RegistryObject getRegistryObject() throws JAXRException;
	public Timestamp getTimestamp() throws JAXRException;
	public User getUser() throws JAXRException;
}
