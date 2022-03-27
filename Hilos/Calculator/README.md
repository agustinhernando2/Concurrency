# Concurrency
## Comenzando 🚀Repositorio para la materia: Programacion Concurrente
en estas lineas de codigo podemos observar el motivo de estudiar concurrencia

### dos Tareas o hilos estan ejecutando acciones sobre variables en comun:
* CRITICAL: seccion critica 
* Y1,Y2 : Variables int que representan cada hilo
* Cantidad representa la cantidad de instrucciones que se ejecutaron hasta llegar a el problema_
#### 📄 debaggeando nos hubieramos vuelto locos buscando el problema_
```
--------Valor CRITICAL desde T2 = -1
--------Valor Y1 desde T2 = 0
--------Valor Y2 desde T2 = 0
Cantidad-10635857
++++++Valor CRITICAL desde T1 = -1
--------Valor Y1 desde T1 = 0
--------Valor Y2 desde T1 = 1
Cantidad-10635858
--------Valor CRITICAL desde T2 = -1
--------Valor Y1 desde T2 = 2
--------Valor Y2 desde T2 = 0
Cantidad-10635859
++++++Valor CRITICAL desde T1 = -1
--------Valor Y1 desde T1 = 0
--------Valor Y2 desde T1 = 3
Cantidad-10635860
--------Valor CRITICAL desde T2 = -1
--------Valor Y1 desde T2 = 4
--------Valor Y2 desde T2 = 0
Cantidad-10635861
```
