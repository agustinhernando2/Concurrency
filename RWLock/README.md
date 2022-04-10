# Bloqueo de escritura y lectura 
---
lock.writeLock().lock();
//BLOQUE DE ESCRITURA//
lock.writeLock().unlock();
---
lock.readLock().lock(); //bloqueo a escritores
//BLOQUE DE LECTURA//
lock.readLock().unlock(); //desbloqueo a escritores
---
si no pongo estos bloque entonces podemos tener error en la escritura de datos y en la lectura:

Tiempo Lectura 1: 1649597597488, Hilo Thread-9
Tiempo Lectura 1: 1649597597488, Hilo Thread-8
Thread-0: Price 1: 1,000000 
Thread-8: Price 1: 7,411658 
