# SOLID Java

## Single Responsibility Principle - Coesao das Classes.

Just because you can, doesn't mean you should.

"Uma classe deveria ter apenas um único motivo para mudar" - Robert (Uncle Bob) Martin

Manter a alta coesao, classes pequenas e enxutas ter apenas um motivo para mudar (claro algumas exeções podem existir) mas devemos ter responsabilidade
em criar comportamentos a uma classe. Regras de negócio deve afetar somente a classe em que você muda, não precisamos sair mudando em classes A,B ou C.


## Open Closed Principle.

Open chest surgery is not needed when putting on a coat

"Deixar classes com muitos comportamentos, o principio do aberto e fechado é entidades de software(classes, módulos, funções, etc) devem estar
abertas para extensão, porém fechadas para modificação" - Bertrand Meyer

Temos que ter em mente que para nova regra sempre será adicionado novos comportamentos nunca mexer em que está escrito, ou seja, sempre evitar inserir
novos comportamentos em códigos já existentes classes ou funções novas.

## Liskov Substitution Principle.

if it looks like a duck, quacks like a duck, but needs batteries - You probably have the wrong abstraction.

"Se q(x) é uma propriedade demonstrável dos objetos x de tipo T, então q(y) deve ser verdadeiro para os objetos y de tipo S, onde S é um subtipo de T" - Barbara Liskov

## Dependency Inversion Principle.

Would you solder a lamp directly to the electrical wiring in a wall?

"Abstrações não devem depender de implementações. Implementações devem depender de abstrações." - Robert (Uncle Bob) Martin

## Interface Segregation Principle

You wante me to plug this in, where?

"Uma classe não deveria ser forçada a depender de métodos que não utilizará." - Robert (Uncle Bob) Martin

