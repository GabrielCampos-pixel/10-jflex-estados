/* 
 * Exemplo de analisador léxico que armazena comentários entre "...", 
 * trata corretamente caracteres escapados como \" \\ \n \t etc
 * e imprime o conteúdo do comentário na tela.
 */


%%

%standalone   
%class data 

%{
    private StringBuilder datapubli = new StringBuilder();
%}

%states DATAPUBLI

%%



<YYINITIAL> {
    "<TD ALIGN=\"RIGHT\" WIDTH=\"50%\"> <B>"   { yybegin(DATAPUBLI); datapubli.setLength(0); }  // Inicia o comentário.
    [^]     { /* Ignora qualquer caracter fora de comentários. */ }
}

<DATAPUBLI> {
    "</B></TD>" { 
        yybegin(YYINITIAL); 
        System.out.println("Data de publicação da patente:\n" + datapubli.toString()); 
    }
    [a-zA-Z]+ \s [0-9]"," \s [0-9]{4}  { datapubli.append(yytext()); } 
}
