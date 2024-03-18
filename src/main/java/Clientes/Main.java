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
package Clientes;

/**
 *
 * @author Luís Fernando Siqueira <luisfernandosqueiraadv@gmail.com>
 * @date 17/03/2024
 * @brief Class Main
 */
public class Main {

    public static void main(String[] args) {

        Cliente cliente01 = new Cliente();

        cliente01.setNome("Maria");
        cliente01.setTelefone("6299999999");
        cliente01.titular.setRua("Rua 3");
        cliente01.titular.setNumero(38);
        cliente01.titular.setComplemento("Casa 2");
        cliente01.titular.setCep(7461756);
        cliente01.titular.setBairro("Vila Nova");
        cliente01.titular.setCidade("Goiânia");
        cliente01.titular.setEstado("Goiás");

        System.out.println("Informações do Cliente:");
        System.out.println("Nome: " + cliente01.getNome());
        System.out.println("Telefone: " + cliente01.getTelefone());
        System.out.println("Endereço do Titular:");
        System.out.println("Rua: " + cliente01.titular.getRua());
        System.out.println("Número: " + cliente01.titular.getNumero());
        System.out.println("Complemento: " + cliente01.titular.getComplemento());
        System.out.println("CEP: " + cliente01.titular.getCep());
        System.out.println("Bairro: " + cliente01.titular.getBairro());
        System.out.println("Cidade: " + cliente01.titular.getCidade());
        System.out.println("Estado: " + cliente01.titular.getEstado());
    }

}
