# 🛒 Ecommerce Backend - Reto #HágaseUnEcommerceChallenge

Este proyecto corresponde al desarrollo del backend para una tienda en línea de accesorios tecnológicos, como parte del reto propuesto por el programa #HagaseUnEcommerceChallenge.

## 📌 Día 1: Mockup

- Diseño wireframe realizado en Excalidraw con pantalla de catálogo, login y carrito.
- [Mockup en imagen](https://github.com/Biershoot/Backend-Ecommerce-Trycach/blob/main/src/main/resources/mockup.png)

## 📌 Día 2: Diseño de la Base de Datos

- Modelo relacional implementado en MySQL.
- Tabla principal: `products`
- [Imagen del diseño de la base de datos](https://github.com/Biershoot/Backend-Ecommerce-Trycach/blob/main/src/main/resources/Base_de_Datos_Modelo_Entidad_Relacion.png)

## 📌 Día 3: CRUD Backend - Parte 1

Se desarrolló una API REST para gestionar productos.

### Endpoints implementados:

| Método | Endpoint             | Descripción                  |
|--------|----------------------|------------------------------|
| GET    | `/api/products`      | Listar todos los productos   |
| POST   | `/api/products`      | Crear un nuevo producto      |

---

## 📌 Día 4: CRUD Backend - Parte 2 ✅

### Nuevos endpoints implementados:

| Método  | Endpoint               | Descripción                    |
|---------|------------------------|--------------------------------|
| PUT     | `/api/products/{id}`   | Actualizar un producto         |
| DELETE  | `/api/products/{id}`   | Eliminar un producto           |

### Pruebas

- ✅ Todos los endpoints han sido **probados con Postman**
- ✅ Comprobación de respuestas correctas (`200 OK`, `201 Created`, `204 No Content`, etc.)
- ✅ Comportamiento validado con datos reales

---

## 🛠️ Tecnologías utilizadas

- Java 17
- Spring Boot 3
- Spring Data JPA
- MySQL
- Lombok
- Postman (para pruebas)
- Excalidraw / draw.io (para diagramas)

---

## ⚙️ Configuración del proyecto

1. Clona el repositorio:

```bash
git clone https://github.com/tu_usuario/tu_repositorio.git
