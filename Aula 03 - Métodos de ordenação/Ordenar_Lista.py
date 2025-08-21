import time
import random

import time
import random

# rotina 1 - popular uma lista com 100000 números aleatórios entre 100 e 100000
tempoInicio = time.time()
listaAleatoria = []
for i in range(100000):
    numero = random.randint(100, 100000)
    listaAleatoria.append(numero)
tempoFim = time.time()
print("Tempo da rotina 1 (popular lista aleatória):", round((tempoFim - tempoInicio), 3), "s")

# rotina 2 - popular uma lista sequencial de 0 até 99999
tempoInicio = time.time()
listaSequencial = []
for i in range(100000):
    listaSequencial.append(i)
tempoFim = time.time()
print("Tempo da rotina 2 (popular lista sequencial):", round((tempoFim - tempoInicio), 3), "s")

# rotina 3 - ordenar a lista aleatória
tempoInicio = time.time()
listaAleatoria.sort()
tempoFim = time.time()
print("Tempo da rotina 3 (ordenar lista aleatória): ", round((tempoFim - tempoInicio), 3), "s")

# rotina 4 - ordenar a lista sequencial
tempoInicio = time.time()
listaSequencial.sort()
tempoFim = time.time()
print("Tempo da rotina 4 (ordenar lista sequencial): ", round((tempoFim - tempoInicio), 3), "s")
