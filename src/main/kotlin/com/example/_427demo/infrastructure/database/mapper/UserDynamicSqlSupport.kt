/*
 * Auto-generated file. Created by MyBatis Generator
 */
package com.example._427demo.infrastructure.database.mapper

import java.sql.JDBCType
import org.mybatis.dynamic.sql.SqlTable

object UserDynamicSqlSupport {
    object User : SqlTable("user") {
        val id = column<Long>("id", JDBCType.BIGINT)

        val name = column<String>("name", JDBCType.VARCHAR)

        val password = column<String>("password", JDBCType.VARCHAR)

        val authority = column<Byte>("authority", JDBCType.TINYINT)
    }
}