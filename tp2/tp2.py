
from abc import ABC
from datetime import date


class Empleado(ABC):
    def __init__(self, nombre: str, dirección: str, estadoCivil: str, fechaDeNacimiento: date, sueldoBásico: float):
        self.nombre: str = nombre
        self.dirección: str = dirección
        self.estadoCivil: str = estadoCivil
        self.fechaDeNacimiento: date = fechaDeNacimiento
        self.sueldoBásico: float = sueldoBásico
        
    def calcularEdad(self)->int:
        return self.fechaDeNacimiento.year - date.today().year
    
    def calcularSueldoNeto(self)->float:
        return self.calcularSueldoBruto() - self.calcularRetenciones()
    
    def calcularSueldoBruto(self)->float:
        raise LookupError
    
    def calcularRetenciones(self)->float:
        raise LookupError


class Empresa:
    def __init__(self, cuit: str, nombre: str):
        self.cuit: str = cuit
        self.nombre: str = nombre
        self.empleados: list[Empleado] = []
        self.recibosDeHaberes: list = []
    
    def calcularTotalSueldos(self)->float :
        total = 0
        for empleado in self.empleados:
            total += empleado.calcularSueldoNeto()
            
        return total
        
    def calcularTotalSueldosBrutos(self)->float :
        total = 0
        for empleado in self.empleados:
            total += empleado.calcularSueldoBruto()
            
        return total
    
    def calcularTotalRetenciones(self)->float :
        total = 0
        for empleado in self.empleados:
            total += empleado.calcularRetenciones(empleado.calcularSueldoBruto())
            
        return total
    
    def realizarLiquidaciónDeSueldos(self)->None:
        for empleado in self.empleados:
            self.recibosDeHaberes.append(ReciboDeHaberes(empleado, date.today))
            
    def contratarEmpleado(self, empleado: Empleado):
        self.empleados.append(empleado)
            
        
    
    
class EmpleadoTemporario(Empleado):
    def __init__(self, nombre: str, dirección: str, estadoCivil: str, fechaDeNacimiento: date, sueldoBásico: float, cantidadDeHorasExtra: int, fechaDeFin: date):
        super().__init__(nombre, dirección, estadoCivil, fechaDeNacimiento, sueldoBásico)
        self.cantidadDeHorasExtra: int = cantidadDeHorasExtra
        self.fechaDeFin: date = fechaDeFin
        
    def calcularSueldoBruto(self)->float:
        horasExtra = 40 * self.cantidadDeHorasExtra
        return self.sueldoBásico + horasExtra
    
    def calcularRetenciones(self)->float:
        sueldoBruto = self.calcularSueldoBruto()
        asignaciónPorEdad = 25 if self.calcularEdad() > 50 else 0
        obraSocial = sueldoBruto * 0.1 + asignaciónPorEdad
        aportesJubilatorios = sueldoBruto * 0.1 + 5 * self.cantidadDeHorasExtra
        
        return aportesJubilatorios + obraSocial
    
class EmpleadoContratado(Empleado):
    def __init__(self, nombre: str, dirección: str, estadoCivil: str, fechaDeNacimiento: date, sueldoBásico: float, númeroDeContrato: str, medioDePago: str):
        super().__init__(nombre, dirección, estadoCivil, fechaDeNacimiento, sueldoBásico)
        self.númeroDeContrato: str = númeroDeContrato
        self.medioDePago: str = medioDePago
        
    def calcularSueldoBruto(self)->float:
        return self.sueldoBásico
    
    def calcularRetenciones(self)->float:
        gastosAdministrativosContractuales = 50
        
        return gastosAdministrativosContractuales
        
        
class EmpleadoPermanente(Empleado):
    def __init__(self, nombre: str, dirección: str, estadoCivil: str, fechaDeNacimiento: date, sueldoBásico: float, cantidadHijos: int, antigüedad: int):
        super().__init__(nombre, dirección, estadoCivil, fechaDeNacimiento, sueldoBásico)
        self.cantidadHijos: int = cantidadHijos
        self.antigüedad: int = antigüedad
        
    def calcularSueldoBruto(self)->float:
        asignaciónPorHijo = 150 * self.cantidadHijos
        tieneCónyuge = self.estadoCivil == "Casado"
        asignaciónPorCónyuge = 100 if tieneCónyuge else 0
        antigüedad = 50 * self.antigüedad
        
        salarioFamiliar = asignaciónPorHijo + asignaciónPorCónyuge + antigüedad
        
        return self.sueldoBásico + salarioFamiliar
        
    
    def calcularRetenciones(self)->float:
        sueldoBruto = self.calcularSueldoBruto()
        aportesJubilatorios = sueldoBruto * 0.15
        obraSocial = sueldoBruto * 0.1 + 20 * self.cantidadHijos
        
        return aportesJubilatorios + obraSocial
    

class ReciboDeHaberes:
    def __init__(self, empleado: Empleado, fechaEmisión: date):
        self.nombre: str = empleado.nombre
        self.dirección: str = empleado.dirección
        self.fechaEmisión: date = fechaEmisión
        self.sueldoBruto: float = empleado.calcularSueldoBruto()
        self.sueldoNeto: float = empleado.calcularSueldoNeto()
        self.desgloce: str = f'''
        Sueldo bruto: {self.sueldoBruto}
        Retenciones: {empleado.calcularRetenciones()}
        '''      
        
    def __repr__(self) -> str:
        return self.desgloce
        
        
        
# roberto = EmpleadoPermanente(nombre="Roberto", antigüedad=2, dirección="Dean Funes 125", estadoCivil= "Casado", fechaDeNacimiento=date(2000, 1, 1), sueldoBásico=2000, cantidadHijos=2)
# juan = EmpleadoPermanente(nombre="Juan", antigüedad=5, dirección="Dean Funes 850", estadoCivil= "Soltero", fechaDeNacimiento=date(1980, 5, 6), sueldoBásico=2500, cantidadHijos=0)
# pepe = EmpleadoTemporario(cantidadDeHorasExtra=2, fechaDeFin=date(2025, 1, 1), nombre="pepe", dirección="Lavalle 500", estadoCivil="Soltero", fechaDeNacimiento=date(1998, 12, 3), sueldoBásico=1000)

# empresa = Empresa(cuit="20232444", nombre="San Juan inc.")


# print("SUELDOS TOTALES ------------------------------------------")
# print("")
# print(empresa.calcularTotalSueldos())
# print("")
# print("----------------------------------------------------------")

# empresa.realizarLiquidaciónDeSueldos()

# print("LIQUIDACIÓN -------------------------------------------------")
# print("")
# print(empresa.recibosDeHaberes)
# print("")
# print("----------------------------------------------------------")


def test02():
    roberto = EmpleadoPermanente(nombre="Roberto", antigüedad=2, dirección="Dean Funes 125", estadoCivil= "Casado", fechaDeNacimiento=date(2000, 1, 1), sueldoBásico=2000, cantidadHijos=2)
    pepe = EmpleadoTemporario(cantidadDeHorasExtra=2, fechaDeFin=date(2025, 1, 1), nombre="pepe", dirección="Lavalle 500", estadoCivil="Soltero", fechaDeNacimiento=date(1995, 12, 3), sueldoBásico=1000)
    agustín = EmpleadoTemporario(cantidadDeHorasExtra=5, fechaDeFin=date(2026, 5, 1), nombre="agustín", dirección="San Martín 506", estadoCivil="Casado", fechaDeNacimiento=date(2000, 12, 3), sueldoBásico=1000)
    miguel = EmpleadoContratado(númeroDeContrato="0001", medioDePago="Tarjeta", nombre="miguel", dirección="Belgrano 5000", estadoCivil="Soltero", fechaDeNacimiento=date(1998, 12, 1), sueldoBásico=1000)
    
    empleados = [roberto, pepe, agustín, miguel]
    
    empresa = Empresa(cuit="20232466", nombre="Corpus inc.")

    for empleado in empleados:
        empresa.contratarEmpleado(empleado)
        
    print("")    
    print("SUELDOS TOTALES ------------------------------------------")
    print(f"          {empresa.calcularTotalSueldos()}")
    print("----------------------------------------------------------")

    empresa.realizarLiquidaciónDeSueldos()

    print("LIQUIDACIÓN -------------------------------------------------")
    print("")
    print(empresa.recibosDeHaberes)
    print("")
    print("----------------------------------------------------------")
    
def test01():
    roberto = EmpleadoPermanente(nombre="Roberto", antigüedad=2, dirección="Dean Funes 125", estadoCivil= "Casado", fechaDeNacimiento=date(2000, 1, 1), sueldoBásico=2000, cantidadHijos=2)
    juan = EmpleadoPermanente(nombre="Juan", antigüedad=5, dirección="Dean Funes 850", estadoCivil= "Soltero", fechaDeNacimiento=date(1980, 5, 6), sueldoBásico=2500, cantidadHijos=0)
    pepe = EmpleadoTemporario(cantidadDeHorasExtra=2, fechaDeFin=date(2025, 1, 1), nombre="pepe", dirección="Lavalle 500", estadoCivil="Soltero", fechaDeNacimiento=date(1998, 12, 3), sueldoBásico=1000)
    rich = EmpleadoContratado(númeroDeContrato="0000", medioDePago="Tarjeta", nombre="rich", dirección="Belgrano 5000", estadoCivil="Casado", fechaDeNacimiento=date(1995, 12, 1), sueldoBásico=15000)

    empresa = Empresa(cuit="20232444", nombre="San Juan inc.")
    
    empleados = [roberto, pepe, juan, rich]

    for empleado in empleados:
        empresa.contratarEmpleado(empleado)
        
    print("")    
    print("SUELDOS TOTALES ------------------------------------------")
    print(f"          {empresa.calcularTotalSueldos()}")
    print("----------------------------------------------------------")

    empresa.realizarLiquidaciónDeSueldos()

    print("LIQUIDACIÓN -------------------------------------------------")
    print("")
    print(empresa.recibosDeHaberes)
    print("")
    print("----------------------------------------------------------")


test01()
