# 1. adımda imaj içinde kullanacağımız JDK sürümünü belitiyoruz.
FROM amazoncorretto:17
# 2. Kullanacağımız sürüm geride kalmış olabilir bu nedenle güncellemeleri alması için
# update ediyoruz. güncellemelerde Y/N şeklinde sorular olabileceği için tüm bu sorulara
# YES cevabı vermek için -y kullanıyoruz.
CMD apt-get update -y
# 3. Belli bir dosya kopyalanabilir ancak, biz daha generic bir file oluşturmak için
# dosya adının dışarıdan alınması tercih ediyoruz. yani imaj içine yükleyeceğimiz, java
# proje dosyamızın adının dışarıdan verilmesini sağlıyoruz.
# COPY build/libs/Yarisma-1.0-SNAPSHOT.jar app.jar --bu kullanım direkt yükleme içindir.
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
# 4. Yüklediğimiz proje jar dosyasını java üzerinden çalıştırıyoruz.
ENTRYPOINT ["java","-jar","app.jar"]
