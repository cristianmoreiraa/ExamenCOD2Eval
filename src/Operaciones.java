/**
 * Librería Operaciones Básicas
 * @author crist
 * @version 1.0
 */


public class Operaciones {
    /*
     * private static FLOAT Resultado
     */
    private static Float resultado = null;
    /*
     * Elegir sumar
     * static final int SUMA=1
     */
    static final int SUMA = 1;
    /*
     *Elegir resta
     * static final int RESTA=1
     */
    static final int RESTA = 2;
    /*
     * Elegir multiplicación
     * static final int MULTIPLICACION = 3
     */
    static final int MULTIPLICACION = 3;

    /**
     * Elegir division
     * static final int DIVISION = 4
     */
    static final int DIVISION = 4;
    /**
     * Elegir raíz cuadrada
     * static final int CUADRADA = 5
     */
    static final int CUADRADA = 5;

    /**
     * Elegir raíz cualquiera
     * static final int RAIZCUALQUIERA = 6
     */
    static final int RAIZCUALQUIERA = 6;

    /**
     * @param device --> [1,2,3,4,5,6] seleccionar Operacion  (SUMA, RESTA, MULTIPLICACIÓN, DIVISIÓN,CUADRADA, RAIZCUALQUIERA)
     * @param num1 --> primer número de la operación
     * @param num2 --> segundo número de la operación
     * @return resultado de la operacion
     */

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

            case CUADRADA:
                try{
                    resultado = (float) Math.sqrt(num1);
                }catch (Exception e ){
                    System.out.println("Error");
                }

            case RAIZCUALQUIERA:
                try{
                    resultado = (float) Math.pow(num1, 1.0/num2);
                }catch(Exception e ){
                    System.out.println("Error");
                }
                break;

        }
        return resultado;
    }
}