<img width="483" height="220" alt="WhatsApp Image 2026-09-28 at 16 14 37" src="https://github.com/user-attachments/assets/713ba79a-2aa6-401a-9b5e-d703a42a7a4a" />

Automatización del Hogar Inteligente

 Descripción
Este proyecto consiste en un sistema en Java que permite controlar diferentes dispositivos de una casa inteligente mediante un objeto central llamado `HubCentral`. El hub envía comandos para encender, apagar o configurar los dispositivos según las necesidades del usuario.

Clases
- **DispositivoInteligente:** representa un dispositivo del hogar y contiene métodos para encenderlo, apagarlo y configurar sus parámetros. También permite controlar si está conectado.
- **HubCentral:** almacena los dispositivos inteligentes y se encarga de enviarles comandos, como activar el modo noche.

Funcionamiento
En el `main` se crea un objeto `HubCentral` y se agregan al menos tres dispositivos inteligentes. Luego, se ejecuta el método `activarModoNoche()`, que recorre los dispositivos y les envía las órdenes correspondientes.

Recorrido del mensaje
1. El programa crea el hub central y los dispositivos inteligentes.
2. Los dispositivos se agregan al hub para que pueda controlarlos.
3. Se llama al método `activarModoNoche()` del hub central.
4. El hub recorre los dispositivos y verifica si están conectados.
5. Si un dispositivo está conectado, recibe el comando correspondiente, como apagarse o ajustar su configuración.
6. Si está desconectado, el hub evita enviarle órdenes y lo informa por consola.
7. Finalmente, se muestra un reporte con las acciones realizadas y los dispositivos que no pudieron ser controlados.

 Validaciones
Antes de enviar un comando, el hub comprueba que el dispositivo esté conectado. De esta manera, evita realizar operaciones sobre dispositivos que no pueden recibir mensajes.

 Objetivo
Practicar la comunicación entre objetos en Java, el uso de colecciones, las referencias entre clases, los métodos y las validaciones al controlar varios dispositivos desde un objeto central.
