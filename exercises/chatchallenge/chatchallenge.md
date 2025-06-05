Desafio 1: Balanced Sums
🧩 Enunciado:
Dado um array de inteiros, determine se existe um índice tal que a soma dos elementos à esquerda dele seja igual à soma dos elementos à direita.

O elemento no índice atual não é incluído em nenhuma das somas.  
Se houver pelo menos um índice que satisfaça a condição, retorne "YES". Caso contrário, retorne "NO".  
🧪 Exemplos:  
Entrada 1:

```
arr = [1, 2, 3, 3]
```
Saída:  
```
YES
```
Explicação:  
Índice 2: soma à esquerda = 1+2 = 3, soma à direita = 3.

Entrada 2:  
```
arr = [1, 2, 3]
```
Saída:
```
NO
```
✅ Restrições:  
1 <= arr.length <= 10^5  
-10^4 <= arr[i] <= 10^4  

💡 Dica de desempenho:  
Uma abordagem que percorre o array mais de uma vez pode ser lenta. Pense em como calcular a soma da esquerda e da direita de forma eficiente em um único for.

---
