/* 
 * Exemplo de analisador léxico que armazena comentários entre "...", 
 * trata corretamente caracteres escapados como \" \\ \n \t etc
 * e imprime o conteúdo do comentário na tela.
 */

%%

%standalone   
%class reivindicacoes

%{
    private StringBuilder reivindicacoes = new StringBuilder();
%}

%states REIVINDICACOES

%%



<YYINITIAL> {
    "</B></I></CENTER> <HR> <BR><BR>"   { yybegin(REIVINDICACOES); reivindicacoes.setLength(0); } 
    [^]     { /* Ignora qualquer caracter fora de comentários. */ }
}

<REIVINDICACOES> {
    "<HR> <CENTER>" { 
        yybegin(YYINITIAL); 
        System.out.println("Reivindicações da patente:\n" + reivindicacoes.toString()); 
    }
    [\w* \s* \'-.,:;<>]   { reivindicacoes.append(yytext()); } 
}