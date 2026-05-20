package variaveis;

public class CadastroLivro {
    public static void main(String[] args) {

        String titulo = "O Pequeno Príncipe";
        String autor = "Antoine de Saint-Exupéry";
        int paginas = 96;
        double preco = 29.90;
        char categoria = 'F';

        String descricaoCategoria;

        switch (categoria) {
            case 'F':
                descricaoCategoria = "Ficção";
                break;
            case 'N':
                descricaoCategoria = "Não-ficção";
                break;
            case 'T':
                descricaoCategoria = "Tecnologia";
                break;
            case 'H':
                descricaoCategoria = "História";
                break;
            default:
                descricaoCategoria = "Desconhecida";
        }

        System.out.println("Livro cadastrado: \"" + titulo + "\", de " + autor +
                ". Ele possui " + paginas + " páginas, custa R$ " + preco +
                " e pertence à categoria " + descricaoCategoria + ".");
    }
}
