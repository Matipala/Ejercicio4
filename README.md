# Serie Combinada: Fibonacci + Serie Multiplicativa

Este proyecto genera una secuencia numérica combinada, donde se mezclan dos patrones distintos:

Fibonacci en posiciones pares

Una serie multiplicativa personalizada en posiciones impares

La secuencia resultante crea un comportamiento híbrido donde ambas progresiones crecen de forma diferente.

## Descripción de la lógica
### 1. Posiciones pares → Fibonacci

En cada índice par (0, 2, 4, …) se coloca el número correspondiente de la serie de Fibonacci.

Ejemplo:

i = 0 → 0  
i = 2 → 1  
i = 4 → 3  
i = 6 → 8

### 2. Posiciones impares → Serie Multiplicativa

En las posiciones impares (1, 3, 5, …) se usa una fórmula que genera valores crecientes:

nuevoValor = (valorAnterior * contador) + 1


Donde:

valorAnterior = último valor generado en posición impar

contador = aumenta con cada aparición de una posición impar (1, luego 2, luego 3, …)

Ejemplo de los primeros términos impares:

i = 1 → 1  
i = 3 → (1 * 2) + 1 = 3  
i = 5 → (3 * 3) + 1 = 10  
i = 7 → (10 * 4) + 1 = 41


Esta parte de la secuencia crece de manera más acelerada debido a la multiplicación progresiva.

### Ejemplo completo (n = 10)
Índice	Valor	Tipo
0	0	Fibonacci
1	1	Multiplicativa
2	1	Fibonacci
3	3	Multiplicativa
4	2	Fibonacci
5	10	Multiplicativa
6	3	Fibonacci
7	41	Multiplicativa
8	5	Fibonacci
9	205	Multiplicativa

## Resultado final:
0, 1, 1, 3, 2, 10, 3, 41, 5, 205
