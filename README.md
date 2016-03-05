# Facil Lang's Grammar / Parser

This project defines Facil's grammar.


Compilation
-----------

Dash uses [ply](http://github.com/blangel/ply) as its build tool, ensure you have it installed.


Invocation
----------

To invoke the grammar parser, run the `org.facillang.FacilTestRig` passing in two parameters:

- The first is the `mode` which is either `-tree` or `-gui`
- The second is a file path to a `.facil` file to parse

Example invocations using `ply`

    $ ply grammar -gui src/test/antlr4/Company.facil

-alternatively-

    $ java -cp `ply classpath` org.facillang.FacilTestRig -gui src/test/antlr4/Company.facil



