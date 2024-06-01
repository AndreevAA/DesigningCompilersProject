.section .data
input_format: .string "%d"
output_format: .string "%d "

.section .bss
.space 400          

.section .text
.globl _start

read_int:
    mov $0, %rax        
    mov $0, %rdi        
    lea 8(%rsp), %rsi    
    mov $4, %rdx        
    syscall
    mov $0, %rax        
    lea 8(%rsp), %rsi    
    lea 16(%rsp), %rdi    
    call atoi
    mov 16(%rsp), %rax    
    ret

write_int:
    lea 12(%rsp), %rsi 
    lea output_format(%rip), %rdi 
    mov $0, %rax
    call printf
    ret

_start:
    call read_int
    mov %rax, %rcx    

    mov %rsp, %rbx
    sub $400, %rsp    

input_loop:
    cmp %rax, %rcx
    je reverse_array    
    call read_int
    mov %rax, (%rsp,%rax,4) 
    inc %rax
    jmp input_loop

reverse_array:
    xor %rax, %rax 
    lea -4(%rsp,%rcx,4), %rbx 
reverse_loop:
    cmp %rax, %rbx
    jge print_array 
    mov (%rsp,%rax,4), %rdx 
    mov (%rbx), %rdi
    mov %rdi, (%rsp,%rax,4)
    mov %rdx, (%rbx)
    add $4, %rax
    sub $4, %rbx
    jmp reverse_loop

print_array:
    xor %rax, %rax  
    mov %rcx, %rdi 

output_loop:
    cmp %rax, %rdi
    je end_program  
    mov (%rbx,%rax,4), %rsi 
    call write_int
    inc %rax
    jmp output_loop

end_program:
    mov $60, %rax  
    xor %edi, %edi
    syscall