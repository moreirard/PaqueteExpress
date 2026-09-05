package ar.edu.unahur.obj2.paquete;

public class PedidoNacional {

    private Double pesoEnKg;
    private EstrategiaDeEnvio estrategiaDeEnvio;
    private Double costoFinal;
    private String numeroDeGuia;
    private EstadoDePedido estado;

    public PedidoNacional(Double pesoEnKg, EstrategiaDeEnvio estrategiaDeEnvio) {
       this.pesoEnKg = pesoEnKg;
       this.estrategiaDeEnvio = estrategiaDeEnvio;
    }

    public void despachar() {
      costoFinal = estrategiaDeEnvio.calcularCosto(pesoEnKg);
      numeroDeGuia = "PED-NAC-" + System.nanoTime();
      estado = EstadoDePedido.CONFIRMADO;
    }

    public String getNuemeroDeGuia() {
        return this.numeroDeGuia;
      
    }

}
