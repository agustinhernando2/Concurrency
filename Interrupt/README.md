# Concurrency
## 🚀Interrupciones: BUSCADOR DE ARCHIVOS

### Se captura la interrupcion y se realiza la finalizacion del hilo por medio de un catch
### donde todos los metodos recursivos deben hacer un Throw InterruptedExcepcion
### isInterrupted() => Throw new InterruptedException();
-----------------------------------------------------------------------

##### Si se cambia el metodo start() por run() en la ejecucion del hilo vamos a ver que
##### el metodo run se va a ejecutar sobre el hilo "main" y no se va a ejecutar en 
##### ningun momento el metodo interrupt() puesto que el hilo main ejecuta secuencialmente
#
## 🚀Interrupciones: GENERADOR DE NUMEROS PRIMOS

### un hilo busca numeros primos y se lo interrumpe con el metodo interrupt() como una sugerencia
* se hacen algunos cambios : se comenta //return  
###### vemos que el hilo realmente no finaliza, no le da bola a la sugerencia que se hace en main()
#### 📄 📄 📄 📄 📄 📄 📄 📄 
```
The Prime Generator has been Interrupted
The Prime Generator has been Interrupted
Main: Status of the Thread: RUNNABLE
Main: isInterrupted: true
Main: isAlive: true
Number 79423
```
