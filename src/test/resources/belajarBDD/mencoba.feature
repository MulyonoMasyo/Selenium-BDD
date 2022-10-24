Feature: Fitur untuk menguji login fungsionalitas

  Scenario: Untuk mengetahui login berhasil dengan menggunakan data yang valid
  
    Given user sedang berada pada halaman login
    When user mengisi username dan password dengan data valid
    
    And klik tombol login
    
    Then navigasi pada halaman dashboard

		