Agora, a segunda questão: 

![1706739697352](image/AreaDoQuadrado/1706739697352.png)

A segunda questão segue a mesma lógica, só que nesse caso temos um diferencial: Ao invés de um nextDouble(), temos um nextInt(), ou seja, dessa vez ele irá receber o "próximo inteiro" escrito! Outro diferencial é ali, no area = area * 2. ![1706738810045](https://file+.vscode-resource.vscode-cdn.net/c%3A/Users/darll/OneDrive/%C3%81rea%20de%20Trabalho/projetos/FRONT-END/cafeteria%20Avivar/Lista-01/image/AreaDoQuadrado/1706738810045.png)

Nesse caso, estamos atualizando o valor para o valor * 2, como é uma leitura da esquerda para a direita, o valor consegue ser atualizado sem criar confusões ou loopings (Imagina se ele fica se atualizando o tempo todo sobre ser o mesmo valor * 2? Seria desastroso para o desempenho do meu i3.)

No final, System.out.print novamente para exibir a questão de valores.
