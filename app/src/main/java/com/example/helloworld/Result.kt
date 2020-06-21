package com.example.helloworld

/**
 * Created by zz on 2020/6/20 .
 *
 */
sealed class Result
class Success(val msg: String) : Result()
class Failure(val error: Exception) : Result()