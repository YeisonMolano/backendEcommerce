package com.bitech.ecommerce.service;

import com.bitech.ecommerce.modells.Pedido;

import java.util.Optional;

public interface PedidoService {
    Pedido newPedido(Pedido newPedido);
    Optional<Pedido> ifExist(Long idPedido);
    void deletePedidoById(Long idPedido);
    Pedido updatePedido(Pedido pedido);
    Iterable<Pedido> getAll();
}
