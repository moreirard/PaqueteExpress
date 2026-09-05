package ar.edu.unahur.obj2.paquete;

/**
 * EnvioAereo
 */
public class EnvioAereo implements EstrategiaDeEnvio{

    @Override
    public Double calcularCosto(Double pesoEnKg) {
        return 800.0 + 100.0 * pesoEnKg;        
    }

}
