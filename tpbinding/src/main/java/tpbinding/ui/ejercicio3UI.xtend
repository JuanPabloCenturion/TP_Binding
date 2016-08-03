package tpbinding.ui

import tpbinding.model.ejercicio3Model
import org.uqbar.arena.widgets.Panel
import org.uqbar.arena.windows.WindowOwner
import org.uqbar.arena.windows.Window
import org.uqbar.arena.widgets.Label
import org.uqbar.arena.widgets.TextBox
import static extension org.uqbar.arena.xtend.ArenaXtendExtensions.*

class ejercicio3UI extends Window<ejercicio3Model> {

	new(WindowOwner owner, ejercicio3Model model) {
		super(owner, model)
	}

	override createContents(Panel mainPanel) {
		this.title = "Conversor de Frases"

		new Label(mainPanel).text = "Frase"
		new TextBox(mainPanel) => [
			value <=> "frase"
			width = 215
		]

		new Label(mainPanel) => [
			foreground <=> [ejercicio3Model c|c.palindromo]
			value <=> "conversion"
		]
	}

}