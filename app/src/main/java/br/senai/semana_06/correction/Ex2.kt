val competidor = competidores.find { it.id == id }?: "O competidor não foi encontrado com o ID informado"
println(competidor.nome)
