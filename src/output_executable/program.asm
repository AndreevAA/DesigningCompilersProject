section .bss
value1 resq 1
value2 resq 1
array  resq 10

section .data
message db "Enter number: ", 0
format db "%d", 0
output db "Result: %d", 10, 0

section .text
global _start
extern _printf, _scanf, _exit

_start:
    push rbp
    mov rbp, rsp
    sub rsp, 56

    lea rdi, [message]
    xor rax, rax
    call _printf

    lea rdi, [format]
    lea rsi, [value1]
    xor rax, rax          
    call _scanf

    mov rax, [value1]

    lea rsi, [array]
    mov [rsi], rax

    mov rbx, [rsi]
    add rbx, 1
    mov [rsi], rbx

_loop:
    lea rdi, [format]
    lea rsi, [value1]
    xor rax, rax          
    call _scanf

    mov rax, [value1]
    imul rax, rax, 4
    add rbx, rax
    mov [rsi], rbx

    mov rax, [rsi]
    cmp rax, 10
    jl _loop

_end_loop:
    lea rsi, [array]
_print_loop:
    mov rax, [rsi]
    test rax, rax
    je _end_print_loop

    lea rdi, [output]
    mov rsi, rax
    xor rax, rax         
    call _printf

    add rsi, 8
    jmp _print_loop

_end_print_loop:
    mov rsp, rbp
    pop rbp
    mov rdi, 0
    call _exit