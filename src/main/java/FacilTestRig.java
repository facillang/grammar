import org.antlr.v4.gui.TestRig;

/**
 * Created by sumanthdommaraju on 2/4/16.
 */
public class FacilTestRig extends TestRig{

    public FacilTestRig(String[] args, String inputFile) throws Exception {
        super(args);
        this.inputFiles.add(inputFile);
    }

    //grammarName startRuleName mode fileName
    //ex:Facil facilCompilation -gui /Users/sumanthdommaraju/Facil/src/main/antlr4/Employee.facil
    public static void main(String[] args) throws Exception {
        validateArgs(args);
        String[] argsForTestRig = new String[]{args[0], args[1], args[2]};
        FacilTestRig facilTestRig = new FacilTestRig(argsForTestRig, args[3]);
        facilTestRig.process();
    }

    private static void validateArgs(String[] args) {
        if(args == null || args.length != 4 ||
                (!args[2].equals("-tree") && !args[2].equals("-gui") )){
            throw new RuntimeException("Invalid arguments. Usage: java FacilTestRig grammarName startRuleName mode fileName");
        }
        if(!args[3].contains(".facil")){
            throw new RuntimeException("Invalid file extension");
        }
    }
}
