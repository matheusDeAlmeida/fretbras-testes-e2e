Feature: Tabela de pedágios
    Quero ver a tabela de fretes

    Scenario: Valor do frete para um caminhão de 2 eixos
        Given que eu faço login
        And eu faço checkin
        When eu escolho um frete
        Then eu vejo a tabela de pedágios
        