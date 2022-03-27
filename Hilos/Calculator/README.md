# Concurrency
## 🚀Prioridades de hilos
---------------------------------------------

### pares prioridad alta
### impares prioridad baja
#### 📄 pruebas: 
* aumentando cantidad de numeros primos con 10 hilos
las prioridades ejecutan bien
* aumentando la cantidad de hilos y bajando la afinidad de nucleos:
aca vemos que el proceso al iniciar tantos hilos finaliza algunos impares antes que los pares
```
Main : Id 25 - My Thread 11
Main : Priority: 1
Main : Old State: RUNNABLE
Main : New State: TERMINATED
Main : ************************************
Main : Id 26 - My Thread 12
Main : Priority: 10
Main : Old State: RUNNABLE
Main : New State: TERMINATED
Main : ************************************
```
