Feature: Validar la estrategia

  Scenario: Ejecutar y validar la estrategia
    Given el usuario está en la página de estrategias
    When el usuario ejecuta la estrategia
    Then la estrategia se ejecuta correctamente