import java.util.HashMap;
import java.util.Map;

public class UserQuery {
    private Map<String, Usuario> userStore;

    public UserQuery(Map<String, Usuario> userStore) {
        this.userStore = userStore;
    }

    public Usuario findUserById(String id) {
        return userStore.get(id);
    }
}
