def organograma = "08000200"
def funcao      = "10"
def subfuncao   = "301"
def programa    = "0803"
def acao        = "2019"
def natureza    = "33903900"
def recurso     = "0.1.0046.0000"

def getRight = { str, tam ->
   def tamStr = str.length()
   if(tamStr >= tam){
      return str.substring(tamStr-tam, tamStr)
   } else {
       return str
   }
}

def numOrgao     = organograma.toString().take(2).padLeft(2,'0')
def numUnidade   = getRight(organograma.toString().substring(2), 3).padLeft(3,'0')
def numFuncao    = funcao.toString().take(2).padLeft(2,'0')
def numSubfuncao = subfuncao.toString().take(3).padLeft(3, '0')
def numPrograma  = programa.toString().take(4).padLeft(4, '0')
def numAcao      = acao.toString().take(1) + "0" + getRight(acao.toString().substring(1), 3).padLeft(3,'0')
def numNatureza  = "${natureza.toString().substring(0, 1)}.${natureza.toString().substring(1, 2)}.${natureza.toString().substring(2, 4)}.${natureza.toString().substring(4, 6)}.${natureza.toString().substring(6, 8)}"
def arrRecurso   = recurso.split("\\.").collect({ it.toString() })
def numRecurso   = arrRecurso.size() >= 3 ? (arrRecurso[0].padRight(1,'0') + "." + arrRecurso[1].padRight(1,'0') + "." + getRight(arrRecurso[2], 2).padRight(2,'0') + "." + arrRecurso[3].padRight(6,'0'))  : ""

def DOT_CodigoResumido = """${numOrgao}.${numUnidade}.${numFuncao}.${numSubfuncao}.${numPrograma}.${numAcao}.${numNatureza}.${numRecurso}"""
def modeloIdeal        = "99.999.99.999.9999.99999.9.9.99.99.99.9.9.99.999999"
println modeloIdeal
println DOT_CodigoResumido 