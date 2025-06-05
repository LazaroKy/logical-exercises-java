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


🧵 Desafio 2: Anagram Pairs  
🧩 Enunciado:  
Dada uma lista de strings, conte quantos pares de anagramas podem ser formados.  
Duas strings são anagramas se contêm exatamente as mesmas letras, na mesma quantidade, mas em ordem diferente.  

🧪 Exemplos:  
Entrada:  

```
["abc", "bca", "xyz", "zyx", "foo"]
```
Saída esperada:  
```
2
```

Explicação:    
Pares de anagramas: ("abc", "bca") e ("xyz", "zyx")  
"foo" não tem par anagrama  

✅ Restrições:  
1 <= strings.length <= 10^5
Cada string tem no máximo 100 caracteres
Apenas letras minúsculas (a-z)    

💡 Dicas de lógica (sem código):  
Como saber se duas strings são anagramas rapidamente?  
Como evitar verificar cada par um a um (que daria tempo O(n²))?  
Existe uma característica única de cada grupo de anagramas que pode ser usada como chave?  


---