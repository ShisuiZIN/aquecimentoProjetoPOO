package aquecimentoProjetoPOO;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		Persistencia p=new Persistencia();
		CentralDeInformacoes cdi=new CentralDeInformacoes();
		cdi=p.recuperarCentral("cdi.xml");		
		for(String opcao = null;opcao!="S";) {
			System.out.println("Informe a sua opção: ");
			System.out.println(" 1- Novo aluno\n 2- Listar todos os alunos\n 3- Exibir informações de um aluno específico\n S- Sair");
			opcao=input.nextLine();
			if(opcao.equals("1")) {
				System.out.println("Informe o nome do aluno: ");
				String nome=input.nextLine();
				System.out.println("Informe o sexo do aluno: ");
				String sexo=input.nextLine().toUpperCase();
				System.out.println("Informe a matricula do aluno: ");
				String matricula=input.nextLine();
				System.out.println("Informe o email do aluno: ");
				String email=input.nextLine();
				System.out.println("Informe a senha do aluno: ");
				String senha=input.nextLine();
				Aluno aluno =new Aluno(nome, sexo, matricula, email, senha);
				cdi.adicionarAluno(aluno);
				p.salvarCentral(cdi,"cdi.xml");
			}else if(opcao.equals("2")) {
				System.out.println(cdi.getTodosOsAlunos());
			}else if(opcao.equals("3")) {
				System.out.println("Informe a matricula do aluno: ");
				String matricula=input.nextLine();
				System.out.println(cdi.recuperarAlunoPorMatricula(matricula).getNome()+"\n"+cdi.recuperarAlunoPorMatricula(matricula).getSexo()+"\n"+cdi.recuperarAlunoPorMatricula(matricula).getMatricula()+"\n"+cdi.recuperarAlunoPorMatricula(matricula).getEmail()+"\n"+cdi.recuperarAlunoPorMatricula(matricula).getSenha()+"\n");
			}else if(opcao.equalsIgnoreCase("s")){
				System.out.println("Programa encerrado");
			}
			else 
				System.out.println("Opção inválida, informe corretamente.");
		}
	}
}
