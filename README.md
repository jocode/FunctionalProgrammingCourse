# Programación Funcional

> [!TIP]
> La programación funcional es un paradigma de programación que trata de resolver los problemas de la programación de una manera funcional. Se basa en el uso de funciones que transforman los datos de entrada en la salida sin tener en cuenta el estado interno que pueda tener el programa.
> 
> La programación funcional es un paradigma de programación basado en el uso de funciones matemáticas.
> 
> - Variables inmutables
> - Funciones puras
> - Funciones de orden superior
> - Funciones recursivas
> - Composición de funciones


## Diferencias entre programación funcional y programación imperativa

| Programación Funcional                                                                                                                                | Programación Imperativa                                                                                |
|-------------------------------------------------------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------|
| Se basa en el uso de funciones que transforman los datos de entrada en la salida sin tener en cuenta el estado interno que pueda tener el programa.   | Se basa en el uso de variables y estructuras de control para modificar el estado interno del programa. |
| Las funciones son puras, es decir, no tienen efectos secundarios.                                                                                     | Las funciones pueden tener efectos secundarios.                                                        |
| Las variables son inmutables, es decir, una vez que se asigna un valor a una variable, no se puede cambiar.                                           | Las variables pueden cambiar de valor en cualquier momento.                                            |
| Se basa en el uso de funciones de orden superior, es decir, funciones que toman otras funciones como argumentos o devuelven funciones como resultado. | No se basa en el uso de funciones de orden superior.                                                   |
| Se basa en el uso de funciones recursivas, es decir, funciones que se llaman a sí mismas.                                                             | No se basa en el uso de funciones recursivas.                                                          |
| Se basa en la composición de funciones, es decir, en la combinación de funciones para crear nuevas funciones.                                         | No se basa en la composición de funciones.                                                             |


## ¿Qué es una expresión Lambda?

¿Qué es una expresión Lambda?

Una expresión lambda es esencialmente una función sin nombre, que tiene un cuerpo de función y puede o no recibir parámetros.

En Java, una expresión lambda siempre va a representar el método abstracto de una interfaz funcional. Es decir, una interfaz que tiene un solo método abstracto.

Una expresión lambda se compone de tres partes:

- Parámetros: los parámetros que recibe la función.
- Flecha: la flecha que separa los parámetros del cuerpo de la función.
- Cuerpo: el cuerpo de la función.

Por ejemplo, la siguiente expresión lambda recibe un parámetro y devuelve el cuadrado de ese parámetro:

```java
(int x) -> x * x
```

En este caso, el parámetro es x, la flecha es -> y el cuerpo de la función es x * x.


## Interfaz funcional 

Una interfaz funcional es una interfaz que tiene un solo método abstracto. En Java, una interfaz funcional se puede representar con una expresión lambda.

Las interfaces funcionales se utilizan principalmente para permitir el paso de funciones a métodos. Esto es, que podemos pasar una implementación de una función como argumento de un método.

En Java existe la anotación @FunctionalInterface que se utiliza para indicar que una interfaz es funcional. Esta anotación no es obligatoria, pero es recomendable utilizarla para indicar que una interfaz es funcional.

```java
@FunctionalInterface
public interface Operacion {
    double calcular(double a, double b);
}
```

Implementación de la interfaz funcional:

```java
Operacion suma = (a, b) -> a + b;
double resultado = suma.calcular(5, 3); // Resultado: 8.0
```

Propósito de @FunctionalInterface:

1.	Claridad del Código: Al marcar una interfaz con @FunctionalInterface, indicas claramente que esta interfaz está diseñada para ser funcional, es decir, que se espera que se utilice como una lambda o método de referencia.

2.	Verificación en Tiempo de Compilación: El compilador verifica que la interfaz marcada con @FunctionalInterface tenga solo un método abstracto. Si se añade otro método abstracto, el compilador generará un error, asegurando que se mantenga la característica de ser una interfaz funcional.
