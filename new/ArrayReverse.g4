// ArrayReverse.g4
grammar ArrayReverse;

array    : '[' elements ']' ; 
elements : element (',' element)* ; 
element  : INT ; 
INT      : [0-9]+ ; 

WS       : [ \t\r\n]+ -> skip ; 