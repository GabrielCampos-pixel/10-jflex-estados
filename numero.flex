/* 
 * Exemplo de analisador léxico que armazena comentários entre "...", 
 * trata corretamente caracteres escapados como \" \\ \n \t etc
 * e imprime o conteúdo do comentário na tela.
 */

%%

%standalone 
%class numero

%{
    private StringBuilder numero = new StringBuilder();
%}

%states NUMERO

%%



<YYINITIAL> {
    "<TD ALIGN=\"RIGHT\" WIDTH=\"50%\"><B>"   { yybegin(NUMERO); numero.setLength(0); } 
    [^]     { /* Ignora qualquer caracter fora de comentários. */ }
}

<NUMERO> {
    "</B>" { 
        yybegin(YYINITIAL); 
        System.out.println("Número da patente capturado:\n" + numero.toString()); 
    }
    [0-9]","[0-9]{3}","[0-9]{3}  { numero.append(yytext()); }
}