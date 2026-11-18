# ☕ Mis ejercicios de Java

¡Hola! 👋 Soy estudiante de **DAW (Desarrollo de Aplicaciones Web)** y aquí guardo todo lo que he ido programando en Java durante el curso, en la asignatura de **Programación**.

Hay de todo: desde los primeros bucles hasta programas con objetos, ficheros y bases de datos MySQL. Todo el código lo he escrito yo mientras aprendía, así que algunos ejercicios tienen varias versiones (`v2`, `SinCadena`, `ConFunciones`...). Así se ve cómo he ido mejorando 🙂

---

## 🗂️ ¿Qué hay en cada carpeta?

### 📘 [01-Fundamentos](01-Fundamentos)
Lo básico para empezar a programar.
| Carpeta | De qué va |
|---|---|
| [01-Patrones-y-basicos](01-Fundamentos/01-Patrones-y-basicos) | Variables, bucles, `try/catch`, números aleatorios, fechas y horas, `compareTo`... |
| [02-Trucos-utiles](01-Fundamentos/02-Trucos-utiles) | Ejercicios cortos y curiosos: piedra-papel-tijera (¡también la versión lagarto-Spock!), triángulos con asteriscos... |
| [03-Funciones](01-Fundamentos/03-Funciones) | Partir el código en funciones. En `otras-versiones` hay otras formas de resolver los mismos problemas |
| [04-Librerias](01-Fundamentos/04-Librerias) | Crear mis propias librerías (paquetes) y usarlas desde otro programa |
| [05-Arrays-y-matrices](01-Fundamentos/05-Arrays-y-matrices) | Arrays y matrices |
| [06-Colecciones](01-Fundamentos/06-Colecciones) | `ArrayList`, mapas y compañía |

### 🧱 [02-POO](02-POO) — Programación Orientada a Objetos
| Carpeta | De qué va |
|---|---|
| [01-Clases-y-objetos](02-POO/01-Clases-y-objetos) | Mis primeras clases: cafetera, dado, pizza, planeta, fracciones... |
| [02-Agregacion-y-composicion](02-POO/02-Agregacion-y-composicion) | Cómo se relacionan unas clases con otras |
| [03-Herencia](02-POO/03-Herencia) | Clases padre e hijas, clases abstractas (figuras, vehículos, universidad...) |
| [04-Interfaces](02-POO/04-Interfaces) | Uso de `implements` (drones, juegos, instituto) |
| [05-Ejercicios-de-objetos](02-POO/05-Ejercicios-de-objetos) | Ejercicios más largos: reservas, lavanderías, festival, refugio, cifrado César, un mini `grep`... |
| [06-Maquina-vending](02-POO/06-Maquina-vending) | Una máquina expendedora con menú (sin terminar 🚧) |

### 💾 [03-Ficheros-y-BBDD](03-Ficheros-y-BBDD)
Guardar y leer datos de verdad.
| Carpeta | De qué va |
|---|---|
| [01-Ficheros](03-Ficheros-y-BBDD/01-Ficheros) | Leer y escribir ficheros de texto, copiar ficheros... (el `passwd.txt` son usuarios de prueba, no es nada real 😉) |
| [02-Serializacion](03-Ficheros-y-BBDD/02-Serializacion) | Guardar objetos enteros en ficheros `.dat` (Fórmula 1, cartas, amigos...) |
| [03-BBDD-con-JDBC](03-Ficheros-y-BBDD/03-BBDD-con-JDBC) | Conectar Java con MySQL usando JDBC |
| [04-BBDD-con-JDBC-2](03-Ficheros-y-BBDD/04-BBDD-con-JDBC-2) | Más JDBC: tienda, login y reservas |
| [05-Reservas-de-vuelos](03-Ficheros-y-BBDD/05-Reservas-de-vuelos) | Un sistema de reservas de vuelos con su base de datos |

### 🏆 [04-Acepta-el-Reto](04-Acepta-el-Reto)
Problemas de la web [Acepta el Reto](https://aceptaelreto.com/user/profile.php?id=36826). Los archivos se llaman `AER` + el número del problema (por ejemplo, `AER112.java` es el problema 112).
| Carpeta | De qué va |
|---|---|
| [01-Resueltos](04-Acepta-el-Reto/01-Resueltos) | Problemas resueltos |
| [02-Ejercicios-MSA](04-Acepta-el-Reto/02-Ejercicios-MSA) | Más problemas y algunos exámenes de práctica |
| [03-Concurso](04-Acepta-el-Reto/03-Concurso) | Problemas de un concurso de programación |
| [04-Entregas-PRG](04-Acepta-el-Reto/04-Entregas-PRG) | Ejercicios que entregué en clase |
| [05-Entregas-actividades](04-Acepta-el-Reto/05-Entregas-actividades) | Más entregas |

### 📝 [05-Examenes](05-Examenes)
Exámenes que he hecho durante el curso (con los enunciados en PDF cuando los tengo).
| Carpeta | De qué va |
|---|---|
| [01-Examenes-de-practica](05-Examenes/01-Examenes-de-practica) | Exámenes para practicar |
| [02-Tercer-examen-corregido](05-Examenes/02-Tercer-examen-corregido) | Tercer examen, con mis notas sobre los fallos |
| [03-Tercer-examen-otra-version](05-Examenes/03-Tercer-examen-otra-version) | Otra versión del tercer examen |
| [04-Cuarto-examen-borrascas](05-Examenes/04-Cuarto-examen-borrascas) | Estaciones meteorológicas y alertas |
| [05-Examen-Formula1](05-Examenes/05-Examen-Formula1) | Clasificación de Fórmula 1 con ficheros |
| [06-Examenes-pasados](05-Examenes/06-Examenes-pasados) | Exámenes de otros años: faltas de asistencia, recuperaciones, una "trivago" con base de datos... |
| [07-Examen-7](05-Examenes/07-Examen-7) | Currículums, habilidades y preguntas de examen |

### 📒 [06-Apuntes](06-Apuntes)
Mis chuletas: comandos, MySQL, pilas y colas, cosas para el examen...

---

## ▶️ ¿Cómo pruebo un ejercicio?

Necesitas tener Java instalado (JDK). Luego, desde la carpeta del ejercicio:

```bash
javac AER112.java      # compila
java AER112            # ejecuta
```

Muchos ejercicios leen datos por teclado. Si en la carpeta hay un `datos.in`, puedes pasárselo directamente:

```bash
java AER112 < datos.in
```

Para los de **base de datos** necesitas MySQL: primero cargas el `.sql` de la carpeta y luego ejecutas con el conector, que ya está en la carpeta:

```bash
javac -cp mysql-connector-j-9.6.0.jar *.java
java -cp .:mysql-connector-j-9.6.0.jar NombreDelPrograma
```

---

## 🛠️ Lo que he usado

Java · Programación orientada a objetos · Colecciones · Ficheros · Serialización · MySQL · JDBC · Git y GitHub

---

¿Te ha gustado algo o tienes alguna duda? ¡Escríbeme por GitHub! 🚀
