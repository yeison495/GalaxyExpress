# Galaxy Express 🚀

## Descripción

**Galaxy Express** es un simulador de viajes intergalácticos desarrollado en Java. Este programa permite a los usuarios planificar un viaje interestelar seleccionando planetas de destino y naves espaciales, gestionando recursos como combustible y oxígeno, y enfrentándose a eventos aleatorios que pueden alterar el curso del viaje. El proyecto utiliza estructuras de datos como mapas (`Map`) para manejar destinos, naves y eventos, ofreciendo una experiencia interactiva basada en consola.

---

## Funcionalidades ✨

### 🌍 Explorar Destinos
- Información detallada sobre los planetas disponibles, como distancia desde la Tierra y características principales.

### 🚀 Explorar Naves Espaciales
- Detalles de las naves, incluyendo capacidad, velocidad y características especiales.

### 🛠 Configurar Viaje
- Permite al usuario seleccionar un destino y una nave.
- Calcula el tiempo de viaje estimado.
- Determina los recursos necesarios (combustible y oxígeno) según la distancia y cantidad de pasajeros.

### 🌌 Iniciar Viaje
- Visualiza el progreso del viaje con una barra de progreso interactiva.
- Genera eventos aleatorios que pueden impactar el viaje, como fallas en la nave, lluvias de asteroides o tormentas solares.
- Ofrece soluciones para gestionar los eventos y permite repostar combustible y oxígeno si es necesario.

### ⚡ Eventos Aleatorios
- Simula imprevistos durante el viaje, con opciones para mitigar sus efectos según el tipo de evento.

### 🧪 Repostar Recursos
- Posibilidad de recargar combustible y oxígeno en el punto de control del 50% del viaje.

---

## Estructura del Proyecto 🛠️

El proyecto está compuesto por una única clase principal (`App`) que organiza las funcionalidades del simulador. A continuación, se detallan los métodos más importantes:

### Métodos Clave:
- **main**: Punto de entrada del programa. Controla el flujo principal del simulador y despliega el menú principal.
- **menu**: Presenta las opciones disponibles: explorar destinos, explorar naves, configurar el viaje, iniciar el viaje o salir del programa.

### Mapas de Datos:
- `planetMap()`: Devuelve un mapa con los planetas disponibles y sus distancias.
- `spaceshipMap()`: Devuelve un mapa con las naves espaciales y sus velocidades.
- `eventsMap()`: Devuelve un mapa con eventos aleatorios y sus impactos.
- `solutionMap()`: Devuelve un mapa con soluciones para los eventos y su efectividad.

### Otros Métodos:
- **Configuración de Viaje (`tripConfiguration`)**: Calcula los recursos necesarios (combustible y oxígeno) y el tiempo estimado según el destino, nave seleccionada y cantidad de pasajeros.
- **Iniciar Viaje (`starTravel`)**: Simula el progreso del viaje y gestiona eventos aleatorios, soluciones y repostaje.
- **Eventos Aleatorios (`eventRandom`)**: Selecciona aleatoriamente un evento del mapa de eventos.
- **Solución de Eventos (`eventSolution`)**: Permite al usuario elegir una solución para mitigar un evento inesperado.
- **Repostaje (`reFill`)**: Ofrece al usuario la posibilidad de recargar oxígeno y combustible en el punto de control del viaje.

---

## Requisitos del Sistema 🖥️

- **Java JDK** 8 o superior.
- Entorno de desarrollo (Eclipse, IntelliJ IDEA o cualquier editor de texto con soporte para Java).
- Consola para la interacción con el programa.

---

## Ejecución ▶️

1. Clona o descarga el archivo `App.java` en tu máquina local.
2. Compila y ejecuta el programa desde la consola o un IDE:

```bash
javac App.java
java App
```
---

## Uso del Programa 📖
**Inicio:**
- Ejecuta el programa para ver el mensaje de bienvenida.

**Opciones del Menú:**
1. Selecciona destinos para obtener información sobre planetas.
2. Explora las naves disponibles.
3. Configura un viaje seleccionando un destino, nave y número de pasajeros.
4. Inicia el viaje para experimentar la simulación con barra de progreso y eventos dinámicos.

**Eventos Aleatorios:**
- Gestiona eventos inesperados durante el viaje seleccionando soluciones.

**Punto de Control:**
- Decide si deseas repostar recursos en la mitad del trayecto.

---

## Consideraciones ⚠️
- **Errores de Entrada:** El programa maneja errores comunes como ingresar datos no numéricos y opciones fuera de rango.
- **Eventos Aleatorios:** Las soluciones pueden no ser 100% efectivas, lo que añade un componente de estrategia al viaje.
- **Duración del Viaje:** La duración y los recursos se calculan dinámicamente según el destino y la nave seleccionada.

---


## Mejoras Futuras 🚀
- Implementar una interfaz gráfica para mejorar la experiencia del usuario.
- Añadir más eventos aleatorios y soluciones para enriquecer la jugabilidad.
- Ampliar el catálogo de planetas y naves.
- Guardar y cargar configuraciones de viaje previamente realizadas.

---

## Autores ✍️
- **Yeison Berbesi chapeta** 
- **Joe Weider Berbesi Chapeta**