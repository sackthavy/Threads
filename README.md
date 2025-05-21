# 🧵 Simulação de Corrida com Threads em Java

Este projeto simula uma corrida de Fórmula 1 utilizando **multithreading** em Java. Cada piloto é representado por uma thread que imprime seu nome a cada segundo durante um determinado número de voltas.

## 🚗 Como funciona

- A classe `Principal` instancia e inicia diversas threads usando a classe `MinhaThread`.
- Cada thread representa um piloto e executa o método `run()`, que imprime o nome do piloto 30 vezes com intervalo de 1 segundo.
- É usada a função `Thread.sleep(1000)` para simular o tempo entre as voltas.
- O estado da thread é exibido no console antes e após sua execução, permitindo visualizar o ciclo de vida da thread.

---

## 📂 Estrutura do Projeto

src/  
├── Principal.java  
├── MinhaThread.java  
└── (Opcional) Piloto.java

---

## 🧠 Conceitos abordados

-   Programação concorrente
    
-   Criação e controle de threads
    
-   Métodos `run()` e `start()`
    
-   Estados de uma thread (`NEW`, `RUNNABLE`, etc.)
    
-   Uso de `Thread.sleep()`
    
-   Orientação a Objetos
## 🏷️ Tags

`#Java` `#Threads` `#Multithreading` `#Simulação` `#POO` `#Fórmula1` `#Concurrency` `#ProjetosAcademicos` `#JavaProject` `#DevEstudante`

`DevEstudante`

----------

## 📌 Observações

Este projeto foi desenvolvido com fins didáticos para praticar conceitos de programação concorrente em Java. Sinta-se à vontade para contribuir ou adaptar o código!

## 📄 Licença

Este projeto está sob a licença MIT. Consulte o arquivo LICENSE para mais detalhes.

---

Se quiser, posso personalizar com seu nome de usuário no GitHub, links reais e imagem da simulação (por exemplo, um print do console). É só me avisar!
