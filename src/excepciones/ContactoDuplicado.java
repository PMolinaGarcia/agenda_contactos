package excepciones;
import dominio.*;

/**
 * Esta es la clase de la excepción causada por contactos duplicados.
 * En esta clase creamos la excepción para que pueda ser lanzada cuando, al añadir un contacto, el usuario pretenda añadir uno con los mismos datos que uno ya existente.
 */
public class ContactoDuplicado extends Exception {

    /**
     * Definición del atributo contactoDuplicado, que es de la clase Contacto.
     */
    private Contacto contactoDuplicado;

    /**
     * Definición del constructor de los contactos duplicados para asignar un valor inicial al contacto duplicado.
     * @param contactoDuplicado el contacto introducido por el usuario, que coincide con uno existente en la agenda.
     */
    public ContactoDuplicado(Contacto contactoDuplicado){
        this.contactoDuplicado=contactoDuplicado;
    }

    /**
     * Definición de un constructor vacío, sin parámetros.
     */
    public ContactoDuplicado(){}

    /**
     * Método getter para obtener el contacto duplicado que ha sido introducido.
     * @return El contacto duplicado introducido por el usuario.
     */
    public Contacto getContactoDuplicado(){
        return contactoDuplicado;
    }

}
