# Concurrency
------------------------------------------------------
## 🚀Join: JoinGroup
------------------------------------------------------
* al ejecutar thread_01.join()  se detiene el hilo hasta que el thread_01 termine su ejecucion.
* si agrego un sleep en el hilo simplemente espera y sigue ejecutando, no se corta el join().

---
## 🚀Join: network
----
* si se intercalan los join() el orden de la ejecucion de la conexion se altera y en un sistema esto no funcionaria
