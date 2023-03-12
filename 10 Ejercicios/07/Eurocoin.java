import java.util.ArrayList;

public class Eurocoin {

  public static void main(String[] args) {
    ArrayList<Moneda> listaMonedas = new ArrayList<>();
    Moneda monedaAnterior = new Moneda();
    listaMonedas.add(monedaAnterior);

    for (int i = 0; i < 5; i++) {
      boolean monedaDiferente = false;
      Moneda nuevaMoneda = new Moneda();
      for (Moneda m : listaMonedas) {
        if (!m.equals(nuevaMoneda)) {
          monedaDiferente = true;
          break;
        }
      }
      if (monedaDiferente) {
        listaMonedas.add(nuevaMoneda);
        monedaAnterior = nuevaMoneda;
      }
    }

    for (Moneda m : listaMonedas) {
      System.out.println(m.toString());
    }
  }
}

