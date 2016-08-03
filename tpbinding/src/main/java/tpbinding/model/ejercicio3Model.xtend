package tpbinding.model

import org.uqbar.commons.utils.Observable
import org.eclipse.xtend.lib.annotations.Accessors
import org.uqbar.commons.utils.Dependencies
import java.awt.Color

@Accessors
@Observable
class ejercicio3Model {
	String frase
	String conversion

	new() {
		this.frase = ""
		this.conversion = ""
	}

	def void setFrase(String frase) {
		this.frase = frase
		convertir
	}

	def void convertir() {
		var int i
		conversion = ""
		for (i = frase.length - 1; i >= 0; i--)
			conversion += frase.charAt(i)
	}

	@Dependencies("conversion")
	def getPalindromo() {
		var color = Color.RED
		if (frase.toLowerCase.replaceAll("\\s", "").equals(conversion.toLowerCase.replaceAll("\\s", "")))
			color = Color.BLUE
		color
	}
	
}