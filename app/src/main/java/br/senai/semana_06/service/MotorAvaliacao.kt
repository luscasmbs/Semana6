package br.senai.semana_06.service

import br.senai.semana_06.validation.Entrega
import br.senai.semana_06.validation.Penalidade
import br.senai.semana_06.validation.RegraAvaliacao

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