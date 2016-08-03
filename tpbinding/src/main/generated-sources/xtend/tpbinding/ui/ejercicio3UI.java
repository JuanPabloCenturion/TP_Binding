package tpbinding.ui;

import java.awt.Color;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.uqbar.arena.bindings.ObservableValue;
import org.uqbar.arena.widgets.Control;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.TextBox;
import org.uqbar.arena.windows.Window;
import org.uqbar.arena.windows.WindowOwner;
import org.uqbar.arena.xtend.ArenaXtendExtensions;
import org.uqbar.lacar.ui.model.ControlBuilder;
import org.uqbar.lacar.ui.model.bindings.ViewObservable;
import tpbinding.model.ejercicio3Model;

@SuppressWarnings("all")
public class ejercicio3UI extends Window<ejercicio3Model> {
  public ejercicio3UI(final WindowOwner owner, final ejercicio3Model model) {
    super(owner, model);
  }
  
  public void createContents(final Panel mainPanel) {
    this.setTitle("Conversor de Frases");
    Label _label = new Label(mainPanel);
    _label.setText("Frase");
    TextBox _textBox = new TextBox(mainPanel);
    final Procedure1<TextBox> _function = new Procedure1<TextBox>() {
      public void apply(final TextBox it) {
        ObservableValue<Control, ControlBuilder> _value = it.<ControlBuilder>value();
        ArenaXtendExtensions.operator_spaceship(_value, "frase");
        it.setWidth(215);
      }
    };
    ObjectExtensions.<TextBox>operator_doubleArrow(_textBox, _function);
    Label _label_1 = new Label(mainPanel);
    final Procedure1<Label> _function_1 = new Procedure1<Label>() {
      public void apply(final Label it) {
        ViewObservable<Control, ControlBuilder> _foreground = it.<ControlBuilder>foreground();
        final Function1<ejercicio3Model, Color> _function = new Function1<ejercicio3Model, Color>() {
          public Color apply(final ejercicio3Model c) {
            return c.getPalindromo();
          }
        };
        ArenaXtendExtensions.<ejercicio3Model, Color>operator_spaceship(_foreground, _function);
        ObservableValue<Control, ControlBuilder> _value = it.<ControlBuilder>value();
        ArenaXtendExtensions.operator_spaceship(_value, "conversion");
      }
    };
    ObjectExtensions.<Label>operator_doubleArrow(_label_1, _function_1);
  }
}
