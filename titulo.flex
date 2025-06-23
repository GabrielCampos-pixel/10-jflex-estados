/* 
 * Exemplo de analisador léxico que armazena comentários entre "...", 
 * trata corretamente caracteres escapados como \" \\ \n \t etc
 * e imprime o conteúdo do comentário na tela.
 */

%%

%standalone  
%class titulo 

%{
    private StringBuilder titulo = new StringBuilder();
%}

%states TITULO

%%



<YYINITIAL> {
    "<font size=\"+1\">"   { yybegin(TITULO); titulo.setLength(0); }
    [^]     { /* Ignora qualquer caracter fora de comentários. */ }
}

<TITULO> {
    "</font>" { 
        yybegin(YYINITIAL); 
        System.out.println("Título da patente capturado:\n" + titulo.toString()); 
    }
    [a-zA-Z]* \s*  { titulo.append(yytext()); } 
}
