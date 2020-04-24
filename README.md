# Calculadora de Sal�rio L�quido

No Brasil, as pessoas que trabalham �com carteira assinada� (CLT) t�m uma parte do seu sal�rio bruto (isto �, o sal�rio integral, sem descontos) retida pela empresa empregadora para o pagamento de alguns tributos, como, por exemplo, a Previd�ncia Social (INSS) e o Imposto de Renda Retido na Fonte (IRRF). Ap�s esse desconto, o valor que a pessoa contratada recebe � denominado sal�rio l�quido.

Neste desafio, vamos implementar um algoritmo que ser� respons�vel por receber como par�metro o sal�rio bruto e retornar o sal�rio l�quido, j� com todos os descontos de INSS e IRRF. Esse algoritmo deve ser implementado na classe CalculadoraSalario no m�todo calcularSalarioLiquido, esse m�todo deve receber um valor do tipo double e retornar um valor do tipo int (Utilize o m�todo Math.round() para arredondar o resultado final).

Lembre-se que � uma boa pr�tica deixar cada m�todo com apenas 1 responsabilidade, ent�o fique � vontade para criar m�todos privados na classe para melhorar a legibilidade de seu algoritmo.

Observa��es: Para simplificar o desafio, ser�o utilizados valores fict�cios e n�o os valores oficiais das tabelas de al�quotas da Previd�ncia Social e Receita Federal.

F�rmula do c�lculo
Primeiro passo
Primeiro deve ser calculado o valor do desconto do INSS, o mesmo deve ser calculado conforme a tabela abaixo:

Faixa salarial	Percentual de desconto
At� R$ 1.500,00	8%
De R$ 1.500,01 at� R$ 4.000,00	9%
Acima de R$ 4.000,00	11%
Exemplo: - Para um sal�rio bruto de R$1.000,00 ou R$1.500,00, dever� ser aplicado o desconto de 8% resultando em valores l�quidos de R$920,00 ou R$1.380,00, respectivamente. - Para um sal�rio bruto de R$1.500,01 ou R$10.000,00, dever� ser aplicado o desconto de 9% e 11% respectivamente, resultando em valores l�quidos de R$1.365,00 ou R$ 8.900,00, respectivamente.

Segundo passo
Ap�s obter o valor do sal�rio bruto - INSS, utilizaremos esse valor como refer�ncia para realizar o c�lculo do IRRF e realizar o desconto correto. Esse valor de refer�ncia (sal�rio bruto - INSS) dever� ter um percentual descontado de acordo com a tabela abaixo:

Faixa salarial	Percentual de desconto
At� R$ 3.000,00	ISENTO
De R$ 3.000,01 at� R$ 6.000,00	7.5%
Acima de R$ 6.000,00	15%
Exemplo

Ap�s descontar o INSS, obtivemos o valor de R$1.320,00, como esse valor � at� R$ 3.000,00, n�o haver� desconto do IRRF, totalizando um sal�rio l�quido final de R$ 1.320,00.
Ap�s descontar o INSS, obtivemos o valor de R$8.900,00, como esse valor � maior que R$3.000,00, haver� o desconto de 15% desse valor, totalizando um sal�rio l�quido final de R$7.565,00.
Observa��es - Caso o valor do sal�rio base recebido seja abaixo do sal�rio m�nimo (R$ 1.039,00), o algoritmo deve retornar 0.0.

# Resultado submetido

![](resolvido.JPG)