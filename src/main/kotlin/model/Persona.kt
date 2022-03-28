package model

class Persona {
    var nombre : String = ""
    var cedula : Int = 0
    var sexo : Char = 'H'
    var edad : Int = 0
    var peso: Int = 0
    var altura: Int = 0



    constructor(nombre: String, cedula: Int, sexo: Char, edad: Int, peso: Int, altura: Int) {
        this.nombre = nombre
        this.cedula = cedula
        this.sexo = sexo
        this.edad = edad
        this.peso = peso
        this.altura = altura
    }

    constructor(nombre: String, sexo: Char, edad: Int) {
        this.nombre = nombre
        this.sexo = sexo
        this.edad = edad
    }

    constructor()


}