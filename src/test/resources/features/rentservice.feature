Feature: Alquilar mecanico

  Scenario: buy a car in the web page 2
    Given que estoy en la tienda de carros
    And quiero que el mecanico venga a la casa a cambiar las ruedas
    When selecciono al mecanico mas valorado
    Then deberia recibir el carro en la casa