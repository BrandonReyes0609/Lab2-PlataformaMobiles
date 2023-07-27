fun main() {
    /*
    * Nombre: Brandon Javier Reyes Morales
    * Carné: 22992
    * Correo: rey22992@uvg.edu.gt
    * Fecha: 26/07/2023
    * */
    //----------------Inicalización del Array----------------
    val myArrayList = ArrayList<String>()
    myArrayList.add("Brandon")
    myArrayList.add("Java")
    myArrayList.add("SQL")
    myArrayList.add("Kotlin")
    //-------------------------------------------------------



    var ID: Int? = 0;
    var Nombres: String? = ""
    var Apellidos: String? = ""
    var UrlPhoto: String? = ""
    var Edad: Int? = 0
    var Correo: String? = ""
    var Biografía: String? = ""
    var Estado: String? = ""
    var Hobbies:String? = "" //MutableList<Hobby> = mutableListOf()
    var Perfil: MutableList<Hobby> = mutableListOf()
    var ListadoPersonas = mutableListOf<PerfilUsuario>(
        PerfilUsuario(1, "Juan", "Perez", "www.Juan.com", 30, "juan@example.com", "Nacio en Estados Unidos", "Activo",null),
        PerfilUsuario(2, "Loncho", "Peludo", "www.Loncho.com", 24, "Loncho@example.com", "Nacio en Jamaica", "Activo",null),
        PerfilUsuario(3, "Oveja", "Peluda", "www.Oveja.com", 5, "Oveja@example.com", "Nacio en Mexico", "Activo",null),
        PerfilUsuario(4, "Brandon", "Reyes", "www.Brando.com", 30, "juan@example.com", "Nacio en Guamtela", "Activo",null),
    )

    var op: String? = ""

    //-----------PERFILES PRECARGADOS


    //-----------
    println("Bienvenido al Programa de Brandon Reyes 0609")
    println("Por favor, ingrese la opción:")
    println("1) Crear usario")
    println("2) Buscar Perfil")
    println("3) Eliminar perfil")
    println("4) Agregar Hobbie")
    println("5) Cerrar el programa")

    op = (readLine())
    println("->Selecciono la opción: $op")

    while(op != "5"){

        if(op == "1") {
            //Opción  de crear ususario
            //ID
            println("Por favor, ingrese el ID:")
            ID = (readLine())?.toInt()
            println("->ID: $ID")

            //Nombre
            println("Por favor, ingrese su nombre:")
            Nombres = (readLine())
            println("->Nombre: $Nombres")

            //Apellidos
            println("Por favor, ingrese sus Apellidos:")
            Apellidos = (readLine())
            println("->Apellidos: $Apellidos")

            //UrlPhoto
            println("Por favor, ingrese sus UrlPhoto:")
            UrlPhoto = (readLine())
            println("->UrlPhoto: $UrlPhoto")

            //Edad
            println("Por favor, ingrese sus Edad:")
            Edad = (readLine())?.toInt()
            println("->Edad: $Edad")

            //Correo
            println("Por favor, ingrese sus Correo:")
            Correo = readLine()
            println("->Correo: $Correo")

            //Biografía
            println("Por favor, ingrese sus Biografía:")
            Biografía = (readLine())
            println("->Biografía: $Biografía")

            //Estado
            println("Por favor, ingrese sus Estado:")
            Estado = (readLine())
            println("->Estado: $Estado")

            //Hobbies
            println("Por favor, ingrese sus Hobbies:")
            Hobbies = (readLine())
            println("->Hobbies: $Hobbies")

            var nuevoPerfil = PerfilUsuario(ID, Nombres, Apellidos, UrlPhoto, Edad, Correo, Biografía, Estado, Hobbies)
            ListadoPersonas.add(nuevoPerfil)
            println(ListadoPersonas)
            println("Perfil creado exitosamente.")


        } else if(op == "2") {


            println("Listado de las personas ingresadas")
            var i: Int = 0;
            var largoLista = ListadoPersonas.size - 1
            while(i <= largoLista){
                var datoID = ListadoPersonas[i].ID
                var datoNombres = ListadoPersonas[i].Nombres
                var datoApellidos = ListadoPersonas[i].Apellidos
                println("No.$i: ID: $datoID Nombres: $datoNombres Apellidos: $datoApellidos")
                i++

            }

            var j: Int = 0;

            println("Ingrese el ID, nombres o apellidos del perfil que desea buscar:")

            var search = (readLine())
            println("->Se busca: $search")

            while(j <= largoLista){
                var datoID = ListadoPersonas[j].ID
                var datoNombres = ListadoPersonas[j].Nombres
                var datoApellidos = ListadoPersonas[j].Apellidos
                if(search.equals( datoID.toString()) ){
                    println("Se encontro el dato: $search")
                    println(ListadoPersonas[j])

                }
                if(search.equals( datoNombres)){
                    println("Se encontro el dato: $search")
                    println(ListadoPersonas[j])

                }
                if(search.equals(datoApellidos) ){
                    println("Se encontro el dato: $search")
                    println(ListadoPersonas[j])
                }
                j++

            }

        }else if(op == "3"){
            //var listadoPersonas = mutableListOf<PerfilUsuario>()
            var idCounter = 0

            println("Listado de las personas ingresadas")
            while (idCounter < ListadoPersonas.size) {
                val datoID = ListadoPersonas[idCounter].ID
                println("No.${idCounter + 1}: ID: $datoID")
                idCounter++
            }

            println("Ingrese el ID del perfil que desea borrar:")
            val searchID = readLine()?.toIntOrNull()

            if (searchID != null) {
                val foundIndex = ListadoPersonas.indexOfFirst { it.ID == searchID }
                if (foundIndex != -1) {
                    ListadoPersonas.removeAt(foundIndex)
                    println("Elemento con ID '$searchID' eliminado.")
                } else {
                    println("El elemento con ID '$searchID' no existe en la lista.")
                }
            } else {
                println("Entrada inválida. Ingrese un valor numérico para el ID.")
            }

        }else if(op == "5") {
            println("Cerro el programa")
            break

        }else if(op == "4") {
            println("------------------------------------")
            println("Selecciono Agregar Hobbie")
            println("------------------------------------")
            println("Listado de las personas ingresadas")
            var k: Int = 0;
            var largoLista = ListadoPersonas.size - 1
            while(k <= largoLista){
                var datoID = ListadoPersonas[k].ID
                var datoNombres = ListadoPersonas[k].Nombres
                var datoApellidos = ListadoPersonas[k].Apellidos
                println("No.$k: ID: $datoID Nombres: $datoNombres Apellidos: $datoApellidos")
                k++
            }


        }
        println("Por favor, ingrese la opción:")
        println("1) Crear usario")
        println("2) Buscar Perfil")
        println("3) Eliminar perfil")
        println("4) Agregar Hobbie")
        op = (readLine())
        println("->Selecciono la opción: $op")

    }
}
