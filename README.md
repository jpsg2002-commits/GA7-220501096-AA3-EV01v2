# Módulo de Inventario - Software ADSO (SENA)
 Información de la Evidencia
* **Evidencia:** GA7-220501096-AA3-EV01: Codificación de módulos del software stand-alone, web y móvil.
* **Aprendiz:** Juan Pablo Sarmiento
* **Ficha:** 3186626

 Descripción del Proyecto
Este módulo corresponde al sistema de control de inventarios desarrollado para la gestión de productos. Implementa los principios de la Programación Orientada a Objetos (POO) en Java y la lógica de operaciones CRUD (Crear, Leer, Actualizar, Eliminar).

 Tecnologías y Estándares Aplicados
* **Lenguaje:** Java SE / JDK 17+
* **Arquitectura:** Modelo - Controlador (MVC simplificado)
* **Control de Versiones:** Git & GitHub (con commits estructurados y trazabilidad)
* **Estándares de Codificación:** Clean Code, comentarios descriptivos en clases y métodos, encapsulamiento y nombres significativos.

Estructura del Código Fuente
1. **`Producto.java`**: Clase entidad que define los atributos principales del producto (id, nombre, descripción, precio, stock) y sus métodos de encapsulamiento (Getters y Setters).
2. **`InventarioApp.java`**: Clase principal que simula la ejecución y controlador de la lógica de negocio, ejecutando las pruebas del CRUD de manera secuencial y mostrando resultados en consola.

Pruebas de Funcionamiento (CRUD)
El sistema ejecuta las siguientes operaciones al iniciar:
* **CREATE:** Registro de nuevos productos en memoria/estructura de datos.
* **READ:** Listado en tiempo real de los elementos almacenados.
* **UPDATE:** Modificación de atributos específicos (como el stock).
* **DELETE:** Eliminación segura de registros por medio de identificador único (`id`).
