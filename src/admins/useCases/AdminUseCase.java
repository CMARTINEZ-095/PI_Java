package admins.useCases;

import java.util.ArrayList;
import java.util.List;

import admins.models.Admin;

// Contenedor de metodos y atributos
public class AdminUseCase {
    // Propiedad
    private final List<Admin> admins;

    // Constructor
    public AdminUseCase() {
        this.admins = new ArrayList<>();
    }

    // Read
    public String all(){
        try {
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < admins.size(); i++) {
                Admin admin = admins.get(i);
                result.append("Admin ")
                .append(i)
                .append(": ")
                .append(admin.getAdminName())
                .append(" Telefono: ")
                .append(admin.getPhoneNumber())
                .append("\n");
            }
            return result.toString();
        } catch (Exception e) {
           return "No ha sido posible listar los Admins.";
        }
    }

    // Read by index
    public String findByIndex(int index){
        try {
             Admin adminFound = new Admin();
            for (int i = 0; i < admins.size(); i++) {
                if(index == i){
                    Admin admin = admins.get(index);
                    adminFound = admin;
                }
            }
            return "Admin Encontrado:" + adminFound.getAdminName() + " Telefono:" + adminFound.getPhoneNumber();
        }
        catch (Exception e) {
            return "no ha sido posible encontrar el Admin.";
        }
    }

    // Create
    public String create(String adminName, double phoneNumber) {
        try {
            Admin admin = new Admin(adminName, phoneNumber, false);
            this.admins.add(admin);
            return "Admin creado:" + admin.getAdminName() + " Telefono:" + admin.getPhoneNumber();
        }
        catch (Exception e) {
            return "Ha ocurrido un error, por favor intentelo nuevo";
        }
    }

    // Update
    public String update(int index, String adminName, double phoneNumber, boolean status){ 
        try {
            Admin adminFound = new Admin();
            for (int i = 0; i < admins.size(); i++) {
               if(index == i){
                Admin admin = admins.get(index);
                admin.setAdminName(adminName);
                admin.setPhoneNumber(phoneNumber);
                admin.setStatus(status);
                adminFound = admin;
               }
            }
            return "Admin Actualizado:" + adminFound.getAdminName() + " Telefono:" + adminFound.getPhoneNumber();
        }
        catch (Exception e) {
            return "Ha ocurrido un error, por favor intentelo nuevo";
        }
    }

    // Delete
    public String delete(int index){
       try {
            admins.remove(index);
            return "Se ha eliminado el Admin correctamente.";
       } catch (Exception e) {
            return "no ha sido posible eliminar el Admin.";
       }
    }
}
