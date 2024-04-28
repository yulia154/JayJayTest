@beli-pulsa
  Feature: Beli Pulsa

    @input-valid-im3-phone-number
    Scenario: input valid im3 phone number
      Given user is on beli pulsa page
      And user should see Beli Pulsa text "Beli Pulsa"
      When user input phone number with "085753098654"
      Then user should see provider image "https://images.tokopedia.net/img/elTgOa/2024/1/30/a8570726-6e83-4658-ac9d-3b283bd9c8b2.png"
      And nominal options should be shown with "Nominal"
      And Beli button should be enabled

    @input-valid-telkomsel-phone-number
    Scenario: input valid telkomsel phone number
      Given user is on beli pulsa page
      And user should see Beli Pulsa text "Beli Pulsa"
      When user input phone number with "08213265432"
      Then user should see provider image "https://images.tokopedia.net/img/elTgOa/2024/1/30/422678b1-aca8-4ffb-bd8b-beb3ed216cb7.png"
      And nominal options should be shown with "Nominal"
      And Beli button should be enabled

    @input-invalid-phone-number
    Scenario: input invalid phone number
      Given user is on beli pulsa page
      And user should see Beli Pulsa text "Beli Pulsa"
      When user input phone number with "8735243781762"
      And Beli button should be disabled

    @input-phone-number-less-than-10-number
    Scenario: input phone number less than 10 number
      Given user is on beli pulsa page
      And user should see Beli Pulsa text "Beli Pulsa"
      When user input phone number with "085753098"
      Then user should see error message with "Nomor terlalu pendek, minimal 10 karakter"
      And Beli button should be disabled

    @input-phone-number-more-than-14-number
    Scenario: input phone number more than 14 number
      Given user is on beli pulsa page
      And user should see Beli Pulsa text "Beli Pulsa"
      When user input phone number with "08573628017028634"
      Then user should see error message with "Nomor terlalu panjang, maksimum 14 karakter"
      And Beli button should be disabled