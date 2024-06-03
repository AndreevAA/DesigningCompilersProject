.data
_day2:
.space 4
_a:
.space 4
_day3:
.space 4
_j:
.space 4
_al:
.space 4
_t1:
.space 4
_t2:
.space 4

linespace:
 .asciiz " \n"


.text
main:
li $t0,0
sw $t0,_day2
sw $t0,_a
sw $t0,_day3
sw $t0,_al
sw $t0,_t1
sw $t0,_t2
_0:
_1:
li $t1,2
sw $t1,_al
_2:
li $t1,5
sw $t1,_day2
_3:
lw $t1, _day2
li $t2,1
add $t0,$t1,$t2 
sw $t0,_day2
_4:
subu $sp, $sp, 4
lw $t1, _day2
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
lw $t1, _day2
li $t2,1
sub $t0,$t1,$t2 
sw $t0,_day2
_7:
subu $sp, $sp, 4
lw $t1, _day2
sw $t1, ($sp)
_8:
lw $a0, ($sp)
li $v0, 1
syscall
la $a0, linespace
li $v0,4
syscall
addu $sp, $sp, 4
_9:
lw $t1, _day2
li $t2,5
add $t0,$t1,$t2 
sw $t0,_day2
_10:
subu $sp, $sp, 4
lw $t1, _day2
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
lw $t1, _day2
li $t2,-3
sub $t0,$t1,$t2 
sw $t0,_day2
_13:
subu $sp, $sp, 4
lw $t1, _day2
sw $t1, ($sp)
_14:
lw $a0, ($sp)
li $v0, 1
syscall
la $a0, linespace
li $v0,4
syscall
addu $sp, $sp, 4
_15:
li $t1,-96
mtc1 $t1, $f0 
cvt.s.w $f0, $f0
s.s $f0,_t1
_16:
l.s $f1, _day3
l.s $f2, _t1
add.s $f0,$f1,$f2 
s.s $f0,_day3
_17:
l.s $f1, _day3
li.s $f2,0.0
c.lt.s $f1, $f2 
bc1t _20
_18:
l.s $f1, _day3
s.s $f1,_t2
_19:
b _21
_20:
l.s $f1, _day3
neg.s $f0, $f1
s.s $f0,_t2
_21:
subu $sp, $sp, 4
lw $t1, _t2
sw $t1, ($sp)
_22:
l.s $f12, ($sp)
li $v0, 2
syscall
la $a0, linespace
li $v0,4
syscall
addu $sp, $sp, 4
jal halt
_23:

halt:

li $v0, 10
syscall

Ln:
la $a0, linespace
li $v0,4
syscall
jr $ra