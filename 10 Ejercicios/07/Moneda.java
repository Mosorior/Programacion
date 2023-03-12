public class Moneda {
    private String posicion;
    private String cantidad;
  
    public Moneda() {
      this.posicion = generarPosicionAleatoria();
      this.cantidad = generarCantidadAleatoria();
    }
  
    public String getPosicion() {
      return this.posicion;
    }
  
    public String getCantidad() {
      return this.cantidad;
    }
  
    public void setPosicion(String posicion) {
      this.posicion = posicion;
    }
  
    public void setCantidad(String cantidad) {
      this.cantidad = cantidad;
    }
  
    private String generarPosicionAleatoria() {
      String[] posiciones = {"1 céntimo", "2 céntimos", "5 céntimos", "10 céntimos", "20 céntimos", "50 céntimos", "1 euro", "2 euros"};
      int indiceAleatorio = (int) (Math.random() * posiciones.length);
      return posiciones[indiceAleatorio];
    }
  
    private String generarCantidadAleatoria() {
      int cantidadAleatoria = (int) (Math.random() * 2);
      return cantidadAleatoria == 0 ? "cara" : "cruz";
    }
}
  
   
  