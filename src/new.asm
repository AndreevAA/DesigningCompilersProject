.data
_size:
.space 4
_day2:
.space 4
_a:
.space 4
_day3:
.space 4
_f:
.space 4
_arr:
.space 400
_tmp:
.space 4
_i:
.space 4
_res:
.space 400
_j:
.space 4
_al:
.space 4
_t1:
.space 4
_t2:
.space 4
_t3:
.space 4
_t4:
.space 4
_t5:
.space 4
_t6:
.space 4
_t7:
.space 4
_t8:
.space 4
_t9:
.space 4
_t10:
.space 4
_t11:
.space 4
_t12:
.space 4
_t13:
.space 4
_t14:
.space 4
_t15:
.space 4
_t16:
.space 4
_t17:
.space 4
_t18:
.space 4
_t19:
.space 4
_t20:
.space 4
_t21:
.space 4

linespace:
 .asciiz " \n"


STRING1:
 .asciiz "TEST REVERSE ARRAY"

STRING2:
 .asciiz "Array size and elems: "

STRING3:
 .asciiz ""

STRING4:
 .asciiz "Result array:"

.text
main:
li $t0,0
sw $t0,_size
sw $t0,_day2
sw $t0,_a
sw $t0,_day3
sw $t0,_tmp
sw $t0,_i
sw $t0,_j
sw $t0,_al
sw $t0,_t1
sw $t0,_t2
sw $t0,_t3
sw $t0,_t4
sw $t0,_t5
sw $t0,_t6
sw $t0,_t7
sw $t0,_t8
sw $t0,_t9
sw $t0,_t10
sw $t0,_t11
sw $t0,_t12
sw $t0,_t13
sw $t0,_t14
sw $t0,_t15
sw $t0,_t16
sw $t0,_t17
sw $t0,_t18
sw $t0,_t19
sw $t0,_t20
sw $t0,_t21
_0:
_1:
li $t1,2
sw $t1,_al
_2:
la $a0, STRING1
_3:
li $v0,4
syscall
la $a0, linespace
li $v0,4
syscall
_4:
la $a0, STRING2
_5:
li $v0,4
syscall
la $a0, linespace
li $v0,4
syscall
_6:
li $v0 , 5
syscall
sw $v0, _size
_7:
li $t1,0
sw $t1,_a
_8:
li $t1,0
sw $t1,_t1
_9:
lw $t1, _size
li $t2,1
sub $t0,$t1,$t2 
sw $t0,_t2
_10:
lw $t1, _t2
sw $t1,_t3
_11:
li $v0 , 5
syscall
sw $v0, _tmp
_12:
lw $t1, _a
li $t2,4
mul $t0,$t1,$t2 
sw $t0,_t4
_13:
li $t1,20
lw $t2, _t4
add $t0,$t1,$t2 
sw $t0,_t5
_14:
lw $t1, _tmp
lw $t0, _t5
la $t3, _size
add $t0, $t0, $t3
sw $t1,($t0)
_15:
lw $t1, _a
li $t2,1
add $t0,$t1,$t2 
sw $t0,_a
_16:
lw $t1, _t1
lw $t2, _t3
ble $t1, $t2, _19
_17:
lw $t1, _a
lw $t2, _t2
bge $t1, $t2, _11
_18:
b _20
_19:
lw $t1, _a
lw $t2, _t2
ble $t1, $t2, _11
_20:
lw $t1, _size
li $t2,1
sub $t0,$t1,$t2 
sw $t0,_t6
_21:
lw $t1, _t6
sw $t1,_j
_22:
li $t1,0
sw $t1,_i
_23:
li $t1,0
sw $t1,_t7
_24:
lw $t1, _size
li $t2,1
sub $t0,$t1,$t2 
sw $t0,_t8
_25:
lw $t1, _t8
sw $t1,_t9
_26:
lw $t1, _i
li $t2,4
mul $t0,$t1,$t2 
sw $t0,_t10
_27:
li $t1,20
lw $t2, _t10
add $t0,$t1,$t2 
sw $t0,_t11
_28:
lw $t1, _t11
la $t3, _size
add $t1, $t1, $t3
lw $t1, ($t1)
sw $t1,_t12
_29:
lw $t1, _t12
sw $t1,_tmp
_30:
lw $t1, _j
li $t2,4
mul $t0,$t1,$t2 
sw $t0,_t13
_31:
li $t1,428
lw $t2, _t13
add $t0,$t1,$t2 
sw $t0,_t14
_32:
lw $t1, _tmp
lw $t0, _t14
la $t3, _size
add $t0, $t0, $t3
sw $t1,($t0)
_33:
lw $t1, _j
li $t2,1
sub $t0,$t1,$t2 
sw $t0,_t15
_34:
lw $t1, _t15
sw $t1,_j
_35:
lw $t1, _i
li $t2,1
add $t0,$t1,$t2 
sw $t0,_i
_36:
lw $t1, _t7
lw $t2, _t9
ble $t1, $t2, _39
_37:
lw $t1, _i
lw $t2, _t8
bge $t1, $t2, _26
_38:
b _40
_39:
lw $t1, _i
lw $t2, _t8
ble $t1, $t2, _26
_40:
la $a0, STRING3
_41:
li $v0,4
syscall
la $a0, linespace
li $v0,4
syscall
_42:
la $a0, STRING4
_43:
li $v0,4
syscall
la $a0, linespace
li $v0,4
syscall
_44:
li $t1,0
sw $t1,_i
_45:
li $t1,0
sw $t1,_t16
_46:
lw $t1, _size
li $t2,1
sub $t0,$t1,$t2 
sw $t0,_t17
_47:
lw $t1, _t17
sw $t1,_t18
_48:
lw $t1, _i
li $t2,4
mul $t0,$t1,$t2 
sw $t0,_t19
_49:
li $t1,428
lw $t2, _t19
add $t0,$t1,$t2 
sw $t0,_t20
_50:
lw $t1, _t20
la $t3, _size
add $t1, $t1, $t3
lw $t1, ($t1)
sw $t1,_t21
_51:
lw $t1, _t21
sw $t1,_tmp
_52:
subu $sp, $sp, 4
lw $t1, _tmp
sw $t1, ($sp)
_53:
lw $a0, ($sp)
li $v0, 1
syscall
la $a0, linespace
li $v0,4
syscall
addu $sp, $sp, 4
_54:
lw $t1, _i
li $t2,1
add $t0,$t1,$t2 
sw $t0,_i
_55:
lw $t1, _t16
lw $t2, _t18
ble $t1, $t2, _58
_56:
lw $t1, _i
lw $t2, _t17
bge $t1, $t2, _48
_57:
b _59
_58:
lw $t1, _i
lw $t2, _t17
ble $t1, $t2, _48
jal halt
_59:

halt:

li $v0, 10
syscall

Ln:
la $a0, linespace
li $v0,4
syscall
jr $ra