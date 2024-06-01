.section .data
input_format: .string "%d"
output_format: .string "%d\n"

.section .bss
n:  .space 4
a:  .space 40
b:  .space 40  

.section .text
.global _start

_start:
    mov $0, %rax
    lea n(%rip), %rdi
    lea input_format(%rip), %rsi
    call scanf

    xor %ebx, %ebx        

read_loop:
    cmp %ebx, n(%rip)
    jge reverse_array
    lea a(,%ebx,4), %rdi
    lea input_format(%rip), %rsi
    call scanf
    inc %ebx
    jmp read_loop

reverse_array:
    xor %ebx, %ebx        

reverse_loop:
    cmp %ebx, n(%rip)
    jge output_array
    mov a(,%ebx,4), %eax
    mov n(%rip), %edx
    sub %ebx, %edx
    dec %edx
    mov %eax, b(,%edx,4)
    inc %ebx
    jmp reverse_loop

output_array:
    xor %ebx, %ebx        

output_loop:
    cmp %ebx, n(%rip)
    jge end_program
    mov b(,%ebx,4), %esi
    lea output_format(%rip), %rdi
    mov $0, %rax
    call printf
    inc %ebx
    jmp output_loop

end_program:
    mov $60, %rax  
    xor %edi, %edi        
    syscall