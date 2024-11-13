package excepciones;
import dominio.*;

/**
 * Definición de una clase para tratar la excepción de que no se encuentra un contacto.
 * Esta excepción se aplica para la eliminación de contactos, ya que es el único método que hemos definido para que busque en la lista sin el método "buscar" y empleando "contains". Si hubiésemos utilizado "contains" en los otros métodos que involucran búsqueda, también sería necesario utilziar esta excepción.
 */
public class ContactoNoEncontrado extends Exception {

    /**
     * Definición del atributo contactoNoEncontrado, que es un objeto de tipo Contacto.
     */
    private Contacto contactoNoEncontrado;

    /**
     * El constructor del atributo contactoNoEncontrado, que le asigna sus valores iniciales.
     * @param contactoNoEncontrado el contacto introducido por el usuario que no se encuentra en la agenda.
     */
    public ContactoNoEncontrado(Contacto contactoNoEncontrado){
        this.contactoNoEncontrado=contactoNoEncontrado;
    }

    /**
     * El constructor vacío sin parámetros.
     */
    public ContactoNoEncontrado(){}

    /**
     * El método getter para retornar el contacto no encontrado y trabajar con él.
     * @return El contacto introducido por el usuario, que no ha sido encontrado.
     */
    public Contacto getContactoNoEncontrado(){
        return contactoNoEncontrado;
    }


}
