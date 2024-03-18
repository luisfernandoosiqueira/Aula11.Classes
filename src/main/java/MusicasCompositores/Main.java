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
package MusicasCompositores;

/**
 *
 * @author Luís Fernando Siqueira <luisfernandosqueiraadv@gmail.com>
 * @date 17/03/2024
 * @brief Class Main
 */
public class Main {
    
    public static void main(String[] args) {
        
        Musica musica1 = new Musica();
        
        musica1.getComp().setNomecomp("Maria"); // Acessando o compositor através do getter
        musica1.getComp().setNacionalidade("Brasileira");
        
        musica1.setName("Hino");
        musica1.setTipo("Pop");
        musica1.setAno(2000);
        
        System.out.println("Detalhes da Música:");
        System.out.println("Nome: " + musica1.getName());
        System.out.println("Tipo: " + musica1.getTipo());
        System.out.println("Ano: " + musica1.getAno());
        System.out.println("Compositor: " + musica1.getComp().getNomecomp());
        System.out.println("Nacionalidade do Compositor: " + musica1.getComp().getNacionalidade());
        
    }    
}