import java.util.Map;

public class QueryHandler {
    private UserQuery userQuery;

    public QueryHandler(Map<String, Usuario> userStore) {
        this.userQuery = new UserQuery(userStore);
    }

    public Usuario getUserById(String id) {
        return userQuery.findUserById(id);
    }
}
