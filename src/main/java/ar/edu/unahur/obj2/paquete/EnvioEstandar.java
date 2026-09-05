package ar.edu.unahur.obj2.paquete;

public class EnvioEstandar implements EstrategiaDeEnvio{

    @Override
    public Double calcularCosto(Double pesoEnKg) {
       return 150.0 + 30.0 * pesoEnKg;
    }

}
