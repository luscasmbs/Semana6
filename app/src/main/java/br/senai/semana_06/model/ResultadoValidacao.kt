package br.senai.semana_06.model

sealed class ResultadoValidacao{
    object Valido: ResultadoValidacao()
    data class Invalido(val mensagens: List<String>):
            ResultadoValidacao()
}
data class Entrega(
    val readme: Boolean,
    val commits: Int,
    val checklist: Boolean,
    val evidencias: Boolean
)
fun ValidarEntrega(entrega: Entrega): ResultadoValidacao{
    val erros = mutableListOf<String>()

    if (!entrega.readme){
        erros.add("É obrigatório ter um readme")
    }
    if (entrega.commits < 3) {
        erros.add("É obrigatório no mínimo 3 commits")
    }

    if (!entrega.checklist) {
        erros.add("Checklist é obrigatório")
    }

    return if (erros.isEmpty()) {
        ResultadoValidacao.Valido
    } else {
        ResultadoValidacao.Invalido(erros)
    }

}