//Gabriel Joaquim e João Victor
public class CriaFuniconario {
    public static void main(String[] args) {
        Funcionario primeiroFuncionario = new Funcionario();
        primeiroFuncionario.nomeFuncionario = "Pedro Lima";
        primeiroFuncionario.cpfFuncionario = "1234567890";
        primeiroFuncionario.telefoneFuncionario = "008473892";
        primeiroFuncionario.salario = 1000.00F;
        primeiroFuncionario.cargoFuncionario = Cargo.Tecnico;

        System.out.println("Nome: " + primeiroFuncionario.nomeFuncionario);
        System.out.println("CPF: " + primeiroFuncionario.cpfFuncionario);
        System.out.println("Telefone: " + primeiroFuncionario.telefoneFuncionario);
        System.out.println("Salario: " + primeiroFuncionario.salario + " Reais");
        System.out.println("Cargo: " + primeiroFuncionario.cargoFuncionario);
    }
}
