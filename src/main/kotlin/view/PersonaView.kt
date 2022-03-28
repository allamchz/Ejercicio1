package view

import controller.PersonaController
import model.Persona

class PersonaView {
    var persona = Persona()
    var personaController = PersonaController(persona)

    fun inicializa(){
        persona.altura = 180
        persona.peso = 80
        println(persona.altura)

        personaController.persona = persona


        println(personaController.carcularIMC())
    }





}