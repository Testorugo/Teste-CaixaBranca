# Teste de Caixa Branca em Java.

<h2>Descrição:</h2>
Este repositório inclui um exemplo de implementação em Java para testes de caixa branca, enfocando operações de banco de dados. O programa implementado faz uso de conexões JDBC para acessar um banco de dados MySQL, onde realiza a autenticação de usuários através do login e senha.

<h2>Tecnologias Utilizadas:</h2>

- **Java**: A linguagem de programação utilizada para o desenvolvimento deste exemplo.
- **MySQL**: O sistema de gerenciamento de banco de dados usado para armazenar dados do usuário.
- **JDBC**: A interface de programação utilizada para interagir com o banco de dados.

<h2>Erros encontrados no código:</h2>
<h3> Documentação:</h3>
<p>O código não inclui comentários explicativos sobre sua funcionalidade. Comentários ajudariam a entender o propósito das classes, métodos e partes complexas do código. A falta de documentação pode dificultar a manutenção futura.</p>
<h3>Nomenclatura de variáveis e constantes:</h3>
<p>As variáveis e constantes não seguem as convenções de nomenclatura padrão do Java. Em Java, é comum usar camelCase para nomes de variáveis e constantes. Por exemplo, em vez de Teste_Caixa_Branca, seria mais adequado TesteCaixaBranca. Nomes mais descritivos também poderiam ser usados para melhorar a compreensão do código.</p>
<h3>Legibilidade e organização:</h3>
<p>O código está mal formatado e não está bem organizado. A falta de espaços e alinhamento inconsistente dificulta a leitura do código. Uma formatação mais clara e consistente melhoraria a legibilidade.</p>
<h3>Tratamento de NullPointerExceptions:</h3>
<p>O código não trata explicitamente exceções do tipo NullPointerException, que podem ocorrer em várias partes do código. Por exemplo, quando conectarBD() retorna null ou quando rs.getString("nome") é chamado sem verificar se a consulta SQL retornou resultados.</p>
<h3>Respeito à arquitetura:</h3>
<p>Não está claro se o código segue uma arquitetura específica. Utilizar um padrão arquitetural, como MVC (Model-View-Controller) ou camadas separadas, poderia facilitar a manutenção e a extensibilidade do código.</p>
<h3>Fechamento de conexões:</h3>
<p>As conexões com o banco de dados não são fechadas explicitamente após o uso. É importante fechar todas as conexões, instruções e conjuntos de resultados (ResultSet) quando não forem mais necessários para evitar vazamentos de recursos. Isso pode ser feito com um bloco finally ou utilizando o recurso try-with-resources do Java.</p>

<h2>Plano de Teste</h2>

[PLANO DE TESTE.xlsx](https://github.com/Testorugo/Teste-CaixaBranca/files/15081435/PLANO.DE.TESTE.xlsx)


<h2>Grafo de Fluxo:</h2>

![grafo de fluxo](https://github.com/Testorugo/Teste-CaixaBranca/assets/114782204/b08fd0da-a8d2-4e6d-be74-f94616cd0661)

<h3>Os nodos são:<br />
1. Início<br />
2. Tentativa de conectar com o banco<br />
3. Tenta executar a consulta SQL<br />
4. Verifica o resultado da consulta<br />
5. Fim</h3>

<h2>Cálculo da Complexidade Ciclomática</h2>

<p>V(G) = complexidade ciclomática.</p>
<p>E = número de arestas no grafo.</p>
<p>N = número de nós no grafo.</p>
<p>P = número de componentes conexos (1 para um único grafo).</p>

<h3>V(G)=E−N+2P</h3>
<h4>V(G)= 6 − 5 + 2(1) = 3</h4>

<h2>Caminhos possiveis no grafo:</h2>

<h3>Caminho 1:</h3>
<p>1-2-3-4-5</p>
<h3>Caminho 2:</h3>
<p>1-2-3-5</p>
<h3>Caminho 3:</h3>
<p>1-2-4-2-3-4-5</p>
<h3>Caminho 4:</h3>
<p>1-2-4-2-3-5</p>
