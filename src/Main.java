//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    HubCenter hub = new HubCenter();

    DispositivoInteligente foco =
            new DispositivoInteligente("Foco del dormitorio", true);

    DispositivoInteligente aire =
            new DispositivoInteligente("Aire acondicionado", true);

    DispositivoInteligente televisor =
            new DispositivoInteligente("Televisor", false);

    hub.agregarDispositivo(foco);
    hub.agregarDispositivo(aire);
    hub.agregarDispositivo(televisor);

    foco.encender();
    aire.encender();

    hub.activarModoNoche();
}

