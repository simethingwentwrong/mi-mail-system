
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
    // añadir asunto para el correo 
    private String subjet;
/**
 * Creamos el constructor para que MailItem tenga atributos para inicializarse
 */
public MailItem(String from, String to, String message, String subjet)
{
    this.from =  from;
    this.to =  to;
    this.message = message;
    this.subjet = subjet;
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
 * metodo getter para subjet
 */
public String getSubjet()
{
    return subjet;
}

/**
 * imprimir lo que tenemos
 */
public void print ()
{
    System.out.println("From: " + from);
    System.out.println("To: " + to);
    System.out.println("Message: " + message);
    System.out.println("Subjet: " + subjet);
}
}


    