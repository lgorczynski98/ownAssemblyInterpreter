grammar g;
start: expr '\n';
expr: int0x80 | push operation | mov operation ',' REGISTER | xor operation ',' REGISTER;
int0x80: INT;
push: PUSH;
mov: MOV;
xor: XOR;
operation: term | operation ('+' | '-') term;
//term: factor | term ( '*' | '/' ) factor;     w specyfikacji bez dzielenia
term: factor | term '*' factor;
factor: operand | '(' operation ')';
operand: REGISTER | NUMBER;


INT: ('int 0x80');
PUSH: ('push ');
MOV: ('mov ');
XOR: ('xor ');
NUMBER:[0-9]+;
REGISTER: ('%eax' | '%ebx' | '%ecx' | '%edx');
//CARIDGE: [\r] -> skip;
WS: [ \t\r] -> skip;
IDENTIFIER : .;