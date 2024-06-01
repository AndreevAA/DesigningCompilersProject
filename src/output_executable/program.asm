.section .data
input_format: .string "%d"
output_format: .string "%d "

.section .bss
n:  .space 4
a:  .space 40
b:  .space 40  

.section .text
.global _start

_start:
    mov rdi, n       
    lea rsi, [input_format]
    call scanf

    xor ebx, ebx        

read_loop:
    cmp ebx, dword ptr [n]
    jge reverse_array  
    lea rdi, [a + ebx * 4]
    lea rsi, [input_format]
    call scanf
    inc ebx
    jmp read_loop

reverse_array:
    xor ebx, ebx        

reverse_loop:
    cmp ebx, dword ptr [n]
    jge output_array  
    mov eax, dword ptr [a + ebx * 4]
    mov edx, dword ptr [n]
    sub edx, ebx
    dec edx
    mov dword ptr [b + edx * 4], eax
    inc ebx
    jmp reverse_loop

output_array:
    xor ebx, ebx        

output_loop:
    cmp ebx, dword ptr [n]
    jge end_program   
    mov eax, dword ptr [b + ebx * 4]
    mov rsi, eax
    lea rdi, [output_format]
    call printf
    inc ebx
    jmp output_loop

end_program:
    mov eax, 0x2000001  
    xor edi, edi        
    syscall

.extern printf
.extern scanf