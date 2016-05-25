@api
Feature: Google API Address Validation

  Scenario: Formatted Address
    Given I access the google geocode api
    When I call the API with post code WD17 1JJ
    Then 'Clarendon Rd, Watford, Hertfordshire WD17 1JJ, UK' should be returned