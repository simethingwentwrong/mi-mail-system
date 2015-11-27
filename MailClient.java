
/**
 * Write a description of class MailClient here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MailClient
{
    // representacion del seridor asociado a ese cliente
    private MailServer server;
    //representa la direccion de corre del usuario que es cliente
    private String user;

    /**
     * constructor que inicialice metiendo valores
     */
    public MailClient(MailServer server, String user)
    {
        this.server = server;
        this.user = user;
        
    }

    /**
     * devolver el siguiente correo
     */
    public MailItem getNextMailItem()   
    {
        return server.getNextMailItem (user);
    }
    
    /**
     * 
     */
    public void printNextMailItem()
    {
        MailItem item = server.getNextMailItem(user);
        if(item == null) {
            System.out.println("No new mail.");
        }
        else {
            item.print();
        }
    }
}
