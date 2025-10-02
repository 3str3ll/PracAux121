class Bus:
    def __init__(self, capacidadMaxima):
        self.cantPasajeros = 0
        self.capacidadMaxima = capacidadMaxima
        self.totalRecaudado = 0
        self.pasaje = 1.50

    def subirPasajeros(self, cantidad):
        if cantidad <= 0:
            print("La cantidad debe ser mayor a 0")
            return

        asientosDisponibles = self.capacidadMaxima - self.cantPasajeros

        if cantidad <= asientosDisponibles:
            self.cantPasajeros += cantidad
            print(f"{cantidad} pasajeros subieron al bus.")
        else:
            self.cantPasajeros = self.capacidadMaxima
            print(f"Solo pudieron subir {asientosDisponibles} pasajeros. El bus está lleno.")

    def cobrarPasaje(self, cantidadPasajeros):
        if cantidadPasajeros <= 0:
            print("La cantidad debe ser mayor a 0")
            return

        totalCobrado = cantidadPasajeros * self.pasaje
        self.totalRecaudado += totalCobrado
        print(f"Se cobró Bs. {totalCobrado} a {cantidadPasajeros} pasajeros.")

    def mostrarAsientosDisponibles(self):
        disponibles = self.capacidadMaxima - self.cantPasajeros
        print(f"Asientos disponibles: {disponibles} de {self.capacidadMaxima}")

    def mostrarInformacion(self):
        print("\ninformacion")
        print(f"Pasajeros actuales: {self.cantPasajeros}")
        print(f"Capacidad máxima: {self.capacidadMaxima}")
        print(f"Total recaudado: Bs. {self.totalRecaudado}")
        self.mostrarAsientosDisponibles()
miBus = Bus(50)
print("\nsubiendo pasajeros")
miBus.subirPasajeros(30)
miBus.mostrarAsientosDisponibles()
print("\n--- Cobrando pasajes ---")
miBus.cobrarPasaje(30)
miBus.mostrarInformacion()