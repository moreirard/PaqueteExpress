package ar.edu.unahur.obj2.paquete;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculadorEstrategyTest {

     @Test
    void dadoEnvioEstandarConPesoDeDosKilos_alCalcularCosto_esDoscientosDiez() {
        // Given
        EstrategiaDeEnvio calculador = new EnvioEstandar();
        // When
        Double costo = calculador.calcularCosto(2.0);
        // Then
        assertEquals(210.0,costo);
    }
   
    @Test
    void dadoEnvioExpressConPesoDeDosKilos_alCalcularCosto_esQuinientosVeinte() {
        // Given
        EstrategiaDeEnvio calculador = new EnvioExress();
        // When
        Double costo = calculador.calcularCosto(2.0);
        // Then
        assertEquals(520.0,costo);
    }

    @Test
    void dadoRetiroEnSucursalConCualquierPeso_alCalcularCosto_esCero() {
        // Given
        EstrategiaDeEnvio calculador = new RetiroEnSucursal();
        // When
        Double costo = calculador.calcularCosto(10.0);
        // Then
        assertEquals(0.0,costo);
    }

    @Test
    void dadoEnvioAereoConPesoDeDosKilos_alCalcularCosto_esMil() {
        // Given
        EstrategiaDeEnvio calculador = new EnvioAereo();
        // When
        Double costo = calculador.calcularCosto(2.0);
        // Then
        assertEquals(1_000.0,costo);
    }

}
