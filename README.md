# SENAI Fullstack [Education]

## Resolução dos exercícios da Semana 4

### M1S04 | Ex 1 - Lista de Cursos e Professores

Criar dois ArrayList para armazenar lista de cursos e professores.
Utilizando um laço de repetição, pedir ao usuário que informe alguns cursos/professores ou um comando para sair (pode ser "0", mas fique à vontade para mudar).
Para isso, criar funções para:

- Adicionar curso/professores na lista
- Ao sair listar os cursos/professores inseridos

### M1S04 | Ex 2 - Lista de cursos e professores - Com menu de opções

Vamos melhorar nosso sistema!

O usuário precisa manipular as listas de cursos e professores, portanto precisaremos adicionar a funcionalidade de um menu de opções:

Opções (números são sugestões para executar as ações):

- (1) Listar
- (2) Adicionar
- (0) Sair

**LISTAR**</br>
Quando a opção escolhida for "Listar", utilizar a função de listagem criada no Exercício 1.
Obs.: Altere a função listar para que seja exibido o índice ao lado de cada item, usaremos posteriormente.

**ADICIONAR**</br>
Quando a opção escolhida for "Adicionar", utilizar a função criada para adicionar no Exercício 1.

### M1S04 | Ex 3 - Lista de cursos e professores - Nova opção no menu

Após esta refatoração realizada no Exercício 2, adicione uma opção no menu para que o curso/professores seja removido

**Nova opção** *(números são sugestões para executar as ações)*

- (3) Remover

**Novas funções**</br>
Criar 3 novas funções *(nomes das funções são apenas sugestões):*

- `listarPedirIndice`
  - utilizar a função de listagem (com índices - conforme alterado no Exercício 2)
  - pedir ao usuário que escolha um item da lista
  - retornar o índice escolhido
- `removerItemLista`
  - utilizar a função `listarPedirIndice`
  - utilizar a função `removerItem` *(próxima função a ser criada)* e passar como parâmetro o índice retornado da função `listarPedirIndice`
- `removerItem`
  - precisa receber o índice por parâmetro
  - na sequência realizar a remoção do item existente no índice

### M1S04 | Ex 4 - Lista de cursos concluídos

Continuando nosso projeto!

Vamos criar uma nova lista para armazenar os cursos que já foram concluídos pelo usuário.

Após criar a lista, será necessário adicionar mais opções no menu:

**Novas opções** *(números são sugestões para executar as ações)*:

- (4) Marcar como concluído
- (5) Listar concluídos

**Nova função** *(nome da função é apenas sugestão)*:

- `marcarComoConcluído`
  - utilizar a função `listarPedirIndice` *(criada no Exercício 3)*
  - adicionar na nova lista de concluídos o curso escolhido pelo usuário
  - remover item da lista de cursos utilizando a função `removerItem` *(criada no Exercício 3)*. Dessa forma o curso/professores será movido para a nova lista.

### M1S04 | Ex 5 - (POO Abstração) Criar classes de curso e professor

Vamos adicionar um pouco de Orientação a Objetos em nosso projeto

1. Crie uma classe de curso com ao menos:
- Atributos:
  - Nome
  - Descrição
  - Professores
  - Carga horária
- Métodos:
  - Progresso
  - Notas
  - Participação
- ***Obs.:*** Os métodos podem conter apenas textos que imprimam no console
2. Crie uma classe de professor com ao menos:
- Atributos:
  - Nome
  - Especialidade
- Métodos:
  - Ensinar
- ***Obs.:*** Os métodos podem conter apenas textos que imprimam no console

