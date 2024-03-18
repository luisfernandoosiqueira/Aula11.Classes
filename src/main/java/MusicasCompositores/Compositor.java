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
 * @brief Class Compositor
 */
public class Compositor {

    private String nomecomp;
    private String nacionalidade;

    public Compositor() {
    }

    public Compositor(String nomecomp, String nacionalidade) {
        this.nomecomp = nomecomp;
        this.nacionalidade = nacionalidade;
    }

    public String getNomecomp() {
        return nomecomp;
    }

    public void setNomecomp(String nomecomp) {
        this.nomecomp = nomecomp;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    @Override
    public String toString() {
        return "Compositor{"
                + "nomecomp=" + nomecomp
                + ", nacionalidade=" + nacionalidade
                + '}';
    }

}
