public class Circulo extends Figura{

    private double raio;

    public Circulo(String nome, String cor, double raio) {
        super(nome, cor);

        if(raio <= 0){
            throw new RuntimeException("O raio não pode ser menor ou igual a zero");
        }

        this.raio=raio;
    }

    @Override
    public double CalcularArea() throws FiguraException {
        if(raio%2 !=0){
            throw new FiguraException("O valor do raio não pode ser um número ímpar");
        }
        return Math.PI * Math.pow(getRaio(),2);
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }


}
