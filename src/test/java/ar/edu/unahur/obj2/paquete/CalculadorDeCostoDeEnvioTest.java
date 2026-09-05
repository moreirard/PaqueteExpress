package ar.edu.unahur.obj2.paquete;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class CalculadorDeCostoDeEnvioTest {
    
    @Test
    void dadoEnvioEstandarConPesoDeDosKilos_alCalcularCosto_esDoscientosDiez() {
        // Given
        CalculadorDeCostoDeEnvio calculador = new CalculadorDeCostoDeEnvio();
        // When
        Double costo = calculador.calcular("ESTANDAR",2.0);
        // Then
        assertEquals(210.0,costo);
    }
   
    @Test
    void dadoEnvioExpressConPesoDeDosKilos_alCalcularCosto_esQuinientosVeinte() {
        // Given
        CalculadorDeCostoDeEnvio calculador = new CalculadorDeCostoDeEnvio();
        // When
        Double costo = calculador.calcular("EXPRESS",2.0);
        // Then
        assertEquals(520.0,costo);
    }

    @Test
    void dadoRetiroEnSucursalConCualquierPeso_alCalcularCosto_esCero() {
        // Given
        CalculadorDeCostoDeEnvio calculador = new CalculadorDeCostoDeEnvio();
        // When
        Double costo = calculador.calcular("RETIRO_SUCURSAL",10.0);
        // Then
        assertEquals(0.0,costo);
    }
}
