def retorno = """SOLICITA��O DE DIARIA PARA TRANSPORTAR AS DOSES DESTINADAS A CAMPANHA NACIONAL DE IMUNIZACAO CONTRA O COVID-19 E BOLSAS DE SANGUE
 NA CIDADE DE BARRA DO GARCASMT. DIARIA N. 330/2022. SOLICITACAO DE DIARIA PARA TRANSPORTAR AS DOSES DESTINADAS A CAMPANHA"""
 
def limparStringXml = { str ->
    def novo = ""
    if(str){
        novo = str.replaceAll(/[^�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|(a-z)|(A-Z)|(0-9)| |,|~\\~\|~\/~\|-|_|*|.|!|@|#|$|%|�|&|*|^|�|.|~|:|;|)|(|%|~\-|]/, "")
    }
    return novo
}

limparStringXml(retorno)