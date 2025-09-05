
import users.models.User;
import users.useCases.UserUseCase;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hola Estudiantes!");
        UserUseCase userUseCase = new UserUseCase();

        // Create

        System.out.println("Se procede a crear los Usuarios...");
        String create = userUseCase.create("Luis Jimenez.", 3001234567d);
        // System.out.println(create);

        String create2 = userUseCase.create("Pedro Rodriguez.",3102345211d);
        // System.out.println(create2);
        System.out.println("\n\n");

        System.out.println("Consultar todos los usuarios...");
        // Read
        String read = userUseCase.all();
        System.out.println(read);
        System.out.println("\n\n");

        System.out.println("Se ha consultado el Usuario con el indice 1");
         // Read find by index
        String read2 = userUseCase.findByIndex(1);
        System.out.println(read2);
        System.out.println("\n\n");


        System.out.println("Se Actualizo el Usuario con indice 0.");
        // Update
        String update = userUseCase.update(0, "Luis Jimenez", 3011234567d, true);
        System.out.println(update);

        System.out.println("\n\n");


        System.out.println("Se Elimino el Usuario con indice 1.");
        // Delete
        String delete = userUseCase.delete(1);
        System.out.println(delete);
    }
}