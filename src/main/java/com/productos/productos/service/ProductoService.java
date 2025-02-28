package com.productos.productos.service;

import com.productos.productos.model.Producto;
import java.util.List;

public interface ProductoService {
    List<Producto> obtenerTodos();
    Producto obtenerPorId(Long id);
    Producto guardar(Producto producto);
    void eliminar(Long id);
}
