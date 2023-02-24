## Pasos a seguir:
### Creamos un fichero llamado docs y ahí guardamos el JavaDoc
- 1 Primer paso:

         private static Float resultado = null;
            static final int SUMA = 1;
            static final int RESTA = 2;
            static final int MULTIPLICACION = 3;
            static final int DIVISION = 4;  
            static final int RAIZCUADRADA = 5;
            static final int RAIZCUALQUIERA = 6;

- 2 Segundo paso:
            
      public static Float realizar(int device, float num1, float num2){

          switch (device){
              case SUMA:
                  try{
                      resultado = num1 + num2;
                  }catch (Exception e){
                      System.out.println("Error");
                  }
                  break;
              case RESTA:
                  try{
                      resultado = num1 - num2;
                  }catch (Exception e){
                      System.out.println("Error");
                  }
                  break;
              case MULTIPLICACION:
                  try{
                      resultado = num1*num2;
                  }catch (Exception e){
                      System.out.println("Error");
                  }
                  break;
              case DIVISION:
                  try{
                      resultado = num1/num2;
                  }catch (Exception e){
                      System.out.println("Error");
                  }
                  break;
          }
          return resultado;
      }
- 3 Creamos el JAVADOC

      El JavaDoc se usa para poder hacer más entendible nuestro programa.
- 4 Importamos nuestra librería llamada 'MiLibreria'.

      1 file - project structure, le damos a libreries, añadimos el .jar.

### Y así ya tendríamos hecho este proyecto.
        