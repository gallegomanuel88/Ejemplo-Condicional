package ejemplocondicional;

import javax.swing.JOptionPane;

/**
 *
 * @author galle
 */
public class Comparar {
    public int pedirNumEntero1 (){
    int num;
    String res = JOptionPane.showInputDialog("teclea primer numero");
    num = Integer.parseInt(res);
    return num;
    }
    //Lo mismo de antes pero de una tacada.
    public int pedirNumEntero2 (){
    return (Integer.parseInt(JOptionPane.showInputDialog("teclea segundo numero")));
    }
    public void comparar (int num1, int num2){
    if (num1>num2)
            System.out.println("el mayor es "+num1);
    else if (num2>num1)
            System.out.println("el mayor es "+num2);
    else 
            System.out.println("son iguales ");
    }
}