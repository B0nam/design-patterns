# Template Method

O padrão Template Method define o esqueleto de um algoritmo em uma operação, deixando alguns passos para serem implementados pelas subclasses. Assim, as subclasses podem redefinir certas etapas do algoritmo sem alterar sua estrutura geral.

O Template Method permite que subclasses redefinam certas etapas de um algoritmo sem mudar a estrutura do algoritmo.

Imagine um sistema que processa diferentes tipos de documentos, como PDF e DOC. O algoritmo geral é:

1. Abrir arquivo
2. Ler conteúdo
3. Processar conteúdo (específico para cada tipo)
4. Salvar resultado

