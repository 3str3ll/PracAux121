class Producto:
    def __init__(self, nombre, precio, stockInicial):
        self.nombre = nombre
        self.precio = precio
        self.stock = stockInicial

    def vender(self, cantidad):
        if cantidad <= 0:
            print("Error: La cantidad a vender debe ser mayor a 0")
            return

        if cantidad <= self.stock:
            self.stock -= cantidad
            totalVenta = cantidad * self.precio
            print("Venta realizada: " + str(cantidad) + " unidades de " + self.nombre)
            print("Total de la venta: $" + str(totalVenta))
            print("Stock restante: " + str(self.stock))
        else:
            print("Error: No hay suficiente stock para vender " + str(cantidad) + " unidades")
            print("Stock disponible: " + str(self.stock))

    def reabastecer(self, cantidad):
        if cantidad <= 0:
            print("Error: La cantidad a reabastecer debe ser mayor a 0")
            return
        self.stock += cantidad
        print("Stock reabastecido: " + str(cantidad) + " unidades de " + self.nombre)
        print("Nuevo stock total: " + str(self.stock))

    def mostrarInformacion(self):
        print("\ninformacion de producto")
        print("Nombre: " + self.nombre)
        print("Precio: $" + str(self.precio))
        print("Stock: " + str(self.stock))

laptop = Producto("Laptop Gamer", 1200.00, 10)
mouse = Producto("Mouse Inalámbrico", 25.50, 50)

print("GESTIÓN DE INVENTARIO")
laptop.mostrarInformacion()
mouse.mostrarInformacion()

print(" vendiendo")
laptop.vender(3)
mouse.vender(15)

print("\n intento de venta con stock insuficiente")
laptop.vender(10)

print("\nrebasteciendo")
laptop.reabastecer(20)
mouse.reabastecer(30)

print("\nventa tras reabastecimiento")
laptop.vender(5)
mouse.vender(25)

print("\n  inventario")
laptop.mostrarInformacion()
mouse.mostrarInformacion()

print("\npruebas de validacion")
laptop.vender(-5)
laptop.reabastecer(0)