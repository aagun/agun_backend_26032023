
# agun_backend_26032023

Program ini diperuntukan demi memenuhi persyaratan rekrutment yang diselenggarakan oleh PT Padepokan Tujuh Sembilan. Teknologi yang digunakan ketika melakukan development aplikasi ini antara lain Java-17, SpringBoot 3 dan SQL Server.


## Installation

1. Clone atau download repo ```agun_backend_26032023```

2. Eksekusi ```db_padepokan_tujuh_sembilan.sql``` menggunakan SQl Server Management Studio atau Azure Data Studio.

3. Buka file ```path-to/agun_backend_26032023/src/main/resource/application.properties```. Kemudian sesuaikan username, password dan url database.
    ```spring.datasource.url=jdbc:sqlserver://URL_DB_KAMU:PORT_DB_KAMU;encrypt=true;trustServerCertificate=true;databaseName=Padepokan_Tujuh_Sembilan```

    ```spring.datasource.username=USERNAME_DB_KAMU```

    ```spring.datasource.password=PASSWORD_DB_KAMU```

4. Jalankan perintah berikut pada ``terminal`` atau ```cmd```

    ```mnv spring-boot:run```

5. Tunggu proses hingga selesai, kemudian buka aplikasi postman lalu import file ```api_document.postman_collection.json```

6. Jalanakan salah satu request postman yang telah di import untuk melakukan pengjuan pada palikasi.




    
