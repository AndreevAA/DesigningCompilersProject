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
_j:
.space 4
_second:
.space 4
_first:
.space 4
_al:
.space 4
_kpermut:
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
_t22:
.space 4
_t23:
.space 4
_t24:
.space 4
_t25:
.space 4
_t26:
.space 4
_t27:
.space 4
_t28:
.space 4
_t29:
.space 4
_t30:
.space 4
_t31:
.space 4
_t32:
.space 4
_t33:
.space 4
_t34:
.space 4
_t35:
.space 4

linespace:
 .asciiz " \n"


STRING1:
 .asciiz "TEST BUBBLE SORT"

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
sw $t0,_second
sw $t0,_first
sw $t0,_al
sw $t0,_kpermut
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
sw $t0,_t22
sw $t0,_t24
sw $t0,_t25
sw $t0,_t26
sw $t0,_t27
sw $t0,_t28
sw $t0,_t29
sw $t0,_t30
sw $t0,_t31
sw $t0,_t32
sw $t0,_t33
sw $t0,_t34
sw $t0,_t35
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
li $t1,99
sw $t1,_t2
_10:
lw $t1, _t2
sw $t1,_t3
_11:
lw $t1, _a
li $t2,4
mul $t0,$t1,$t2 
sw $t0,_t4
_12:
li $t1,20
lw $t2, _t4
add $t0,$t1,$t2 
sw $t0,_t5
_13:
li $t1,999999
lw $t0, _t5
la $t3, _size
add $t0, $t0, $t3
sw $t1,($t0)
_14:
lw $t1, _a
li $t2,1
add $t0,$t1,$t2 
sw $t0,_a
_15:
lw $t1, _t1
lw $t2, _t3
ble $t1, $t2, _18
_16:
lw $t1, _a
lw $t2, _t2
bge $t1, $t2, _11
_17:
b _19
_18:
lw $t1, _a
lw $t2, _t2
ble $t1, $t2, _11
_19:
li $t1,0
sw $t1,_a
_20:
li $t1,0
sw $t1,_t6
_21:
lw $t1, _size
li $t2,1
sub $t0,$t1,$t2 
sw $t0,_t7
_22:
lw $t1, _t7
sw $t1,_t8
_23:
li $v0 , 5
syscall
sw $v0, _tmp
_24:
lw $t1, _a
li $t2,4
mul $t0,$t1,$t2 
sw $t0,_t9
_25:
li $t1,20
lw $t2, _t9
add $t0,$t1,$t2 
sw $t0,_t10
_26:
lw $t1, _tmp
lw $t0, _t10
la $t3, _size
add $t0, $t0, $t3
sw $t1,($t0)
_27:
lw $t1, _a
li $t2,1
add $t0,$t1,$t2 
sw $t0,_a
_28:
lw $t1, _t6
lw $t2, _t8
ble $t1, $t2, _31
_29:
lw $t1, _a
lw $t2, _t7
bge $t1, $t2, _23
_30:
b _32
_31:
lw $t1, _a
lw $t2, _t7
ble $t1, $t2, _23
_32:
li $t1,100
sw $t1,_kpermut
_33:
lw $t1, _kpermut
li $t2,0
bgt $t1, $t2, _35
_34:
b _69
_35:
lw $t1, _size
li $t2,1
sub $t0,$t1,$t2 
sw $t0,_t12
_36:
lw $t1, _t12
sw $t1,_j
_37:
li $t1,0
sw $t1,_kpermut
_38:
li $t1,1
sw $t1,_i
_39:
li $t1,1
sw $t1,_t13
_40:
lw $t1, _size
li $t2,1
sub $t0,$t1,$t2 
sw $t0,_t14
_41:
lw $t1, _t14
sw $t1,_t15
_42:
lw $t1, _i
li $t2,1
sub $t0,$t1,$t2 
sw $t0,_t16
_43:
lw $t1, _t16
li $t2,4
mul $t0,$t1,$t2 
sw $t0,_t17
_44:
li $t1,20
lw $t2, _t17
add $t0,$t1,$t2 
sw $t0,_t18
_45:
lw $t1, _t18
la $t3, _size
add $t1, $t1, $t3
lw $t1, ($t1)
sw $t1,_t19
_46:
lw $t1, _t19
sw $t1,_first
_47:
lw $t1, _i
li $t2,4
mul $t0,$t1,$t2 
sw $t0,_t20
_48:
li $t1,20
lw $t2, _t20
add $t0,$t1,$t2 
sw $t0,_t21
_49:
lw $t1, _t21
la $t3, _size
add $t1, $t1, $t3
lw $t1, ($t1)
sw $t1,_t22
_50:
lw $t1, _t22
sw $t1,_second
_51:
lw $t1, _first
lw $t2, _second
bgt $t1, $t2, _53
_52:
b _63
_53:
lw $t1, _i
li $t2,1
sub $t0,$t1,$t2 
sw $t0,_t24
_54:
lw $t1, _t24
li $t2,4
mul $t0,$t1,$t2 
sw $t0,_t25
_55:
li $t1,20
lw $t2, _t25
add $t0,$t1,$t2 
sw $t0,_t26
_56:
lw $t1, _second
lw $t0, _t26
la $t3, _size
add $t0, $t0, $t3
sw $t1,($t0)
_57:
lw $t1, _i
li $t2,4
mul $t0,$t1,$t2 
sw $t0,_t27
_58:
li $t1,20
lw $t2, _t27
add $t0,$t1,$t2 
sw $t0,_t28
_59:
lw $t1, _first
lw $t0, _t28
la $t3, _size
add $t0, $t0, $t3
sw $t1,($t0)
_60:
lw $t1, _kpermut
li $t2,1
add $t0,$t1,$t2 
sw $t0,_t29
_61:
lw $t1, _t29
sw $t1,_kpermut
_62:
b _63
_63:
lw $t1, _i
li $t2,1
add $t0,$t1,$t2 
sw $t0,_i
_64:
lw $t1, _t13
lw $t2, _t15
ble $t1, $t2, _67
_65:
lw $t1, _i
lw $t2, _t14
bge $t1, $t2, _42
_66:
b _68
_67:
lw $t1, _i
lw $t2, _t14
ble $t1, $t2, _42
_68:
b _33
_69:
la $a0, STRING3
_70:
li $v0,4
syscall
la $a0, linespace
li $v0,4
syscall
_71:
la $a0, STRING4
_72:
li $v0,4
syscall
la $a0, linespace
li $v0,4
syscall
_73:
li $t1,0
sw $t1,_i
_74:
li $t1,0
sw $t1,_t30
_75:
lw $t1, _size
li $t2,1
sub $t0,$t1,$t2 
sw $t0,_t31
_76:
lw $t1, _t31
sw $t1,_t32
_77:
lw $t1, _i
li $t2,4
mul $t0,$t1,$t2 
sw $t0,_t33
_78:
li $t1,20
lw $t2, _t33
add $t0,$t1,$t2 
sw $t0,_t34
_79:
lw $t1, _t34
la $t3, _size
add $t1, $t1, $t3
lw $t1, ($t1)
sw $t1,_t35
_80:
lw $t1, _t35
sw $t1,_tmp
_81:
subu $sp, $sp, 4
lw $t1, _tmp
sw $t1, ($sp)
_82:
lw $a0, ($sp)
li $v0, 1
syscall
la $a0, linespace
li $v0,4
syscall
addu $sp, $sp, 4
_83:
lw $t1, _i
li $t2,1
add $t0,$t1,$t2 
sw $t0,_i
_84:
lw $t1, _t30
lw $t2, _t32
ble $t1, $t2, _87
_85:
lw $t1, _i
lw $t2, _t31
bge $t1, $t2, _77
_86:
b _88
_87:
lw $t1, _i
lw $t2, _t31
ble $t1, $t2, _77
jal halt
_88:

halt:

li $v0, 10
syscall

Ln:
la $a0, linespace
li $v0,4
syscall
jr $ra