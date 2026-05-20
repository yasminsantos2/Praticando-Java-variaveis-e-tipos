package variaveis;

public class Viagem {
    public static void main(String[] args) {


                double consumoMedio = 12.5;
                double capacidadeTanque = 50;
                double combustivelAtual = 20;
                double distanciaViagem = 200;

                // Autonomia máxima
                double autonomiaMaxima = consumoMedio * capacidadeTanque;

                // Autonomia atual
                double autonomiaAtual = consumoMedio * combustivelAtual;

                // Resultado da viagem
                String resultado;

                if (autonomiaAtual >= distanciaViagem) {
                    resultado = "Você conseguirá completar a viagem sem precisar abastecer";
                } else {
                    resultado = "Você NÃO conseguirá completar a viagem sem abastecer";
                }

                // Saída
                System.out.println("Autonomia máxima do veículo: " + autonomiaMaxima + " km");
                System.out.println("Autonomia atual: " + autonomiaAtual + " km");
                System.out.println(resultado);
            }
        }
    

