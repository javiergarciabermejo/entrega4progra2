

//Ejercicio 34

Que es un algoritmo?

Un algoritmo es un conjunto finito de instrucciones o reglas bien definidas y ordenadas que permiten llevar a cabo una tarea o resolver un problema especifico.



//Ejercicio 35


//Algoritmo iterativo:


public class SumaNaturales {
    public static int sumaIterativa(int n) {
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += i;
        }
        return suma;
    }

    public static void main(String[] args) {
        int n = 10; // Número de elementos a sumar
        System.out.println("Suma iterativa de los primeros " + n + " numeros naturales: " + sumaIterativa(n));
    }
}


//Algoritmo recursivo

public class SumaNaturales {
    public static int sumaRecursiva(int n) {
        if (n == 0)
            return 0;
        else
            return n + sumaRecursiva(n - 1);
    }

    public static void main(String[] args) {
        int n = 10; // Número de elementos a sumar
        System.out.println("Suma recursiva de los primeros " + n + " numeros naturales: " + sumaRecursiva(n));
    }
}


//Ejercicio 36


En la notacion O(n), n representa el tamaño del problema o la entrada.



//Ejercicio 37


La formula para calcular el espacio recorrido por un movil es e = 1/2 * g * t^2.



//Ejercico 38


Metodo primero:

Este metodo devuelve el primer elemento de la lista, por lo tanto, su complejidad temporal es constante, O(1).


Metodo nEsimo:


Este metodo devuelve el elemento en la posicion n de la lista. 



//Ejercicio 39


Para el algoritmo iterativo de suma de los n primeros numeros naturales, la complejidad temporal es O(n) ya que recorre los numeros de 1 a n una vez.

Para el algoritmo recursivo de suma de los n primeros numeros naturales, la complejidad temporal es tambien O(n).



//Ejercicio 42


Como el conjunto A tiene una cardinalidad n, el producto cartesiano de A × A tendra n^2 elementos.
 Si el algoritmo ejecuta una instruccion para cada elemento de este producto cartesiano, la complejidad temporal sera O(n^2), 
ya que el numero de instrucciones ejecutadas es cuadratico en relacion con el tamaño del conjunto A.


//Ejercicio 43


public static double sumaEltosMatriz(double matriz[][]) {
    double suma = 0;
    for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz[i].length; j++) {
            suma += matriz[i][j];
        }
    }
    return suma;
}


//Ejercicio 44


public static boolean buscar(int e, int[] array) {
    for (int i = 0; i < array.length; i++) {
        if (array[i] == e) {
            return true;
        }
    }
    return false;
}


//Ejercico 45


public static boolean buscarRecursivo(int e, int[] array, int inicio, int fin) {
    if (inicio > fin) {
        return false;
    }
    int medio = (inicio + fin) / 2;
    if (array[medio] == e) {
        return true;
    } else if (array[medio] < e) {
        return buscarRecursivo(e, array, medio + 1, fin);
    } else {
        return buscarRecursivo(e, array, inicio, medio - 1);
    }
}


//Ejercicio 46



public static int fibonacciRecursivo(int n) {
    if (n <= 1) {
        return n;
    }
    return fibonacciRecursivo(n - 1) + fibonacciRecursivo(n - 2);
}



//Ejercico 47

Este metodo trata de calcular la suma de los primeros n numeros naturales



//Ejercicio 48



Tambien calcula la suma de los primeros n numeros naturales, pero lo hace de manera diferente. En lugar de simplemente sumar los numeros, realiza una sumatoria anidada, 
sumando cada numero hasta i para cada i desde 1 hasta n.


//Ejercico 49

La definicion describe la notacion de orden grande (O) en terminos de funciones.

Esto significa que T(n) no crece mas rapido que f(n) a medida que n aumenta.




//Ejercicio 53

Si, es cierta dicha afirmacion.

Cuando un ArrayList esta ordenado, para agregar un nuevo elemento  hay que mover algunos otros elementos para hacer espacio. 

Y esto lleva mas tiempo cuanto mas grande es la lista, asi que la complejidad de tiempo es proporcional al tamaño de la lista.












