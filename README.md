SistemaEcommerce
=================

Este é um pequeno projeto de prática para a matéria de Programação Orientada a Objetos. É um sistema mínimo de e-commerce com classes para `Cliente`, `Produto`, `ItemPedido`, `Pedido` e diferentes formas de `Pagamento`.

O objetivo deste repositório é demonstrar o uso de classes, herança e composição — e também deixar tudo organizado para entrega ao professor.

O que tem neste repositório
- Código-fonte Java em `src/main/java/br/com/ecommerce/`
- Classe principal: `Main.java` (exemplo de uso)
- Diagrama UML em `docs/diagrama-uml.png`
- Arquivo `pom.xml` para quem quiser usar Maven

Como compilar e executar (simples)

1) Usando Maven (recomendado se tiver o Maven instalado):

```powershell
cd "c:\Users\ADZ\Documents\SistemaEcommerce"
mvn compile
mvn exec:java -Dexec.mainClass="br.com.ecommerce.Main"
```

2) Sem Maven (apenas Java instalado):

```powershell
cd "c:\Users\ADZ\Documents\SistemaEcommerce"
javac -d target/classes src/main/java/br/com/ecommerce/*.java
java -cp target/classes br.com.ecommerce.Main
```

Observações rápidas
- Use Java 11+ para evitar problemas de compilação.
- O projeto é simples e foi escrito para fins didáticos — você pode modificar `Main.java` para testar diferentes formas de pagamento.

Se quiser, eu posso:
- Gerar um arquivo JAR executável;
- Adicionar instruções específicas para Windows/macOS;
- Ou abrir um Pull Request com melhorias.

Boa sorte na entrega — se quiser que eu escreva uma mensagem curta para colar no Classroom, eu faço também.