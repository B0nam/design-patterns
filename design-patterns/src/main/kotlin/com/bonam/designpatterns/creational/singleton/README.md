# Singleton

Design Pattern que garante que uma classe tenha apenas uma instância e fornece um ponto de acesso global a essa instância. O padrão Singleton é útil quando precisamos garantir que apenas uma única instância de uma classe seja criada e usada em todo o sistema.

O padrão Singleton é frequentemente usado para gerenciar recursos compartilhados, como conexões de banco de dados, gerenciadores de configuração ou serviços globais.

Considere um sistema que precisa acessar a configuração de banco de dados de forma global. Devemos garantir que essa configuração seja carregada apenas uma vez e reutilizada sempre que necessário.

| Tipo de Configuração | Implementação         |
|---------------------|-----------------------|
| Banco de Dados      | DatabaseConfiguration |

Neste caso, podemos criar uma classe `DatabaseConfiguration` que carrega a configuração do banco de dados. Usamos o padrão Singleton para garantir que apenas uma instância dessa classe seja criada e usada em todo o sistema. A classe `DatabaseConfiguration` terá um método estático `getInstance()` que retorna a instância única da classe.
