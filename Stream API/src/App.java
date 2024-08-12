import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class App {
  public static void main(String[] args) throws Exception {
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, 15);

    // Default umeric order
    List<Integer> numerosOrdenados = numeros.stream().sorted().toList();

    System.out.println("Numeros ordenados: " + numerosOrdenados);

    // Even items sum
    List<Integer> numerosPares = numeros.stream().filter(numero -> numero % 2 == 0).toList();

    Integer somaPares = numerosPares.stream().reduce(0, (a, b) -> a + b);

    System.out.println("Soma dos pares: " + somaPares);

    // Is all numbers >= 0?
    Predicate<Integer> ePositivo = num -> num >= 0;

    System.out.println("Todos os numeros sao positivos? " + numeros.stream().allMatch(ePositivo));

    // Remove all Odds
    List<Integer> numerosImpares = numeros.stream().filter(numero -> numero % 2 != 0).toList();

    System.out.println("Lista sem impares: " + numerosImpares);

    // Arithmetic mean of items > 5
    List<Integer> numerosMaioresQ5 = numeros.stream().filter(numero -> numero > 5).toList();

    Integer mediaMaiorQ5 =
        numerosMaioresQ5.stream().reduce(0, (a, b) -> a + b) / numerosMaioresQ5.size();

    System.out.println("Media dos maiores que 5: " + mediaMaiorQ5);

    // Is there a number higher than 10?
    Predicate<Integer> temMaiorQ10 = num -> num > 10;

    System.out.println("Existe numero maior que 10? " + numeros.stream().anyMatch(temMaiorQ10));

    // Find the second highest number
    Integer segundoMaior =
        numeros.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();

    System.out.println("Segundo maior numero: " + segundoMaior);

    // Sum all items
    Integer soma = numeros.stream().reduce(0, (a, b) -> a + b);

    System.out.println("Soma dos numeros: " + soma);

    // All items are distincts?
    boolean todosDistintos = numeros.stream().distinct().count() == numeros.size();

    System.out.println("Todos os numeros sao distintos? " + todosDistintos);

    // Set all odd items multiples by 3 or 5
    List<Integer> numerosMultiplos3ou5 =
        numerosImpares.stream().filter(num -> num % 3 == 0 || num % 5 == 0).toList();

    System.out.println("Numeros multiplos de 3 ou 5: " + numerosMultiplos3ou5);

    // Find all items squares
    List<Integer> numerosAoQuadrado = numeros.stream().map(num -> num * num).toList();

    System.out.println("Numeros ao quadrado: " + numerosAoQuadrado);

    // Filter list within a interval
    int inicio = 3;
    int fim = 7;

    Predicate<Integer> intervalo = num -> num >= inicio && num <= fim;

    List<Integer> numerosFiltrados = numerosOrdenados.stream().filter(intervalo).toList();

    System.out.println(
        "Numeros dentro do intervalo " + inicio + " e " + fim + ": " + numerosFiltrados);

    // Find the highest number
    System.out.println("Maior numero: " + numeros.stream().max(Comparator.naturalOrder()).get());

    // Find any negative number

    System.out.println("Existe numero negativo? " + numeros.stream().anyMatch(ePositivo.negate()));

    // Agroup numbers in Even and Odd
    System.out.println("Pares: " + numerosPares);
    System.out.println("Impares: " + numerosImpares);

    // FIlter prime items
    Predicate<Integer> ePrimo =
        num -> {
          for (int i = 2; i < num; i++) {
            if (num % i == 0) {
              return false;
            }
          }
          return true;
        };

    List<Integer> numerosPrimos = numeros.stream().filter(ePrimo).toList();

    System.out.println("Numeros primos: " + numerosPrimos);

    // All items are equals?
    System.out.println(
        "Todos os numeros sao iguais? " + numeros.stream().allMatch(num -> num == numeros.get(0)));

    // Set all odd items multiples by 3 and 5 and sum them
    List<Integer> numerosMultiplos3e5 =
        numerosImpares.stream().filter(num -> num % 3 == 0 && num % 5 == 0).toList();

    Integer somaMultiplos3e5 = numerosMultiplos3e5.stream().reduce(0, (a, b) -> a + b);

    System.out.println("Soma dos multiplos de 3 e 5: " + somaMultiplos3e5);
  }
}
