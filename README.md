# 👨‍💻 Projeto SmartTv

## 🔎 Visão Geral

Este projeto é uma simulação simples de uma Smart TV, criada para praticar a sintaxe Java aprendida no curso "Aprendendo a Sintaxe Java" oferecido pelo Bootcamp "Coding Future Gft: Desenvolvimento Java com IA" da DIO. 

O projeto consiste em dois arquivos principais:

1. `SmartTv.java`: Define a classe `SmartTv` com métodos para controlar o estado da TV, volume e canal.
2. `Usuario.java`: Contém o método `main` para demonstrar o uso da classe `SmartTv`.

## 💻 Tecnologia utilizada no projeto:
<div>
   <img alt="Java" src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white">
</div>

## 🗂 Arquivos

### SmartTv.java

Este arquivo contém a classe `SmartTv` com os seguintes atributos e métodos:

- **Atributos:**
  - `boolean ligada`: Indica se a TV está ligada ou desligada. O padrão é `false`.
  - `int canal`: O canal atual da TV. O padrão é `1`.
  - `int volume`: O volume atual da TV. O padrão é `25`.

- **Métodos:**
  - `ligar()`: Liga a TV.
  - `desligar()`: Desliga a TV.
  - `aumentarVolume()`: Aumenta o volume da TV em 1 unidade, com verificação de máximo.
  - `diminuirVolume()`: Diminui o volume da TV em 1 unidade, com verificação de mínimo.
  - `mudarCanal(int novoCanal)`: Muda o canal da TV para o canal especificado.
  - `aumentarCanal()`: Aumenta o número do canal em 1.
  - `diminuirCanal()`: Diminui o número do canal em 1.

### Usuario.java

Este arquivo contém a classe `Usuario` com o método `main`. Ele demonstra o seguinte:

- Criação de uma instância de `SmartTv`.
- Verificação e exibição do estado inicial da TV (ligada, canal, volume).
- Ligar e desligar a TV.
- Mudar o canal e ajustar o volume.

## 💻 Uso

Para executar este projeto, você precisa ter o Java instalado na sua máquina. Siga estes passos para compilar e executar o programa:

1. **Compile as classes:**
   ```sh
   javac SmartTv.java Usuario.java
   ```

2. **Execute a classe `Usuario`:**
   ```sh
   java Usuario
   ```

## ☕ Versão do Java

Este projeto utiliza a versão 22 do Java.

## 🛠 Objetivo

O objetivo principal deste projeto é praticar a sintaxe Java e entender os conceitos básicos de programação orientada a objetos. Ele fornece experiência prática com a definição de classes, criação de objetos e implementação de métodos para manipular estados de objetos.

## 📖 Informações do Curso

Este projeto faz parte do curso "Aprendendo a Sintaxe Java" oferecido pelo Bootcamp "Coding Future Gft: Desenvolvimento Java com IA" da DIO

## 👨‍💻 Expert

<p>
    <img 
      align=left 
      margin=10 
      width=80 
      src="https://avatars.githubusercontent.com/u/44624583?v=4"
    />
    <p>&nbsp&nbsp&nbspMarcos Winther<br>
    &nbsp&nbsp&nbsp
    <a href="https://github.com/MarcosWinther">
    GitHub</a>&nbsp;|&nbsp;
    <a href="https://www.linkedin.com/in/marcoswinthersilva/">LinkedIn</a>
    </p>
</p>
<br/><br/>

---

⌨️ com 💜 por [Marcos Winther](https://github.com/MarcosWinther)