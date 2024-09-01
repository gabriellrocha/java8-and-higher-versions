<html lang="PT-BR">
<head>
    <title></title>
    <style>
        #enfase {
            color: green;
        }
        .def {
            color: #00BFFF;
            list-style-type: none;
        }
    </style>
</head>

<body style="font-size: 16px">
    <h1>Orientação Objetos</h1>
    <hr>
    <h2>Classe</h2>
    <ul>
        <li class="def"><h4>Modelo que define a estrutura e o comportamento de objetos</h4></li>
    </ul>
    <hr>
    <h2>Objeto</h2>
    <ul>
        <li class="def"><h4>É uma instância da classe. Representa uma unidade concreta com atributos (dados)
         e métodos (comportamentos) definidos pela classe
        </h4></li>
        <ul>
            <h5>Podem ser classificados em várias "categorias", por exemplo:</h5>
            <li>Objetos físicos: Representações digitais de entidades físicas, como impressoras, veículos ou sensores.</li>
            <li>Objetos conceituais: Entidades que representam conceitos abstratos, como contas bancárias, usuários ou pedidos.</li>
            <li>Objetos digitais: Dados e estruturas digitais, como arquivos, documentos ou imagens, que existem apenas no ambiente digital.</li>
            <li>Objetos software: Componentes de um programa, como classes e instâncias, que encapsulam dados e comportamentos específicos.</li>
        </ul>
    </ul>
    <hr>
    <h2>Métodos</h2>
    <ul>
        <li>Métodos de Instância: Associados a objetos. Eles operam sobre os dados (atributos) específicos de uma instância.(da qual está sendo chamado).</li>
        <li>Métodos de Classe (ou Métodos Estáticos): São associados à classe em si. Não dependem de dados de instâncias específicas.
        <li>Parâmetros: São as variáveis definidas na assinatura do método.
        <li>Argumentos: São os valores que você passa para essas variáveis quando chama o método.</li>
    </ul>
    <h4>Sobrecarga</h4>
    <ul>
        <li class="def"><h4>Permite definir múltiplos métodos com o mesmo nome em uma classe, desde que tenham assinaturas diferentes.</h4></li>
        <li><span id="enfase">Vantagens:</span> Permite que métodos com a mesma intenção sejam utilizados em contextos diferentes</li>
    </ul>
    <h4>Construtores</h4>
    <ul>
        <li class="def"><h4>Métodos especiais de uma classe usados para inicializar novos objetos</h4></li>
    </ul>
    <hr>
    <h2>Modificadores de acesso</h2>
    <ul>
        <li class="def"><h4>Definem a visibilidade / acesso de classes, métodos e atributos</h4>
        <li>public: Acessível de qualquer lugar.</li>
        <li>protected: Acessível dentro do mesmo pacote e por subclasses em pacotes diferentes.</li>
        <li>default: (sem modificador): Acessível apenas dentro do mesmo pacote.</li>
        <li>private: Acessível apenas dentro da própria classe.</li>
    </ul>
    <h2>Coesão</h2>
    <ul>
        <li class="def"><h4> Refere-se ao grau que os elementos de uma classe (ou modulo) estão relacionados entre si</h4></li>
        <li>Uma classe com alta coesão tem uma responsabilidade única e bem definida.</li>
        <li>Cada classe deve se concentrar em uma parte específica do sistema. Se você encontrar que uma classe está fazendo muitas coisas diferentes, isso indica baixa coesão.</li>
        <li><span id="enfase">Vantagens:</span> Manutenção fácil, reusabilidade e facilidade de testes</li>
    </ul>
    <h2>Acoplamento</h2>
    <ul>
        <li class="def"><h4>É o grau de dependência entre diferentes módulos ou classes de um sistema</h4></li>
        <li>Alto Acoplamento: Classes fortemente dependentes umas das outras. Isso pode dificultar a manutenção e evolução do sistema.</li>
        <li>Baixo Acoplamento: Classes ou módulos com pouca, ou nenhuma dependência direta entre si. Promove a modularidade e reutilização de código.</li>
    </ul>
    <hr>
    <h2>Boas práticas:</h2>
    <ul>
        <li>Código com alta coesão | baixo acoplamento</li>
        <li>Escrever getters e setters sempre no final da classe</li>
        <li>Em métodos realizar primeiros as validações, e em seguida, executar a lógica principal. "fail fast"</li>
        <ul>
            <li style="list-style-type: none"><h3>Convenção nomenclatura </h3></li>
            <li>camelCase: métodos, variáveis, atributos, parâmetros</li>
            <li>PascalCase: Classes, Interfaces, Enums</li>
            <li>Constantes | Valores dos enums: UPPER_CASE_WITH_UNDERSCORES</li>
            <li>Genéricos (Generics): Uma única letra maiúscula. T para tipo, E para elemento, K para chave, e V para valor.</li>
        </ul>
    </ul>
    <hr>
    <h2>Más práticas:</h2>
    <ul>
        <li>Mudar nomes de métodos e construtores existentes, especialmente se o sistema estiver em produção ou bibliotecas
        usadas em outras aplicações. Pode ocorrer quebra de compatibilidade e impacto nos testes. A melhor prática seria
        adicionar novo método/construtor</li>
    </ul>
</body>
</html>
