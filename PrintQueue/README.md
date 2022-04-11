# Concurrency
-----------------------------------------------------------------------
## 🚀PRIORIDAD DE LOCK
### Modo fairness o justo:
en el argumento donde creo el objeto lock le paso true o false, true para que el lock se lo devuelva al que esta esperando hace mas tiempo.
--
## 🚀SEMAPHORE BINARIO
argumento 1
---
## 🚀SEMAPHORE
### acquireUninterruptibly() 
cuando invoco acquire y permaneze en sleep el hilo, con este metodo evito interrupciones
### tryAcquire()
cuando no puede tomar el semaforo entonce retorna false y sigue opernado
### Modo fairness o justo:
enviarle el valor de inicializacion y un booleano
### cuando estamos hablando de una seccion que es utilizada por una cantidad de hilos finita entonces se dice que es seccion o rescurso compartido, NO es una seccion critica 
### Semaphore Multiple
tenemos que usar un array para tener registro de los recursos utilizados
