class Videojuego:
    def __init__(self, nombre, plataforma=None, cantidad_jugadores=None):
        self.nombre = nombre

        if plataforma is None:
            self.plataforma = "Desconocida"
        else:
            self.plataforma = plataforma

        if cantidad_jugadores is None:
            self.cantidad_jugadores = 0
        else:
            self.cantidad_jugadores = cantidad_jugadores

    def agregar_jugadores(self, cantidad=None, scanner=None):
        if cantidad is None and scanner is None:
            self.cantidad_jugadores += 1
            print(f"Se agregó 1 jugador al videojuego: {self.nombre}")
            print(f"Total de jugadores: {self.cantidad_jugadores}")

        elif scanner is not None:
            try:
                cantidad_input = int(input(f"Ingrese la cantidad de jugadores a agregar para '{self.nombre}': "))
                if cantidad_input > 0:
                    self.cantidad_jugadores += cantidad_input
                    print(f"Se agregaron {cantidad_input} jugadores al videojuego: {self.nombre}")
                    print(f"Total de jugadores: {self.cantidad_jugadores}")
                else:
                    print("La cantidad debe ser mayor a 0")
            except ValueError:
                print("Error: Debe ingresar un número válido")

        elif cantidad is not None:
            if cantidad > 0:
                self.cantidad_jugadores += cantidad
                print(f"Se agregaron {cantidad} jugadores al videojuego: {self.nombre}")
                print(f"Total de jugadores: {self.cantidad_jugadores}")
            else:
                print("La cantidad debe ser mayor a 0")
    def get_nombre(self):
        return self.nombre

    def set_nombre(self, nombre):
        self.nombre = nombre

    def get_plataforma(self):
        return self.plataforma

    def set_plataforma(self, plataforma):
        self.plataforma = plataforma

    def get_cantidad_jugadores(self):
        return self.cantidad_jugadores

    def set_cantidad_jugadores(self, cantidad_jugadores):
        self.cantidad_jugadores = cantidad_jugadores

    def __str__(self):
        return f"Videojuego: {self.nombre} | Plataforma: {self.plataforma} | Jugadores: {self.cantidad_jugadores}"
print("Creando videojuegos")
juego1 = Videojuego("FIFA 24", "PlayStation 5", 2)
print(f"1. {juego1}")
juego2 = Videojuego("Mario Kart", "Nintendo Switch")
print(f"2. {juego2}")
juego3 = Videojuego("Call of Duty")
print(f"3. {juego3}")
print("Agregando 1 jugador a cada juego")
juego1.agregar_jugadores()
juego2.agregar_jugadores()
juego3.agregar_jugadores()
print("\nAgregando jugadores por teclado")
juego1.agregar_jugadores(scanner=True)
juego2.agregar_jugadores(scanner=True)
print("\nAgregando jugadores con cantidad específica")
juego3.agregar_jugadores(5)
juego1.agregar_jugadores(3)
print(juego1)
print(juego2)
print(juego3)
total_jugadores = (juego1.get_cantidad_jugadores() +
                       juego2.get_cantidad_jugadores() +
                       juego3.get_cantidad_jugadores())
print(f"Total de jugadores en todos los videojuegos: {total_jugadores}")
