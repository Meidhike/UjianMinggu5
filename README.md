# CURA Healthcare Appointment Automation Test

##  Overview
Proyek ini adalah contoh implementasi **Cucumber**.
Pengujian dapat dijalankan secara lokal menggunakan Maven, maupun secara otomatis di Jenkins melalui pipeline CI/CD yang sudah dikonfigurasi.
Hasil test akan dilengkapi dengan screenshot setiap scenario dan laporan HTML yang dapat diakses langsung dari Jenkins atau folder `Reports/`.

---

## Automation testing project menggunakan:
- Java + Selenium + Maven
- Cucumber (BDD)
- TestNG
- Extent Report
- Jenkins Pipeline
- Chrome

---
## Quick Installation
Please clone this project with the following command:
```
git clone <https://github.com/Meidhike/UjianMinggu5.git>
```
Running test with the following command:
`mvn clean test`

Test with Another Suite
`mvn clean test -Dsurefire.suiteXmlFiles=src/test/resources/testng.xml`

---

## 📊 Reports

HTML Report :

Disimpan di folder Reports/Spark.html


PDF Report :

Disimpan di folder Reports/ExtentReport.pdf

---

## Author
[Moch Meidhike Wirazitanra Jayadi](https://github.com/Meidhike)
