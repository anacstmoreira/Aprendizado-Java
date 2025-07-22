package Pessoal;
import java.util.ArrayList;
import java.util.List;

public class Usuario {

    private String nome;
    private String cpf;
    private String endereco;
    private String login;
    private String senha;
    private String cartao;
    //Usando arraylist pra que 1 usuario possa ter mais de um Animal, e/ou Reserva, o arraylist é pra ser dinamico na hora de add ou retirar
    private List<Animal> animais;
    private List<Reserva> historicoDeReserva;

    public Usuario(String nome, String cpf, String endereco, String login, String senha, String cartao) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.login = login;
        this.senha = senha;
        this.cartao = cartao;
        this.animais = new ArrayList<>();
        this.historicoDeReserva = new ArrayList<>();
        System.out.println(nome + "sua conta foi criada com sucesso!");
    }

    public void atualizarDados(String nome, String cpf, String endereco, String login, String senha, String cartao){
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.login = login;
        this.senha = senha;
        this.cartao = cartao;
        System.out.println("Dados atualizados com sucesso");
    }

    public boolean fazerLogin(String login, String senha) {
        return this.login.equals(login) && this.senha.equals(senha);
    }

    // Metodo com verificaçao pra não haver caso de animais repetidos
    public void adicionarAnimal(Animal animal) {
        boolean jaExiste = false;
        for (Animal animall : animais) {
            // Comparando os atributos de animal pra verificar se já estão do ArrayList
            if (animall.getNome().equals(animal.getNome()) &&
                    animall.getRaca().equals(animal.getRaca()) &&
                    animall.getIdade() == animal.getIdade()) {
                jaExiste = true;
                break;
            }
        }
        if (jaExiste) {
            System.out.println("Animal já cadastrado.");
        } else {
            animais.add(animal);
            System.out.println("Animal adicionado com sucesso.");
        }
    }

    // O metodo tem uma verificaçao pra ter um retorno caso não ache o animal do parâmetro
    public void removerAnimal(Animal animal) {
        Animal encontrado = null;

        for (Animal animall : animais) {
            if (animall.getNome().equals(animal.getNome()) &&
                    animall.getRaca().equals(animal.getRaca()) &&
                    animall.getIdade() == animal.getIdade()) {
                encontrado = animall;
                break;
            }
        }
        if (encontrado != null) {
            animais.remove(encontrado);
            System.out.println("Animal removido com sucesso.");
        } else {
            System.out.println("Animal não encontrado.");
        }
    }

    public void fazerReserva(Reserva novaReserva) {
        boolean conflito = false;
        // Pra não adicionar direto, o for vai ser usado pra comparar se a reserva que estamos fazendo já existe no historico
        for (Reserva reservaExistente : historicoDeReserva) {
            if (reservaExistente.getQuarto().equals(novaReserva.getQuarto())) {
                //Aqui vai verificar se existe conflito, se existir vai retornar True
                boolean datasConflitantes =
                        !novaReserva.getDataCheckout().before(reservaExistente.getDataCheckin()) &&
                                !novaReserva.getDataCheckin().after(reservaExistente.getDataCheckout());

                if (datasConflitantes) {
                    conflito = true;
                    break;
                }
            }
        }

        if (conflito) {
            System.out.println("Erro: já existe uma reserva para este quarto nesse intervalo de datas.");
        } else {
            historicoDeReserva.add(novaReserva);
            System.out.println("Reserva realizada com sucesso.");
        }
    }


    public void listarHistoricoReservas() {
        if (historicoDeReserva.isEmpty()) {
            System.out.println("Nenhuma reserva encontrada.");
        } else {
            for (Reserva reserva : historicoDeReserva) {
                System.out.println(reserva);
            }
        }
    }

    //Uma toString pra exibir algumas informaçoes
    @Override
    public String toString() {
        return "Usuário: " + nome +
                ", CPF: " + cpf +
                ", Endereço: " + endereco +
                ", Animais: " + animais.size() +
                ", Reservas: " + historicoDeReserva.size();
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }

    public String getEndereco() { return endereco; }
    public void setEndereco(String endereco) { this.endereco = endereco; }

    public List<Animal> getAnimais() { return animais; }

    public List<Reserva> getHistoricoDeReserva() { return historicoDeReserva; }

    public String getLogin() { return login; }
    public void setLogin(String login) { this.login = login; }

    public String getSenha() { return senha; }
    public void setSenha(String senha) { this.senha = senha; }

    public String getCartao() { return cartao; }
    public void setCartao(String cartao) { this.cartao = cartao; }
}
