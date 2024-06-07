.data
_day2:
.space 4
_a:
.space 4
_day3:
.space 4
_j:
.space 4
_b:
.space 4
_c:
.space 4
_t2:
.space 4

linespace:
 .asciiz " \n"


STRING1:
 .asciiz "In the function: Old value of a"

STRING2:
 .asciiz "In the function: New value of a"

STRING3:
 .asciiz "old value of day2"

STRING4:
 .asciiz "new value of day2"

STRING5:
 .asciiz "old value of day3"

STRING6:
 .asciiz "new value of day3"

STRING7:
 .asciiz "Before func call a is: "

STRING8:
 .asciiz "After func call a is :"

.text
_0:
_1:
add1:
subu $sp, $sp, 32
move $s0, $sp
sw $ra, 28($sp)
sw $fp, 24($sp)
addu $fp, $sp, 32
_2:
la $a0, STRING1
_3:
li $v0,4
syscall
la $a0, linespace
li $v0,4
syscall
_4:
subu $sp, $sp, 4
lw $t1, 36 ($s0) 
sw $t1, ($sp)
_5:
lw $a0, ($sp)
li $v0, 1
syscall
la $a0, linespace
li $v0,4
syscall
addu $sp, $sp, 4
_6:
lw $t1, 36 ($s0) 
li $t2,1
add $t0,$t1,$t2 
sw $t0, 20 ($s0) 
_7:
lw $t1, 20 ($s0) 
sw $t1, 36 ($s0) 
_8:
la $a0, STRING2
_9:
li $v0,4
syscall
la $a0, linespace
li $v0,4
syscall
_10:
subu $sp, $sp, 4
lw $t1, 36 ($s0) 
sw $t1, ($sp)
_11:
lw $a0, ($sp)
li $v0, 1
syscall
la $a0, linespace
li $v0,4
syscall
addu $sp, $sp, 4
_12:
lw $v0, 36 ($s0) 
lw $ra, 28($sp)
lw $fp, 24($sp)
addu $sp, $sp, 32
lw $s0, ($sp)
addu $sp, $sp, 4
addu $sp, $sp, 4
jr $ra
_13:
lw $ra, 28($sp)
lw $fp, 24($sp)
addu $sp, $sp, 32
lw $s0, ($sp)
addu $sp, $sp, 4
addu $sp, $sp, 4
jr $ra
main:
li $t0,0
sw $t0,_day2
sw $t0,_a
sw $t0,_day3
sw $t0,_b
sw $t0,_c
sw $t0,_t2
_14:
_15:
li $t1,5
sw $t1,_b
_16:
li $t1,1
sw $t1,_c
_17:
la $a0, STRING3
_18:
li $v0,4
syscall
la $a0, linespace
li $v0,4
syscall
_19:
subu $sp, $sp, 4
lw $t1, _day2
sw $t1, ($sp)
_20:
lw $a0, ($sp)
li $v0, 1
syscall
la $a0, linespace
li $v0,4
syscall
addu $sp, $sp, 4
_21:
li $t1,3
sw $t1,_day2
_22:
la $a0, STRING4
_23:
li $v0,4
syscall
la $a0, linespace
li $v0,4
syscall
_24:
subu $sp, $sp, 4
lw $t1, _day2
sw $t1, ($sp)
_25:
lw $a0, ($sp)
li $v0, 1
syscall
la $a0, linespace
li $v0,4
syscall
addu $sp, $sp, 4
_26:
la $a0, STRING5
_27:
li $v0,4
syscall
la $a0, linespace
li $v0,4
syscall
_28:
subu $sp, $sp, 4
lw $t1, _day3
sw $t1, ($sp)
_29:
l.s $f12, ($sp)
li $v0, 2
syscall
la $a0, linespace
li $v0,4
syscall
addu $sp, $sp, 4
_30:
lw $t1, _day2
mtc1 $t1, $f0 
cvt.s.w $f0, $f0
s.s $f0,_t2
_31:
l.s $f1, _t2
s.s $f1,_day3
_32:
la $a0, STRING6
_33:
li $v0,4
syscall
la $a0, linespace
li $v0,4
syscall
_34:
subu $sp, $sp, 4
lw $t1, _day3
sw $t1, ($sp)
_35:
l.s $f12, ($sp)
li $v0, 2
syscall
la $a0, linespace
li $v0,4
syscall
addu $sp, $sp, 4
_36:
li $t1,2
sw $t1,_a
_37:
la $a0, STRING7
_38:
li $v0,4
syscall
la $a0, linespace
li $v0,4
syscall
_39:
subu $sp, $sp, 4
lw $t1, _a
sw $t1, ($sp)
_40:
lw $a0, ($sp)
li $v0, 1
syscall
la $a0, linespace
li $v0,4
syscall
addu $sp, $sp, 4
_41:
subu $sp, $sp, 4
lw $t1, _a
sw $t1, ($sp)
_42:
subu $sp, $sp, 4
sw $s0, ($sp)
jal add1
_43:
la $a0, STRING8
_44:
li $v0,4
syscall
la $a0, linespace
li $v0,4
syscall
_45:
subu $sp, $sp, 4
lw $t1, _a
sw $t1, ($sp)
_46:
lw $a0, ($sp)
li $v0, 1
syscall
la $a0, linespace
li $v0,4
syscall
addu $sp, $sp, 4
jal halt
_47:

halt:

li $v0, 10
syscall

Ln:
la $a0, linespace
li $v0,4
syscall
jr $ra