/* The following code was generated by JFlex 1.7.0 */

/* 
 * Exemplo de analisador léxico que armazena comentários entre "...", 
 * trata corretamente caracteres escapados como \" \\ \n \t etc
 * e imprime o conteúdo do comentário na tela.
 */


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0
 * from the specification file <tt>resumo.flex</tt>
 */
class resumo {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int RESUMO = 2;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1, 1
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\5\22\22\0\1\22\6\0\10\22\1\13\12\22\2\0\1\1"+
    "\1\0\1\3\2\0\1\4\1\2\1\14\1\22\1\15\10\22\1\16"+
    "\1\22\1\21\1\22\1\20\1\22\1\17\6\22\4\0\1\22\1\0"+
    "\1\11\1\5\1\12\16\22\1\10\1\6\1\7\6\22\12\0\1\22"+
    "\32\0\1\22\11\0\1\22\12\0\1\22\4\0\1\22\5\0\27\22"+
    "\1\0\37\22\1\0\u01ca\22\4\0\14\22\16\0\5\22\7\0\1\22"+
    "\1\0\1\22\21\0\165\22\1\0\2\22\2\0\4\22\1\0\1\22"+
    "\6\0\1\22\1\0\3\22\1\0\1\22\1\0\24\22\1\0\123\22"+
    "\1\0\213\22\1\0\255\22\1\0\46\22\2\0\1\22\7\0\47\22"+
    "\11\0\55\22\1\0\1\22\1\0\2\22\1\0\2\22\1\0\1\22"+
    "\10\0\33\22\5\0\3\22\35\0\13\22\5\0\112\22\4\0\146\22"+
    "\1\0\10\22\2\0\12\22\1\0\23\22\2\0\1\22\20\0\73\22"+
    "\2\0\145\22\16\0\66\22\4\0\1\22\5\0\56\22\22\0\34\22"+
    "\104\0\25\22\1\0\10\22\26\0\16\22\1\0\201\22\2\0\12\22"+
    "\1\0\23\22\1\0\10\22\2\0\2\22\2\0\26\22\1\0\7\22"+
    "\1\0\1\22\3\0\4\22\2\0\11\22\2\0\2\22\2\0\4\22"+
    "\10\0\1\22\4\0\2\22\1\0\5\22\2\0\14\22\17\0\3\22"+
    "\1\0\6\22\4\0\2\22\2\0\26\22\1\0\7\22\1\0\2\22"+
    "\1\0\2\22\1\0\2\22\2\0\1\22\1\0\5\22\4\0\2\22"+
    "\2\0\3\22\3\0\1\22\7\0\4\22\1\0\1\22\7\0\20\22"+
    "\13\0\3\22\1\0\11\22\1\0\3\22\1\0\26\22\1\0\7\22"+
    "\1\0\2\22\1\0\5\22\2\0\12\22\1\0\3\22\1\0\3\22"+
    "\2\0\1\22\17\0\4\22\2\0\12\22\11\0\1\22\7\0\3\22"+
    "\1\0\10\22\2\0\2\22\2\0\26\22\1\0\7\22\1\0\2\22"+
    "\1\0\5\22\2\0\11\22\2\0\2\22\2\0\3\22\10\0\2\22"+
    "\4\0\2\22\1\0\5\22\2\0\12\22\1\0\1\22\20\0\2\22"+
    "\1\0\6\22\3\0\3\22\1\0\4\22\3\0\2\22\1\0\1\22"+
    "\1\0\2\22\3\0\2\22\3\0\3\22\3\0\14\22\4\0\5\22"+
    "\3\0\3\22\1\0\4\22\2\0\1\22\6\0\1\22\16\0\12\22"+
    "\20\0\4\22\1\0\10\22\1\0\3\22\1\0\27\22\1\0\20\22"+
    "\3\0\10\22\1\0\3\22\1\0\4\22\7\0\2\22\1\0\3\22"+
    "\5\0\4\22\2\0\12\22\20\0\4\22\1\0\10\22\1\0\3\22"+
    "\1\0\27\22\1\0\12\22\1\0\5\22\2\0\11\22\1\0\3\22"+
    "\1\0\4\22\7\0\2\22\7\0\1\22\1\0\4\22\2\0\12\22"+
    "\1\0\2\22\16\0\3\22\1\0\10\22\1\0\3\22\1\0\51\22"+
    "\2\0\10\22\1\0\3\22\1\0\5\22\5\0\4\22\7\0\5\22"+
    "\2\0\12\22\12\0\6\22\2\0\2\22\1\0\22\22\3\0\30\22"+
    "\1\0\11\22\1\0\1\22\2\0\7\22\3\0\1\22\4\0\6\22"+
    "\1\0\1\22\1\0\10\22\6\0\12\22\2\0\2\22\15\0\72\22"+
    "\5\0\17\22\1\0\12\22\47\0\2\22\1\0\1\22\2\0\2\22"+
    "\1\0\1\22\2\0\1\22\6\0\4\22\1\0\7\22\1\0\3\22"+
    "\1\0\1\22\1\0\1\22\2\0\2\22\1\0\15\22\1\0\3\22"+
    "\2\0\5\22\1\0\1\22\1\0\6\22\2\0\12\22\2\0\4\22"+
    "\40\0\1\22\27\0\2\22\6\0\12\22\13\0\1\22\1\0\1\22"+
    "\1\0\1\22\4\0\12\22\1\0\44\22\4\0\24\22\1\0\22\22"+
    "\1\0\44\22\11\0\1\22\71\0\112\22\6\0\116\22\2\0\46\22"+
    "\1\0\1\22\5\0\1\22\2\0\53\22\1\0\u014d\22\1\0\4\22"+
    "\2\0\7\22\1\0\1\22\1\0\4\22\2\0\51\22\1\0\4\22"+
    "\2\0\41\22\1\0\4\22\2\0\7\22\1\0\1\22\1\0\4\22"+
    "\2\0\17\22\1\0\71\22\1\0\4\22\2\0\103\22\2\0\3\22"+
    "\40\0\20\22\20\0\126\22\2\0\6\22\3\0\u026c\22\2\0\54\22"+
    "\5\0\113\22\3\0\13\22\7\0\15\22\1\0\7\22\13\0\25\22"+
    "\13\0\24\22\14\0\15\22\1\0\3\22\1\0\2\22\14\0\124\22"+
    "\3\0\1\22\4\0\2\22\2\0\12\22\41\0\3\22\2\0\12\22"+
    "\6\0\130\22\10\0\53\22\5\0\106\22\12\0\37\22\1\0\14\22"+
    "\4\0\14\22\12\0\50\22\2\0\5\22\13\0\54\22\4\0\32\22"+
    "\6\0\12\22\46\0\34\22\4\0\77\22\1\0\35\22\2\0\13\22"+
    "\6\0\12\22\15\0\1\22\10\0\17\22\101\0\114\22\4\0\12\22"+
    "\21\0\11\22\14\0\164\22\14\0\70\22\10\0\12\22\3\0\61\22"+
    "\2\0\11\22\107\0\3\22\1\0\43\22\1\0\2\22\6\0\366\22"+
    "\5\0\u011b\22\2\0\6\22\2\0\46\22\2\0\6\22\2\0\10\22"+
    "\1\0\1\22\1\0\1\22\1\0\1\22\1\0\37\22\2\0\65\22"+
    "\1\0\7\22\1\0\1\22\3\0\3\22\1\0\7\22\3\0\4\22"+
    "\2\0\6\22\4\0\15\22\5\0\3\22\1\0\7\22\3\0\13\22"+
    "\35\0\2\22\5\0\1\22\17\0\2\22\23\0\1\22\12\0\1\22"+
    "\21\0\1\22\15\0\1\22\20\0\15\22\63\0\41\22\21\0\1\22"+
    "\4\0\1\22\2\0\12\22\1\0\1\22\3\0\5\22\6\0\1\22"+
    "\1\0\1\22\1\0\1\22\1\0\4\22\1\0\13\22\2\0\4\22"+
    "\5\0\5\22\4\0\1\22\21\0\51\22\u032d\0\64\22\u0716\0\57\22"+
    "\1\0\57\22\1\0\205\22\6\0\11\22\14\0\46\22\1\0\1\22"+
    "\5\0\1\22\2\0\70\22\7\0\1\22\17\0\30\22\11\0\7\22"+
    "\1\0\7\22\1\0\7\22\1\0\7\22\1\0\7\22\1\0\7\22"+
    "\1\0\7\22\1\0\7\22\1\0\40\22\57\0\1\22\u01d0\0\1\22"+
    "\4\0\3\22\31\0\17\22\1\0\5\22\2\0\5\22\4\0\126\22"+
    "\2\0\2\22\2\0\3\22\1\0\132\22\1\0\4\22\5\0\51\22"+
    "\3\0\136\22\21\0\33\22\65\0\20\22\u0200\0\u19b6\22\112\0\u51d6\22"+
    "\52\0\u048d\22\103\0\56\22\2\0\u010d\22\3\0\34\22\24\0\63\22"+
    "\1\0\12\22\1\0\163\22\45\0\11\22\2\0\147\22\2\0\44\22"+
    "\1\0\10\22\77\0\61\22\30\0\64\22\14\0\106\22\12\0\12\22"+
    "\6\0\30\22\3\0\1\22\1\0\1\22\2\0\56\22\2\0\44\22"+
    "\14\0\35\22\3\0\101\22\16\0\13\22\6\0\37\22\1\0\67\22"+
    "\11\0\16\22\2\0\12\22\6\0\27\22\3\0\111\22\30\0\3\22"+
    "\2\0\20\22\2\0\5\22\12\0\6\22\2\0\6\22\2\0\6\22"+
    "\11\0\7\22\1\0\7\22\1\0\53\22\1\0\12\22\12\0\173\22"+
    "\1\0\2\22\2\0\12\22\6\0\u2ba4\22\14\0\27\22\4\0\61\22"+
    "\u2104\0\u016e\22\2\0\152\22\46\0\7\22\14\0\5\22\5\0\14\22"+
    "\1\0\15\22\1\0\5\22\1\0\1\22\1\0\2\22\1\0\2\22"+
    "\1\0\154\22\41\0\u016b\22\22\0\100\22\2\0\66\22\50\0\14\22"+
    "\4\0\20\22\20\0\20\22\3\0\2\22\30\0\3\22\40\0\5\22"+
    "\1\0\207\22\23\0\12\22\7\0\32\22\4\0\1\22\1\0\32\22"+
    "\13\0\131\22\3\0\6\22\2\0\6\22\2\0\6\22\2\0\3\22"+
    "\43\0\14\22\1\0\32\22\1\0\23\22\1\0\2\22\1\0\17\22"+
    "\2\0\16\22\42\0\173\22\105\0\65\22\210\0\1\22\202\0\35\22"+
    "\3\0\61\22\17\0\1\22\37\0\40\22\20\0\33\22\5\0\53\22"+
    "\5\0\36\22\2\0\44\22\4\0\10\22\1\0\5\22\52\0\236\22"+
    "\2\0\12\22\6\0\44\22\4\0\44\22\4\0\50\22\10\0\64\22"+
    "\234\0\u0137\22\11\0\26\22\12\0\10\22\230\0\6\22\2\0\1\22"+
    "\1\0\54\22\1\0\2\22\3\0\1\22\2\0\27\22\12\0\27\22"+
    "\11\0\37\22\101\0\23\22\1\0\2\22\12\0\26\22\12\0\32\22"+
    "\106\0\70\22\6\0\2\22\100\0\4\22\1\0\2\22\5\0\10\22"+
    "\1\0\3\22\1\0\33\22\4\0\3\22\4\0\1\22\40\0\35\22"+
    "\3\0\35\22\43\0\10\22\1\0\36\22\31\0\66\22\12\0\26\22"+
    "\12\0\23\22\15\0\22\22\156\0\111\22\67\0\63\22\15\0\63\22"+
    "\u030d\0\107\22\37\0\12\22\17\0\74\22\25\0\31\22\7\0\12\22"+
    "\6\0\65\22\1\0\12\22\20\0\44\22\2\0\1\22\11\0\105\22"+
    "\5\0\3\22\3\0\13\22\1\0\1\22\43\0\22\22\1\0\45\22"+
    "\6\0\1\22\101\0\7\22\1\0\1\22\1\0\4\22\1\0\17\22"+
    "\1\0\12\22\7\0\73\22\5\0\12\22\6\0\4\22\1\0\10\22"+
    "\2\0\2\22\2\0\26\22\1\0\7\22\1\0\2\22\1\0\5\22"+
    "\2\0\11\22\2\0\2\22\2\0\3\22\2\0\1\22\6\0\1\22"+
    "\5\0\7\22\2\0\7\22\3\0\5\22\213\0\113\22\5\0\12\22"+
    "\46\0\106\22\1\0\1\22\10\0\12\22\246\0\66\22\2\0\11\22"+
    "\27\0\6\22\42\0\101\22\3\0\1\22\13\0\12\22\46\0\70\22"+
    "\10\0\12\22\66\0\32\22\3\0\17\22\4\0\12\22\u0166\0\112\22"+
    "\25\0\1\22\u01c0\0\71\22\u0107\0\11\22\1\0\55\22\1\0\11\22"+
    "\17\0\12\22\30\0\36\22\2\0\26\22\1\0\16\22\u0349\0\u039a\22"+
    "\146\0\157\22\21\0\304\22\u0abc\0\u042f\22\u0fd1\0\u0247\22\u21b9\0\u0239\22"+
    "\7\0\37\22\1\0\12\22\146\0\36\22\2\0\5\22\13\0\67\22"+
    "\11\0\4\22\14\0\12\22\11\0\25\22\5\0\23\22\u0370\0\105\22"+
    "\13\0\57\22\20\0\21\22\100\0\1\22\37\0\u17ed\22\23\0\u02f3\22"+
    "\u250d\0\2\22\u0bfe\0\153\22\5\0\15\22\3\0\11\22\7\0\12\22"+
    "\3\0\2\22\u14c6\0\5\22\3\0\6\22\10\0\10\22\2\0\7\22"+
    "\36\0\4\22\224\0\3\22\u01bb\0\125\22\1\0\107\22\1\0\2\22"+
    "\2\0\1\22\2\0\2\22\2\0\4\22\1\0\14\22\1\0\1\22"+
    "\1\0\7\22\1\0\101\22\1\0\4\22\2\0\10\22\1\0\7\22"+
    "\1\0\34\22\1\0\4\22\1\0\5\22\1\0\1\22\3\0\7\22"+
    "\1\0\u0154\22\2\0\31\22\1\0\31\22\1\0\37\22\1\0\31\22"+
    "\1\0\37\22\1\0\31\22\1\0\37\22\1\0\31\22\1\0\37\22"+
    "\1\0\31\22\1\0\10\22\2\0\62\22\u0200\0\67\22\4\0\62\22"+
    "\10\0\1\22\16\0\1\22\26\0\5\22\1\0\17\22\u0550\0\7\22"+
    "\1\0\21\22\2\0\7\22\1\0\2\22\1\0\5\22\u07d5\0\305\22"+
    "\13\0\7\22\51\0\113\22\5\0\12\22\u04a6\0\4\22\1\0\33\22"+
    "\1\0\2\22\1\0\1\22\2\0\1\22\1\0\12\22\1\0\4\22"+
    "\1\0\1\22\1\0\1\22\6\0\1\22\4\0\1\22\1\0\1\22"+
    "\1\0\1\22\1\0\3\22\1\0\2\22\1\0\1\22\2\0\1\22"+
    "\1\0\1\22\1\0\1\22\1\0\1\22\1\0\1\22\1\0\2\22"+
    "\1\0\1\22\2\0\4\22\1\0\7\22\1\0\4\22\1\0\4\22"+
    "\1\0\1\22\1\0\12\22\1\0\21\22\5\0\3\22\1\0\5\22"+
    "\1\0\21\22\u0274\0\32\22\6\0\32\22\6\0\32\22\u0e76\0\ua6d7\22"+
    "\51\0\u1035\22\13\0\336\22\2\0\u1682\22\u295e\0\u021e\22\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\u06ed\0"+
    "\360\22\uffff\0\uffff\0\ufe12\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\2\0\2\1\2\2\1\3\5\0\1\4\26\0\1\5";

  private static int [] zzUnpackAction() {
    int [] result = new int[36];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\23\0\46\0\71\0\46\0\114\0\46\0\137"+
    "\0\162\0\205\0\230\0\253\0\46\0\276\0\321\0\344"+
    "\0\367\0\u010a\0\u011d\0\u0130\0\u0143\0\u0156\0\u0169\0\u017c"+
    "\0\u018f\0\u01a2\0\u01b5\0\u01c8\0\u01db\0\u01ee\0\u0201\0\u0214"+
    "\0\u0227\0\u023a\0\u024d\0\46";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[36];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\3\1\4\21\3\1\5\1\6\1\7\1\5\7\7"+
    "\1\5\7\7\25\0\1\10\33\0\1\11\12\0\1\12"+
    "\40\0\1\13\5\0\1\14\21\0\1\15\24\0\1\16"+
    "\23\0\1\17\23\0\1\20\23\0\1\21\23\0\1\22"+
    "\23\0\1\23\17\0\1\24\14\0\1\25\34\0\1\26"+
    "\11\0\1\27\23\0\1\30\20\0\1\31\34\0\1\32"+
    "\23\0\1\33\23\0\1\34\23\0\1\35\23\0\1\36"+
    "\20\0\1\37\25\0\1\40\5\0\1\41\20\0\1\42"+
    "\42\0\1\43\4\0\1\44\17\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[608];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\2\0\1\11\1\1\1\11\1\1\1\11\5\0\1\11"+
    "\26\0\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[36];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true iff the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true iff the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /* user code: */
    private StringBuilder resumo = new StringBuilder();


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  resumo(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 2828) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public int yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return YYEOF;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { /* Ignora qualquer caracter fora de comentários. */
            } 
            // fall through
          case 6: break;
          case 2: 
            { System.out.print(yytext());
            } 
            // fall through
          case 7: break;
          case 3: 
            { resumo.append(yytext());
            } 
            // fall through
          case 8: break;
          case 4: 
            { yybegin(YYINITIAL); 
        System.out.println("Resumo da patente:\n" + resumo.toString());
            } 
            // fall through
          case 9: break;
          case 5: 
            { yybegin(RESUMO); resumo.setLength(0);
            } 
            // fall through
          case 10: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }

  /**
   * Runs the scanner on input files.
   *
   * This is a standalone scanner, it will print any unmatched
   * text to System.out unchanged.
   *
   * @param argv   the command line, contains the filenames to run
   *               the scanner on.
   */
  public static void main(String argv[]) {
    if (argv.length == 0) {
      System.out.println("Usage : java resumo [ --encoding <name> ] <inputfile(s)>");
    }
    else {
      int firstFilePos = 0;
      String encodingName = "UTF-8";
      if (argv[0].equals("--encoding")) {
        firstFilePos = 2;
        encodingName = argv[1];
        try {
          java.nio.charset.Charset.forName(encodingName); // Side-effect: is encodingName valid? 
        } catch (Exception e) {
          System.out.println("Invalid encoding '" + encodingName + "'");
          return;
        }
      }
      for (int i = firstFilePos; i < argv.length; i++) {
        resumo scanner = null;
        try {
          java.io.FileInputStream stream = new java.io.FileInputStream(argv[i]);
          java.io.Reader reader = new java.io.InputStreamReader(stream, encodingName);
          scanner = new resumo(reader);
          while ( !scanner.zzAtEOF ) scanner.yylex();
        }
        catch (java.io.FileNotFoundException e) {
          System.out.println("File not found : \""+argv[i]+"\"");
        }
        catch (java.io.IOException e) {
          System.out.println("IO error scanning file \""+argv[i]+"\"");
          System.out.println(e);
        }
        catch (Exception e) {
          System.out.println("Unexpected exception:");
          e.printStackTrace();
        }
      }
    }
  }


}
