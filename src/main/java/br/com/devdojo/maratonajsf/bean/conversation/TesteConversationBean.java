package br.com.devdojo.maratonajsf.bean.conversation;

import javax.enterprise.context.Conversation;
import javax.enterprise.context.ConversationScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

@Named
@ConversationScoped
//Transient
public class TesteConversationBean implements Serializable {

    private List<String> personagens;
    private List<String> personagemSelecionado = new ArrayList<>();

    @Inject
    private Conversation conversation;

    public void init(){
        System.out.println("Entrou no post construct do conversationScoped");
        personagens = Arrays.asList("GokuConversation", "VegetaConv", "GohanConv");
        if (conversation.isTransient()){
            //Long Run
            conversation.begin();
            System.out.println("Iniciando conversation scoped, ID =" + conversation.getId());
        }
    }

    public void endConversation(){
        if (!conversation.isTransient()){
            conversation.end();
        }
    }

    public void selecionaPersonagem(){
        int index = ThreadLocalRandom.current().nextInt(3);
        String personagem = personagens.get(index);
        personagemSelecionado.add(personagem);
    }

    public List<String> getPersonagens() {
        return personagens;
    }

    public void setPersonagens(List<String> personagens) {
        this.personagens = personagens;
    }

    public List<String> getPersonagemSelecionado() {
        return personagemSelecionado;
    }

    public void setPersonagemSelecionado(List<String> personagemSelecionado) {
        this.personagemSelecionado = personagemSelecionado;
    }

}
