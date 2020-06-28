package com.iamkurtgoz.easystore

/**********************************************************************************************/
/**********************************************************************************************/
/************************************** STRING DATA *******************************************/
/**********************************************************************************************/
/**********************************************************************************************/

fun String.save(key: Enum<*>) {
    EasyStore.save(key.name, this)
}

fun String.save(key: String) {
    EasyStore.save(key, this)
}

/**********************************************************************************************/
/**********************************************************************************************/
/************************************* INTEGER DATA *******************************************/
/**********************************************************************************************/
/**********************************************************************************************/

fun Int.save(key: Enum<*>) {
    EasyStore.save(key.name, this)
}

fun Int.save(key: String) {
    EasyStore.save(key, this)
}

/**********************************************************************************************/
/**********************************************************************************************/
/*************************************** BOOLEAN DATA *******************************************/
/**********************************************************************************************/
/**********************************************************************************************/

fun Boolean.save(key: Enum<*>) {
    EasyStore.save(key.name, this)
}

fun Boolean.save(key: String) {
    EasyStore.save(key, this)
}

/**********************************************************************************************/
/**********************************************************************************************/
/*************************************** FLOAT DATA *******************************************/
/**********************************************************************************************/
/**********************************************************************************************/

fun Float.save(key: Enum<*>) {
    EasyStore.save(key.name, this)
}

fun Float.save(key: String) {
    EasyStore.save(key, this)
}

/**********************************************************************************************/
/**********************************************************************************************/
/*************************************** LONG DATA *******************************************/
/**********************************************************************************************/
/**********************************************************************************************/

fun Long.save(key: Enum<*>) {
    EasyStore.save(key.name, this)
}

fun Long.save(key: String) {
    EasyStore.save(key, this)
}

/**********************************************************************************************/
/**********************************************************************************************/
/********************************** STRING SET DATA *******************************************/
/**********************************************************************************************/
/**********************************************************************************************/

fun Set<String>.save(key: Enum<*>) {
    EasyStore.save(key.name, this)
}

fun Set<String>.save(key: String) {
    EasyStore.save(key, this)
}

/**********************************************************************************************/
/**********************************************************************************************/
/********************************** EASY MODEL DATA *******************************************/
/**********************************************************************************************/
/**********************************************************************************************/

fun ArrayList<EasyModel>.save(){
    this.forEach {
        val easyModel = it
        if (easyModel.value is String){
            EasyStore.save(easyModel.key, easyModel.value.toString())
        } else if (easyModel.value is Int){
            EasyStore.save(easyModel.key, easyModel.value.toInt())
        } else if (easyModel.value is Boolean){
            EasyStore.save(easyModel.key, easyModel.value.toString().toBoolean())
        } else if (easyModel.value is Float){
            EasyStore.save(easyModel.key, easyModel.value.toFloat())
        } else if (easyModel.value is Long){
            EasyStore.save(easyModel.key, easyModel.value.toLong())
        }
    }
}

fun List<EasyModel>.save(){
    this.forEach {
        val easyModel = it
        if (easyModel.value is String){
            EasyStore.save(easyModel.key, easyModel.value.toString())
        } else if (easyModel.value is Int){
            EasyStore.save(easyModel.key, easyModel.value.toInt())
        } else if (easyModel.value is Boolean){
            EasyStore.save(easyModel.key, easyModel.value.toString().toBoolean())
        } else if (easyModel.value is Float){
            EasyStore.save(easyModel.key, easyModel.value.toFloat())
        } else if (easyModel.value is Long){
            EasyStore.save(easyModel.key, easyModel.value.toLong())
        }
    }
}