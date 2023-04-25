package com.bitech.ecommerce.service;

import com.bitech.ecommerce.modells.Pedido;
import com.bitech.ecommerce.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class PedidoServiceImpl implements PedidoService{
    @Autowired
    private PedidoRepository pedidoRepository;

    @Override
    public Pedido newPedido(Pedido newPedido) {
        return this.pedidoRepository.save(newPedido);
    }

    @Override
    public Optional<Pedido> ifExist(Long idPedido) {
        Optional<Pedido> pedido = this.pedidoRepository.findById(idPedido);
        return pedido;
    }

    @Override
    public void deletePedidoById(Long idPedido) {
        this.pedidoRepository.deleteById(idPedido);
    }

    @Override
    public Pedido updatePedido(Pedido pedidoNew) {
        Optional<Pedido> pedido = this.ifExist(pedidoNew.getIdPedido());
        if(pedido != null){
            pedido.get().setProductos(pedidoNew.getProductos());
            return this.newPedido(pedido.get());
        }else{
            return null;
        }
    }

    @Override
    public Iterable<Pedido> getAll() {
        return this.pedidoRepository.findAll();
    }
}
