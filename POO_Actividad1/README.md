# Actividad 1 – Principios de POO en Java

Solución completa a los 3 ejercicios de la actividad "Programación Web –
Principios de Programación Orientada a Objetos en Java".

## Estructura del proyecto

```
POO_Actividad1/
├── Ejercicio1_Persona/
│   ├── Persona.java        -> Clase con atributos privados, constructor, get/set,
│   │                           mostrarInformacion() y esMayorDeEdad()
│   └── PersonaMain.java     -> Genera 10 personas aleatorias e imprime quiénes
│                                son mayores de edad
├── Ejercicio2_Empleados/
│   ├── Empleado.java              -> Clase base abstracta (nombre, salario)
│   ├── EmpleadoTiempoCompleto.java -> Hereda de Empleado, agrega bonificación
│   ├── EmpleadoPorHoras.java       -> Hereda de Empleado, agrega horasTrabajadas
│   │                                  y valorHora
│   └── EmpleadoMain.java          -> Genera 10 empleados aleatorios (mezcla de
│                                      ambos tipos) y muestra el salario de cada uno
└── Ejercicio3_Calculadora/
    ├── Calculadora.java     -> sumar, restar, multiplicar, dividir y
    │                           mostrarResultado(operacion, resultado)
    └── CalculadoraMain.java -> Ejecuta las cuatro operaciones de ejemplo
```

## Cómo compilar y ejecutar

Cada ejercicio es independiente. Desde la carpeta de cada ejercicio:

```bash
# Ejercicio 1
cd Ejercicio1_Persona
javac *.java
java PersonaMain

# Ejercicio 2
cd Ejercicio2_Empleados
javac *.java
java EmpleadoMain

# Ejercicio 3
cd Ejercicio3_Calculadora
javac *.java
java CalculadoraMain
```

## Conceptos de POO aplicados

- **Encapsulamiento**: atributos privados con getters y setters en `Persona` y `Empleado`.
- **Herencia**: `EmpleadoTiempoCompleto` y `EmpleadoPorHoras` heredan de `Empleado`.
- **Abstracción**: `Empleado` es una clase abstracta con el método `calcularSalario()`.
- **Polimorfismo / Sobreescritura**: cada subclase de `Empleado` implementa
  `calcularSalario()` de forma distinta; `EmpleadoMain` recorre la lista tratando
  a todos como `Empleado` pero cada uno calcula su salario según su tipo real.
- **Constructores**: todas las clases inicializan sus atributos mediante constructores.
- **Recorrido de ArrayList**: uso de `List<Persona>` y `List<Empleado>` recorridas
  con `for-each`.
- **Validación**: `Calculadora.dividir()` valida división por cero.
