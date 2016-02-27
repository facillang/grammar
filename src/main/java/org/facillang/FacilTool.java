package org.facillang;

import org.antlr.v4.Tool;

/**
 * Created by sumanthdommaraju on 2/6/16.
 *
 * This class generates code(lexer, parser, listner..) using grammar file.
 */
public class FacilTool {

    // arg[0] = facil grammarfile, arg[1]= directory to generate code
    // ex:  ..Facil/src/main/antlr4/Facil.g4  Facil/src/main/java/
    public static void main(String[] args) {
        String fileSeparator = System.getProperty("file.separator");
        String[] argumentsForTool = { args[0], "-package", "org.facillang", "-o",
                                      String.format("%s%sorg%sfacillang", args[1], fileSeparator, fileSeparator)};
        Tool.main(argumentsForTool);
    }
}
