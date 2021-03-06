import javax.swing.JOptionPane;
/**
 *
 * @author Marcio Pedro Schiehl and Ricardo Borba
 */
public class CadastroFuncionario {

    int atual = 0;

    String nomes[] = new String[100];
    String dataNascimentos[] = new String[100];
    String cpfs[] = new String[100];
    String telephones[] = new String[100]; //telefone
    String mobilephones[] = new String[100]; //celular
    String ufs[] = new String[100]; //bairro
    String cities[] = new String[100]; //Cidades
    String neighborhoods[] = new String[100];//Bairros
    String places[] = new String[100]; // lougradouros
    String numbers[] = new String[100]; //numeros
    String addOns[] = new String[100];// complementos

    public void solicitaInformacaoFuncionario(int posicao) {
        nomes[posicao] = JOptionPane.showInputDialog(null,
                "Informe o nome do colaborador", "Loja de Celular", JOptionPane.QUESTION_MESSAGE);
        dataNascimentos[posicao] = JOptionPane.showInputDialog(null,
                "Informe a data de Nascimento", "Loja de Celular", JOptionPane
                .QUESTION_MESSAGE).replace(".", "").replace("-", "").replace("\\","").replace(",", "").replace("/", "");
        cpfs[posicao] = JOptionPane.showInputDialog(null,
                "Informe seu CPF", "Loja de Celular", JOptionPane
                .QUESTION_MESSAGE).replace(".", "").replace("-", "").replace("\\","").replace(",", "").replace("/", "");
        telephones[posicao] = JOptionPane.showInputDialog(null,
                "Informe o Telefone de Contatos", "Loja de Celular", JOptionPane
                .QUESTION_MESSAGE).replace(".", "").replace("-", "").replace("\\","").replace(",", "").replace("/", "");
        mobilephones[posicao] = JOptionPane.showInputDialog(null,
                "Informe o Celular", "Loja de Celular", JOptionPane
                .QUESTION_MESSAGE).replace(".", "").replace("-", "").replace("\\","").replace(",", "").replace("/", "");
        ufs[posicao] = JOptionPane.showInputDialog(null,
                "Informe a Unidade Federativa (Estado)", "Loja de Celular", JOptionPane.QUESTION_MESSAGE);
        cities[posicao] = JOptionPane.showInputDialog(null,
                "Informe a cidade", "Loja de Celular", JOptionPane.QUESTION_MESSAGE);
        neighborhoods[posicao] = JOptionPane.showInputDialog(null,
                "Informe bairro", "Loja de Celular", JOptionPane.QUESTION_MESSAGE);
        places[posicao] = JOptionPane.showInputDialog(null,
                "Informe o lougradouro", "Loja de Celular", JOptionPane.QUESTION_MESSAGE);
        numbers[posicao] = JOptionPane.showInputDialog(null,
                "Informe o Numero", "Loja de Celular", JOptionPane.QUESTION_MESSAGE);
        addOns[posicao] = JOptionPane.showInputDialog(null,
                "Complementos", "Loja de Celular", JOptionPane.QUESTION_MESSAGE);
    }
    public void editar(){
       String buscar = JOptionPane.showInputDialog("Digite o nome para editar");
        for (int i = 0; i<atual;i++){
            if (nomes[i].equals(buscar)){
                solicitaInformacaoFuncionario(i);
                return;
            }
        }
    }

    public void cadastrarFuncionario() {
        solicitaInformacaoFuncionario(atual);
        atual++;
    }

    public void buscarNomeFuncionario() {
        String busca = JOptionPane.showInputDialog("Digite o nome parcial para a busca");

        for (int i = 0; i < atual; i++) {
            if (nomes[i].contains(busca)) {
                apresentarInformacaoFuncionario(i);
            }
        }

    }
    public void funcionarioMaiorNome(){
        int tam = 0;
        String maiorNome = "";
        for (int i=0; i<atual; i++) {
            if(tam < nomes[i].length()){
                maiorNome = nomes[i];
            }
        }
            JOptionPane.showMessageDialog(null, "Maior nome é: " + maiorNome);
    }
     
    public void apresentarInformacaoFuncionario(int posicao) {
        JOptionPane.showMessageDialog(null, "Nome: " + nomes[posicao]
                + "\nData de Nascimento: " + dataNascimentos[posicao]
                + "\nTelefone: " + telephones[posicao]
                + "\nCelular: " + mobilephones[posicao]
                + "\nUnidade Federativa: " + ufs[posicao]
                + "\nCidade: " + cities[posicao]
                + "\nBairro: " + neighborhoods[posicao]
                + "\n" + places[posicao] + "   Numero: " + numbers[posicao]
                + "\nComplementos: " + addOns[posicao], "Loja de Celular",
                JOptionPane.PLAIN_MESSAGE);

    }
    public void apresentaMenuCadastro() {
        int menu2 = JOptionPane.showOptionDialog(null, "Clique na opção desejada",
                "Loja de Celular", 0, JOptionPane.PLAIN_MESSAGE, null,
                new Object[]{"Cadastro","Funcionario Maior nome", "Editar", "Buscar", "Sair"}, "Sair");
        if (menu2 == 0) {
            cadastrarFuncionario();
        }else if (menu2 == 1) {
            funcionarioMaiorNome();
        }else if (menu2 == 2) {
            editar();
        }else if (menu2 == 3) {
            buscarNomeFuncionario();
        }else if (menu2 == 4) {

        }

    }
}
