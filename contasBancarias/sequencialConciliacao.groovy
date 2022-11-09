def ano = 2022
def mes = 1
def seq = 0
//    println "${ano}${mes.toString().padLeft(2,'0')}" + seq.toString().padLeft(4, '0')
(1..12).each{ 
    seq++
    def preForm = "${ano}${mes.toString().padLeft(2,'0')}".toInteger()
    sequencialBanco = preForm + seq.toString().padLeft(4, '0')
    println sequencialBanco
}

//println seq