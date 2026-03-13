# language: en
Feature: Cambio de estado de ticket desde el Dashboard
  Como agente de soporte
  Quiero cambiar el estado de un ticket
  Para gestionar la atención al cliente

  @cambiar-estado
  Scenario: El agente cambia el estado de un ticket a "En Progreso"
    Given que el usuario está en el Dashboard de gestión de tickets
    And los tickets están cargados en la tabla
    When selecciona el primer ticket de la lista
    Then se visualiza el modal de cambio de estado
    When elige el estado "En Progreso" en el modal
    And confirma el cambio de estado
    Then el modal se cierra confirmando que el estado fue actualizado


