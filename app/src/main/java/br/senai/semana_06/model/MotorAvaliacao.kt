package br.senai.semana_06.model

class MotorAvaliacao(
    val regra: List<RegraAvaliacao>
){
    fun avaliar(entrega: Entrega): List<Penalidade>{
        return regra.mapNotNull { regra ->
            regra.avaliar(
                entrega
            )
        }
    }
}