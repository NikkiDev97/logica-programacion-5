import java.util.*;
public class Main {
  public static void main(String[] args) {

    Map<String, String> diccionario = new HashMap<>();

    diccionario.put("clase", "class");
    diccionario.put("objeto", "object");
    diccionario.put("método", "method");
    diccionario.put("función", "function");
    diccionario.put("atributo", "attribute");
    diccionario.put("herencia", "inheritance");
    diccionario.put("polimorfismo", "polymorphism");
    diccionario.put("interfaz", "interface");
    diccionario.put("sobrecarga", "overload");
    diccionario.put("sobrescritura", "override");
    diccionario.put("algoritmo", "algorithm");
    diccionario.put("bucle", "loop");
    diccionario.put("condicional", "conditional");
    diccionario.put("base de datos", "database");
    diccionario.put("servidor", "server");
    diccionario.put("biblioteca", "library");
    diccionario.put("despliegue", "deployment");
    diccionario.put("entorno", "environment");
    diccionario.put("desarrollo", "development");
    diccionario.put("rendimiento", "performance");

    Random random = new Random();

    List<String> palabrasEspannol = new ArrayList<>(diccionario.keySet());
    List<String> palabrasSeleccionadas = new ArrayList<>();

    for (int i = 0; i < 5; i++) {
      int randomIndex = random.nextInt(palabrasEspannol.size());
      palabrasSeleccionadas.add(palabrasEspannol.get(randomIndex));
      palabrasEspannol.remove(randomIndex);
    }

    Scanner scanner = new Scanner(System.in);
    int respuestasCorrectas = 0;
    int respuestasIncorrectas = 0;

    for (String palabra : palabrasSeleccionadas) {
      System.out.println("Traduce la palabra: " + palabra);
      String traduccion = scanner.nextLine();

      if (diccionario.get(palabra).equalsIgnoreCase(traduccion)) {
        respuestasCorrectas++;
      } else {
        respuestasIncorrectas++;
      }
    }
    System.out.println("Respuestas correctas: " + respuestasCorrectas);
    System.out.println("Respuestas incorrectas: " + respuestasIncorrectas);

    scanner.close();
  }
}