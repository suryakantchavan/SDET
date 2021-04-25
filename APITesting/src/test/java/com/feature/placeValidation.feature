Feature: Search India on BBC website and verify search.

  @Search
  Scenario: Search India on BBC website and verify it.
    Given I open the firefox browser
    And I navigating to BBc website
    Then I click at search textbox
    And I enter "India" in search textbox
    And I click at Search button
    Then I should be taken to search page
    And I verify India on search page
    And The database table fact.itd_agentbynotreadyreasoncode_interval for account_id = ABCDEF will contain record with
 When reasonCode creation event is sent to kafka topic 'reason-code' containing: