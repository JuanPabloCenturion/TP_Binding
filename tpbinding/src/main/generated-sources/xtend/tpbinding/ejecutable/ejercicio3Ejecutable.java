package tpbinding.ejecutable;

import org.uqbar.arena.Application;
import org.uqbar.arena.windows.Window;
import tpbinding.model.ejercicio3Model;
import tpbinding.ui.ejercicio3UI;

@SuppressWarnings("all")
public class ejercicio3Ejecutable extends Application {
  public static void main(final String[] args) {
    ejercicio3Ejecutable _ejercicio3Ejecutable = new ejercicio3Ejecutable();
    _ejercicio3Ejecutable.start();
  }
  
  protected Window<?> createMainWindow() {
    ejercicio3Model _ejercicio3Model = new ejercicio3Model();
    return new ejercicio3UI(this, _ejercicio3Model);
  }
}
