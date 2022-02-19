package com.ustasoft.carapp.repository;

import com.ustasoft.carapp.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CarRepository extends JpaRepository<Car, Long> {

   List<Car> findByBrand(String brand);
   List<Car> findByColor(String color);
   List<Car> findByYear(int year);


   //burada ki sorguyu entitylere soruyoruz
    @Query("select c from Car c where c.year > ?1")
    List<Car> yıldanSonrakiArabalarıGetir(int year);

    //bu normal veritabanı sorgusu
    @Query(value = "select * from Cars where year > ?1",nativeQuery = true)
    List<Car> yıldanSonrakiArabalarıGetirNative(int year);

}
