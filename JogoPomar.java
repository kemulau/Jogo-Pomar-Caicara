import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class JogoPomar {
    public static void main(String[] args) {
        List<Arvore> arvores = new ArrayList<>();
        arvores.add(new ArvoreFrutifera("Pitangueira", "Árvore que produz a pitanga, fruta vermelha e de sabor ácido.", "Mata Atlântica, especialmente no litoral."));
        arvores.add(new ArvoreFrutifera("Araçazeiro", "Árvore que produz o araçá, fruto semelhante à goiaba.", "Áreas costeiras e de restinga."));
        arvores.add(new ArvoreFrutifera("Cambucizeiro", "Árvore que produz o cambuci, fruto de sabor ácido utilizado em sucos e geleias.", "Florestas da Mata Atlântica."));
        arvores.add(new ArvoreFrutifera("Grumixameira", "Árvore que produz a grumixama, fruta doce e suculenta.", "Mata Atlântica e regiões úmidas."));
        arvores.add(new ArvoreFrutifera("Guabirobeira", "Árvore que produz a guabiroba, fruto pequeno consumido em sucos.", "Florestas e áreas de transição."));
        arvores.add(new ArvoreNaoFrutifera("Figueira", "Árvore simbólica da Mata Atlântica, seus frutos não são comestíveis.", "Mata Atlântica e regiões tropicais."));
        arvores.add(new ArvoreNaoFrutifera("Cedro", "Árvore de madeira nobre, muito utilizada em construções.", "Florestas tropicais e subtropicais."));
        arvores.add(new ArvoreNaoFrutifera("Ipê", "Árvore ornamental conhecida por suas flores coloridas.", "Regiões abertas e florestas tropicais."));
        arvores.add(new ArvoreNaoFrutifera("Pinho", "Árvore típica da região sul, conhecida como araucária.", "Regiões de altitude e clima frio."));

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int pontos = 0;

        System.out.println("Bem-vindo ao Jogo do Pomar Caiçara!");
        System.out.println("Identifique se a árvore é frutífera ou não. (Digite 'sim' ou 'não')");
        System.out.println("Após responder, você verá mais informações sobre a árvore. Boa sorte!");

        for (int i = 0; i < 5; i++) {
            Arvore arvore = arvores.get(random.nextInt(arvores.size()));
            System.out.println("\nÁrvore: " + arvore.getNome());
            System.out.print("É frutífera? ");
            String resposta = scanner.nextLine().trim().toLowerCase();

            if ((resposta.equals("sim") && arvore.isFrutifera()) || (resposta.equals("não") && !arvore.isFrutifera())) {
                System.out.println("Correto!");
                pontos++;
            } else {
                System.out.println("Errado! A resposta correta era: " + (arvore.isFrutifera() ? "sim" : "não"));
            }

            System.out.println("Descrição: " + arvore.getDescricao());
            System.out.println("Habitat: " + arvore.getHabitat());
        }

        System.out.println("\nFim do jogo! Você fez " + pontos + " ponto(s).");
        scanner.close();
    }
}
