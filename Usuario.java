public class Usuario {
    private String id;
    private static String name;
    
    public Usuario(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public static String getName() {
        return name;
    }
}
