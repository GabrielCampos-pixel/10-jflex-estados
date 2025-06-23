/* 
 * Exemplo de analisador léxico que armazena comentários entre "...", 
 * trata corretamente caracteres escapados como \" \\ \n \t etc
 * e imprime o conteúdo do comentário na tela.
 */

%%

%standalone  
%class resumo 

%{
    private StringBuilder resumo = new StringBuilder();
%}

%states RESUMO

%%



<YYINITIAL> {
    "<B>Abstract</B></CENTER><P>"   { yybegin(RESUMO); resumo.setLength(0); } 
    [^]     { /* Ignora qualquer caracter fora de comentários. */ }
}

<RESUMO> {
    "</P>" { 
        yybegin(YYINITIAL); 
        System.out.println("Resumo da patente:\n" + resumo.toString()); 
    }
    [\w* \s* \'-.]   { resumo.append(yytext()); } 
}