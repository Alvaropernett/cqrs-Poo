import java.util.HashMap;
import java.util.Map;

public class CommandHandler {
    private Map<String, Usuario> userStore = new HashMap<>();

    public void handle(Crearusuariocommand command) {

        Usuario user = new Usuario(command.getId(), command.getName());

        userStore.put(user.getId(), user);
        
        System.out.println("Usuario creado: " + user.getName());
    }
}
