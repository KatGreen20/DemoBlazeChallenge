#language: es
  @DemoBlaze
  Característica: DemoBlaze

    @Singin
    Escenario: Registro
      Dado soy un usuario de DemoBlaze sin credenciales
      Cuando ingreso informacion necesaria para creacion de usuario
      Entonces se realiza el registro exitoso


    @Cart
    Escenario: Login con Carrito
      Dado que soy un usuario de DemoBlaze
      Cuando agrego un celular al carrito
      Cuando ingreso para verificar carrito
      Entonces verifico que se encuentre agregado
      Y finalizo la compra verificada



