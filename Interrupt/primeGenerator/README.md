# Concurrency
## 🚀Interrupciones

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
