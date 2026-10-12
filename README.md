# AtividadeOhata1

1. Descrição do projeto
O Projeto Calculadora é uma aplicação em Java desenvolvida para realizar operações matemáticas básicas de forma segura e estruturada. O sistema recebe dois números inteiros e um operador matemático, processando a solicitação e retornando o resultado. O código foi desenhado para não interromper a execução abruptamente (evitando crashes), retornando mensagens de erro amigáveis caso o usuário tente realizar uma operação inválida ou uma divisão por zero. A estrutura do código passou por um processo de refatoração para garantir maior legibilidade, coesão e facilidade de manutenção.

2. Objetivo da atividade
O objetivo desta atividade foi aplicar conceitos fundamentais de Programação Orientada a Objetos e boas práticas de desenvolvimento de software. As metas incluíram:

Criação de um projeto e pacote estruturado em Java.

Implementação de regras de negócio para operações matemáticas (soma, subtração, multiplicação e divisão) com tratamento de erros.

Criação de testes para validar cenários de sucesso e falha (como a divisão por zero).

Refatoração de código (extração de métodos e simplificação estrutural).

Versionamento de código utilizando Git, com a criação de uma branch específica (Refatoracao).

Produção de documentação técnica utilizando o padrão JavaDoc.

3. Tecnologias utilizadas
Linguagem: Java

Ambiente de Desenvolvimento (IDE): Apache NetBeans

Versionamento de Código: Git

Hospedagem do Repositório: GitHub

4. Explicação das operações
A lógica principal do sistema está centralizada no método calc(int a, int b, String op).
Para manter o código organizado (aplicando a técnica de extração de métodos na refatoração), o método calc atua apenas como um "gerenciador". Ele utiliza uma estrutura switch que avalia o operador digitado (+, -, *, /) e chama métodos privados específicos para cada operação:

somar(a, b): Retorna a soma dos dois valores.

subtrair(a, b): Retorna a diferença entre os dois valores.

multiplicar(a, b): Retorna o produto dos dois valores.

dividir(a, b): Possui uma regra de negócio específica. Antes de realizar a conta, ele verifica se o divisor (b) é igual a zero. Se for, retorna a mensagem "Erro: Não é possível dividir por zero". Caso contrário, converte o resultado para double para exibir casas decimais precisas e realiza a divisão.
Se um operador que não existe for passado (como %), o switch cai na condição default e retorna "Erro: Operação inválida".

5. Prints da execução dos testes
(Para tirar esse print: Vá na classe TesteCalculadora.java no seu NetBeans, clique com o botão direito e vá em "Run File" ou "Executar Arquivo". O painel "Output/Saída" na parte de baixo do NetBeans vai exibir os resultados. Tire um print dessa tela preta/branca mostrando os testes com status [OK!]).

--- INICIANDO TESTES ---

Conta    : 15 + 5
Esperado : 20
Obtido   : 20
Status   : [OK!]

Conta    : 10 - 7
Esperado : 3
Obtido   : 3
Status   : [OK!]

6. Prints da documentação JavaDoc
<img width="1917" height="711" alt="image" src="https://github.com/user-attachments/assets/754bc193-0961-48bc-9324-2c061c9a0b99" />

7. Link do repositório
O código fonte, incluindo a branch Refatoracao, pode ser acessado através do repositório remoto abaixo:
Link: https://github.com/MurFernandez/AtividadeOhata1/tree/Refatoracao
