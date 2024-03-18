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
 * @brief Class Musica
 */
public class Musica {

    private String name;
    private String tipo;
    private int ano;

    Compositor comp = new Compositor();

    public Musica() {
    }

    public Musica(String name, String tipo, int ano) {
        this.name = name;
        this.tipo = tipo;
        this.ano = ano;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Compositor getComp() {
        return comp;
    }

    public void setComp(Compositor comp) {
        this.comp = comp;
    }

    @Override
    public String toString() {
        return "Musica{" + "name=" + name
                + ", tipo=" + tipo
                + ", ano=" + ano
                + ", comp=" + comp + '}';
    }

}
