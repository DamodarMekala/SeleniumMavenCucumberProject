
  Feature: Login to facebook

    Scenario: facebook login
      Given Man log sich ein
Then Pruefe ob der seite erschient

      When Gebe in das feld userName "opensourcecms"
      When Gebe in das feld password "opensourcecms"

      And Klicke auf den Button "LOGIN"
