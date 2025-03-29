package QuartoCurso.Screenmatch.principal;

import QuartoCurso.Screenmatch.excecao.ErroDeConversaoDeAnoException;
import QuartoCurso.Screenmatch.modelos.Titulo;
import QuartoCurso.Screenmatch.modelos.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner entrada = new Scanner(System.in);
        String leitura = "";
        List<Titulo> titulos = new ArrayList<>();

        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).setPrettyPrinting().create();

        while (!leitura.equalsIgnoreCase("sair")) {

            System.out.print("Qual filme você deseja obter informações?: ");
            leitura = entrada.nextLine();

            if(leitura.equalsIgnoreCase("sair")){
                break;
            }
            //Esse replace é para buscar filmes contendo espaço em branco no nome
            String endereco = "https://www.omdbapi.com/?t=" + leitura.replace(" ", "+") + "&apikey=619610d";

            try {
                //Faz uma requisição:
                HttpClient client = HttpClient.newHttpClient(); //Pede
                HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).build();//Pra onde é a requisição?

                //Resposta da requisição - um JSON:
                HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

                //Imprime
                String json = response.body();
                System.out.println(json);

                TituloOmdb meuTituloOmdb = gson.fromJson(json, TituloOmdb.class);
                System.out.println(meuTituloOmdb);

                Titulo meuTitulo = new Titulo(meuTituloOmdb); //Meu título(da minha classe)
                System.out.println("Título já convertido!");
                System.out.println(meuTitulo);

                titulos.add(meuTitulo);
                //FileWriter escrita = new FileWriter("filmes.txt"); //Escreve o arquivo
                //escrita.write(meuTitulo.toString()); //Pega a representação textual e escreve
                //escrita.close(); //Acabei de escrever o arquivo
            } catch (NumberFormatException e) {
                System.out.println("Aconteceu um erro!");
                System.out.println("--> " + e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println("Algum erro de argumento na busca, verifique o endereço");
            } catch (ErroDeConversaoDeAnoException e) { //EXCEÇÃO MAIS GENÉRICA
                System.out.println(e.getMessage());
            }
        }
        System.out.println(titulos);
        FileWriter escrita = new FileWriter("filmes.json");
        escrita.write(gson.toJson(titulos));
        escrita.close();
        System.out.println("O programa foi finalizado!");
    }
}
