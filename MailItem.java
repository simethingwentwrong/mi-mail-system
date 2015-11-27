
/**
 * Write a description of class MailItem here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MailItem
{
    // desde donde viene el mensaje
    private String from;
    // para quien es el mensaje
    private String to;
    // el mensaje
    private String message;
    
/**
 * Creamos el constructor para que MailItem tenga atributos para inicializarse
 */
public MailItem(String from, String to, String message)
{
    this.from =  from;
    this.to =  to;
    this.message = message;
}

/**
 * metodo getter para from
 */
public String getFrom()
{
    return from;
}
/**
 * metodo getter para to
 */
public String getTo()
{
    return to;
}

/**
 * metodo getter para message
 */
public String getMessage()
{
    return message;
}

/**
 * imprimir lo que tenemos
 */
public void print ()
{
    System.out.println("From: " + from);
    System.out.println("To: " + to);
    System.out.println("Message: " + message);
}
}


    