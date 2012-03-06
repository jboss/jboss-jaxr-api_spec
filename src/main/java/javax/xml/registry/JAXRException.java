package javax.xml.registry;

/**
 * @author Scott.Stark@jboss.org
 * @version $Revision$
 */
public class JAXRException extends Exception
   implements JAXRResponse
{
   private static final long serialVersionUID = -396751348710944315L;
   
   protected Throwable cause;

   public JAXRException()
   {
   }
   public JAXRException(String msg)
   {
      super(msg);
   }
   public JAXRException(String msg, Throwable cause)
   {
      super(msg, cause);
   }
   public JAXRException(Throwable cause)
   {
      super(cause);
   }
   public String getRequestId()
   {
      return null;
   }
   public int getStatus()
   {
      return 0;
   }
   public boolean isAvailable() throws JAXRException
   {
      return true;
   }

   /** Initializes the cause of this throwable to the specified value. (The
    * cause is the throwable that caused this throwable to get thrown.)
    * 
    * This method can be called at most once. It is generally called from
    * within the constructor, or immediately after creating the throwable. If
    * this throwable was created with JAXRException(Throwable) or
    * JAXRException(String,Throwable), this method cannot be called even once. 
    * 
    * @param cause
    * @return this
    */ 
   public Throwable initCause(Throwable cause)
   {
      if( this.cause != null )
      {
         if( this.cause == this )
            throw new IllegalArgumentException("A throwable cannot be its own cause.");
         else
            throw new IllegalStateException("cause has already been set"); 
      }
      this.cause = cause;
      super.initCause(cause);
      return this;
   }
}
