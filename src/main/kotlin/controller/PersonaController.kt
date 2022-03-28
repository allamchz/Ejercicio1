package controller


import model.Persona

class PersonaController {

    val PESO_IDEAL = 0
    val SOBREPESO = 1
    val BAJOPESO = -1
    var persona = Persona()

    constructor(persona: Persona) {
        this.persona = persona
    }


    fun carcularIMC():Int{

        if ((persona.peso/100) / (persona.altura * persona.altura) < 18.5)
            return BAJOPESO
        if ((persona.peso/100) / (persona.altura * persona.altura) < 25.0)
            return PESO_IDEAL
        else
            return SOBREPESO
    }
    fun  esMayorDeEdad():Boolean{
        return persona.edad >=18
    }

    fun  comprobarSexo(){
        if (persona.sexo != 'M' || persona.sexo != 'H')
            persona.sexo= 'H'
    }


}