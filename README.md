# 💱 Conversor de Monedas - Challenge ONE - Java Back-End

![Java](https://img.shields.io/badge/Java-17-blue.svg)
![IntelliJ IDEA](https://img.shields.io/badge/IDE-IntelliJ-orange.svg)
![Estado](https://img.shields.io/badge/Estado-Completado-success)
![Challenge](https://img.shields.io/badge/ONE-Alura%20Latam-green)

> Proyecto creado como parte del **Challenge de Oracle Next Education (ONE)** en alianza con **Alura Latam**.

---

## ✨ Descripción

Este proyecto consiste en un conversor de monedas basado en consola que:

✅ Conecta a una API externa (ExchangeRate API)  
✅ Permite al usuario convertir entre distintas monedas latinoamericanas y el dólar  
✅ Guarda el historial de conversiones en un archivo `.txt`  
✅ Aplica buenas prácticas de programación y separación en paquetes

---

## 📸 Vista previa del menú

    *************************************
                Sea bienvenido/a al Conversor de Moneda 🦖 =]

                1) Dólar => Peso argentino
                2) Peso argentino => Dólar
                3) Dólar => Real brasileño
                4) Real brasileño => Dólar
                5) Dólar => Peso colombiano
                6) Peso colombiano => Dólar
                7) Dólar => Peso mexicano
                8) Peso mexicano => Dólar
                9) Salir

                Elija una opción válida:
                *************************************
                """);


---

## 🛠️ Tecnologías utilizadas

- 💻 Java 17  
- 🧠 Gson (para parseo de JSON)  
- 🌐 [ExchangeRate API](https://www.exchangerate-api.com/) (para tasas de cambio)  
- 🧰 IntelliJ IDEA (IDE)  
- 📝 Manejo de archivos con `FileWriter` y `BufferedReader`

---

## 🧪 Funcionalidades

- 🔄 Conversión de monedas en tiempo real  
- 📥 Obtención automática de tasas desde API  
- 📂 Historial en archivo `historial_conversiones.txt`  
- ⚠️ Validación de entradas y errores de conexión  

---

## 🚀 Cómo ejecutar el proyecto

1. Clona el repositorio:

```bash
git clone https://github.com/yonireyesm85/conversor-moneda-java.git

2. Abre el proyecto con IntelliJ IDEA.

3. Asegúrate de tener la librería Gson agregada:

4. Haz clic derecho en el proyecto → Open Module Settings → Libraries → Añade gson.jar

5. Ejecuta el archivo Principal.java

---

## 📝 Notas adicionales

- El historial de conversiones se guarda automáticamente al ejecutar el programa.
- Se limpia cada vez que se inicia una nueva sesión.
- Este proyecto fue diseñado con un enfoque en **buenas prácticas** y estructura **modular**.

---

## 👨‍💻 Diseñado por

**Yhoni Reyes**  
### yhoni-reyes ![logo](assets/bender-el-tremendo.png)
Desarrollador Back-End en formación – Alura Latam + Oracle ONE

- 🐙 GitHub: [@yonireyesm85](https://github.com/yonireyesm85)  
- 💼 LinkedIn: [Jonathan Israel Reyes Méndez](https://www.linkedin.com/in/jonathan-israel-reyes-m%C3%A9ndez-257b58318/)

---

## 💡 Frase de inspiración

> *"Todo gran programador fue un principiante que no se rindió."*  
> **¡Sigue construyendo... Yhoni! 🚀🦖**

