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
        <li>Métodos de Classe (ou Métodos Estáticos): São associados à classe em si. Não dependem de dados de instâncias específicas. Operam em<br>
            dados compartilhados entre todas as instâncias (atributos da classe) ou realizam operações que não dependem dos dados de instâncias específicas.</li>
        <li>Parâmetros: São as variáveis definidas na assinatura do método.
        <li>Argumentos: São os valores que você passa para essas variáveis quando chama o método.</li>
    </ul>
    <h2>Coesão</h2>
    <ul>
        <li class="def"><h4> Refere-se ao grau que os elementos de uma classe (ou modulo) estão relacionados entre si</h4></li>
        <li>Uma classe com alta coesão tem uma responsabilidade única e bem definida.</li>
        <li>Cada classe deve se concentrar em uma parte específica do sistema. Se você encontrar que uma classe está fazendo muitas coisas diferentes, isso indica baixa coesão.</li>
        <li><span id="enfase">Vantagens:</span> Manutenção fácil, reusabilidade e facilidade de testes</li>
    </ul>
</body>
</html>
