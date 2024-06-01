section .bss
    arr resb 256
    size resb 4

section .text
    global _start

_start:
    mov eax, 3
    mov ebx, 0
    mov ecx, size
    mov edx, 4
    int 0x80

    mov eax, 3
    mov ebx, 0
    mov ecx, arr
    mov edx, 256
    int 0x80

    mov eax, [size]
    mov ecx, 0
    mov ebx, eax
    dec ebx

reverse_loop:
    cmp ecx, ebx
    jge reverse_done
    mov dl, [arr + ecx]
    mov dh, [arr + ebx]
    mov [arr + ecx], dh
    mov [arr + ebx], dl
    inc ecx
    dec ebx
    jmp reverse_loop

reverse_done:
    mov eax, 4
    mov ebx, 1
    mov ecx, arr
    mov edx, 256
    int 0x80

    mov eax, 1
    xor ebx, ebx
    int 0x80