package com.example.roomapp12302120.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.ColumnInfo

//Notacao que vai dizer ao Room que essa classe é uma representação de uma tabela do banco
// de dados, uma tabela chamada "Usuario"
@Entity(tableName = "Usuario")
class UsuarioModel {

    @PrimaryKey(autoGenerate = true) //O id é a chave primária com auto incremento (autoGenerate) ativado
    @ColumnInfo(name = "id_usuario") //O atributo é uma coluna, e que o nome dessa coluna será "id_usuario"
    var id_usuario: Int = 0 //Esse atributo representa uma coluna do tipo Int

    @ColumnInfo(name = "nome") //O nome dessa coluna será "nome"
    var nome: String = "" //Esse atributo representa uma coluna do tipo String

    @ColumnInfo(name = "idade") //Diz ao Room que o atributo abaixo é uma coluna, e que o nome dessa coluna será "idade"
    var idade: Int = 0
}