import javax.swing.JOptionPane;

class teste{
    public static void main (String[] args){
        for (int contador=3; contador >=1; contador--){
            int numero = Integer.parseInt(JOptionPane.showInputDialog("digite sua idade"));
            System.out.println(numero);
        }
    }
}