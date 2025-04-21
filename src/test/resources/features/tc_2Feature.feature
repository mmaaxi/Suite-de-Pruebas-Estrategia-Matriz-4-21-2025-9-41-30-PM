Feature: Validar la matriz

  Scenario: Ejecutar la matriz y verificar que se genera correctamente
    Given el usuario se encuentra en la página de la matriz
    When el usuario ejecuta la matriz
    Then la matriz se genera correctamente