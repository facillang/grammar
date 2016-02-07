package org.facillang;

import org.antlr.v4.gui.TestRig;
/**
 * Created by sumanthdommaraju on 2/4/16.
 */

/**
 * This class will be useful to test grammar. (look for example arguments to use).
 */
public class FacilTestRig extends TestRig{

    public FacilTestRig(String[] args, String inputFile) throws Exception {
        super(args);
        this.inputFiles.add(inputFile);
    }

    //mode fileName
    //ex:-gui src/main/antlr4/Employee.facil
    public static void main(String[] args) throws Exception {
        validateArgs(args);
        String[] argsForTestRig = new String[]{"org.facillang.Facil", "facilCompilation", args[0]};
        FacilTestRig facilTestRig = new FacilTestRig(argsForTestRig, args[1]);
        facilTestRig.process();
    }

    private static void validateArgs(String[] args) {
        if(args == null || args.length != 2 ||
                (!args[0].equals("-tree") && !args[0].equals("-gui") )){
            throw new RuntimeException("Invalid arguments. Usage: java org.facillang.FacilTestRig mode fileName");
        }
        if(!args[1].contains(".facil")){
            throw new RuntimeException("Invalid file extension");
        }
    }
}
