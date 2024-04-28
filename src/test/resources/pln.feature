@tagihan-listrik
  Feature: Tagihan Listrik

    @valid-input
    Scenario: input valid nomor token
      Given user is on pln page
      And user input nomor token with "112233445566"
      When user click bayar button
      Then user is on login page "Masuk"

    @invalid-scenario
    Scenario: input invalid nomor token
      Given user is on pln page
      When user input nomor token with "abcdefghij01"
      Then user able to see error message "Nomor hanya boleh mengandung angka"

    @boundaries-scenario
    Scenario: input nomor token more than 12 number
      Given user is on pln page
      When user input nomor token with "112233444556677"
      Then user able to see error message "Nomor terlalu panjang, maksimum 12 karakter"