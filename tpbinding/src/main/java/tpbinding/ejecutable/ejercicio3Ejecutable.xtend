package tpbinding.ejecutable

import tpbinding.ui.ejercicio3UI
import tpbinding.model.ejercicio3Model
import org.uqbar.arena.Application
import org.uqbar.arena.windows.Window

class ejercicio3Ejecutable extends Application {

	static def void main(String[] args) {
		new ejercicio3Ejecutable().start()
	}

	override protected Window<?> createMainWindow() {
		return new ejercicio3UI(this, new ejercicio3Model())
	}
	
}