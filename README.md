# Proyecto - Árbol Binario de Búsqueda Inverso

El alumno debe implementar la clase ArbolBinarioBusquedaInverso<T> para realizar algunas operaciones con un árbol binario de búsqueda inverso

## Ejecución

Tu programa debería ejecutarse de la siguiente manera:

```
ARBOL BINARIO DE BUSQUEDA INVERSO
=================================

Proporcione el numero de elementos del arbol:8
Proporcione el elemento 1:10
Proporcione el elemento 2:14
Proporcione el elemento 3:8
Proporcione el elemento 4:9
Proporcione el elemento 5:13
Proporcione el elemento 6:4
Proporcione el elemento 7:15
Proporcione el elemento 8:1
abbi01 es igual a abbi02
abbi01 no es igual a abbi03
El total de nodos internos de abbi01 es:4
Eliminar la raiz de abbi01:10
Elementos de abbi01:
15
14
13
9
8
4
1
```

## Diagrama de clases
[Editor en línea](https://mermaid.live/)
```mermaid
---
title: ArbolBinarioBusquedaInverso
---
classDiagram
      ArbolBinario <|-- ArbolBinarioBusquedaInverso
      ArbolBinarioBusquedaInverso: ArbolBinarioBusquedaInverso(Integer[] arreglo)
      ArbolBinarioBusquedaInverso: +void addElement(T elemento)
      ArbolBinarioBusquedaInverso: +T removeElement(T elemento)
      ArbolBinarioBusquedaInverso: boolean equals(TDAArbolBinarioBusquedaInverso<T> otro)
      ArbolBinarioBusquedaInverso: int contarNodosInternos()
```
[Referencia-Mermaid](https://mermaid.js.org/syntax/classDiagram.html)

## Diagrama de clases UML con draw.io
El repositorio está configurado para crear Diagramas de clases UML con ```draw.io```. Para usarlo simplemente agrega un archivo con extensión ```.drawio.png```, das doble clic sobre el mismo y se activará el editor ```draw.io``` incrustado en ```VSCode``` para edición. Asegúrate de agregar las formas UML en el menú de formas del lado izquierdo (opción ```+Más formas```).

## Uso del proyecto con make

### Default - Compilar+Probar+Ejecutar
```
make
```
### Compilar
```
make compile
```
### Probar todo
```
make test
```
### Ejecutar App
```
make run
```
### Limpiar binarios
```
make clean
```
## Comandos Git-Cambios y envío a Autograding

### Por cada cambio importante que haga, actualice su historia usando los comandos:
```
git add .
git commit -m "Descripción del cambio"
```
### Envíe sus actualizaciones a GitHub para Autograding con el comando:
```
git push origin main
```
## Comandos individuales
### Compilar

```
find ./ -type f -name "*.java" > compfiles.txt
javac -encoding utf-8 -d build -cp lib/junit-platform-console-standalone-1.5.2.jar @compfiles.txt
```
Ejecutar ambos comandos en 1 sólo paso:

```
find ./ -type f -name "*.java" > compfiles.txt ; javac -encoding utf-8 -d build -cp lib/junit-platform-console-standalone-1.5.2.jar @compfiles.txt
```


### Ejecutar Todas la pruebas locales de 1 Test Case

```
java -jar lib/junit-platform-console-standalone-1.5.2.jar -class-path build --select-class miTest.AppTest
```
### Ejecutar 1 prueba local de 1 Test Case

```
java -jar lib/junit-platform-console-standalone-1.5.2.jar -class-path build --select-method miTest.AppTest#testNodosInternos()
```
### Ejecutar App
```
java -cp build miPrincipal.Principal
```
Los comandos anteriores están considerados para un ambiente Linux. [Referencia.](https://www.baeldung.com/junit-run-from-command-line)