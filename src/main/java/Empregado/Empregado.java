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
 * @brief Class Empregado
 */
public class Empregado {
    private String nome;
    private String cargo;
    private Empresa empresa;

    public Empregado() {
    }
     
    public Empregado(String nome, String cargo, Empresa empresa) {
        this.nome = nome;
        this.cargo = cargo;
        this.empresa = empresa;
    }

    // Métodos getters e setters
    public String getNome() { 
        return nome; }
    
    public void setNome(String nome) { 
        this.nome = nome; }

    public String getCargo() { 
        return cargo; }
    
    public void setCargo(String cargo) { 
        this.cargo = cargo; }

    public Empresa getEmpresa() { 
        return empresa; }
    
    public void setEmpresa(Empresa empresa) { 
        this.empresa = empresa; }
    
}

