# language: pt
Funcionalidade: Tabela de pedágios
    Quero ver a tabela de pedágios de um determinado frete

    Cenário: Valor do pedágio total de um percurso para um caminhão de 2 eixos
        Dado que eu faço login
        E eu faço checkin
        Quando eu escolho um frete
        Entao eu vejo a tabela de pedágios com o pedágio para um caminhão de 2 eixos
