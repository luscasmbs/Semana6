data class Competidor(val nome: String, val nota: Double)

sealed class Media{
    data class Sucesso(val media: Double): Media()
    data class Erro(val texto: String): Media()
}

fun calcularMedia(competidores: List<Competidor>): Media {
    val media = competidores.sumOf { it.nota } / competidores.size
    
    return Media.Sucesso(media)
}
