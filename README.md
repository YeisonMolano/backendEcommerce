# backendEcommerce
En este apartado se encuentra el backend de la aplicacion en donde realizamos los respectivos endpoints para realizar peticiones HTTP, esta diseñado 
en arquitectura MVC. Cuenta con tres clases las cuales funcionan como entidades de conexion hacia la base de datos, se crea un microservicio de Producto,
con su respectivo repositorio, y su crud, al mismo tiempo una clase persona en donde van a estar todos los datos de compradores y administradores 
(Si hay un registro previo), por ultimo se cuenta con un clase pedido que es la encargada de ver todo el stock del producto que queda luego de que se realiza una
compra.
Se desarrolla con Java utilizando SpringBoot, con JDk 17, para la parte de la base de datos se utiliza WorkBench (MySql).

Se adjuntan una serie de pruebas realizadas con Postman.
Producto
Obtener todos los productos
<img width="649" alt="image" src="https://user-images.githubusercontent.com/105460971/234432405-60d65fa6-2842-4732-b1c5-4247afb7bdde.png">


Agregar un nuevo producto}

<img width="506" alt="image" src="https://user-images.githubusercontent.com/105460971/234432721-8544d703-ed37-4157-b5b5-2b8a79fd5a3c.png">
<img width="516" alt="image" src="https://user-images.githubusercontent.com/105460971/234432779-3b6b4e50-4744-4828-804d-36fbda9c8eb8.png">

Editar o actualizar un producto

<img width="617" alt="image" src="https://user-images.githubusercontent.com/105460971/234432909-9d7b563e-0fd2-4a81-88fd-309f4ae4d459.png">

Eliminar un producto

<img width="665" alt="image" src="https://user-images.githubusercontent.com/105460971/234432960-5908bbb5-66a9-4c1f-ae96-802bdede35e4.png">


Persona
Obtenemos las personas

<img width="439" alt="image" src="https://user-images.githubusercontent.com/105460971/234433631-56c98525-5250-4ac8-b7a7-8e9c98f1046c.png">

Añadir una nueva persona

<img width="432" alt="image" src="https://user-images.githubusercontent.com/105460971/234433777-081a6c65-c8aa-4ccc-8a93-ca89e074f2ed.png">
<img width="333" alt="image" src="https://user-images.githubusercontent.com/105460971/234433824-ccd80981-1eab-4e37-8893-357e352c95f9.png">

Editar o actualizar datos de una persona

<img width="439" alt="image" src="https://user-images.githubusercontent.com/105460971/234433903-547b3bbf-2213-484a-8411-bf79fcb88a4b.png">

Eliminar una persona por identificación

<img width="673" alt="image" src="https://user-images.githubusercontent.com/105460971/234433958-ed706333-ca2f-4bd6-b8e0-2d3bca8b8d89.png">


Pedido
La parte del pedido se hace segun el carrito de compras de la persona y se guarda con llaves foraneas de cada uno de los productos, con el mismo comprador

<img width="702" alt="image" src="https://user-images.githubusercontent.com/105460971/234434160-d16c167d-01c1-4118-a885-8a94ad186410.png">

Se puede realizar el respectivo CRUD
