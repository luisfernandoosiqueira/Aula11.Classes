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
 * @brief Class Departamento
 */
public class Departamento {

    private String siglaDepartamento;

    public Departamento() {
    }

    public Departamento(String siglaDepartamento) {
        this.siglaDepartamento = siglaDepartamento;
    }

    public String getSiglaDepartamento() {
        return siglaDepartamento;
    }

    public void setSiglaDepartamento(String siglaDepartamento) {
        this.siglaDepartamento = siglaDepartamento;
    }


}
