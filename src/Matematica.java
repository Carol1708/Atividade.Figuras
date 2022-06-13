public class Matematica {

    public static void main(String[] args) {

        try {

            Retangulo r1 = new Retangulo("retângulo", "rosa", 3, 4);
            System.out.println(" A área do " + r1.getNome() + " " + r1.getCor() + " é igual a: " + r1.CalcularArea());

        } catch (RuntimeException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (FiguraException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        try {

            Circulo c1 = new Circulo("circulo", "branco", -5);
            System.out.println(" A área do " + c1.getNome() + " " + c1.getCor() + " é igual a: " + c1.CalcularArea());

        } catch (RuntimeException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (FiguraException e) {
            System.out.println("Erro: " + e.getMessage());
        }


        try {
            Triangulo t1 = new Triangulo("Triangulo", "amarelo", 4, 10);
            System.out.println(" A área do " + t1.getNome() + " " + t1.getCor() + " é igual a: " + t1.CalcularArea());

        } catch (RuntimeException e) {
            System.out.println("Erro: " + e.getMessage());
        }catch (FiguraException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
       }

