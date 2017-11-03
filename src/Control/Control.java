package Control;

import Model.Usuario;
import View.MenuUI;

public class Control {

    private Usuario usuario;
    private MenuUI menu;

    public void salvar() {

        /*     Aqui eu pego os valores dos inputs do usuário e coloco nas variáveis "nome", "idade" e "CPF". */
        usuario.setNome(menu.id_input_nome.getText());
        usuario.setIdade(Integer.parseInt(menu.id_input_idade.getText()));
        usuario.setCpf(menu.id_input_cpf.getText());

        /*IDADE */
        menu.id_text_suaIdade.setText("Você tem: ");
        menu.id_text_anos.setText(usuario.getIdade() + " anos");

        /*CPF */
        menu.id_text_seucpf.setText("Seu CPF é: ");
        menu.id_text_cpf.setText(usuario.getCpf());

        /*      Verificação se o usuário é Masculino ou Feminino */

 /*      Pergunto a cada RadioButton se está selecionado */
        if (menu.id_radio_Masc.isSelected()) {
            /*     Caso o usuário seja Masculino, os valores das labels serão diferentes. */

        /*NOME */
        menu.id_text_seuNome.setText("Você é o: ");
        menu.id_text_nome.setText(usuario.getNome());

        /*SEXO */
        menu.id_text_seuSexo.setText("Seu sexo é: ");
        menu.id_text_sexo.setText("Masculino");

        } else if (menu.id_radio_Fem.isSelected()) {
            /*     Caso o usuário seja Feminino, os valores das labels serão diferentes. */

        /*NOME */
        menu.id_text_seuNome.setText("Você é a: ");
        menu.id_text_nome.setText(usuario.getNome());

        /*SEXO */
        menu.id_text_seuSexo.setText("Seu sexo é: ");
        menu.id_text_sexo.setText("Feminino");
        }
    }
}
