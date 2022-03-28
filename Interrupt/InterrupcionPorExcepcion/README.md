# Concurrency
## 🚀Interrupciones: BUSCADOR DE ARCHIVOS

### Se captura la interrupcion y se realiza la finalizacion del hilo por medio de un catch
### donde todos los metodos recursivos deben hacer un Throw InterruptedExcepcion
### isInterrupted() => Throw new InterruptedException();


### Si se cambia el metodo start() por run() en la ejecucion del hilo vamos a ver que
### el metodo run se va a ejecutar sobre el hilo "main" y no se va a ejecutar en 
### ningun momento el metodo interrupt() puesto que el hilo main nunca sale del run().
