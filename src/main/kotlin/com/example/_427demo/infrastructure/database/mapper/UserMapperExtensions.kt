/*
 * Auto-generated file. Created by MyBatis Generator
 */
package com.example._427demo.infrastructure.database.mapper

import com.example._427demo.infrastructure.database.mapper.UserDynamicSqlSupport.User
import com.example._427demo.infrastructure.database.mapper.UserDynamicSqlSupport.User.authority
import com.example._427demo.infrastructure.database.mapper.UserDynamicSqlSupport.User.id
import com.example._427demo.infrastructure.database.mapper.UserDynamicSqlSupport.User.name
import com.example._427demo.infrastructure.database.mapper.UserDynamicSqlSupport.User.password
import com.example._427demo.infrastructure.database.record.UserRecord
import org.mybatis.dynamic.sql.SqlBuilder.isEqualTo
import org.mybatis.dynamic.sql.util.kotlin.*
import org.mybatis.dynamic.sql.util.kotlin.mybatis3.*

fun UserMapper.count(completer: CountCompleter) =
    countFrom(this::count, User, completer)

fun UserMapper.delete(completer: DeleteCompleter) =
    deleteFrom(this::delete, User, completer)

fun UserMapper.deleteByPrimaryKey(id_: Long) =
    delete {
        where(id, isEqualTo(id_))
    }

fun UserMapper.insert(record: UserRecord) =
    insert(this::insert, record, User) {
        map(id).toProperty("id")
        map(name).toProperty("name")
        map(password).toProperty("password")
        map(authority).toProperty("authority")
    }

fun UserMapper.insertMultiple(records: Collection<UserRecord>) =
    insertMultiple(this::insertMultiple, records, User) {
        map(id).toProperty("id")
        map(name).toProperty("name")
        map(password).toProperty("password")
        map(authority).toProperty("authority")
    }

fun UserMapper.insertMultiple(vararg records: UserRecord) =
    insertMultiple(records.toList())

fun UserMapper.insertSelective(record: UserRecord) =
    insert(this::insert, record, User) {
        map(id).toPropertyWhenPresent("id", record::id)
        map(name).toPropertyWhenPresent("name", record::name)
        map(password).toPropertyWhenPresent("password", record::password)
        map(authority).toPropertyWhenPresent("authority", record::authority)
    }

private val columnList = listOf(id, name, password, authority)

fun UserMapper.selectOne(completer: SelectCompleter) =
    selectOne(this::selectOne, columnList, User, completer)

fun UserMapper.select(completer: SelectCompleter) =
    selectList(this::selectMany, columnList, User, completer)

fun UserMapper.selectDistinct(completer: SelectCompleter) =
    selectDistinct(this::selectMany, columnList, User, completer)

fun UserMapper.selectByPrimaryKey(id_: Long) =
    selectOne {
        where(id, isEqualTo(id_))
    }

fun UserMapper.update(completer: UpdateCompleter) =
    update(this::update, User, completer)

fun KotlinUpdateBuilder.updateAllColumns(record: UserRecord) =
    apply {
        set(id).equalTo(record::id)
        set(name).equalTo(record::name)
        set(password).equalTo(record::password)
        set(authority).equalTo(record::authority)
    }

fun KotlinUpdateBuilder.updateSelectiveColumns(record: UserRecord) =
    apply {
        set(id).equalToWhenPresent(record::id)
        set(name).equalToWhenPresent(record::name)
        set(password).equalToWhenPresent(record::password)
        set(authority).equalToWhenPresent(record::authority)
    }

fun UserMapper.updateByPrimaryKey(record: UserRecord) =
    update {
        set(name).equalTo(record::name)
        set(password).equalTo(record::password)
        set(authority).equalTo(record::authority)
        where(id, isEqualTo(record::id))
    }

fun UserMapper.updateByPrimaryKeySelective(record: UserRecord) =
    update {
        set(name).equalToWhenPresent(record::name)
        set(password).equalToWhenPresent(record::password)
        set(authority).equalToWhenPresent(record::authority)
        where(id, isEqualTo(record::id))
    }