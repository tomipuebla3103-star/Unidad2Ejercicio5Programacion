public class DispositivoInteligente {
    String nombre;
    boolean conectado;
    boolean encendido;

    public DispositivoInteligente(String nombre, boolean conectado) {
        this.nombre = nombre;
        this.conectado = conectado;
        this.encendido = false;
    }

    public void encender() {
        if (conectado) {
            encendido = true;
            System.out.println(nombre + " encendido.");
        } else {
            System.out.println(nombre + " está desconectado.");
        }
    }

    public void apagar() {
        if (conectado) {
            encendido = false;
            System.out.println(nombre + " apagado.");
        } else {
            System.out.println(nombre + " está desconectado. No se puede apagar.");
        }
    }

    public void configurar(String parametro) {
        if (conectado) {
            System.out.println(nombre + " configurado: " + parametro);
        } else {
            System.out.println(nombre + " está desconectado. No se puede configurar.");
        }
    }
}
