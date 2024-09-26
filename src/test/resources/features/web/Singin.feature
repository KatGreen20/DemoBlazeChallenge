#language: es
  @DemoBlaze
  Característica: DemoBlaze

    @Singin
    Escenario: Registro
      Dado soy un usuario de DemoBlaze sin credenciales
      Cuando ingreso informacion necesaria para creacion de usuario
      Entonces se realiza el registro exitoso


    @Cart
    Esquema del escenario: Login con Carrito y agregar productos
      Dado que soy un usuario de DemoBlaze
      Cuando agrego el producto "<producto>" al carrito
      Y ingreso para verificar carrito
      Entonces verifico que el producto "<producto>" se encuentre agregado
      Y finalizo la compra verificada
      Ejemplos:
        | producto          |
        | Samsung galaxy s6 |
        | Nokia lumia 1520  |



