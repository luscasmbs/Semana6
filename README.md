# 📝 Resoluções de Exercícios - Semana 06

---

## QUESTÕES CONCEITUAIS

### Questão 1
o enum tem um valor fixo, já o sealed tem uma hierarquia de tipos e subclasses. Um exemplo pode ser quando você quer saber se um usuário foi cadastrado, se for, sucess e o nome do usuário, se não, error: e o erro

### Questão 2
Porque dificulta leitura, reaproveitamento, e dificuldade de testar, já que se você por dentro da main ou de uma tela, não vai ser possível fazer teste unitário, que é mais rápido que reiniciar a aplicação para testar

### Questão 3
A herança herda TUDO da classe mãe, então qualquer mudança vai afetar a classe filha; Já a composição, pega pequenos comportamentos, não uma classe inteira. UM exemplo pode ser

### Questão 4
Objeto de valor é uma classe que representa algo que só importa pelos seus dados, não por um id único. Porque pontuação vai já ter tratado os valores que podem ser recebidos, limitando até quanto é a nota.

### Questão 5
Porque o nome não explica o que é, processar o que? e provavelmente ela faz varias funções de processamento, não especificas, dificultando testes e leitura do código. Para resolver isso, pode se criar uma interface chamada RegrasDeAvaliação, com o método AvaliarNotas(), assim deixa-se mais especifico e facilita a leitura.

### Questão 6
O require valida os dados no momento da criação do objeto, recusando valores rapidamente, sem passar para outra parte do código, fazendo o código ter certeza que o objeto recebido é suportado.

### Questão 7
Deve pertencer ao domínio, porque domínio define as regras. Nunca na UI, a Ui deve exibir mensagem do erro ao usuário, e o banco só armazenar os dados, não tratar.

### Questão 8
Não vai ter testes unitários, mexendo em uma parte, pode quebrar todo o resto, além disso, dificulta na manutenção.

---

## QUESTÕES DE INTERPRETAÇÃO

### Caso 1
Vai exibir "true", porque a função aprovar vai retorna um valor boolean, mas o problema é que foi dito anteriormente que é importante limitar, e nesse exemplo não foi limitado nenhum código, para corrigir, um require dentro do dataclass resolveria.

### Caso 2
porque ele está criando subclasses para caso seja incompleta. O when precisa de um else, para caso o resultado não se adeque a nenhum dos anteriores. Se fosse adicionado mais um, teria que editar o when.

### Caso 3
Não. Ele não informa o motivo da penalidade, para resolver isso, é interessante criar uma interface de regras de pontuação, com uma variável string contendo o motivo.

### Caso 4
As regras de aprovação com print. Dificult porque tudo depende do input no console. Criar uma classe para nota e retorna o resultado.
