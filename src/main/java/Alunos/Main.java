/*
 * Copyright (C) 2024 Luís Fernando Siqueira <luisfernandosqueiraadv@gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package Alunos;

/**
 *
 * @author Luís Fernando Siqueira <luisfernandosqueiraadv@gmail.com>
 * @date 17/03/2024
 * @brief Class Aluno
 */

import java.util.Scanner; // Importa a classe Scanner do pacote java.util para leitura de entradas do console.

public class Main { // Declaração da classe Main, que contém o método principal do programa.

    public static void main(String[] args) { // Método main, que é o ponto de entrada do programa.
        
        Scanner scanner = new Scanner(System.in); // Cria uma instância de Scanner para ler a entrada do teclado.

        Departamento departamentoCurso = new Departamento(); // Cria uma nova instância da classe Departamento.
        departamentoCurso.setSiglaDepartamento("TI"); // Define a sigla do departamento como "TI".
        
        Curso curso = new Curso(); // Cria uma nova instância da classe Curso.
        curso.setNomeCurso("Engenharia de Software"); // Define o nome do curso como "Engenharia de Software".
        curso.setSiglaCurso("ENGSW"); // Define a sigla do curso como "ENGSW".
        curso.setDuracao("4 anos"); // Define a duração do curso como "4 anos".
        curso.setDepartamento(departamentoCurso); // Associa o departamento criado ao curso.
        
        Aluno[] alunos = new Aluno[2]; // Cria um array para armazenar dois objetos do tipo Aluno.

        // Loop para iterar sobre o array de alunos e coletar informações para cada um.
        for (int i = 0; i < alunos.length; i++) {
            
            alunos[i] = new Aluno(); // Inicializa o objeto Aluno na posição i do array.

            System.out.println("Digite o nome do aluno " + (i + 1) + ":"); // Solicita ao usuário o nome do aluno.
            String nome = scanner.nextLine(); // Lê o nome do aluno do console e armazena na variável nome.
            alunos[i].setNome(nome); // Define o nome do aluno usando o método setNome.

            System.out.println("Digite a matrícula do aluno " + (i + 1) + ":"); // Solicita ao usuário a matrícula do aluno.
            int nMatricula = scanner.nextInt(); // Lê a matrícula do aluno do console e armazena na variável nMatricula.
            alunos[i].setMatricula(nMatricula); // Define a matrícula do aluno usando o método setMatricula.

            System.out.println("Digite o ano de ingresso do aluno " + (i + 1) + ":"); // Solicita ao usuário o ano de ingresso do aluno.
            int anoDeIngresso = scanner.nextInt(); // Lê o ano de ingresso do aluno do console e armazena na variável anoDeIngresso.
            alunos[i].setAnoIngresso(anoDeIngresso); // Define o ano de ingresso do aluno usando o método setAnoIngresso.
            
            scanner.nextLine(); // Consome a quebra de linha restante após ler um número inteiro, evitando a omissão da próxima leitura de string.
        }

        System.out.println("\nDados do Curso:"); // Imprime uma linha em branco seguida de "Dados do Curso:" no console.
        System.out.println("Curso: " + curso.getNomeCurso()); // Imprime o nome do curso.
        System.out.println("Sigla: " + curso.getSiglaCurso()); // Imprime a sigla do curso.
        System.out.println("Duração: " + curso.getDuracao()); // Imprime a duração do curso.
        System.out.println("Departamento: " + curso.getDepartamento().getSiglaDepartamento()); // Imprime a sigla do departamento associado ao curso.

        System.out.println("\nDados dos Alunos:"); // Imprime uma linha em branco seguida de "Dados dos Alunos:" no console.
        
        // Loop para iterar sobre o array de alunos e imprimir suas informações.
        for (Aluno aluno : alunos) {
            System.out.println("Nome: " + aluno.getNome()); // Imprime o nome do aluno.
            System.out.println("Matrícula: " + aluno.getMatricula()); // Imprime a matrícula do aluno.
            System.out.println("Ano de Ingresso: " + aluno.getAnoIngresso()); // Imprime o ano de ingresso do aluno.
            System.out.println(); // Imprime uma linha em branco para separar os dados de cada aluno.
        }

        scanner.close(); // Fecha o scanner para liberar os recursos que ele pode estar utilizando.
    }
}





