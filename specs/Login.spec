Specification Heading
=====================
Created by Mustafa YARDIMCI on 19.03.2021

This is an executable specification file which follows markdown syntax.
Every heading in this file denotes a scenario. Every bulleted point denotes a step.

Oturum Ac Sayfasinin Acilmasi
--------------------
* Login Ekraninda Logo,Giris butonu ve Kayit ol butonu oldugu gorulur
* Login Butonuna tiklanir
* login Sayfasinin acildigi gorulur
* Oturum Acma Sayfasinde Logo-Email-Password-Login Butonu - Login FB ve Sifremi Unuttum Alanlari Gorulur

Kayit Ol Sayfasinin Acilmasi
----------------
* Login Ekraninda Logo,Giris butonu ve Kayit ol butonu oldugu gorulur
* Register Butonuna tiklanir
* Register Sayfasinin acildigi gorulur
* Register sayfasinde Usurname,Email,Password alanlari ve RegisterNow butonun yer aldigi gorulur


Forgot Password
----------------
* Login Ekraninda Logo,Giris butonu ve Kayit ol butonu oldugu gorulur
* Login Butonuna tiklanir
* login Sayfasinin acildigi gorulur
* Oturum Acma Sayfasinde Logo-Email-Password-Login Butonu - Login FB ve Sifremi Unuttum Alanlari Gorulur
* Forgot Password e tiklanir
* Sifreniz Email adresinize gonderilmistir mesaji geldigi gorulur



Kayit Olma Pozitif
--------------------------
* Login Ekraninda Logo,Giris butonu ve Kayit ol butonu oldugu gorulur
* Register Butonuna tiklanir
* Register Sayfasinin acildigi gorulur
* Register sayfasinde Usurname,Email,Password alanlari ve RegisterNow butonun yer aldigi gorulur
* Kullanıcı adı alanına "TestUser12312" yazılır
* Email alanına "deneme1231@gmail.com" yazılır
* Password alanına "123456789" yazılır
* Passwordun 5 karakterden uzun oldugu kontrol edilir
* Kullanici adi ve sifrenin farkli oldugu gorulur
* Kayit ol sayfasinda Register Now butonuna tiklanir
* Basarili register mesajı gorulur
* Kayit sonrasi çikan OK butonuna tiklanir

Kayit Olma Negatif Kullanici Adi ve Sifre Ayni
-------------------------------------------
* Login Ekraninda Logo,Giris butonu ve Kayit ol butonu oldugu gorulur
* Register Butonuna tiklanir
* Register Sayfasinin acildigi gorulur
* Register sayfasinde Usurname,Email,Password alanlari ve RegisterNow butonun yer aldigi gorulur
* Kullanıcı adı alanına "TestUser121232" yazılır
* Email alanına "deneme1123123@gmail.com" yazılır
* Password alanına "TestUser12312" yazılır
* Passwordun 5 karakterden uzun oldugu kontrol edilir
* Kayit ol sayfasinda Register Now butonuna tiklanir
* Kullanici adi ve sifrenin ayni olmasi durumunda hata mesaji verdigi gorulur


Kayit Olma Negatif Senaryo Sifre Karakter Sayisi 5 den az
--------------------------------------------------------
* Login Ekraninda Logo,Giris butonu ve Kayit ol butonu oldugu gorulur
* Register Butonuna tiklanir
* Register Sayfasinin acildigi gorulur
* Register sayfasinde Usurname,Email,Password alanlari ve RegisterNow butonun yer aldigi gorulur
* Kullanıcı adı alanına "TestUser12312" yazılır
* Email alanına "deneme1231@gmail.com" yazılır
* Password alanına "123" yazılır
* Kayit ol sayfasinda Register Now butonuna tiklanir
* Passwordun 5 karakterden az girildiginde hata mesajı verdigi gorulur
