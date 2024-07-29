

Feature: Como usuario, quiero registrar un nuevo candidato y posteriormente contratarlo

  Background: Estar logueado con un usuario administrador
    Given el usuario está en la pantalla de inicio y coloca las siguientes credenciales
      | user  | password |
      | Admin | admin123 |
    And el usuario presiona el boton Login

   Scenario: Registrar y contratar un candidato valido

    Given el usuario esta en la pagina de reclutamiento de candidatos
    When el usuario registra al candidato con los siguientes datos
      | firstname | middlename | lastname | vacancy | email            | contactnumber | interview          | interviewer   | dateday      | time   |
      | Felipe    | Edward     | Rodriguez| test    | felipe@gmail.com | 312545664     | Entrevista Tecnica |Ranga  Akunuri | 2024-30-07   | 01:00 PM  |
    And el usuario aprueba la entrevista
    And el usuario contrata al candidato
    Then el usuario vera la informacion del candidato en estado contratado
      | candidate  | hire   |
      | Felipe     | Hired  |