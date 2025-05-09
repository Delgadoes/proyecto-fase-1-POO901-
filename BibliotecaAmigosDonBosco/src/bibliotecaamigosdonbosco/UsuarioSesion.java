
package bibliotecaamigosdonbosco;


public class UsuarioSesion {
        // Variable estática para almacenar el ID del usuario
    private static int idUsuario;

    // Método para obtener el ID del usuario
    public static int getIdUsuario() {
        return idUsuario;
    }

    // Método para guardar el ID del usuario
    public static void setIdUsuario(int id) {
        idUsuario = id;
    }
}
