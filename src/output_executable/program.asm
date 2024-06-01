.section .data
input_format: .string "%ld"
output_format: .string "%ld "

.section .bss
    .lcomm array, 400          

.section .text
.globl _start

_start:
    mov $0, %rax              
    mov $0, %rdi              
    lea array(%rip), %rsi     
    mov $400, %rdx            
    syscall                   

    mov $0, %rcx              
    mov $100, %r8             
.read_loop:
    cmp %rcx, %r8             
    jge .reverse_loop_start   
    lea array(%rip), %rax     
    add %rcx, %rax            
    mov (%rax), %rdi          
    
    mov $1, %rax              
    mov $1, %rdi              
    lea output_format(%rip), %rsi
    mov $2, %rdx              
    syscall
    
    inc %rcx                  
    jmp .read_loop            

.reverse_loop_start:
    mov $0, %rax              
.reverse_loop:
    cmp %rax, %r8
    jge .end_program          
    lea array(%rip), %rbx     
    lea array(%rip), %rcx     
    sub %rax, %r8             
    add %r8, %rcx             
    mov (%rbx), %rdi
    mov (%rcx), %rsi
    mov %rsi, (%rbx)
    mov %rdi, (%rcx)
    inc %rax
    jmp .reverse_loop
    
.end_program:
    mov $60, %rax         
    xor %edi, %edi        
    syscall               