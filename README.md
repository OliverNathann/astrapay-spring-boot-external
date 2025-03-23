# Astrapay Spring Boot Backend

Backend untuk proyek **Astrapay** menggunakan **Spring Boot**. Backend ini berfungsi sebagai API server untuk mengelola data yang digunakan oleh frontend Angular.

---

## 📥 Clone Repository

Untuk menjalankan backend ini, Anda perlu melakukan clone repository berikut:

```sh
git clone https://github.com/OliverNathann/astrapay-spring-boot-external.git
cd astrapay-spring-boot-external
```

---

## 🔧 Konfigurasi Database

Backend ini menggunakan **MySQL** sebagai database. Pastikan MySQL sudah terinstal dan jalankan perintah berikut untuk membuat database:

```sql
CREATE DATABASE astrapay_db;
```

Selanjutnya, ubah konfigurasi database di file **`application.properties`** yang ada di folder `src/main/resources/`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/astrapay_db
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

> **Catatan:** Gantilah `yourpassword` dengan password MySQL Anda.

---

## 🚀 Menjalankan Backend

### **1️⃣ Pastikan Java & Maven Terinstal**
Pastikan Anda sudah menginstal **Java 17+** dan **Maven**. Cek versi dengan:

```sh
java -version
mvn -version
```

Jika belum terinstal, unduh Java dari [Oracle](https://www.oracle.com/java/) atau gunakan OpenJDK.

### **2️⃣ Jalankan Aplikasi**
Untuk menjalankan backend, jalankan perintah berikut:

```sh
mvn spring-boot:run
```

Setelah itu, backend akan berjalan di **`http://localhost:8080`**.

---

## 🚀 Clone & Jalankan Frontend

Setelah backend berjalan, lakukan clone frontend Angular agar dapat mengakses API backend ini:

```sh
git clone -b master https://github.com/OliverNathann/astrapay-angular.git
cd astrapay-angular
npm install
ng serve
```

Aplikasi frontend akan berjalan di **`http://localhost:4200/`** dan berkomunikasi dengan backend di **`http://localhost:8080/api`**.

---

## 📌 API Endpoint
Berikut adalah beberapa endpoint utama yang tersedia:

### **📌 GET Semua Data**
```http
GET /api/notes
```
**Response:**
```json
[
  { "id": 1, "note": "Catatan pertama" },
  { "id": 2, "note": "Catatan kedua" }
]
```

### **📌 POST Tambah Catatan**
```http
POST /api/notes
Content-Type: application/json
```
**Body:**
```json
{
  "note": "Catatan baru"
}
```

### **📌 DELETE Hapus Catatan**
```http
DELETE /api/notes/{id}
```

---

## 🛠 Teknologi yang Digunakan

✅ **Spring Boot** - Framework utama backend  
✅ **Spring Data JPA** - ORM untuk database  
✅ **MySQL** - Database utama  
✅ **Maven** - Dependency management  
✅ **Lombok** - Mengurangi boilerplate code  

## 🛠 POSTMAN

![Add Notes](https://github.com/user-attachments/assets/b7c5e2ab-1dd8-4f3e-9936-efc71691c413)
![Delete Note](https://github.com/user-attachments/assets/cb14a536-679d-4a3d-8dca-08876e571947)
![Get All Note](https://github.com/user-attachments/assets/2aef6014-2ea9-446a-bd75-6327fd460791)
![Empty List](https://github.com/user-attachments/assets/78a33fd8-f7d8-4546-9d44-bba51168f8ae)
![List Berisi](https://github.com/user-attachments/assets/95d5c936-7f24-40cf-ba2e-5c17b8a506cd)


## 📞 Kontak dan Bantuan

Jika mengalami masalah atau memiliki pertanyaan, silakan hubungi:

- **GitHub:** [OliverNathann](https://github.com/OliverNathann)
- **Email:** example@email.com
- **Diskusi & Isu:** [GitHub Issues](https://github.com/OliverNathann/astrapay-spring-boot-external/issues)

---

## 🎉 Terima Kasih! 🎉

Terima kasih telah menggunakan **Astrapay Spring Boot Backend**! Jika proyek ini bermanfaat, jangan lupa untuk memberikan **⭐ Star** di repository ini. 🚀

