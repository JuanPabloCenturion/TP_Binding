package tpbinding.model;

import java.awt.Color;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;
import org.uqbar.commons.utils.Dependencies;
import org.uqbar.commons.utils.Observable;

@Accessors
@Observable
@SuppressWarnings("all")
public class ejercicio3Model {
  private String frase;
  
  private String conversion;
  
  public ejercicio3Model() {
    this.frase = "";
    this.conversion = "";
  }
  
  public void setFrase(final String frase) {
    this.frase = frase;
    this.convertir();
  }
  
  public void convertir() {
    int i = 0;
    this.conversion = "";
    for (i = (this.frase.length() - 1); (i >= 0); i--) {
      String _conversion = this.conversion;
      char _charAt = this.frase.charAt(i);
      this.conversion = (_conversion + Character.valueOf(_charAt));
    }
  }
  
  @Dependencies("conversion")
  public Color getPalindromo() {
    Color _xblockexpression = null;
    {
      Color color = Color.RED;
      String _lowerCase = this.frase.toLowerCase();
      String _replaceAll = _lowerCase.replaceAll("\\s", "");
      String _lowerCase_1 = this.conversion.toLowerCase();
      String _replaceAll_1 = _lowerCase_1.replaceAll("\\s", "");
      boolean _equals = _replaceAll.equals(_replaceAll_1);
      if (_equals) {
        color = Color.BLUE;
      }
      _xblockexpression = color;
    }
    return _xblockexpression;
  }
  
  @Pure
  public String getFrase() {
    return this.frase;
  }
  
  @Pure
  public String getConversion() {
    return this.conversion;
  }
  
  public void setConversion(final String conversion) {
    this.conversion = conversion;
  }
}
