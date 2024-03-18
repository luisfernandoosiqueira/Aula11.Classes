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

package Empregado;

/**
 *
 * @author Luís Fernando Siqueira <luisfernandosqueiraadv@gmail.com>
 * @date 17/03/2024
 * @brief Class Main
 */
public class Main {
    public static void main(String[] args) {
        // Criação e atribuição de dados para o Endereço da Empresa
       
        Endereco enderecoEmpresa = new Endereco();
        
        enderecoEmpresa.setRua("Rua das Empresas");
        enderecoEmpresa.setNumero(1000);
        enderecoEmpresa.setComplemento("Sala 2");
        enderecoEmpresa.setCep(12345678);
        enderecoEmpresa.setBairro("Vila Nova");
        enderecoEmpresa.setCidade("Goiânia");
        enderecoEmpresa.setEstado("Goiás");

        // Criação e atribuição de dados para a Empresa
        Empresa empresa = new Empresa();
        empresa.setCnpj("12.345.678/0001-99");
        empresa.setRazaoSocial("Empresa Faz Site S.A.");
        empresa.setEndereco(enderecoEmpresa);

        // Criação e atribuição de dados para o Empregado
        Empregado empregado = new Empregado();
        empregado.setNome("João Silva");
        empregado.setCargo("Desenvolvedor");
        empregado.setEmpresa(empresa);

       // Impressão dos dados para verificação
        System.out.println("Empregado: " + empregado.getNome());
        System.out.println("Cargo: " + empregado.getCargo());
        System.out.println("Empresa: " + empregado.getEmpresa().getRazaoSocial());
        System.out.println("CNPJ: " + empregado.getEmpresa().getCnpj());
        System.out.println("Endereço da Empresa: " + empregado.getEmpresa().getEndereco().getRua()
                + ", " + empregado.getEmpresa().getEndereco().getNumero()
                + " - " + empregado.getEmpresa().getEndereco().getComplemento());
        System.out.println("CEP: " + empregado.getEmpresa().getEndereco().getCep()
                + ", Bairro: " + empregado.getEmpresa().getEndereco().getBairro()
                + ", Cidade: " + empregado.getEmpresa().getEndereco().getCidade()
                + ", Estado: " + empregado.getEmpresa().getEndereco().getEstado());
    }
}