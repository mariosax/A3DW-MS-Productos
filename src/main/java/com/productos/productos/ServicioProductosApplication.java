package com.productos.productos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient // Habilita el cliente de Eureka
public class ServicioProductosApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServicioProductosApplication.class, args);
    }
}
