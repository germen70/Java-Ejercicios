# Mis ejercicios de Java

Soy estudiante de DAW (Desarrollo de Aplicaciones Web) y aquí guardo todo lo que he ido programando en Java en la asignatura de Programación.

Hay de todo: desde los primeros bucles hasta programas con objetos, ficheros y bases de datos MySQL. Algunos ejercicios tienen varias versiones (`v2`, `SinCadena`, `ConFunciones`...) porque los volví a hacer de otra forma cuando aprendí algo nuevo.

---

## Qué hay en cada carpeta

### [01-Fundamentos](01-Fundamentos)

Lo básico para empezar a programar.

- [01-Patrones-y-basicos](01-Fundamentos/01-Patrones-y-basicos): variables, bucles, `try/catch`, números aleatorios, fechas y horas, `compareTo`...
- [02-Trucos-utiles](01-Fundamentos/02-Trucos-utiles): ejercicios cortos, como piedra-papel-tijera (también la versión con lagarto y Spock) o triángulos con asteriscos.
- [03-Funciones](01-Fundamentos/03-Funciones): partir el código en funciones. En `otras-versiones` hay otras formas de resolver los mismos problemas.
- [04-Librerias](01-Fundamentos/04-Librerias): crear mis propias librerías (paquetes) y usarlas desde otro programa.
- [05-Arrays-y-matrices](01-Fundamentos/05-Arrays-y-matrices): arrays y matrices.
- [06-Colecciones](01-Fundamentos/06-Colecciones): `ArrayList`, `HashSet`, mapas...

### [02-POO](02-POO)

Programación orientada a objetos.

- [01-Clases-y-objetos](02-POO/01-Clases-y-objetos): mis primeras clases: cafetera, dado, pizza, planeta, fracciones...
- [02-Agregacion-y-composicion](02-POO/02-Agregacion-y-composicion): clases que contienen otras clases.
- [03-Herencia](02-POO/03-Herencia): clases padre e hijas y clases abstractas (figuras, vehículos, universidad, tarjetas SIM y móviles...).
- [04-Interfaces](02-POO/04-Interfaces): uso de `implements` (drones, juegos, instituto).
- [05-Ejercicios-de-objetos](02-POO/05-Ejercicios-de-objetos): ejercicios más largos: reservas, lavanderías, festival, refugio, cifrado César, un mini `grep`...
- [06-Maquina-vending](02-POO/06-Maquina-vending): una máquina expendedora con menú. Está sin terminar.

### [03-Ficheros-y-BBDD](03-Ficheros-y-BBDD)

Guardar y leer datos de verdad.

- [01-Ficheros](03-Ficheros-y-BBDD/01-Ficheros): leer y escribir ficheros de texto, copiar ficheros... El `passwd.txt` son usuarios de prueba, no es nada real.
- [02-Serializacion](03-Ficheros-y-BBDD/02-Serializacion): guardar objetos enteros en ficheros `.dat` (Fórmula 1, cartas, amigos...).
- [03-BBDD-con-JDBC](03-Ficheros-y-BBDD/03-BBDD-con-JDBC): conectar Java con MySQL usando JDBC.
- [04-BBDD-con-JDBC-2](03-Ficheros-y-BBDD/04-BBDD-con-JDBC-2): más JDBC: tienda, login y reservas.
- [05-Reservas-de-vuelos](03-Ficheros-y-BBDD/05-Reservas-de-vuelos): un programa de reservas de vuelos con su base de datos.

### [04-Acepta-el-Reto](04-Acepta-el-Reto)

Problemas de la web [Acepta el Reto](https://aceptaelreto.com/user/profile.php?id=36826) (ese enlace es mi perfil). Los archivos se llaman `AER` + el número del problema, así que `AER112.java` es el problema 112.

- [01-Resueltos](04-Acepta-el-Reto/01-Resueltos): problemas resueltos.
- [02-Ejercicios-MSA](04-Acepta-el-Reto/02-Ejercicios-MSA): más problemas y algunos exámenes de práctica.
- [03-Concurso](04-Acepta-el-Reto/03-Concurso): problemas de un concurso de programación.
- [04-Entregas-PRG](04-Acepta-el-Reto/04-Entregas-PRG): ejercicios que entregué en clase.
- [05-Entregas-actividades](04-Acepta-el-Reto/05-Entregas-actividades): más entregas.

### [05-Examenes](05-Examenes)

Exámenes que he hecho durante el curso, con el enunciado en PDF cuando lo tengo.

- [01-Examenes-de-practica](05-Examenes/01-Examenes-de-practica): exámenes para practicar.
- [02-Tercer-examen-corregido](05-Examenes/02-Tercer-examen-corregido): el tercer examen, con mis notas sobre los fallos.
- [03-Tercer-examen-otra-version](05-Examenes/03-Tercer-examen-otra-version): otra versión del tercer examen.
- [04-Cuarto-examen-borrascas](05-Examenes/04-Cuarto-examen-borrascas): estaciones meteorológicas y alertas.
- [05-Examen-Formula1](05-Examenes/05-Examen-Formula1): clasificación de Fórmula 1 con ficheros.
- [06-Examenes-pasados](05-Examenes/06-Examenes-pasados): exámenes de otros años: faltas de asistencia, recuperaciones y una copia de Trivago con base de datos.
- [07-Examen-7](05-Examenes/07-Examen-7): currículums, habilidades y preguntas de examen.

### [06-Apuntes](06-Apuntes)

Mis chuletas: comandos, MySQL, cosas para el examen...

---

## Cómo probar un ejercicio

Necesitas tener Java instalado (el JDK). Luego, desde la carpeta del ejercicio:

```bash
javac AER112.java      # compila
java AER112            # ejecuta
```

Muchos ejercicios leen datos por teclado. Si en la carpeta hay un `datos.in`, se lo puedes pasar directamente:

```bash
java AER112 < datos.in
```

Si un programa usa clases que están en otros archivos de la misma carpeta, compílalos todos a la vez con `javac *.java`.

Para los de base de datos necesitas MySQL. Primero cargas el `.sql` de la carpeta y luego compilas y ejecutas con el conector (está en las carpetas de JDBC):

```bash
javac -cp mysql-connector-j-9.6.0.jar *.java
java -cp .:mysql-connector-j-9.6.0.jar NombreDelPrograma
```

---

## Lo que he usado

Java, programación orientada a objetos, colecciones, ficheros, serialización, MySQL con JDBC, Git y GitHub.
