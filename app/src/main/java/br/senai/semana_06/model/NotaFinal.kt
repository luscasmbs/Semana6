package br.senai.semana_06.model

data class NotaFinal(val valor: Double){
    init {
         require(valor >100 && valor>=0){
             "Nota final deve ser entre 0 e 100"
         }

    }
    fun aplicarDesconto(pontos: Double): NotaFinal{
        require(pontos>=0){
            "Pontos não pode ser negativo"
        }
        return NotaFinal(valor-pontos)
    }
}
