package br.senai.semana_06.service

import br.senai.semana_06.model.NotaFinal
import br.senai.semana_06.model.competidor
import br.senai.semana_06.validation.Entrega
import br.senai.semana_06.validation.Penalidade

class RelatorioAvaliacaoFormatter(
val notafinal: NotaFinal,
    val penalidade: Penalidade,
    val competidor: competidor
){
    fun formatar(entrega: Entrega): String{
        val formatado = "${competidor.nome} | $notafinal | ${competidor.modalidade} | $penalidade"

        return formatado
    }
}