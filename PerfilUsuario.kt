class PerfilUsuario {
    var ID: Int? = 0;
    var Nombres: String? = ""
    var Apellidos: String? = ""
    var UrlPhoto: String? = ""
    var Edad: Int? = 0
    var Correo: String? = ""
    var Biografía: String? = ""
    var Estado: String? = ""
    var Hobbies: String? = ""
    var hobbies: MutableList<Hobby> = mutableListOf()



    constructor(ID: Int?, Nombres: String?, Apellidos: String?, UrlPhoto: String?, Edad: Int? = 0, Correo: String?, Biografía: String?, Estado: String?, Hobbies: String?){
        this.ID = ID
        this.Nombres = Nombres
        this.Apellidos = Apellidos
        this.UrlPhoto = UrlPhoto
        this.Edad = Edad
        this.Correo = Correo
        this.Biografía = Biografía
        this.Estado = Estado
        this.Hobbies = Hobbies
        this.hobbies = hobbies

    }

    override fun toString(): String {
        return "PerfilUsuario(ID=$ID, Nombres=$Nombres, Apellidos=$Apellidos, UrlPhoto=$UrlPhoto, Edad=$Edad, Correo=$Correo, Biografía=$Biografía, Estado=$Estado, Hobbies=$Hobbies, hobbies=$hobbies)"
    }


}
