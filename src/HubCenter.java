import java.util.ArrayList;
public class HubCenter {
    ArrayList<DispositivoInteligente> dispositivos;

    public HubCenter() {
        dispositivos = new ArrayList<>();
    }

    public void agregarDispositivo(DispositivoInteligente dispositivo) {
        dispositivos.add(dispositivo);
    }

    public void activarModoNoche() {

        System.out.println("===== ACTIVANDO MODO NOCHE =====");

        for (DispositivoInteligente dispositivo : dispositivos) {

            if (dispositivo.conectado) {
                dispositivo.apagar();
                dispositivo.configurar("Modo noche");
            } else {
                System.out.println(
                        dispositivo.nombre + " está desconectado. Se ignora."
                );
            }
        }

        System.out.println("===== MODO NOCHE ACTIVADO =====");
    }
}
