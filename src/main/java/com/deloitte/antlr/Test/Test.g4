grammar Test;

prog
    :   (type  NEWLINE)* EOF
    |   (main NEWLINE)* EOF
    ;

type: 'TestType:' NUMBERS;
main: (ALPHANUMERIC | '_'*)'()';


// Define Tokens
UPPERCASE: [A-Z];
LOWERCASE: [a-z];
NUMBERS: [0-9];
NEWLINE: [\r\n]+ ;

ALPHANUMERIC: (LOWERCASE | UPPERCASE | NUMBERS)+;

WS : [ \t]+ -> skip ;
