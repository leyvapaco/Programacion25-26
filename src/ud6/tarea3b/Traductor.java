package ud6.tarea3b;

import java.util.HashMap;

public class Traductor {

    private HashMap<String, String> diccionario;

    public Traductor() {
        diccionario = new HashMap<>();

        // Matriz bidimensional con palabras en español e inglés
        String[][] datos = {
            {"hola", "hello"},
            {"mundo", "world"},
            {"gracias", "thanks"},
            {"adios", "bye"},
            {"bueno", "good"},
            {"tú", "you"},
            {"eres", "are"},
            {"muy", "very"},
            {"feo", "ugly"},
        };
       
     // Cargar el HashMap
        for (int i = 0; i < datos.length; i++) {
            diccionario.put(
                datos[i][0].toLowerCase(),
                datos[i][1].toLowerCase()
            );
        }
        
        // Alternativa de carga del array al mapa
        for (String[] par : datos) {
            diccionario.put(par[0].toLowerCase(), par[1].toLowerCase());
        }
    }

    // Método para traducir una palabra o frase completa
    public String traducir(String texto) {
        String[] palabras = texto.toLowerCase().split(" ");
        StringBuilder resultado = new StringBuilder();

        for (String palabra : palabras) {
            if (diccionario.containsKey(palabra)) {
                resultado.append(diccionario.get(palabra));
            } else {
                // Si no existe en el diccionario, se pone sin traducir
                resultado.append(palabra);
            }
            resultado.append(" ");
        }
        //trim elimina espacios en blanco al principio y al final, y lo convierte en String
        return resultado.toString().trim();
    }

    // Ejemplo de uso
    public static void main(String[] args) {
        Traductor t = new Traductor();
        System.out.println(t.traducir("hola mundo"));
        System.out.println(t.traducir("gracias y adios"));
        System.out.println(t.traducir("buenos dias mundo"));
        System.out.println(t.traducir("Tú eres muy feo"));
    }
}
