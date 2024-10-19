

import java.util.HashMap;
import java.util.Map;
import java.util.Map;


import java.util.HashMap;

public class Main {
    public static <Us> void main(String[] args) {
        CommandHandler commandHandler = new CommandHandler();
        HashMap<String, Usuario> userStore = new HashMap<>();
        QueryHandler queryHandler = new QueryHandler(userStore);

       
        Crearusuariocommand createCommand = new Crearusuariocommand("1", "Juan");
        commandHandler.handle(createCommand);

        Usuario user = queryHandler.getUserById("1");
        if (user != null) {
            System.out.println("Usuario encontrado: " + user.getName());
        } else {
            System.out.println("Usuario no encontrado");
        }
    }
}

