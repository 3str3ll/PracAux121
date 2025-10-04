import math


class Matriz:
    TAMANIO = 10

    def __init__(self, datos=None):
        if datos is None:
            self.matriz = [[0.0] * self.TAMANIO for _ in range(self.TAMANIO)]
          
            for i in range(self.TAMANIO):
                for j in range(self.TAMANIO):
                    if i == j:
                        self.matriz[i][j] = 1.0  
                    else:
                        self.matriz[i][j] = 0.0  
        else:
           
            if len(datos) != self.TAMANIO or len(datos[0]) != self.TAMANIO:
                raise ValueError(f"La matriz debe ser de tamaño {self.TAMANIO}x{self.TAMANIO}")

            self.matriz = [[0.0] * self.TAMANIO for _ in range(self.TAMANIO)]
            for i in range(self.TAMANIO):
                for j in range(self.TAMANIO):
                    self.matriz[i][j] = datos[i][j]
    def sumar(self, otra):
        resultado = [[0.0] * self.TAMANIO for _ in range(self.TAMANIO)]
        for i in range(self.TAMANIO):
            for j in range(self.TAMANIO):
                resultado[i][j] = self.matriz[i][j] + otra.matriz[i][j]
        return Matriz(resultado)
    def restar(self, otra):
        resultado = [[0.0] * self.TAMANIO for _ in range(self.TAMANIO)]
        for i in range(self.TAMANIO):
            for j in range(self.TAMANIO):
                resultado[i][j] = self.matriz[i][j] - otra.matriz[i][j]
        return Matriz(resultado)
    def igual(self, otra):
        for i in range(self.TAMANIO):
            for j in range(self.TAMANIO):
                if abs(self.matriz[i][j] - otra.matriz[i][j]) > 0.0001:
                    return False
        return True
    def get(self, fila, columna):
        if fila < 0 or fila >= self.TAMANIO or columna < 0 or columna >= self.TAMANIO:
            raise ValueError("Índices fuera de rango")
        return self.matriz[fila][columna]
    def set(self, fila, columna, valor):
        if fila < 0 or fila >= self.TAMANIO or columna < 0 or columna >= self.TAMANIO:
            raise ValueError("Índices fuera de rango")
        self.matriz[fila][columna] = valor
    def mostrar(self):
        print(f"Matriz {self.TAMANIO}x{self.TAMANIO}:")
        for i in range(min(4, self.TAMANIO)):  
            for j in range(min(4, self.TAMANIO)):
                print(f"{self.matriz[i][j]:8.2f}", end="")
            if self.TAMANIO > 4:
                print("  ...", end="")
            print()
        if self.TAMANIO > 4:
            print("    ...")
        print()
    def mostrar_completa(self):
        print(f"Matriz completa {self.TAMANIO}x{self.TAMANIO}:")
        for i in range(self.TAMANIO):
            for j in range(self.TAMANIO):
                print(f"{self.matriz[i][j]:8.2f}", end="")
            print()
        print()
    def mostrar_submatriz_4x4(self):
        print("Submatriz 4x4:")
        for i in range(4):
            for j in range(4):
                print(f"{self.matriz[i][j]:8.2f}", end="")
            print()
        print()
    def get_matriz(self):
        return self.matriz

    @classmethod
    def get_tamanio(cls):
        return cls.TAMANIO

    # a)
print("1. MATRIZ IDENTIDAD (constructor predeterminado):")
identidad = Matriz()
identidad.mostrar()
    # b)
print("2. MATRIZ PERSONALIZADA:")
datos1 = [[0.0] * 10 for _ in range(10)]
for i in range(10):
     for j in range(10):
            datos1[i][j] = i * 10 + j + 1

matrizA = Matriz(datos1)
matrizA.mostrar()

print("3. SEGUNDA MATRIZ PERSONALIZADA:")
datos2 = [[0.0] * 10 for _ in range(10)]
for i in range(10):
    for j in range(10):
         datos2[i][j] = (i + 1) * 2 + (j + 1)

matrizB = Matriz(datos2)
matrizB.mostrar()

    # c)
print("4. SUMA DE MATRICES (A + B):")
suma = matrizA.sumar(matrizB)
suma.mostrar()

print("   Detalle de suma (primeros 4 elementos):")
for i in range(2):
    for j in range(2):
        print(
             f"   A[{i}][{j}]={matrizA.get(i, j):.1f} + B[{i}][{j}]={matrizB.get(i, j):.1f} = {suma.get(i, j):.1f}")
print()

print("5. RESTA DE MATRICES (A - B):")
resta = matrizA.restar(matrizB)
resta.mostrar()

print("   Detalle de resta (primeros 4 elementos):")
for i in range(2):
     for j in range(2):
         print(
            f"   A[{i}][{j}]={matrizA.get(i, j):.1f} - B[{i}][{j}]={matrizB.get(i, j):.1f} = {resta.get(i, j):.1f}")
print()

print("6. PRUEBA DE IGUALDAD:")
print(f"   ¿Matriz A es igual a Matriz B? {matrizA.igual(matrizB)}")
print("   Creando copia de Matriz A...")
matrizC = Matriz(datos1)
print(f"   ¿Matriz A es igual a Matriz C (copia)? {matrizA.igual(matrizC)}")
print(f"   ¿Matriz identidad es igual a Matriz A? {identidad.igual(matrizA)}")
print()

print("7. OPERACIONES CON MATRIZ IDENTIDAD:")
print("   Suma: Identidad + A")
suma_con_identidad = identidad.sumar(matrizA)
suma_con_identidad.mostrar_submatriz_4x4()

print("   Resta: A - Identidad")
resta_con_identidad = matrizA.restar(identidad)
resta_con_identidad.mostrar_submatriz_4x4()
print("8. CASOS ESPECIALES:")
print("   ¿Identidad + Identidad = 2*Identidad?")
doble_identidad = identidad.sumar(identidad)

datos_doble_identidad = [[0.0] * 10 for _ in range(10)]
for i in range(10):
    for j in range(10):
        datos_doble_identidad[i][j] = 2.0 if i == j else 0.0

    matriz_doble_identidad = Matriz(datos_doble_identidad)
    print(f"   Resultado: {doble_identidad.igual(matriz_doble_identidad)}")