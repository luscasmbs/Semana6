package br.senai.semana_06.validation

data class Penalidade(
    val motivo: String,
    val pontos: Double,
)


interface RegraAvaliacao {
    fun avaliar(entrega: Entrega): Penalidade?
}
class RegraReadme : RegraAvaliacao{
    override fun avaliar(entrega: Entrega): Penalidade? {
        return if (!entrega.readme) {
            Penalidade("Não tem readme, menos 5 pontos", 5.0)
        } else {
            null
        }
    }

}
class RegraEvidencias : RegraAvaliacao {
    override fun avaliar(entrega: Entrega): Penalidade? {
        return if (!entrega.evidencias) {
            Penalidade("NÃO tem evidências, menos 15 pontos", 15.0)
        } else {
            null
        }
    }
}
