package users.useCases;

import java.util.ArrayList;
import java.util.List;

import users.models.User;

// Contenedor de metodos y atributos
public class UserUseCase { // Clase de las acciones a realizar el Use Case

    // Propiedad
    private final List<User> users; // Definicion Lista en memoria

    // Constructor
    public UserUseCase() {
        this.users = new ArrayList<>(); // Inicializacion - Preparar el uso de la lista.
    }

    // Read
    public String all(){
        try {
            StringBuilder result = new StringBuilder(); // preparando la concatenacion de los strings.
            for (int i = 0; i < users.size(); i++) { // Se procede a concatenar los Usuarios al string.
                User user = users.get(i); // Se obtiene el usuario.
                result.append("Usuario ")
                .append(i)
                .append(": ")
                .append(user.getUserName())
                .append(" Telefono: ")
                .append(user.getPhoneNumber())
                .append("\n"); // Concatenar el Usuario al string.
            }

            return result.toString(); // Retornando la concatenacion de los Usuarios.
            
        } catch (Exception e) {
           return "No ha sido posible listar los Usuarios.";
        }
    }

    // Read by index
    public String findByIndex(int index){
        try {
             User userFound = new User(); // Todavia no se ha encontrado
            for (int i = 0; i < users.size(); i++) { // Se procede a buscar
                if(index == i){ // Se aplica el filtro o condicional
                    User user = users.get(index); // Se obtiene el usuario encontrada
                    userFound = user; // Se asigna el Usuario encontrada
                }
            }
            // Se imprime el Usuario encontrada.
            return "Usuario Encontrado:" + userFound.getUserName() + " Telefono:" + userFound.getPhoneNumber();
        }
        catch (Exception e) {
            return "no ha sido posible encontrar el Usuario.";
        }
    }

    // Create
    public String create(String userName, double phoneNumber) {
        try {
            User user = new User(userName, phoneNumber, false);
            this.users.add(user); // Uso de la lista
            return "Usuario encontrado:" + user.getUserName() + " Telefono:" + user.getPhoneNumber();
        }
        catch (Exception e) {
            return "Ha ocurrido un error, por favor intentelo nuevo";
        }
    }

    // Update
    public String update(int index, String userName, double phoneNumber, boolean status){ 
        try {
            User userFound = new User();
            for (int i = 0; i < users.size(); i++) {
               if(index == i){
                User user = users.get(index);
                user.setUserName(userName);
                user.setPhoneNumber(phoneNumber);
                user.setStatus(status);
                userFound = user;
               }
            }
            return "Usuario Actualizada:" + userFound.getUserName() + " Telefono:" + userFound.getPhoneNumber();
        }
        catch (Exception e) {
            return "Ha ocurrido un error, por favor intentelo nuevo";
        }
    }

    // Delete
    public String delete(int index){
       try {
            users.remove(index);
            return "Se ha eliminado el Usuario correctamente.";
       } catch (Exception e) {
            return "no ha sido posible eliminar la tarea.";
       }
    }
}
