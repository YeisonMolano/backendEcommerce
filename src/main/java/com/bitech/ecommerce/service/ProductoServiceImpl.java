package com.bitech.ecommerce.service;

import com.bitech.ecommerce.modells.Producto;
import com.bitech.ecommerce.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;
@Service
public class ProductoServiceImpl implements ProductoService{
    @Autowired
    private ProductoRepository productoRepository;

    @Override
    public Producto newProducto(Producto newProducto) {
        return this.productoRepository.save(newProducto);
    }

    @Override
    public Optional<Producto> ifExist(Long idProducto) {
        Optional<Producto> producto = this.productoRepository.findById(idProducto);
        return producto;
    }

    @Override
    public void deleteProductoById(Long idProducto) {
        this.productoRepository.deleteById(idProducto);
    }

    @Override
    public Producto updateProducto(Producto productoNew) {
        Optional<Producto> producto = this.ifExist(productoNew.getIdProducto());
        if(producto != null){
            producto.get().setNombreProducto(productoNew.getNombreProducto());
            producto.get().setStock(productoNew.getStock());
            producto.get().setFoto(productoNew.getFoto());
            producto.get().setReferencia(productoNew.getReferencia());
            producto.get().setCategoria(productoNew.getCategoria());
            return this.productoRepository.save(producto.get());
        }else{
            return null;
        }
    }

    @Override
    public Iterable<Producto> getAll() {
        return this.productoRepository.findAll();
    }

    @Override
    @Transactional
    public void compraRealizada(int cantidad, Long id){
        this.productoRepository.restarCantidad(id, cantidad);
    }
}
